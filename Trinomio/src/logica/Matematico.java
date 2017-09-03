/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Matematico {
    private String resultado;

    /**
     * <h3>Matematico</h3>
     * 
     * Inicializa el resultado y crea al Matemático
    */
    public Matematico() {
        
        this.resultado = "";
    }
    
    /**
     * <h3>desarrollarTCP</h3>
     * 
     * Crea la string de resultado que se muestra en el programa, calculando el TCP
     * 
     * @param a Coeficiente del la primer incógnita
     * @param b Coeficiente del la segunda incógnita
     * @param expa Exponente del la primer incógnita
     * @param expb Exponente del la segunda incógnita
     * @param op Signo del segundo término
     * 
     * @return this.resultado La string generada con la operación
    */
    public String desarrollarTCP(double a, double b, double expa, double expb, String op){
        this.resultado = Math.pow(a, 2) + "x^" +  (expa*2) + " " + op + " " + 2*a*b + "x^" + expa + "y^" + expb + " + " + Math.pow(b, 2) + "y^" + expb*2;
        return this.resultado;
    }
    
    
    
}
