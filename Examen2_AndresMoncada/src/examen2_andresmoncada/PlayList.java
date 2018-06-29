/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_andresmoncada;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class PlayList {
    private String nombre;
    private ArrayList<Cancion> canciones = new ArrayList();

    public PlayList() {
    }

    public PlayList(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return nombre + " Canciones: " + canciones.size();
    }
    
}
