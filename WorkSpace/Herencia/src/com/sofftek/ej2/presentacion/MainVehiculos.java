package com.sofftek.ej2.presentacion;

import com.sofftek.ej2.model.Avion;
import com.sofftek.ej2.model.Barco;
import com.sofftek.ej2.model.Coche;
import com.sofftek.ej2.model.Tren;

public class MainVehiculos {
    public static void main(String[] args) {
        Avion a = new Avion(0,220,8);
        Barco b = new Barco(40, 100,100);
        Coche c = new Coche(10,130,4);
        Tren t = new Tren(20, 170,10);

        System.out.println("Avion:");
        System.out.println(a.despegar());
        a.acelerar(100);
        System.out.println("Velocidad actual: "+a.getVelocidad());
        a.decelerar(50);
        System.out.println("Velocidad actual: "+a.getVelocidad());
        a.frenar();
        System.out.println("-------------");
        System.out.println("Barco:");
        b.acelerar(100);
        System.out.println("Velocidad actual: "+b.getVelocidad());
        b.decelerar(50);
        System.out.println("Velocidad actual: "+b.getVelocidad());
        b.frenar();
        System.out.println("-------------");
        System.out.println("Coche:");
        c.acelerar(100);
        System.out.println("Velocidad actual: "+c.getVelocidad());
        c.decelerar(50);
        System.out.println("Velocidad actual: "+c.getVelocidad());
        System.out.println(c.pitar());
        c.frenar();
        System.out.println("-------------");
        System.out.println("Tren:");
        t.acelerar(100);
        System.out.println("Velocidad actual: "+t.getVelocidad());
        t.decelerar(50);
        System.out.println("Velocidad actual: "+t.getVelocidad());
        t.frenar();
        System.out.println("-------------");

    }
}
