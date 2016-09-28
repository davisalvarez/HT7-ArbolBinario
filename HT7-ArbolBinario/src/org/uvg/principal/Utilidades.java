/*
 * UVG
 * Algoritmos y Estructura de Datos
 * HT 7 - Arboles Binarios
 * Autores:
 * 		Davis Alvarez -15842
 * 		Osiris Fuentes - 15240
 * 
 *  * GIT: https://github.com/davisalvarez/HT7-ArbolBinario.git
*/	
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
        List<String> ingles = new ArrayList<String>();
        List<String> espanol = new ArrayList<String>();
        BufferedReader Br = null;
        try{
            ArrayList<String> diccionario = new ArrayList<>();
            String line;
            String[] traduccion;
             Br = new BufferedReader(new FileReader(""));
             while (true){
                 line = Br.readLine();
                 if(line == null){
                     break;
                 }
                 else{
                     traduccion = line.split("[\\\\(\\\\)]");
                     for(String cada :traduccion){
                         if(!"".equals(cada)){
                             diccionario.add(cada);
                         }
                     }
                     for (String each :diccionario){
                         String inglesPalabra = diccionario.get(0);
                         String espanolPalabra = diccionario.get(1);
                         ingles.add(inglesPalabra);
                         espanol.add(espanolPalabra);
                     }
                 }
             }
        }catch(IOException e){
            System.out.println("Archivo no encontrado");
            
        }
        
    }
}
