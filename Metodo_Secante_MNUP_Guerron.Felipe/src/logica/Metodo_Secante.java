package logica;

/**
 * Metodos numericos.
 * Universidad Piloto de Colombia.
 * @author Luis Felipe Guerrón Rodríguez.
 */
public class Metodo_Secante {
    
    public double raiz(double P0, double P1, double valorFuncionP0, double valorFuncionP1) {
        
        return (P1 - (((valorFuncionP1) * (P1 - P0)) / (valorFuncionP1 - valorFuncionP0)));
    
    }

}