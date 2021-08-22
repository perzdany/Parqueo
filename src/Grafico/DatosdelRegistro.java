/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

/**
 *
 * @author 50684
 */
public class DatosdelRegistro {

    String total;
    String Perfil;
    String nombre;
    String Pass;

    public String getPerfil() {
        return Perfil;
    }

    public void setPerfil(String Perfil) {
        this.Perfil = Perfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    @Override
    public String toString() {
        return "DatosdelRegistro{" + "Perfil=" + Perfil + ", nombre=" + nombre + ", Pass=" + Pass + ",total=" + total + '}';
    }

}
