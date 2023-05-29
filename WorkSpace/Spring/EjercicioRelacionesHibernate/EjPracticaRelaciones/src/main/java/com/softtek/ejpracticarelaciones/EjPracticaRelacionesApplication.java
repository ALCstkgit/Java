package com.softtek.ejpracticarelaciones;

import com.softtek.ejpracticarelaciones.controller.Controlador;
import com.softtek.ejpracticarelaciones.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;

@SpringBootApplication
public class EjPracticaRelacionesApplication implements CommandLineRunner {
    @Autowired
    Controlador c;

    public static void main(String[] args) {
        SpringApplication.run(EjPracticaRelacionesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Facturacion f1 = new Facturacion();
//        f1.setPublicidad(5);
//        f1.setSueldo(6);
//        Facturacion f2 = new Facturacion();
//        f2.setPublicidad(10);
//        f2.setSueldo(9);
//        Facturacion f3 = new Facturacion();
//        f3.setPublicidad(1);
//        f3.setSueldo(11);
//        Facturacion f4 = new Facturacion();
//        f4.setPublicidad(5);
//        f4.setSueldo(15);
//        Escuderia e1 = new Escuderia();
//        e1.setNombre("Escuderia1");
//        e1.setPais("Italia");
//        Escuderia e2 = new Escuderia();
//        e2.setNombre("Escuderia2");
//        e2.setPais("Nigeria");
//        Nif n1 = new Nif();
//        n1.setNumero(12345);
//        n1.setLetra('A');
//        Nif n2 = new Nif();
//        n2.setNumero(6789);
//        n2.setLetra('B');
//        Nif n3 = new Nif();
//        n3.setNumero(345345);
//        n3.setLetra('C');
//        Nif n4 = new Nif();
//        n4.setNumero(23675);
//        n4.setLetra('D');
//        Telefono t1 = new Telefono();
//        t1.setNumero(3424345);
//        Telefono t2 = new Telefono();
//        t2.setNumero(1873864);
//        Telefono t3 = new Telefono();
//        t3.setNumero(23748656);
//        Telefono t4 = new Telefono();
//        t4.setNumero(567324);
//        Telefono t5 = new Telefono();
//        t5.setNumero(23287664);
//        Telefono t6 = new Telefono();
//        t6.setNumero(23856846);
//        Temporada temp1 = new Temporada();
//        temp1.setFin(2000);
//        temp1.setInicio(1999);
//        Temporada temp2 = new Temporada();
//        temp2.setFin(2001);
//        temp2.setInicio(2000);
//
//        Piloto p1 = new Piloto();
//        p1.setNombre("Alonso");
//        p1.setEdad(40);
//        p1.setNif(n1);
//        p1.setEscuderia(e1);
//        p1.setFacturacion(f1);
//        p1.setTelefonos(new HashSet<Telefono>());
//        p1.getTelefonos().add(t1);
//        p1.setTemporadas(new HashSet<Temporada>());
//        p1.getTemporadas().add(temp1);
//
//        Piloto p2 = new Piloto();
//        p2.setNombre("Juan");
//        p2.setEdad(50);
//        p2.setNif(n2);
//        p2.setEscuderia(e2);
//        p2.setFacturacion(f2);
//        p2.setTelefonos(new HashSet<Telefono>());
//        p2.getTelefonos().add(t2);
//        p2.getTelefonos().add(t3);
//        p2.setTemporadas(new HashSet<Temporada>());
//        p2.getTemporadas().add(temp1);
//
//        Piloto p3 = new Piloto();
//        p3.setNombre("Pepe");
//        p3.setEdad(30);
//        p3.setNif(n3);
//        p3.setEscuderia(e1);
//        p3.setFacturacion(f3);
//        p3.setTelefonos(new HashSet<Telefono>());
//        p3.getTelefonos().add(t4);
//        p3.setTemporadas(new HashSet<Temporada>());
//        p3.getTemporadas().add(temp2);
//
//        Piloto p4 = new Piloto();
//        p4.setNombre("Antonio");
//        p4.setEdad(55);
//        p4.setNif(n4);
//        p4.setEscuderia(e2);
//        p4.setFacturacion(f4);
//        p4.setTelefonos(new HashSet<Telefono>());
//        p4.getTelefonos().add(t5);
//        p4.getTelefonos().add(t6);
//        p4.setTemporadas(new HashSet<Temporada>());
//        p4.getTemporadas().add(temp1);
//        p4.getTemporadas().add(temp2);
//
//        c.insertPiloto(p1);
//        c.insertPiloto(p2);
//        c.insertPiloto(p3);
//        c.insertPiloto(p4);
//        System.out.println("Pilotos de una temporada:");
//        System.out.println(c.findPilotosTemp(2));
    }
}
