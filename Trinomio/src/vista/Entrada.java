/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import generico.Boton;
import generico.EntradaTextoAdapter;
import generico.Texto;
import generico.Ventana;
import javax.swing.JOptionPane;
import logica.Matematico;

/**
 *
 * @author Alumno
 */
public class Entrada extends Ventana{
    private EntradaTextoAdapter inputA;
    private EntradaTextoAdapter inputB;
    private EntradaTextoAdapter inputExpA;
    private EntradaTextoAdapter inputExpB;
    private EntradaTextoAdapter operador;
    private Boton desarrollarBtn;
    private Texto resultadoLab;
    private Texto aLab;
    private Texto bLab;
    
    /**
     *<h3>Entrada</h3>
     * 
     * Constructor de la clase, inicializa todos los elementos de instancia de la clase
     */
            
    public Entrada(){
        this.inputExpA = new EntradaTextoAdapter(115, 20, 20, 20, this);
        this.inputExpB = new EntradaTextoAdapter(255, 20, 20, 20, this);
        this.inputA = new EntradaTextoAdapter(40, 20, 50, 60, this);
        this.inputB = new EntradaTextoAdapter(180, 20, 50, 60, this);
        this.operador = new EntradaTextoAdapter(150, 35, 20, 20, this);
        this.aLab = new Texto("x", 110, 40, this);
        this.aLab = new Texto("y", 250, 40, this);
        this.desarrollarBtn = new Boton("Desarrollar", 20, 70, this) {
            @Override
            public void action() {
                try{
                    Matematico m = new Matematico();
                    String res = m.desarrollarTCP(
                            Double.valueOf(inputA.getText()), 
                            Double.valueOf(inputB.getText()),
                            Double.valueOf(inputExpA.getText()),
                            Double.valueOf(inputExpB.getText()),
                            operador.getText());
                    JOptionPane.showMessageDialog(null, res, null, JOptionPane.INFORMATION_MESSAGE);
                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Tipo de dato no valido", null, JOptionPane.INFORMATION_MESSAGE);    
                }
            }
        };
        //this.resultadoLab = new Texto("Resultado: ")
    }

    @Override
    public void loopAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
