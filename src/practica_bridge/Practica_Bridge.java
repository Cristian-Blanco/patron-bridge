/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_bridge;

/**
 *
 * @author jorge malaver
 */
import ImplementadorTalla.*;//importamos todo de el paquete implementadorTalla
import Implementador.*;//importamos todo de implementador
import Abstraccion.*;//importamos todo de abstraccion
import java.util.Scanner;//importamos el scaner que nos ayudara a entrar datos al programa

public class Practica_Bridge {//creamos el main del programa

    public static Scanner in = new Scanner(System.in);//instanciamos el scanner para poder obtener datos a futuro


    public static void main(String[] args) {//realizamos el main
        Abstract_prenda prenda = null;//generamos una referencia nulla a abstract prenda
        int option = 0;//generamos una variable entera = 0
        // TODO code application logic here
        do {//realizamos un do while
            int optionPrenda = menuPrenda();//creamos una variable entera igual a la funcion entera menuPrenda
            int optionColor = menuColor();//creamos una variable entera igual a la funcion entera menucolor
            int optionTalla = menuTalla();//creamos una variable entera igual a la funcion entera menutalla
            switch (optionPrenda) {//realizamos un switch case que de entrada sera el valor de optionprenda
                case 1:
                    if (optionColor == 1 && optionTalla == 1) {//realizamos un condicional
                        prenda = new Buzo(new Amarillo(), new TallaS());//en el caso que se cumpla prenda sera igual a la instanciacion de buzo con sus respecticos valores de entrada
                    } else if (optionColor == 1 && optionTalla == 2) {//realizamos un condicional
                        prenda = new Buzo(new Amarillo(), new TallaM());//en el caso que se cumpla prenda sera igual a la instanciacion de buzo con sus respecticos valores de entrada
                    } else if (optionColor == 1 && optionTalla == 3) {//realizamos un condicional
                        prenda = new Buzo(new Amarillo(), new TallaL());//en el caso que se cumpla prenda sera igual a la instanciacion de buzo con sus respecticos valores de entrada
                    } else if (optionColor == 1 && optionTalla == 4) {//realizamos un condicional
                        prenda = new Buzo(new Amarillo(), new TallaXL());//en el caso que se cumpla prenda sera igual a la instanciacion de buzo con sus respecticos valores de entrada
                    } else if (optionColor == 2 && optionTalla == 1) {//realizamos un condicional
                        prenda = new Buzo(new Azul(), new TallaS());//en el caso que se cumpla prenda sera igual a la instanciacion de buzo con sus respecticos valores de entrada
                    } else if (optionColor == 2 && optionTalla == 2) {//realizamos un condicional
                        prenda = new Buzo(new Azul(), new TallaM());//en el caso que se cumpla prenda sera igual a la instanciacion de buzo con sus respecticos valores de entrada
                    } else if (optionColor == 2 && optionTalla == 3) {//realizamos un condicional
                        prenda = new Buzo(new Azul(), new TallaL());//en el caso que se cumpla prenda sera igual a la instanciacion de buzo con sus respecticos valores de entrada
                    } else if (optionColor == 2 && optionTalla == 4) {//realizamos un condicional
                        prenda = new Buzo(new Azul(), new TallaXL());//en el caso que se cumpla prenda sera igual a la instanciacion de buzo con sus respecticos valores de entrada
                    } else if (optionColor == 3 && optionTalla == 1) {//realizamos un condicional
                        prenda = new Buzo(new Rojo(), new TallaS());//en el caso que se cumpla prenda sera igual a la instanciacion de buzo con sus respecticos valores de entrada
                    } else if (optionColor == 3 && optionTalla == 2) {//realizamos un condicional
                        prenda = new Buzo(new Rojo(), new TallaM());//en el caso que se cumpla prenda sera igual a la instanciacion de buzo con sus respecticos valores de entrada
                    } else if (optionColor == 3 && optionTalla == 3) {//realizamos un condicional
                        prenda = new Buzo(new Rojo(), new TallaL());//en el caso que se cumpla prenda sera igual a la instanciacion de buzo con sus respecticos valores de entrada
                    } else if (optionColor == 3 && optionTalla == 4) {//realizamos un condicional
                        prenda = new Buzo(new Rojo(), new TallaXL());//en el caso que se cumpla prenda sera igual a la instanciacion de buzo con sus respecticos valores de entrada
                    }

                    break;//rompemos el switch
                case 2:
                    if (optionColor == 1 && optionTalla == 1) {//realizamos un condicional
                        prenda = new Chaqueta(new Amarillo(), new TallaS());//en el caso que se cumpla prenda sera igual a la instanciacion de chaqueta con sus respecticos valores de entrada
                    } else if (optionColor == 1 && optionTalla == 2) {//realizamos un condicional
                        prenda = new Chaqueta(new Amarillo(), new TallaM());//en el caso que se cumpla prenda sera igual a la instanciacion de chaqueta con sus respecticos valores de entrada
                    } else if (optionColor == 1 && optionTalla == 3) {//realizamos un condicional
                        prenda = new Chaqueta(new Amarillo(), new TallaL());//en el caso que se cumpla prenda sera igual a la instanciacion de chaqueta con sus respecticos valores de entrada
                    } else if (optionColor == 1 && optionTalla == 4) {//realizamos un condicional
                        prenda = new Chaqueta(new Amarillo(), new TallaXL());//en el caso que se cumpla prenda sera igual a la instanciacion de chaqueta con sus respecticos valores de entrada
                    } else if (optionColor == 2 && optionTalla == 1) {//realizamos un condicional
                        prenda = new Chaqueta(new Azul(), new TallaS());//en el caso que se cumpla prenda sera igual a la instanciacion de chaqueta con sus respecticos valores de entrada
                    } else if (optionColor == 2 && optionTalla == 2) {//realizamos un condicional
                        prenda = new Chaqueta(new Azul(), new TallaM());//en el caso que se cumpla prenda sera igual a la instanciacion de chaqueta con sus respecticos valores de entrada
                    } else if (optionColor == 2 && optionTalla == 3) {//realizamos un condicional
                        prenda = new Chaqueta(new Azul(), new TallaL());//en el caso que se cumpla prenda sera igual a la instanciacion de chaqueta con sus respecticos valores de entrada
                    } else if (optionColor == 2 && optionTalla == 4) {//realizamos un condicional
                        prenda = new Chaqueta(new Azul(), new TallaXL());//en el caso que se cumpla prenda sera igual a la instanciacion de chaqueta con sus respecticos valores de entrada
                    } else if (optionColor == 3 && optionTalla == 1) {//realizamos un condicional
                        prenda = new Chaqueta(new Rojo(), new TallaS());//en el caso que se cumpla prenda sera igual a la instanciacion de chaqueta con sus respecticos valores de entrada
                    } else if (optionColor == 3 && optionTalla == 2) {//realizamos un condicional
                        prenda = new Chaqueta(new Rojo(), new TallaM());//en el caso que se cumpla prenda sera igual a la instanciacion de chaqueta con sus respecticos valores de entrada
                    } else if (optionColor == 3 && optionTalla == 3) {//realizamos un condicional
                        prenda = new Chaqueta(new Rojo(), new TallaL());//en el caso que se cumpla prenda sera igual a la instanciacion de chaqueta con sus respecticos valores de entrada
                    } else if (optionColor == 3 && optionTalla == 4) {//realizamos un condicional
                        prenda = new Chaqueta(new Rojo(), new TallaXL());//en el caso que se cumpla prenda sera igual a la instanciacion de chaqueta con sus respecticos valores de entrada
                    }

                    break;//rompemos el switch
                case 3:
                    if (optionColor == 1 && optionTalla == 1) {//realizamos un condicional
                        prenda = new Pantalon(new Amarillo(), new TallaS());//en el caso que se cumpla prenda sera igual a la instanciacion de pantalon con sus respecticos valores de entrada
                    } else if (optionColor == 1 && optionTalla == 2) {//realizamos un condicional
                        prenda = new Pantalon(new Amarillo(), new TallaM());//en el caso que se cumpla prenda sera igual a la instanciacion de pantalon con sus respecticos valores de entrada
                    } else if (optionColor == 1 && optionTalla == 3) {//realizamos un condicional
                        prenda = new Pantalon(new Amarillo(), new TallaL());//en el caso que se cumpla prenda sera igual a la instanciacion de pantalon con sus respecticos valores de entrada
                    } else if (optionColor == 1 && optionTalla == 4) {//realizamos un condicional
                        prenda = new Pantalon(new Amarillo(), new TallaXL());//en el caso que se cumpla prenda sera igual a la instanciacion de pantalon con sus respecticos valores de entrada
                    } else if (optionColor == 2 && optionTalla == 1) {//realizamos un condicional
                        prenda = new Pantalon(new Azul(), new TallaS());//en el caso que se cumpla prenda sera igual a la instanciacion de pantalon con sus respecticos valores de entrada
                    } else if (optionColor == 2 && optionTalla == 2) {//realizamos un condicional
                        prenda = new Pantalon(new Azul(), new TallaM());//en el caso que se cumpla prenda sera igual a la instanciacion de pantalon con sus respecticos valores de entrada
                    } else if (optionColor == 2 && optionTalla == 3) {//realizamos un condicional
                        prenda = new Pantalon(new Azul(), new TallaL());//en el caso que se cumpla prenda sera igual a la instanciacion de pantalon con sus respecticos valores de entrada
                    } else if (optionColor == 2 && optionTalla == 4) {//realizamos un condicional
                        prenda = new Pantalon(new Azul(), new TallaXL());//en el caso que se cumpla prenda sera igual a la instanciacion de pantalon con sus respecticos valores de entrada
                    } else if (optionColor == 3 && optionTalla == 1) {//realizamos un condicional
                        prenda = new Pantalon(new Rojo(), new TallaS());//en el caso que se cumpla prenda sera igual a la instanciacion de pantalon con sus respecticos valores de entrada
                    } else if (optionColor == 3 && optionTalla == 2) {//realizamos un condicional
                        prenda = new Pantalon(new Rojo(), new TallaM());//en el caso que se cumpla prenda sera igual a la instanciacion de pantalon con sus respecticos valores de entrada
                    } else if (optionColor == 3 && optionTalla == 3) {//realizamos un condicional
                        prenda = new Pantalon(new Rojo(), new TallaL());//en el caso que se cumpla prenda sera igual a la instanciacion de pantalon con sus respecticos valores de entrada
                    } else if (optionColor == 3 && optionTalla == 4) {//realizamos un condicional
                        prenda = new Pantalon(new Rojo(), new TallaXL());//en el caso que se cumpla prenda sera igual a la instanciacion de pantalon con sus respecticos valores de entrada
                    }

                    break;//rompemos el switch
            }
            prenda.prenda();//Gracias a la referencia prenda dependiendo del valor asignado podemos llamar el metodo prenda() de la clase abstracta abstract_prenda
            System.out.println("Presiona 1 para comenzar de nuevo o´presiona 0 para salir");//imprimimos texto
            option=in.nextInt();//el usuario selecciona si desea quedarse o salir
        } while (option != 0);

    }

    public static int menuPrenda() {//realizamos una funcion de tipo entera que sea la prenda escogida
        System.out.println("Ingresa que producto deseas crear");//imprimimos texto
        System.out.println("Ingresa 1 para crear un buzo");//imprimimos texto
        System.out.println("Ingresa 2 para crear una chaqueta");//imprimimos texto
        System.out.println("Ingresa 3 para crear un pantalon");//imprimimos texto
        return in.nextInt();//retornamos lo que el usuario haya escogido
    }

    public static int menuColor() {//realizamos una funcion de tipo entera que sea el color escogido
        System.out.println("Ingresa el color que deseas");//imprimimos texto
        System.out.println("Ingresa 1 si deseas color amarillo");//imprimimos texto
        System.out.println("Ingresa 2 si deseas color azul");//imprimimos texto
        System.out.println("Ingresa 3 si deseas color rojo");//imprimimos texto
        return in.nextInt();//retornamos lo que el usuario haya escogido
    }

    public static int menuTalla() {//realizamos una funcion de tipo entera que sea la talla escogida
        System.out.println("Ingresa la talla que deseas");//imprimimos texto
        System.out.println("Ingresa 1 si deseas talla S");//imprimimos texto
        System.out.println("Ingresa 2 si deseas talla M");//imprimimos texto
        System.out.println("Ingresa 3 si deseas talla L");//imprimimos texto
        System.out.println("Ingresa 4 si deseas talla XL");//imprimimos texto
        return in.nextInt();//retornamos lo que el usuario haya escogido
    }

}
