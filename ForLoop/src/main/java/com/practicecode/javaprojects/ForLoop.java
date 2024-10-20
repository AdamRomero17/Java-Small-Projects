/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.practicecode.javaprojects;

/**
 *
 * @author Intel
 */
public class ForLoop {

    public static void main(String[] args) {
        //RIGHT TRIANGLE
       /*int star1 = 5;
       for(int i = 1; i <= star1; i++){
           for(int j = 1; j <= i; j++){
              System.out.print("*");
           }
           System.out.println("");
       }*/
       
       //EQUILATERAL Tringle
       int star = 5;
       for(int i = 1; i <= star; i++){
           for(int j = i; j < star; j++){
               System.out.print(".");
           }
           for(int j = 1; j <= (2 * i - 1); j++){
               System.out.print(j);
           }
          System.out.println(); 
       }
       
    }
}
