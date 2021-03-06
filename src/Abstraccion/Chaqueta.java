/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraccion;

/**
 *
 * @author jorge malaver
 */
import ImplementadorTalla.Seleccion_talla;//importamos del paquete Implementadortalla la interface
import Implementador.*;//importamos del paquete Implementador todo

public class Chaqueta extends Abstract_prenda{//creamos una clase que implemente la clase abstract_prenda
    
    public Chaqueta(Seleccion_color tono, Seleccion_talla talla){//realiamos el constructor de la clase donde su entrada sera una referencia a la interface de seleccion_color
     super(tono,talla);   //heredamos todos los atributos de abstract_prenda
    }
    
    @Override//Nos ayuda a sobreescribir el metodo implementado abstract prenda
    public void prenda(){//implementaion del metodo abstracto
        System.out.println("\n\nHas seleccionado la chaqueta");//imprimimos texto
        System.out.println("----------------------------");//imprimimos texto
        System.out.println("            Color         ");//imprimimos texto
        tono.Seleccionar_color();//con base a la referencia obtenida al constructor, podemos llamar el metodo de seleccion color que nos imprima el color
        System.out.println("----------------------------");//imprimimos texto
        System.out.println("            Tamaño        ");//imprimimos texto
        talla.Seleccionar_talla();//con base a la referencia obtenida al constructor, podemos llamar el metodo de seleccion talla que nos imprima la talla
        System.out.println("----------------------------\n\n");//imprimimos texto
    }
}
