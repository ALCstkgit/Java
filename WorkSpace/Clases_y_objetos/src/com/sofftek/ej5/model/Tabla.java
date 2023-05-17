package com.sofftek.ej5.model;

public class Tabla {
    private int num;

    public Tabla(int num){
        this.num = num;
    }

    public String getTabla(){
        String s = this.num+" x 1 = "+this.num+"\n";
        for(int i = 2; i < 11; i++){
            if(i == 10){
                s += this.num+" x "+i+" = "+this.num*i;
            }else{
                s += this.num+" x "+i+" = "+this.num*i+"\n";
            }
        }
        return s;
    }
}
