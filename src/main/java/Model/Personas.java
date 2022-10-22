/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import INTERFAZ.InterfacesPersonas;


/**
 *
 * @author SENA
 */
abstract public class Personas implements InterfacesPersonas{
    
    private int Id;
    private String Nombre;
    private String Apellidos;
    private String Direccion;

    public Personas(int Id, String Nombre, String Apellidos, String Direccion) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    public void saludar(){
        System.out.println("Hola ¿Como estas? "+getNombre()+" "+getApellidos());
    }
    
        @Override
    public void guardar(int Id, String Nombre) {
        
        /**
         * *
        *primero hacemos el llamada al procedimiento almacenado y
        *posteriormente guardamos en la bd
        */
    }

    @Override
    public boolean buscar(int Id) {
        
        boolean sw = false;
        
        if(Id>0){
            /**
             * llammamos al procedimiento almacenado le paso por parametro el id y lo que me retorne eso enviamos 
             */
            
            //sw = procbuscar(id);
        }
        return sw;
        
    }
    
}