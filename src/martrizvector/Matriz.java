/*
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
public class Matriz implements OrientacionInterface{
      private int [][]vector;
    private int tamaño;
    private int aux,aux1=0 ;
    private int i,j,k,l;
    private int cont=0;
    private int [][]matrizAux; 
    
    public void Tamaño(){
         Scanner tam = new Scanner(System.in);
        System.out.println("digite el tamaño del la Matriz solo recibe matrices cuadradas: ");
        tamaño = tam.nextInt();
        vector = new int [tamaño][tamaño];
        
        System.out.println("digite el valor de cada posicion: ");
        for(i=0; i <vector.length; i++){
            for(j=0; j < vector.length; j++){
                System.out.println("["+(i+1)+"]"+"["+(j+1)+"]");
                vector [i][j] = tam.nextInt();
               
            }
        }
   
        System.out.println("la matriz es:");
         for(i=0; i<vector.length; i++){
            for(j=0; j<vector.length; j++){
                 System.out.println(vector[i][j]);
            }
    }
        
  }
    
    @Override
    public void desendente() {
         for (i=0; i<vector.length; i++){
            //for(k=0;k<vector.length;k++){
             for ( k =i+1; k <vector.length;k++){
                System.out.println("este imprime "+vector[i][k]);
               for(j=0; j<vector.length;j++){
                   //for(l = j+1; j < vector.length ; l++){    
                       for( l =0 ; l<vector.length;l++){
                            
                         //System.out.println("este imprime"+vector [j][l]);
                        
                         
                         System.out.println("imprime"+vector[i][j]+vector[k][l]);
                        if (vector [i][j] < vector [l][k]){
                            
                         aux  = vector [i][k];
                         aux1 = vector [j][l];
                         //vector [k][l]= vector[i][j];
                         vector [i][k]=vector [j][l];
                         vector [k][l]= aux;
                         //vector [i][j]=aux;
                   //     }
                   
                     }
                      
                 }
             }
         } 
    }
         //}
         
         System.out.println("la Matriz ordenada es : ");
         for(i= 0 ; i <vector.length; i++){
             for(j = 0; j< vector.length; j++){
            System.out.println(vector [i][j]);        
             }
         }
         
}
    
    @Override
    public void asendente() {
         for (i=0; i<vector.length; i++){
             for(j=0; j<vector.length;j++){
                System.out.println("este imprime "+vector[i][j]);
                    matrizAux [cont][aux1] = vector [i][j];
                            cont++;
                            aux++;
                            System.out.println("este imprime " + matrizAux[cont][aux1]);
                   /*      //System.out.println("este imprime"+vector [j][l]);
                        
                         
                         System.out.println("imprime"+vector[i][j]+vector[k][l]);
                        if (matrizAux [i] > matrizAux[ i+1]){
                            
                             aux = matrizAux[i];
                            matrizAux [i]= matrizAux[i+1];
                            matrizAux[i+1] = aux;
                             
                   //     }
                   
                     }
                      
                 }
         
         
    }
         //}
         cont = 0;
         System.out.println("la Matriz ordenada es : ");
         for(i= 0 ; i <vector.length; i++){
             for(j = 0; j< vector.length; j++){
                 vector[i][j] = matrizAux[cont];
            System.out.println(vector [i][j]);        
             */}
         }
    }
}
