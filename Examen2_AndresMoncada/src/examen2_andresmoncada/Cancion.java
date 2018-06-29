/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_andresmoncada;

/**
 *
 * @author Dell
 */
public class Cancion {
    private String nombre;
    private String artista;
    private String genero;
    private int duracion;
    private Object[] row;

    public Cancion() {
    }

    public Cancion(String nombre, String artista, String genero, int duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Object[] getRow() {
        row = new Object[4];
        row[0] = nombre;
        row[1] = artista;
        row[2] = genero;
        row[4] = duracion;
        return row;
    }

    @Override
    public String toString() {
        return nombre + " Artista: " + artista + " " + duracion + 's';
    }
    
}
