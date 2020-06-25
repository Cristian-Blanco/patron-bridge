/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ImplementadorTalla;

/**
 *
 * @author jackl
 */
public class TallaM implements Seleccion_talla{//Creamos una clase llamada TallaM que implemente la interface Seleccion_talla
    @Override//Nos ayuda a sobreescribir el metodo
     public void Seleccionar_talla(){//sobreescribimos el metodo
       
        System.out.println("Talla M");//imprimimos un String, en este caso el texto es Tallam
    }
}
