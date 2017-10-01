package logica;

import interfaces.IFuncion;
import com.singularsys.jep.Jep;
import com.singularsys.jep.JepException;
import javax.swing.JOptionPane;
import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

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
    
    @SuppressWarnings("CallToPrintStackTrace")
    public String derivada(String funcion){
        
        String derivada = "";
        
        DJep j = new DJep();

        //DJep es la clase encargada de la derivacion en su escencia
        j.addStandardConstants();

        //agrega constantes estandares, pi, e, etc
        j.addStandardFunctions();

        //agrega funciones estandares cos(x), sin(x)
        j.addComplex();

        //por si existe algun numero complejo
        j.setAllowUndeclared(true);

        //permite variables no declarables
        j.setAllowAssignment(true);
        
        //permite asignaciones
        j.setImplicitMul(true);

        //regla de multiplicacion o para sustraccion y sumas
        j.addStandardDiffRules();

        try {

            //coloca el nodo con una funcion preestablecida
            Node node = j.parse(funcion);

            //deriva la funcion con respecto a x
            Node diff = j.differentiate(node,"x");

            //Simplificamos la funcion con respecto a x
            Node simp = j.simplify(diff);

            //Convertimos el valor simplificado en un String
            derivada =j.toString(simp);

            //imprime la función
            j.println(simp);
        
        } catch(ParseException e){ 
            
            e.printStackTrace();
        
        }

        return derivada;

    }
        
}