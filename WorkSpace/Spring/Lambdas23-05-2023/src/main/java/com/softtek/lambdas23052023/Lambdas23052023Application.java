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
        products.stream().forEach(product -> System.out.println(product));
//        -- Obtenerr una consulta con Productid, productname, supplierid, categoryId, UnistsinStock, UnitPrice
        products.stream().forEach(p -> System.out.println(p.getProductId()+","+p.getProductName()+","+p.getSupplierId()+","+p.getSupplierId()+","+p.getCategoryId()+","+p.getUnitsInStock()+","+p.getUnitPrice()));
//        --Crear una consulta para obtener el IdOrden, IdCustomer, Fecha de la orden de la tabla de ordenes.
//        --Crear una consulta para obtener el OrderId, EmployeeId, Fecha de la orden.
//
//                --Columnas calculadas
//
//        --Obtener una consulta con Productid, productname y valor del inventario, valor inventrio (UnitsinStock * UnitPrice)
//                -- Cuanto vale el punto de reorden
//        -- Mostrar una consulta con Productid, productname y precio, el nombre del producto debe estar en mayuscula
//                -- Mostrar una consulta con Productid, productname y precio, el nombre del producto debe contener unicamente 10 caracteres */
//        --Obtenre una consulta que muestre la longitud del nombre del producto
//        --Obtener una consulta de la tabla de productos que muestre el nombre en minúscula
//                -- Mostrar una consulta con Productid, productname y precio, el nombre del producto debe contener unicamente 10 caracteres y se deben mostrar en mayúscula */
//
//        --Filtros
//                --Obtener de la tabla de Customers las columnas CustomerId, CompanyName, Pais Obtener los clientes cuyo pais sea Spain
        customers.stream()
                .filter(c -> c.getCountry().equals("Spain"))
                .forEach(c -> System.out.println(c));
//                --Obtener de la tabla de Customers las columnas CustomerId, CompanyName, Pais, Obtener los clientes cuyo pais comience con la letra U
        customers.stream()
                .filter(c -> c.getCountry().charAt(0) == 'U')
                .forEach(c -> System.out.println(c));
//                --Obtener de la tabla de Customers las columnas CustomerId, CompanyName, Pais, Obtener los clientes cuyo pais comience con la letra U,S,A
        customers.stream()
                .filter(c -> c.getCountry().charAt(0) == 'U' || c.getCountry().charAt(0) == 'S' || c.getCountry().charAt(0) == 'A')
                .forEach(c -> System.out.println(c));
//                --Obtener de la tabla de Productos las columnas productid, ProductName, UnitPrice cuyos precios esten entre 50 y 150
        products.stream()
                .filter(p -> p.getUnitPrice()> 50.0 && p.getUnitPrice() < 150.0)
                .forEach(p -> System.out.println(p));
//                --Obtener de la tabla de Productos las columnas productid, ProductName, UnitPrice, UnitsInStock cuyas existencias esten entre 50 y 100
        products.stream()
                .filter(p -> p.getUnitsInStock()> 50.0 && p.getUnitsInStock() < 150.0)
                .forEach(p -> System.out.println(p));
//                --Obtener las columnas OrderId, CustomerId, employeeid de la tabla de ordenes cuyos empleados sean 1, 4, 9
        orders.stream()
                .filter(o -> o.getCustomerId().equals("1") || o.getCustomerId().equals("4") || o.getCustomerId().equals("9"))
                .forEach(o -> System.out.println(o));
//                -- ORDENAR EL RESULTADO DE LA QUERY POR ALGUNA COLUMNA Obtener la información de la tabla de Products, Ordenarlos por Nombre del Producto de forma ascendente
        products.stream()
                .sorted(Comparator.comparing(Product::getProductName))
                .forEach(p -> System.out.println(p));
//                -- Obtener la información de la tabla de Products, Ordenarlos por Categoria de forma ascendente y por precio unitario de forma descendente
        products.stream()
                .sorted(Comparator.comparing(Product::getCategoryId).thenComparing(Product::getUnitPrice).reversed())
                .forEach(p -> System.out.println(p));
//        -- Obtener la información de la tabla de Clientes, Customerid, CompanyName, city, country ordenar por pais, ciudad de forma ascendente
        customers.stream().sorted(Comparator.comparing(Customer::getCountry).thenComparing(Customer::getCity)).forEach(c -> System.out.println(c));
//                -- Obtener los productos productid, productname, categoryid, supplierid ordenar por categoryid y supplier únicamente mostrar aquellos cuyo precio esté entre 25 y 200
        products.stream()
                .filter(p -> p.getUnitPrice() > 25 && p.getUnitPrice() < 200)
                .sorted(Comparator.comparing(Product::getCategoryId).thenComparing(Product::getSupplierId))
                .forEach(p -> System.out.println(p));
//
//
//                --Funciones agregación
//
//        --Cuantos productos hay en la tabla de productos
        System.out.println(products.size());
//                --de la tabla de productos Sumar las cantidades en existencia
//        --Promedio de los precios de la tabla de productos
//
//        --Ordenar
//                --Obtener los datos de productos ordenados descendentemente por precio unitario de la categoría 1
//                --Obtener los datos de los clientes(Customers) ordenados descendentemente por nombre(CompanyName) que se encuentren en la ciudad(city) de barcelona, Lisboa
//                --Obtener los datos de las ordenes, ordenados descendentemente por la fecha de la orden cuyo cliente(CustomerId) sea ALFKI
//        --Obtener los datos del detalle de ordenes, ordenados ascendentemente por precio cuyo producto sea 1, 5 o 20
//                --Obtener los datos de las ordenes ordenados ascendentemente por la fecha de la orden cuyo empleado sea 2 o 4
//                --Obtener los productos cuyo precio están entre 30 y 60 ordenado por nombre
//
//                --funciones de agrupacion
//                --OBTENER EL MAXIMO, MINIMO Y PROMEDIO DE PRECIO UNITARIO DE LA TABLA DE PRODUCTOS UTILIZANDO ALIAS
//
//        --Agrupacion
//                --Numero de productos por categoria
//                --Obtener el precio promedio por proveedor de la tabla de productos
//                --Obtener la suma de inventario (UnitsInStock) por SupplierID De la tabla de productos (Products)
//                --Contar las ordenes por cliente de la tabla de orders
//        --Contar las ordenes por empleado de la tabla de ordenes unicamente del empleado 1,3,5,6
//                --Obtener la suma del envío (freight) por cliente
//        --De la tabla de ordenes únicamente de los registros cuya ShipCity sea Madrid, Sevilla, Barcelona, Lisboa, LondonOrdenado por el campo de suma del envío
//                --obtener el precio promedio de los productos por categoria sin contar con los productos descontinuados (Discontinued)
//                --Obtener la cantidad de productos por categoria,  aquellos cuyo precio se encuentre entre 10 y 60 que tengan más de 12 productos
//                --OBTENER LA SUMA DE LAS UNIDADES EN EXISTENCIA (UnitsInStock) POR CATEGORIA, Y TOMANDO EN CUENTA UNICAMENTE LOS PRODUCTOS CUYO PROVEEDOR (SupplierID) SEA IGUAL A 17, 19, 16.
//                --cuya categoria tenga menos de 100 unidades ordenado por unidades
    }
}
