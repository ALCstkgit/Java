package com.softtek.ejercicioDAO.presentacion;

import com.softtek.ejercicioDAO.model.AccesoDesarrollo;
import com.softtek.ejercicioDAO.model.AccesoProduccion;
import com.softtek.ejercicioDAO.model.Cliente;
import com.softtek.ejercicioDAO.model.ClienteDao;

public class MainDao {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        AccesoDesarrollo ad = new AccesoDesarrollo();
        AccesoProduccion ap = new AccesoProduccion();
        ClienteDao cd1 = new ClienteDao(ad);
        ClienteDao cd2 = new ClienteDao(ap);

        System.out.println(cd1.insertar(c));
        System.out.println(cd2.insertar(c));
    }
}
