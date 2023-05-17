package com.softtek.fundamentosspring;

import com.softtek.fundamentosspring.modelConducir.CocheConductor;
import com.softtek.fundamentosspring.modelConducir.Conductor;
import com.softtek.fundamentosspring.modelDao.Cliente;
import com.softtek.fundamentosspring.modelDao.ClienteDao;
import com.softtek.fundamentosspring.modelTaller.CocheTaller;
import com.softtek.fundamentosspring.modelTaller.SeguroCoche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosSpringApplication implements CommandLineRunner {
    @Autowired
    private SeguroCoche sc1;
    @Autowired
    private Conductor con;
    @Autowired
    private ClienteDao cd;

    public static void main(String[] args){
        SpringApplication.run(FundamentosSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Ejercicio Seguros");
        CocheTaller c1 = new CocheTaller("2235jqr","apagando rapido");
        System.out.println(sc1.reparar(c1));
        System.out.println("---------------");
        System.out.println("Ejercicio Conducir");
        ((CocheConductor)con.getV()).setDeposito(10);
        System.out.println(con.conducir());
        System.out.println("---------------");
        System.out.println("Ejercicio Dao");
        System.out.println(cd.insertar(new Cliente()));
    }
}
