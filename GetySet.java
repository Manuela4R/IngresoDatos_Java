
package ingresodatos;

import java.lang.reflect.Array;
import java.util.Arrays;


public class GetySet {
    
    //Declaro atributos
    String nombre;
    String apellido;
    int edad;
    String hobby;
    String editor;
    String sistemaOperativo;
    
    //Declaro sets
  
    public void setNombre(String nombre){
        this.nombre = nombre;      
    }
     public void setApellido(String apellido){
        this.apellido = apellido;      
    }
    
      public void setEdad(int edad){
        this.edad = edad;      
    }
       public void setHobby(String hobby){
        this.hobby = hobby;      
    }
        public void setEditor(String editor){
        this.editor = editor;      
    }
         public void setSistemaOperativo(String sistemaOperativo){
        this.sistemaOperativo = sistemaOperativo;      
    }
         
public void setDatos(String[] array){

        this.nombre=array[0];
        this.apellido=array[1];
        this.edad=Integer.parseInt(array[2]);
        this.hobby=array[3];
        this.editor=array[4];
        this.sistemaOperativo=array[5];
    }
         
    ////Declaro gets
         
   public String getNombre(){
       return nombre;
   }
    
    public String getApellido(){
       return apellido;
   }
    
    public String getEdad(){
        return Integer.toString(edad);
     
    }
    
    public String getHobby(){
        return hobby;
    }
    
    public String getEditor(){
        return editor;
    }
    
      public String getSistemaOperativo(){
        return sistemaOperativo;
    }
      
      
       public void getDatos(){
           
        String nombre1= "Nombre: "+getNombre()+"\n";
        String apellido2= "Apellido: "+getApellido()+"\n";
        String edad3="Edad: "+getEdad()+"\n";
        String hobby4="Hobby: " +getHobby()+"\n";
        String editor5="Editor preferido es: "+getEditor()+"\n";
        String SistOp6="Sistema Operativo: "+getSistemaOperativo()+"\n";
        
        System.out.println(nombre1+apellido2+edad3+hobby4+editor5+SistOp6);
    }

       
   

    
}
