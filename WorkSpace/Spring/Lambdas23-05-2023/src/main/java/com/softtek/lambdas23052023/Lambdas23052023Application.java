package com.softtek.lambdas23052023;

import com.softtek.lambdas23052023.controller.Controller;
import com.softtek.lambdas23052023.model.Customer;
import com.softtek.lambdas23052023.model.Order;
import com.softtek.lambdas23052023.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@SpringBootApplication
public class Lambdas23052023Application implements CommandLineRunner {
    @Autowired
    Controller c;

    public static void main(String[] args) {
        SpringApplication.run(Lambdas23052023Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Product> products = c.listAllProducts();
        List<Order> orders = c.listAllOrders();
        List<Customer> customers = c.listAllCustomers();

//        --Obtener todos los registros y todos los campos de la tabla de productos
        products.stream().forEach(System.out::println);
//        -- Obtenerr una consulta con Productid, productname, supplierid, categoryId, UnistsinStock, UnitPrice
        products.stream().forEach(p -> System.out.println(p.getProductId()+","+p.getProductName()+","+p.getSupplierId()+","+p.getSupplierId()+","+p.getCategoryId()+","+p.getUnitsInStock()+","+p.getUnitPrice()));
//        --Crear una consulta para obtener el IdOrden, IdCustomer, Fecha de la orden de la tabla de ordenes.
        orders.stream().forEach(o -> System.out.println(o.getOrderId()+","+o.getCustomerId()+","+o.getOrderDate()));
//        --Crear una consulta para obtener el OrderId, EmployeeId, Fecha de la orden.
        orders.stream().forEach(o -> System.out.println(o.getOrderId()+","+o.getEmployeeId()+","+o.getOrderDate()));
//
//                --Columnas calculadas
//
//        --Obtener una consulta con Productid, productname y valor del inventario, valor inventrio (UnitsinStock * UnitPrice)
        products.stream()
                .forEach(p -> System.out.println(p+", "+(p.getUnitPrice() * p.getUnitsInStock())));
//                -- Cuanto vale el punto de reorden
        products.stream().forEach(p-> System.out.println(p.getUnitPrice() * p.getReorderLevel()));
//        -- Mostrar una consulta con Productid, productname y precio, el nombre del producto debe estar en mayuscula
        products.stream()
                .map(Product::getProductName)
                .map(String::toUpperCase)
                .forEach(System.out::println);
//                -- Mostrar una consulta con Productid, productname y precio, el nombre del producto debe contener unicamente 10 caracteres */
        products.stream()
                .forEach(p -> System.out.println(p.getProductId()+","+p.getProductName().substring(0, Math.min(p.getProductName().length(), 10))+","+p.getUnitPrice()));
//        --Obtenre una consulta que muestre la longitud del nombre del producto
        products.stream()
                .map(Product::getProductName)
                .map(String::length)
                .forEach(System.out::println);
//        --Obtener una consulta de la tabla de productos que muestre el nombre en minúscula
        products.stream()
                .map(Product::getProductName)
                .map(String::toLowerCase)
                .forEach(System.out::println);
//        --Mostrar una consulta con Productid, productname y precio, el nombre del producto debe contener unicamente 10 caracteres y se deben mostrar en mayúscula */
        products.stream()
                .forEach(p -> System.out.println(p.getProductId()+","+p.getProductName().substring(0, Math.min(p.getProductName().length(), 10)).toUpperCase()+","+p.getUnitPrice()));

//        --Filtros
//                --Obtener de la tabla de Customers las columnas CustomerId, CompanyName, Pais Obtener los clientes cuyo pais sea Spain
        customers.stream()
                .filter(c -> c.getCountry().equals("Spain"))
                .forEach(System.out::println);
//                --Obtener de la tabla de Customers las columnas CustomerId, CompanyName, Pais, Obtener los clientes cuyo pais comience con la letra U
        customers.stream()
                .filter(c -> c.getCountry().charAt(0) == 'U')
                .forEach(System.out::println);
//                --Obtener de la tabla de Customers las columnas CustomerId, CompanyName, Pais, Obtener los clientes cuyo pais comience con la letra U,S,A
        customers.stream()
                .filter(c -> c.getCountry().charAt(0) == 'U' || c.getCountry().charAt(0) == 'S' || c.getCountry().charAt(0) == 'A')
                .forEach(System.out::println);
//                --Obtener de la tabla de Productos las columnas productid, ProductName, UnitPrice cuyos precios esten entre 50 y 150
        products.stream()
                .filter(p -> p.getUnitPrice()> 50.0 && p.getUnitPrice() < 150.0)
                .forEach(System.out::println);
//                --Obtener de la tabla de Productos las columnas productid, ProductName, UnitPrice, UnitsInStock cuyas existencias esten entre 50 y 100
        products.stream()
                .filter(p -> p.getUnitsInStock()> 50.0 && p.getUnitsInStock() < 150.0)
                .forEach(System.out::println);
//                --Obtener las columnas OrderId, CustomerId, employeeid de la tabla de ordenes cuyos empleados sean 1, 4, 9
        orders.stream()
                .filter(o -> o.getCustomerId().equals("1") || o.getCustomerId().equals("4") || o.getCustomerId().equals("9"))
                .forEach(System.out::println);
//                -- ORDENAR EL RESULTADO DE LA QUERY POR ALGUNA COLUMNA Obtener la información de la tabla de Products, Ordenarlos por Nombre del Producto de forma ascendente
        products.stream()
                .sorted(Comparator.comparing(Product::getProductName))
                .forEach(System.out::println);
//                -- Obtener la información de la tabla de Products, Ordenarlos por Categoria de forma ascendente y por precio unitario de forma descendente
        products.stream()
                .sorted(Comparator.comparing(Product::getCategoryId).reversed().thenComparing(Product::getUnitPrice).reversed())
                .map(p -> p.getCategoryId()+","+p.getUnitPrice())
                .forEach(System.out::println);
//        -- Obtener la información de la tabla de Clientes, Customerid, CompanyName, city, country ordenar por pais, ciudad de forma ascendente
        customers.stream().sorted(Comparator.comparing(Customer::getCountry).thenComparing(Customer::getCity)).forEach(c -> System.out.println(c));
//                -- Obtener los productos productid, productname, categoryid, supplierid ordenar por categoryid y supplier únicamente mostrar aquellos cuyo precio esté entre 25 y 200
        products.stream()
                .filter(p -> p.getUnitPrice() > 25 && p.getUnitPrice() < 200)
                .sorted(Comparator.comparing(Product::getCategoryId).thenComparing(Product::getSupplierId))
                .forEach(System.out::println);
//
//
//                --Funciones agregación
//
//        --Cuantos productos hay en la tabla de productos
        System.out.println(products.size());
//                --de la tabla de productos Sumar las cantidades en existencia
        products.stream()
                .map(Product::getUnitsInStock)
                .reduce((a,b) -> (short) (a+b))
                .ifPresent(System.out::println);
//        --Promedio de los precios de la tabla de productos
        products.stream()
                .mapToDouble(Product::getUnitPrice)
                .average()
                .ifPresent(System.out::println);
//        --Ordenar
//                --Obtener los datos de productos ordenados descendentemente por precio unitario de la categoría 1
        products.stream()
                .filter(p -> p.getCategoryId() == 1)
                .sorted(Comparator.comparing(Product::getUnitPrice).reversed())
                .forEach(System.out::println);
//                --Obtener los datos de los clientes(Customers) ordenados descendentemente por nombre(CompanyName) que se encuentren en la ciudad(city) de barcelona, Lisboa
        customers.stream()
                .filter(c -> c.getCity().equals("Barcelona") || c.getCity().equals("Lisboa"))
                .sorted(Comparator.comparing(Customer::getCompanyName).reversed())
                .forEach(System.out::println);
//                --Obtener los datos de las ordenes, ordenados descendentemente por la fecha de la orden cuyo cliente(CustomerId) sea ALFKI
        orders.stream()
                .filter(o -> o.getCustomerId().equals("ALFKI"))
                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .forEach(System.out::println);
//        --Obtener los datos del detalle de ordenes, ordenados ascendentemente por precio cuyo producto sea 1, 5 o 20
//                --Obtener los datos de las ordenes ordenados ascendentemente por la fecha de la orden cuyo empleado sea 2 o 4
        orders.stream()
                .filter(o -> o.getEmployeeId() == 2 ||o.getEmployeeId() == 4)
                .sorted(Comparator.comparing(Order::getOrderDate))
                .forEach(System.out::println);
//                --Obtener los productos cuyo precio están entre 30 y 60 ordenado por nombre
        products.stream()
                .filter(p -> p.getUnitPrice() > 30 && p.getUnitPrice() < 60)
                .sorted(Comparator.comparing(Product::getProductName))
                .forEach(System.out::println);
//                --funciones de agrupacion
//                --OBTENER EL MAXIMO, MINIMO Y PROMEDIO DE PRECIO UNITARIO DE LA TABLA DE PRODUCTOS UTILIZANDO ALIAS
        products.stream().mapToDouble(Product::getUnitPrice).max().ifPresent(System.out::println);
        products.stream().mapToDouble(Product::getUnitPrice).min().ifPresent(System.out::println);
        products.stream().mapToDouble(Product::getUnitPrice).average().ifPresent(System.out::println);
        System.out.println();
//
//        --Agrupacion
//                --Numero de productos por categoria
        products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategoryId,
                        Collectors.counting()))
                .forEach((a,b)-> System.out.println(a+":"+b));
        System.out.println();
//                --Obtener el precio promedio por proveedor de la tabla de productos
        products.stream()
                .collect(Collectors.groupingBy(
                        Product::getSupplierId,
                        Collectors.averagingDouble(Product::getUnitPrice)))
                .forEach((a,b)-> System.out.println(a+":"+b));
        System.out.println();
//                --Obtener la suma de inventario (UnitsInStock) por SupplierID De la tabla de productos (Products)
        products.stream()
                .collect(Collectors.groupingBy(
                        Product::getSupplierId,
                        Collectors.summingInt(Product::getUnitsInStock)))
                .forEach((a,b)-> System.out.println(a+":"+b));
        System.out.println();
//                --Contar las ordenes por cliente de la tabla de orders
        orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomerId,
                        Collectors.counting()))
                .forEach((a,b)-> System.out.println(a+":"+b));
        System.out.println();
//        --Contar las ordenes por empleado de la tabla de ordenes unicamente del empleado 1,3,5,6
        orders.stream()
                .filter(o -> o.getEmployeeId() == 1 || o.getEmployeeId() == 3 || o.getEmployeeId() == 5 || o.getEmployeeId() == 6)
                .collect(Collectors.groupingBy(
                        Order::getEmployeeId,
                        Collectors.counting()))
                .forEach((a,b)-> System.out.println(a+":"+b));
        System.out.println();
//                --Obtener la suma del envío (freight) por cliente
        orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomerId,
                        Collectors.summingDouble(Order::getFreight)))
                .forEach((a,b)-> System.out.println(a+":"+b));
        System.out.println();
//        --De la tabla de ordenes únicamente de los registros cuya ShipCity sea Madrid, Sevilla, Barcelona, Lisboa, LondonOrdenado por el campo de suma del envío
//                --obtener el precio promedio de los productos por categoria sin contar con los productos descontinuados (Discontinued)
        products.stream()
                .filter(p -> p.getDiscontinued()==1)
                .collect(Collectors.groupingBy(
                        Product::getCategoryId,
                        Collectors.averagingDouble(Product::getUnitPrice)))
                .forEach((a,b)-> System.out.println(a+":"+b));
        System.out.println();
//                --Obtener la cantidad de productos por categoria,  aquellos cuyo precio se encuentre entre 10 y 60 que tengan más de 12 productos
        products.stream()
                .filter(p -> p.getUnitPrice() > 10 && p.getUnitPrice() < 60)
                .collect(Collectors.groupingBy(
                        Product::getCategoryId,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 8)
                .forEach(er-> System.out.println(er.getKey()+":"+er.getValue()));
        System.out.println();
//                --OBTENER LA SUMA DE LAS UNIDADES EN EXISTENCIA (UnitsInStock) POR CATEGORIA, Y TOMANDO EN CUENTA UNICAMENTE LOS PRODUCTOS CUYO PROVEEDOR (SupplierID) SEA IGUAL A 17, 19, 16.
//                --cuya categoria tenga menos de 100 unidades ordenado por unidades
        products.stream()
                .filter(p -> p.getSupplierId() == 17 || p.getSupplierId() == 19 || p.getSupplierId() == 16)
                .collect(Collectors.groupingBy(
                        Product::getCategoryId,
                        Collectors.summingInt(Product::getUnitsInStock)))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() < 100)
                .forEach(er-> System.out.println(er.getKey()+":"+er.getValue()));
    }
}
