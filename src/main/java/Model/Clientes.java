/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author SENA
 */
public class Clientes extends Personas{

    public Clientes(int Id, String Nombre, String Apellidos, String Direccion) {
        super(0, Nombre, Apellidos, Direccion);
    }
    
    public void despedida (){
        System.out.println("Chao "+getNombre());
    }
    
}