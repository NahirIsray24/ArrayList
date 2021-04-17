
  import  java.util.Scanner; //para la entrada de datos
//   import java.util.Date; //paquete para Date
  
//package TP1;
 import java.util.ArrayList; //paquete para arralist 
 import java.util.Iterator; //para iteraciones 
 public class TP1 {

    
    public static void main(String[] args) {
        
    /*Task  TareaUno;
    Task  TareaDos;
    Task  TareaTres;
    TareaUno= new Task(); //instancie los objetos de la clase task
    TareaDos= new Task();
    TareaTres= new Task();*/  
                         //= ->constructor de la clase arraylist
    ArrayList<Task> ListaTareas = new ArrayList <Task> ();
    //objeto tarea que se guarListaTareasda en una lista de tipo clase task
  
       
    System.out.println("BIENVENIDOS");
    
    //DECLARACION DE VARIABLES
     int iD=0;
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
        System.out.println("1-CREAR TAREA");
        System.out.println("2-VER LISTADO");
        System.out.println("3-MOSTRAR UNA TAREA");
        System.out.println("4-MARCAR UNA TAREA COMO HECHA");
        System.out.println("5-ELIMINAR UNA TAREA");
        System.out.println("INGRESE UNA OPCION");
        /*Task[] arregloTarea= new Task[3];
                 arregloTarea[0]= TareaUno;
                 arregloTarea[1]= TareaDos;
                 arregloTarea[2]= TareaTres;*/
        opcion = entrada.nextInt(); //ingresa datos
         switch (opcion){
             case 1:
                 
                System.out.println("Ingrese de la descripcion de la nueva tarea");
                
                descrip= entrada.next();
                System.out.println("Ingrese el estado");
                ESTADO= entrada.nextBoolean();
                System.out.println("Ingrese la fecha de entrega");
                System.out.println("Dia");
                DIA= entrada.nextInt();
                System.out.println("Mes");
                MES= entrada.nextInt();
                System.out.println("Año");
                ANIO= entrada.nextInt();
                
                Task tarea;
                tarea= new Task (iD,descrip,ESTADO,DIA,MES,ANIO,false,false);//instanciar el objeto en la clase
                
                //add agregar tarea a la lista
                ListaTareas.add(tarea);
                    iD++;
                 break;
                 
             case 2: 
              
                   System.out.println("---LISTADO DE  TAREAS---");
                   Task uno;
                   //listatarea de tipo task con get obtengo en la posicion el objeto en la posicion 0
                   //una vez q obtengo ese objeto lo guardo en la variable uno de tipo task
                   int i=0;
                   //size devuelve el tamaño de la lista 
                 for (i=0;i<ListaTareas.size();i++){
                     uno=ListaTareas.get(i);
                     System.out.println("---TAREA ---"+uno.getID());
                  System.out.println("DESCRIPCION:" +uno.getDescripcion()); 
                  System.out.println("ESTADO:" +uno.getEstado());
                  System.out.println("FECHA LIMITE: DIA: " +uno.getDia());
                  System.out.println("MES:" +uno.getMes());
                  System.out.println("AÑO:" +uno.getAnio()); 
                 }
                 
                    
                  break;
                 
             case 3:
                 System.out.println("---MOSTRAR UNA TAREA---");  
                  System.out.println("INGRESE EL IDENTIFICADOR (ID)");
                 ingreso= entrada.nextInt();
                
                  uno=ListaTareas.get(ingreso);
                   
                  System.out.println("---TAREA ---"+uno.getID());
                  System.out.println("DESCRIPCION:" +uno.getDescripcion()); 
                  System.out.println("ESTADO:" +uno.getEstado());
                  System.out.println("FECHA LIMITE: DIA: " +uno.getDia());
                  System.out.println("MES:" +uno.getMes());
                  System.out.println("AÑO:" +uno.getAnio());
             
              break;
             case 4:
                 System.out.println("MARCAR UNA TAREA COMO HECHA");
                 System.out.println("INGRESE EL ID");
                 ingreso= entrada.nextInt();
                
                  uno=ListaTareas.get(ingreso);
                  
                  
                  uno.setEntregado(true);
                  ListaTareas(ingreso)=uno;
                  System.out.println("---TAREA HECHA---");
                  
                 
                 break;
             case 5:
                 
                   System.out.println("ELIMINAR UNA TAREA");
                   System.out.println("INGRESE EL IDENTIFICADOR (ID)");
                 ingreso= entrada.nextInt();
                
                  uno=ListaTareas.remove(ingreso);
                 
                  System.out.println("---TAREA ELIMINADA---");
                   
                   
                 break;
         }//fin del sw
         System.out.println("PARA REPETIR PRESIONE 0,DE LO CONTRARIO OTRO NUMERO"); 
           menu= entrada.nextInt();
     }//fin del do
     
     while(menu==0);
        
        
        
    }
    
}
