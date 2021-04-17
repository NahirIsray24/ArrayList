
    //import java.util.Date; //paquete para Date

//package TP1;


public class Task {
    //ATRIBUTOS
    private int iD; //contador 
    private String descripcion; 
    private boolean estado; //completa o incompleta
    private int dia;
    private int mes;
    private int anio;
    private boolean entregado;
    private boolean eliminado; 
    
    //GET  Y SET
    //Set: recibe un valor y lo guarda en descripcion
    public void setID(int iD){
        this.iD=iD;
    }
    public int getID(){
        return iD;
              
    }
    public void setDescripcion (String descripcion){
        this.descripcion = descripcion;
    }
    //get: devuelve el valor de la variable descripcion
    public String getDescripcion (){
        return descripcion;
        
    }
    public void setEstado (boolean estado){
        this.estado = estado;
        
    }
    public boolean getEstado (){
       return estado;
    }
       public void setAnio (int anio){
      this.dia = anio;
    }
    public int getAnio (){
        return anio;
        
    }  
     public void setMes (int mes){
      this.dia = mes;
    }
    public int getMes (){
        return mes;
        
    }
    public void setDia (int dia){
      this.dia = dia;
    }
    public int getDia (){
        return dia;
        
    }
    public void setEntregado  (boolean entregado){
        this.entregado = entregado;
        
    }
    public boolean getEntregado (){
       return entregado;
    }
    public void setEliminado (boolean eliminado){
        this.eliminado = eliminado;
        
    }
    public boolean getEliminado (){
       return eliminado;
    }
    
    //CONTRUCTORES
    
    public Task(){
        this.iD=0;
        this.descripcion = "";
        this.estado = false;  //false tarea incompleta
        //this.fechaLimite =  new Date (2021,3,30);
        this.entregado= false;
        this.eliminado=false;
        this.dia = 0; //ver
        this.mes = 0; //ver
        this.anio = 0; //ver
               
    }
    public Task( int iD,String descripcion, boolean estado, int dia,int mes,int anio, boolean entregado, boolean eliminado){
        this.iD= iD;
        this.descripcion = descripcion;
        this.estado = estado;  //false tarea incompleta
        this.dia = dia; //ver
        this.mes = mes; //ver
        this.anio = anio; //ver
        this.entregado= entregado;
        this.eliminado= eliminado;
    }
    //METODOS 
   
    public void tareaEntregada(){
        this.entregado = true; //tarea entregada
        System.out.println("TAREA ENTREGADA");
    }
    public void estadoDeTarea(){
        if (this.estado == true){
            //TAREA COMPLETA Y HECHA
        System.out.println("TAREA COMPLETADA ");
        }
        else {
             System.out.println("TAREA INCOMPLETA ");
        }
    }
    public void eliminarTarea(){
        this.eliminado = true ; //tarea eliminada true
        System.out.println("TAREA ELIMINADA ");
        
    }
    public void mostrarTarea(boolean estado,boolean entregado){
        System.out.println("DESCRIPCION:"+this.descripcion);
        
         if (this.estado == true){
          System.out.println("ESTADO COMPLETO" );
        }
         else{
             System.out.println("ESTADO INCOMPLETO" );
         }
        
         if (this.entregado == true){
             System.out.println("CONDICIÓN:"+this.entregado);
          System.out.println("TAREA ENTREGADA" );
        }
         else{
             System.out.println("CONDICIÓN:"+this.entregado);
             System.out.println("TAREA NO ENTREGADA" );
         }
        
        
    }
}//fin de la clase
