package com.softtek.ejercicioTaller.presentacion;

import com.softtek.ejercicioTaller.model.Coche;
import com.softtek.ejercicioTaller.model.SeguroCoche;
import com.softtek.ejercicioTaller.model.TallerMecanica;
import com.softtek.ejercicioTaller.model.TallerPintura;

public class MainTaller {
    public static void main(String[] args) {
        Coche c = new Coche("244223","audi muy caro");
        TallerMecanica m = new TallerMecanica();
        TallerPintura p = new TallerPintura();
        SeguroCoche s1 = new SeguroCoche(m,"mecanica");
        SeguroCoche s2 = new SeguroCoche(p,"pintura");

        System.out.println(s1.reparar(c));
        System.out.println(s2.reparar(c));
    }
}
