
  import  java.util.Scanner; //para la entrada de datos
//   import java.util.Date; //paquete para Date
  
//package TP1;

public class TP1 {

    
    public static void main(String[] args) {
        
    Task  TareaUno;
    Task  TareaDos;
    Task  TareaTres;
    
    TareaUno= new Task(); //instancie los objetos de la clase task
    TareaDos= new Task();
    TareaTres= new Task();
       
    System.out.println("BIENVENIDOS");
    
    //DECLARACION DE VARIABLES
     String descrip; 
     boolean ESTADO; //completa o incompleta
     int DIA,MES,ANIO;
     boolean entreg;
     boolean elimin; 
    int menu=0,opcion=0,ingreso=0;
    int mes=0, dia=0 ,anio=0;
   
    Scanner entrada = new Scanner(System.in);
     //fechaLim = new Date(22/3/2021);
     do{
         System.out.println("OPCIONES");
        System.out.println("1-COMPLETAR TAREA");
        System.out.println("2-VER LISTADO");
        System.out.println("3-MOSTRAR UNA TAREA");
        System.out.println("4-MARCAR UNA TAREA COMO HECHA");
        System.out.println("5-ELIMINAR UNA TAREA");
        System.out.println("INGRESE UNA OPCION");
         Task[] arregloTarea= new Task[3];
                 arregloTarea[0]= TareaUno;
                 arregloTarea[1]= TareaDos;
                 arregloTarea[2]= TareaTres;
        opcion = entrada.nextInt(); //ingresa datos
         switch (opcion){
             case 1:
                  System.out.println("---COMPLETAR TAREA---");
                  System.out.println("INGRESE LA TAREA 1 2 O 3");
                  ingreso= entrada.nextInt();
                  
                   if(ingreso==1){
                  System.out.println("INGRESE LA DESCRIPCION DE LA TAREA 1");
                  descrip= entrada.next();
                  System.out.println("INGRESE EL ESTADO DE LA TAREA COMPLETA: TRUE , INCOMPLETA: FALSE");
                  ESTADO= entrada.nextBoolean();
                  
                  System.out.println("INGRESE LA FECHA LIMITE 1 ");
                   System.out.println("DIA");
                             dia = entrada.nextInt();
                             System.out.println("MES");
                          mes= entrada.nextInt();
                            System.out.println("AÑO");
                          anio= entrada.nextInt();
                  // fechaLim= entrada.nextLine();
                  
                    //HAY QUE GUARDAR LOS DATOS INGRESADOS
                   TareaUno.setDescripcion(descrip);
                   TareaUno.setEstado(ESTADO);
                     TareaUno.setDia(dia);
                  TareaUno.setMes(mes);
                   TareaUno.setAnio(anio);
                          }
                    
                   if(ingreso==2){
                   System.out.println("INGRESE LA DESCRIPCION DE LA TAREA 2");
                  descrip= entrada.next();
                  System.out.println("INGRESE EL ESTADO DE LA TAREA COMPLETA: TRUE , INCOMPLETA: FALSE");
                  ESTADO= entrada.nextBoolean();
                  System.out.println("INGRESE LA FECHA LIMITE TAREA 2 ");
                  System.out.println("DIA");
                             dia = entrada.nextInt();
                             System.out.println("MES");
                          mes= entrada.nextInt();
                            System.out.println("AÑO");
                          anio= entrada.nextInt();
                  //fechaLim= entrada.nextInt(); 
                   //HAY QUE GUARDAR LOS DATOS INGRESADOS
                   TareaDos.setDescripcion(descrip);
                   TareaDos.setEstado(ESTADO);
                     TareaDos.setDia(dia);
                     TareaDos.setMes(mes);
                   TareaDos.setAnio(anio);
                   }
                   
                   if (ingreso==3){
                  System.out.println("INGRESE LA DESCRIPCION DE LA TAREA 3");
                  descrip= entrada.next();
                  System.out.println("INGRESE EL ESTADO DE LA TAREA COMPLETA: TRUE , INCOMPLETA: FALSE");
                  ESTADO= entrada.nextBoolean();
                  System.out.println("INGRESE LA FECHA LIMITE TARE 3 ");
                   System.out.println("DIA");
                             dia = entrada.nextInt();
                             System.out.println("MES");
                          mes= entrada.nextInt();
                            System.out.println("AÑO");
                          anio= entrada.nextInt();
                           // GUARDAMOS LOS DATOS INGRESADOS
                   TareaTres.setDescripcion(descrip);
                   TareaTres.setEstado(ESTADO);
                   //TareaUno.setFechaLim(dia);
                    TareaTres.setDia(dia);
                  TareaTres.setMes(mes);
                   TareaTres.setAnio(anio);
                   //fechaLim= entrada.nextLine();
                   }
                  
                 break;
                 
             case 2: 
              
                 
                System.out.println("---INGRESE EL NUMERO DE TAREA---");
                 int i=0;
                     i= entrada.nextInt();
                     i--;
                  System.out.println("---LISTADO DE  TAREAS---");
                  int a=i+1;
                  System.out.println("---TAREA ---"+a);
                  System.out.println("DESCRIPCION:" +arregloTarea[i].getDescripcion()); 
                  System.out.println("ESTADO:" +arregloTarea[i].getEstado());
                  System.out.println("FECHA LIMITE: DIA" +arregloTarea[i].getDia());
                   System.out.println("MES:" +arregloTarea[i].getMes());
                    System.out.println("AÑO:" +arregloTarea[i].getAnio());
                  break;
                  
                  
                  
             case 3:
                 System.out.println("---MOSTRAR UNA TAREA---");  
                  System.out.println("INGRESE LA TAREA 1 2 O 3");
                 ingreso= entrada.nextInt();
                 
                 int b=ingreso-1;
                System.out.println("---TAREA :---"+ingreso);
                  System.out.println("DESCRIPCION:" +arregloTarea[b].getDescripcion()); 
                  System.out.println("ESTADO:" +arregloTarea[b].getEstado());
                    
                     System.out.println("FECHA LIMITE: DIA" +arregloTarea[b].getDia());
                   System.out.println("MES:" +arregloTarea[b].getMes());
                    System.out.println("AÑO:" +arregloTarea[b].getAnio());
             
              break;
             case 4:
                 System.out.println("MARCAR UNA TAREA COMO HECHA");
                 System.out.println("INGRESE EL NUMERO DE LA TAREA");
                 int num=0;
                 num= entrada.nextInt();
                     num--;
                 
                  
                  arregloTarea[num].setEntregado(true);
                  
                  System.out.println("---TAREA ENTREGADA---");
                  
                 
                 break;
             case 5:
                   System.out.println("ELIMINAR UNA TAREA");
                     System.out.println("INGRESE EL NUMERO DE LA TAREA");
                  num=0;
                 num= entrada.nextInt();
                     num--;
                
                  
                  arregloTarea[num].setEliminado(true);//cambia el valor del atributo no deja de existir
                  
                  System.out.println("---TAREA ELIMINADA---");
                   
                   
                 break;
         }//fin del sw
         System.out.println("PARA REPETIR PRESIONE 0,DE LO CONTRARIO OTRO NUMERO"); 
           menu= entrada.nextInt();
     }//fin del do
     
     while(menu==0);
        
        
        
    }
    
}
