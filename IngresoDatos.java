
package ingresodatos;

import java.util.Scanner;
import java.util.Arrays;


public class IngresoDatos {
    
    public static void main(String[] args){
        
    String[] datos={"Nombre","Apellido","Edad","Hobby","Editor","Sistema Operativo"};
    String[] array;
    array = new String[6];
        
        
        
        
        
        GetySet ingresoDatos = new GetySet();
        Scanner inputDatos=new Scanner(System.in);
        
        
        
 
        System.out.println("Ingrese los siguientes datos: ");
        for(int i=0;i<datos.length;i++){
        
            System.out.println("Ingrese su "+ datos[i]);
            String value=inputDatos.nextLine();
            array[i]=value;
        
    }
        
        
        

        ingresoDatos.setDatos(array);
        ingresoDatos.getDatos();
       

    }
    
}
