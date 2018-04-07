/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;
import java.util.ArrayList;
/**
 *
 * @author david_000
 */
public class Proveedor {
    private ArrayList<Empresas> Empresas;
    private String nombre, correo, apellidos, telefono;
    
    public Proveedor(){
    this.Empresas= new ArrayList<>();
    }
public Proveedor(String nombre, String correo, String apellidos, String telefono){
    this.nombre=nombre;
    this.correo=correo;
    this.apellidos=apellidos;
    this.telefono=telefono;
}

    public ArrayList<Empresas> getEmpresas() {
        return Empresas;
    }

    public void setEmpresas(ArrayList<Empresas> Empresas) {
        this.Empresas = Empresas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}

