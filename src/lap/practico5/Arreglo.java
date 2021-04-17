/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap.practico5;

/**
 *
 * @author kevin
 */
public class Arreglo {
    
    public static void sumarLista(int num[]){
         int suma = 0;
         for(int i=0; i<num.length; i++){          
             suma += num[i];
         }
     
         System.out.println("suma de los num en el arreglo "+suma+ " y este es el promedio: "+suma/num.length);
     }
    
    public static int buscarMayor(int n[][]){
        int mayor = 0;
        for(int i=0; i<n.length; i++){
            for(int e=0; e<n[i].length; e++){
                if(mayor<n[i][e]){
                    mayor=n[i][e];
                }
            }
        }
        return mayor;
    }
    
    public static int cuentaVocales(String b){
        char frase[]= b.toCharArray();
        int cont=0;
        for(int i=0; i<frase.length; i++){
            if(frase[i]=='a'||frase[i]=='e'||frase[i]=='i'||frase[i]=='o'||frase[i]=='u'){
                cont++;
            }
        }
        return cont;
    }
    
    public static int cuentaCaracter(String b, char c){
        char frase[]= b.toCharArray();
        int cont=0;
        for(int i=0; i<frase.length; i++){
            if(frase[i]==c){
                cont++;
            } else {
            }
        }
        return cont;
    }
}
