package logica;

import interfaces.IFuncion;
import com.singularsys.jep.Jep;
import com.singularsys.jep.JepException;
import javax.swing.JOptionPane;

/**
 * Metodos numericos.
 * Universidad Piloto de Colombia.
 * @author Luis Felipe Guerrón Rodríguez.
 */
public class Funcion implements IFuncion {

    Object resultado;

    @Override
    public double funcion(String funcion, double x) {
        
        Jep jep = new Jep();
        
        try {
            
            jep.addVariable("x", x);
            jep.parse(funcion);
            
            resultado = jep.evaluate();
        
        } catch (JepException jepException) {
        
            JOptionPane.showMessageDialog(null, "Un error a ocurrido " + 
                    jepException.getMessage());

        }
        
        return (double) resultado;
    
    }
            
}