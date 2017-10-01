package logica;

/**
 * Metodos numericos.
 * Universidad Piloto de Colombia.
 * @author Luis Felipe Guerrón Rodríguez.
 */
public class Metodo_Muller {
    
    public double raizPositiva(double x2, double a, double b, double c) {
        
        return (x2 + ((-2 * c) / (b + (Math.sqrt((Math.pow(b, 2)) - 4 * a * c)))));
    
    }

    public double raizNegativa(double x2, double a, double b, double c) {
        
        return (x2 + ((-2 * c) / (b - (Math.sqrt((Math.pow(b, 2)) - 4 * a * c)))));
    
    }

}