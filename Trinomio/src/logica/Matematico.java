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

    public Matematico() {
        
        this.resultado = "";
    }
    
    public String desarrollarTCP(double a, double b, double expa, double expb, String op){
        this.resultado = Math.pow(a, 2) + "x^" +  (expa*2) + " " + op + " " + 2*a*b + "x^" + expa + "y^" + expb + " + " + Math.pow(b, 2) + "y^" + expb*2;
        return this.resultado;
    }
    
    
    
}
