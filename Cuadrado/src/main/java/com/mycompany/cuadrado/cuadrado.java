/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cuadrado;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class cuadrado {
    static Scanner entrada = new Scanner (System.in);
    
    public static void main (String args[]){
        
        int lado ;
        
       System.out.println("Indica el lado:");
       lado= entrada.nextInt();
       
       System.out.println("area del cuadrado es " +lado*lado);
        
        
        
        
        
        
    }
    
}
