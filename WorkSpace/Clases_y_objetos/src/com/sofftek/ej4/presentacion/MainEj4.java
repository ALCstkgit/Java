package com.sofftek.ej4.presentacion;
import com.sofftek.ej4.model.Campos;

public class MainEj4 {
    public static void main(String[] args) {
        Campos c = new Campos(7);
        System.out.println("Valor Inicial:"+c.mostrar());
        c.incrementar(2);
        System.out.println("Valor Final:"+c.mostrar());
    }
}