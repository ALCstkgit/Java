package com.sofftek.ej1.presentacion;

import com.sofftek.ej1.model.Cactus;
import com.sofftek.ej1.model.PlantaTropical;

public class MainPlantas {
    public static void main(String[] args) {
        PlantaTropical pt = new PlantaTropical(10,20);
        Cactus c = new Cactus("Desertico",true);

        pt.regar(2,10);
        c.regar(3,20);
    }
}
