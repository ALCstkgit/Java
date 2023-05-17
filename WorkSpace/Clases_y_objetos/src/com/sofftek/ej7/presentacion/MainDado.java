package com.sofftek.ej7.presentacion;

import com.sofftek.ej7.model.Dado;

import java.util.Scanner;

public class MainDado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dado d = new Dado();
        boolean sw = true;
        while (sw){
            d.lanzar();
            System.out.println("Quiere continuar? S/N");
            sw = sc.next().equalsIgnoreCase("S");
        }
    }
}
