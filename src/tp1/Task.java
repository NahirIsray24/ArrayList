//import java.utill.Scanner;//paquete para ingresar datos
//import java.utill.Date; //paquete para Date

package tp1;


public class Task {
    //ATRIBUTOS
    private String descripcion; 
    private boolean estado; //completa o incompleta
    private Date fechaLimite;
    private boolean entregado;
    private boolean eliminado; 
    
    //GET  Y SET
    public void setDescripcion (String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion (){
        return descripcion;
        
    }
    public void setEstado  (boolean estado){
        this.estado = estado;
        
    }
    public boolean getEstado (){
       return estado;
    }
        
    
    public void setFechaLimite (Date fechaLimite){
      this.fechaLimite = fechaLimite;
    }
    public Date getFechaLimite (){
        return fechaLimite;
        
    }
    public void setEntregado  (boolean entregado){
        this.entregado = entregado;
        
    }
    public boolean getEntregado (){
       return entregado;
    }
    public void setEliminado  (boolean eliminado){
        this.eliminado = eliminado;
        
    }
    public boolean getEliminado  (){
       return eliminado;
    }
    
    //CONTRUCTORES
    public Task(){
        this.descripcion = "";
        this.estado = false;  //false tarea incompleta
        this.fechaLimite =  new Date (2021,3,30);
        this.entregado= false;
        this.eliminado=false;
               
}
    public Task(String descripcion, boolean estado,Date fechaLimite,boolean entregado, boolean eliminado){
        this.descripcion = "";
        this.estado = false;  //false tarea incompleta
        this.fechaLimite =  new Date (2021,3,30);
        this.entregado= false;
        this.eliminado=false;
    }
    //METODOS 
   
    public String tareaEntregada(){
        
        this.entregado = true ; //tarea entregada
        System.out.println("TAREA ENTREGADA");
    }
    public String estadoDeTarea(){
        if (this.estado == true){
            //TAREA COMPLETA Y HECHA
        System.out.println("TAREA COMPLETADA ");
        }
        else {
             System.out.println("TAREA INCOMPLETA ");
        }
    }
    public String eliminarTarea(){
        this.eliminado = true ; //tarea eliminada true
        System.out.println("TAREA ELIMINADA ");
        
    }
    public String mostrarTarea(){
        System.out.println("DESCRIPCION:"+this.descripcion);
        System.out.println("ESTADO:"+this.estadoDeTarea());
        System.out.println("CONDICIÓN:"+this.entregado);
        
    }
  
    
}//fin de la clase
