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
public class Usuario {
    private String nombre;
    private int edad;
    private String user;
    private String pass;
    private ArrayList<PlayList> playlists = new ArrayList();
    private PlayList favoritos = new PlayList("Favoritos");

    public Usuario() {
    }

    public Usuario(String nombre, int edad, String user, String pass) {
        this.nombre = nombre;
        this.edad = edad;
        this.user = user;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ArrayList<PlayList> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<PlayList> playlists) {
        this.playlists = playlists;
    }

    public PlayList getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(PlayList favoritos) {
        this.favoritos = favoritos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
