/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_andresmoncada;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Admin {
    private ArrayList<Usuario> usuarios = new ArrayList();
    private File archivo = null;

    public Admin(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setPersonas(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Admin{" + "usuarios=" + usuarios + '}';
    }

    public void addU (Usuario u){
        usuarios.add(u);
    }

    public void cargarArchivo(){
        try {
            usuarios = new ArrayList();
            Usuario temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp = (Usuario) objeto.readObject()) != null){
                        usuarios.add(temp);
                    }
                } catch (EOFException ex) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo(){
        FileOutputStream fo = null;
        ObjectOutputStream os = null;
        try {
            fo = new FileOutputStream(archivo);
            os = new ObjectOutputStream(fo);
            for (Usuario u : usuarios) {
                os.writeObject(u);
            }
            os.flush();
        } catch (Exception e) {
        }finally{
            try {
                os.close();
                fo.close();
            } catch (Exception e) {
            }
        }
    }
}
