package com.sofftek.ej1.model;

public class Cactus extends Planta{
    private boolean alucinogeno;
    public Cactus(String clima,boolean alucinogeno){
        super.clima = clima;
        this.alucinogeno = alucinogeno;
    }
    public Cactus(){
        super.clima = "";
        this.alucinogeno = false;
    }
    @Override
    public void regar(int cantidad, int tiempo) {
        System.out.println("Planta regada con "+cantidad+" durante "+tiempo+" cactus");
    }
}
