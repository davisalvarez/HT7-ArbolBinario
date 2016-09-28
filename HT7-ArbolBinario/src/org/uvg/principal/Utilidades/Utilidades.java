package org.uvg.utilidades;

import org.uvg.bean.Diccionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
*
* @author Marlon
*/

public class Utilidades {
	
	private static Utilidades instancia;
    private ArrayList<Diccionario> lectorArray;
    
    public static Utilidades getInstancia(){
		if(instancia==null)
			instancia=new Utilidades();
		return instancia;
	}
    
    public void lector(){
       BufferedReader br = null;
       try{
           String lineas[] = null;
           String linea;
           br = new BufferedReader(new FileReader(""));
           while((linea = br.readLine())!= null){
               lectorArray.add(lineas);
           }
       }catch(IOException e ){
           e.printStackTrace();
       }
    }
   
    public void lectorC(){
        BufferedReader Br = null;
        try{
            String line;
             Br = new BufferedReader(new FileReader(""));
             while ((line = Br.readLine())!= null){
                 
             }
        }catch(IOException e){
            
        }
    }
}
