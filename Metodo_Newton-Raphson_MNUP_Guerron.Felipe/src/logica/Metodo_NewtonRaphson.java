package logica;

/**
 * Metodos numericos.
 * Universidad Piloto de Colombia.
 * @author Luis Felipe Guerrón Rodríguez.
 */
public class Metodo_NewtonRaphson {
    
    public double raiz(double p, double valorP, double valorDerivadaP) {
        
        return (p - (valorP/valorDerivadaP));
    
    }

}