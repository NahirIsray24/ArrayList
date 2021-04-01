package com.ingreso.main; 
import java.util.Scanner;
package tp1;


public class TP1 {

    
    public static void main(String[] args) {
        
    Task  tareaUno;
    Task  tareaDos;
    Task  tareTres;
    
    tareaUno= new Task(); //instancie los objetos de la clase task
    tareaDos= new Task();
    tareTres= new Task();
       
    System.out.println("BIENVENIDOS");
    
    //DECLARACION DE VARIABLES
    private String descripcion; 
    private boolean estado; //completa o incompleta
    private Date fechaLimite;
    private boolean entregado;
    private boolean eliminado; 
    int menu=0;
     int opcion=0;
     int ingreso=0;
    Scanner entrada = new Scanner(System.in);
     do {
         System.out.println("OPCIONES");
        System.out.println("1-COMPLETAR TAREA");
        System.out.println("2-ELIMINAR TAREA");
        System.out.println("3-MOSTRAR TAREA");
        System.out.println("INGRESE UNA OPCION");
        
        opcion = entrada.nextLine();
         switch (opcion){
             case 1:
                 
                  System.out.println("---COMPLETAR TAREA---");
                   System.out.println("INGRESE LA TAREA 1 2 O 3");
                   ingreso= entrada.nextLine();
                   if(ingreso==1){
                  System.out.println("INGRESE LA DESCRIPCION DE LA TAREA 1");
                  descripcion= entrada.nextLine();
                  System.out.println("INGRESE EL ESTADO DE LA TAREA 1");
                  estado= entrada.nextLine();
                  System.out.println("INGRESE LA FECHA LIMITE 1 ");
                   fechaLimite= entrada.nextLine();
                   }
                   if(ingreso==2){
                   System.out.println("INGRESE LA DESCRIPCION DE LA TAREA 2");
                  descripcion= entrada.nextLine();
                  System.out.println("INGRESE EL ESTADO DE LA TAREA 2");
                  estado= entrada.nextLine();
                  System.out.println("INGRESE LA FECHA LIMITE 2 ");
                   fechaLimite= entrada.nextLine(); 
                   }
                   if (ingreso==3){
                   System.out.println("INGRESE LA DESCRIPCION DE LA TAREA 3");
                  descripcion= entrada.nextLine();
                  System.out.println("INGRESE EL ESTADO DE LA TAREA 3");
                  estado= entrada.nextLine();
                  System.out.println("INGRESE LA FECHA LIMITE 3 ");
                   fechaLimite= entrada.nextLine();
                   }
                  
                  
             case 2:
                 
             case 3:
                  
             
         }
     }   
     while(menu==0);
        
        
        
    }
    
}
