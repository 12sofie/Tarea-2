/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg2;

import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class Tarea_2 {

    /**
     * @param args the command line arguments
     */ 
    @SuppressWarnings("null")
    public static void main(String[] args) {
    Scanner cadena = new Scanner(System.in);
    String operacion;  
    System.out.println("Ingrese la operacion que desea realizar en una sola linea con espacios: ");  
    operacion= cadena.nextLine(); 
   String numero1;         
   String numero2;  
   String operador;  
   numero1 =operacion.split(" ")[0];
   numero2 =operacion.split(" ")[2];
   operador =operacion.split(" ")[1];
   int n1; 
   int n2;
   n1= Integer.parseInt(numero1);
   n2=Integer.parseInt(numero2);
   String mas= "+";
   String menos= "-";
   String division= "/";
   String multiplicacion= "*";
   int Suma= n1+n2;
   int Resta= n1-n2;
   int Div = n1/n2;
   int Mult= n1*n2;
   if (operador == null ? mas == null : operador.equals(mas) ){
      System.out.println("El resultado de la operacion  es : " + Suma );   
   }
   if (operador == null ? menos == null : operador.equals(menos) ){
      System.out.println("El resultado de la operacion es : " + Resta );  
   }
   if (operador == null ? division == null : operador.equals(division) ){
      System.out.println("El resultado de la operacion  es : " + Div ); 
   }
   if (operador == null ? multiplicacion == null : operador.equals(multiplicacion) ){
      System.out.println("El resultado de la operacion  es : " + Mult ); 
   }
    }
}

