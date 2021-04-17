/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap.practico5;

import static lap.practico5.Arreglo.*;




/**
 *
 * @author kevin
 */
public class PruebaArreglo {

    
    
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};
        int e[][]= {{ 5, 4, 6}, { 4, 7, 8}, { 2, 3, 4}, { 7, 9}};
        String b="murcielago";
        String c="estaba batman en la casa de robin";
        //muestra por pantall la suma de los numeros en el arreglo y el promedio.
        sumarLista(a);
        //Retorna el num mayor de un un arreglo bidimensional e irregular.
        System.out.println(buscarMayor(e));
        //Recibe un string y devuelve la cantidad de vocales.
        System.out.println(cuentaVocales(b));
        //recibe un string y un caracter y cuenta cuantes veces aparece el caracter en el string.
        System.out.println(cuentaCaracter(c, 'e'));
    }
}


     

