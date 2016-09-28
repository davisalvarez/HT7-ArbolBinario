/*
 * UVG
 * Algoritmos y Estructura de Datos
 * HT 7 - Arboles Binarios
 * Autores:
 * 		Davis Alvarez -15842
 * 		Osiris Fuentes - 15240
 * 
*/	
package org.uvg.bean;

public class Diccionario {
	private String ingles;
    private String espanol;

    public Diccionario(String ingles, String espanol) {
        this.ingles = ingles;
        this.espanol = espanol;
    }
    
    public Diccionario() {
		super();
		// TODO Auto-generated constructor stub
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
