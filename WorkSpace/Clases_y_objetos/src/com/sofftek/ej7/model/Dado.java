package com.sofftek.ej7.model;

import java.util.Random;

public class Dado {
    private int numActual;

    public Dado(){
        this.numActual = (int)((Math.random()*6+1));
    }

    public void lanzar(){
        this.numActual = (int)((Math.random()*6+1));
        switch (this.numActual){
            case 1:
                uno();
                break;
            case 2:
                dos();
                break;
            case 3:
                tres();
                break;
            case 4:
                cuatro();
                break;
            case 5:
                cinco();
                break;
            default:
                seis();
                break;
        }
    }
    private void uno(){
        System.out.println("   ");
        System.out.println(" * ");
        System.out.println("   ");
    }
    private void dos(){
        System.out.println("*  ");
        System.out.println("   ");
        System.out.println("  *");
    }
    private void tres(){
        System.out.println("*  ");
        System.out.println(" * ");
        System.out.println("  *");
    }
    private void cuatro(){
        System.out.println("* *");
        System.out.println("   ");
        System.out.println("* *");
    }
    private void cinco(){
        System.out.println("* *");
        System.out.println(" * ");
        System.out.println("* *");
    }
    private void seis(){
        System.out.println("* *");
        System.out.println("* *");
        System.out.println("* *");
    }
}
