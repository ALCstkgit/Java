package com.softtek.ejercicioVolador.presentacion;

import com.softtek.ejercicioVolador.model.*;

public class MainVolador {
    public static void main(String[] args) {
        ObjetoVolador[] obVoladores = {new Ave(), new Superman(), new Hidroavion(), new Helicoptero(), new Avion()};
        Nautico[] obNauticos = {new Barcaza(), new Hidroavion()};
        System.out.println("Objetos Voladores:");
        System.out.println("***********");
        for (ObjetoVolador o : obVoladores){
            System.out.println(o.getClass());
            System.out.println(o.despegar());
            System.out.println(o.aterrizar());
            System.out.println(o.volar());
            if(o instanceof Ave){
                System.out.println(((Ave) o).hacerNido());
                System.out.println(((Ave) o).ponerHuevos());
            }else if(o instanceof Superman){
                System.out.println(((Superman) o).saltarEdificio());
                System.out.println(((Superman) o).detenerBala());
            }else if(o instanceof Hidroavion){
                System.out.println(((Hidroavion) o).atracar());
                System.out.println(((Hidroavion) o).navegar());
            }
            System.out.println("---------");
        }
        System.out.println("Objetos Nauticos:");
        System.out.println("***********");
        for(Nautico n : obNauticos){
            System.out.println(n.getClass());
            System.out.println(n.atracar());
            System.out.println(n.navegar());
            if(n instanceof Hidroavion){
                System.out.println(((Hidroavion) n).despegar());
                System.out.println(((Hidroavion) n).aterrizar());
                System.out.println(((Hidroavion) n).volar());
            }
            System.out.println("---------");
        }
    }
}
