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
public class MartrizVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("-----");
        System.out.println("1.-vector");
        System.out.println("2.-matriz");
        
        int op,opcion;
        boolean m =true;
       Scanner s = new Scanner(System.in);
    System.out.print(" digite una opcion: ");
      op = s.nextInt();
//      do{
      if (op == 1){
          Vector v = new Vector();
          v.Tamaño();
          System.out.println("1.-ascendente ");
          System.out.println("2.-descendente ");
          System.out.println("digite la opcion y enter: ");
          opcion = s.nextInt();
          switch (opcion){
              case 1:
                  v.asendente();
              break;
              case 2:
                  v.desendente();
                  break;
          }
      }  
                   
//v.asendente();
   //   }while(m);
      if (op == 2){
          Matriz ma = new Matriz();
          ma.Tamaño();
          System.out.println("1.-ascendente ");
          System.out.println("2.-descendente ");
          System.out.println("digite la opcion y enter: ");
          opcion = s.nextInt();
               switch (opcion){
              case 1:
                  ma.asendente();
              break;
              case 2:
                  ma.desendente();
                  break;
          }
 
      }
        
    }
    
    
}
