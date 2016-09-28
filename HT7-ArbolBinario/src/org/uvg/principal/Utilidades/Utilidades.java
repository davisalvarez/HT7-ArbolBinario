
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;






/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marlon
 */
public class Utilidades {
    static ArrayList<String[]> lectorArray;
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
