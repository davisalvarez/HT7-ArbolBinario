/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marlon
 */
public class Diccionario {
    private String ingles;
    private String espanol;

    public Diccionario(String ingles, String espanol) {
        this.ingles = ingles;
        this.espanol = espanol;
    }

    public String getIngles() {
        return ingles;
    }

    public String getEspanol() {
        return espanol;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public void setEspanol(String espanol) {
        this.espanol = espanol;
    }
    
}
