package logica;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Metodos numericos. Universidad Piloto de Colombia.
 *
 * @author Luis Felipe Guerrón Rodríguez.
 */
public class Truncamiento {

    public double numeroTruncado(Double numero) {

        @SuppressWarnings("UnusedAssignment")
        double numeroT = 0;

        numeroT = new BigDecimal(numero).setScale(4, RoundingMode.DOWN).doubleValue();

        return numeroT;

    }

}
