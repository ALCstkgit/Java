package com.sofftek.ej6.presentacion;

import com.sofftek.ej6.model.Alumno;

import java.util.Scanner;

public class MainAlumno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alumno a = new Alumno(3,5,"Antonio");

        System.out.println("Escriba las notas por parcial:");
        for(int i = 0; i < a.getNotas().length; i++){
            System.out.println("Notas parcial "+(i+1)+": ");
            for(int j = 0; j < a.getNotas()[i].length; j++){
                System.out.println("Nota "+(j+1));
                a.getNotas()[i][j] = sc.nextInt();
            }
        }

        System.out.println(a.notasParciales());
        System.out.println(a.mediaParciales());
    }
}
