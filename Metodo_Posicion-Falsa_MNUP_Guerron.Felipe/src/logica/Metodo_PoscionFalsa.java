package logica;

/**
 * Metodos numericos.
 * Universidad Piloto de Colombia.
 * @author Luis Felipe Guerrón Rodríguez.
 */
public class Metodo_PoscionFalsa {
    
    public double raiz(double a, double b, double valorFuncionA, double valorFuncionB) {
        
        return (b - (((valorFuncionB) * (a - b)) / (valorFuncionA - valorFuncionB)));
    
    }

}