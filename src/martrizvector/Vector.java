/*|
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martrizvector;

import java.util.Scanner;

/**
 *
 * @author julian arias
 */
public class Vector implements OrientacionInterface{
    private int []vector;
    private int tamaño;
    private int aux;
    private int i,j;

    public int  Tamaño() {
        Scanner tam = new Scanner(System.in);
        System.out.println("digite el tamaño del vector: ");
        tamaño = tam.nextInt();
        vector = new int [tamaño];
        for ( i=0; i < vector.length ; i++){
            System.out.print("digite el valor de la posicion  "+(i+1)+":"); 
            vector [i] = tam.nextInt();   
            }
        System.out.println("los valores del vector son: ");
            for( i = 0; i < vector.length ; i++){
             
            System.out.println(vector[i]);
                    }
            
        return 0;
            }

    @Override
    public void desendente() {
       for(i=0;i < vector.length;i++){
                for(j=i+1;j<vector.length;j++){
                    System.out.println("esta imprimiendo"+vector[i]+vector[j]);
                    if(vector[i]<vector[j]){
                        aux=vector[i];
                        vector[i]=vector[j];
                        vector[j]=aux;
                    }
                }
            }
            System.out.println("el vector oredenado es ");
            for(i=0;i<vector.length;i++){
                System.out.println(vector[i]);
            }
    }

    @Override
    public void asendente() {
      // Vector r = new Vector();
       //r.Tamaño();
        
        
            for (i=0; i < vector.length ; i++){
                for( j = i+1 ; j < vector.length; j++){
                   if(vector[i] > vector[j]){
                         
                        aux = vector[i];
                        vector[i] = vector[j];
                        vector[j] = aux;
                    }
                }
            }
            System.out.println("el vector odenado es: ");
            for ( i=0;i < vector.length;i++){
        System.out.println(vector [i]);
       //return vector[i];
            }
            
       }// aux=1   vectorj=2      3
       
 
}
