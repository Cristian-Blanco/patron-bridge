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
import ImplementadorTalla.Seleccion_talla;
import Implementador.*;
public abstract class Abstract_prenda {//
    
   protected Seleccion_color tono; //referencia hacia  objeto implementador
   protected Seleccion_talla talla;
   public Abstract_prenda(Seleccion_color tono, Seleccion_talla talla ){//referencia hacia la implementacion
       this.talla=talla;
       this.tono= tono; 
   }
   
   public abstract void prenda();//metodo a implementar n las clases concretas
   
 
   
   
}
