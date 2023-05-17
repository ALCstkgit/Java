package com.sofftek.ej6.model;

public class Alumno {
    private String nombreCompleto;
    private int[][] notas;

    public Alumno(int numParciales, int numNotas, String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
        this.notas = new int[numParciales][numNotas];
    }

    public String mediaParciales(){
        String out = "";
        for(int i = 0; i < notas.length; i++){
            out += "Media del parcial "+(i+1)+": ";
            double media = 0;
            for(int j = 0; j < notas[i].length; j++){
                media += notas[i][j];
            }
            out += (media/notas[i].length)+"\n";
        }
        return out;
    }
    public String notasParciales(){
        String out = "";
        for(int i = 0; i < notas.length; i++){
            out += "Notas del parcial "+(i+1)+": ";
            for(int j = 0; j < notas[i].length; j++){
                out += notas[i][j]+", ";
            }
            out += "\n";
        }
        return out;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int[][] getNotas() {
        return notas;
    }

    public void setNotas(int[][] notas) {
        this.notas = notas;
    }
}
