/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementador;

/**
 *
 * @author jorge malaver
 */
public class Azul implements Seleccion_color{//Creamos una clase llamada Azul que implemente la interface Seleccion_color
    
     @Override//Nos ayuda a sobreescribir el metodo
     public void Seleccionar_color(){//sobreescribimos el metodo
       
        System.out.println("Azul");//imprimimos un String, en este caso el texto es Azul
    }
}
