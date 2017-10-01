package interfaz;

import javax.swing.JFrame;
import logica.Funcion;
import logica.Metodo_NewtonRaphson;
import logica.Truncamiento;

/**
 * Metodos numericos. 
 * Universidad Piloto de Colombia.
 *
 * @author Luis Felipe Guerrón Rodríguez.
 */
public class PanelPrincipal extends JFrame {

    Funcion funcion;
    Metodo_NewtonRaphson newton;
    Truncamiento truncamiento;

    PanelDatos panelDatos;
    PanelIteraciones panelIteraciones;
    PanelBotones panelBotones;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public PanelPrincipal() {

        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(null);

        setTitle("Metodo de Newton-Raphson");
        setResizable(false);

        funcion = new Funcion();
        newton = new Metodo_NewtonRaphson();
        truncamiento = new Truncamiento();

        panelDatos = new PanelDatos();
        panelDatos.setBounds(0, 0, 395, 150);
        add(panelDatos);

        panelIteraciones = new PanelIteraciones();
        panelIteraciones.setBounds(0, 150, 395, 250);
        add(panelIteraciones);

        panelBotones = new PanelBotones(this);
        panelBotones.setBounds(0, 400, 395, 70);
        add(panelBotones);

    }

    public void metodoNewton() {

        int contador = 1;

        double a = panelDatos.darIntervaloA();
        double b = panelDatos.darIntervaloB();
        double pN = panelDatos.darP0();
        
        double raiz = 0;

        String funcionOriginal = panelDatos.darFuncion();
        String primeraDerivada = funcion.derivada(funcionOriginal);
        String segundaDerivada = funcion.derivada(primeraDerivada);

        panelDatos.mostrarDerivada(primeraDerivada);
        panelDatos.mostrarSegundaDerivada(segundaDerivada);

        do {
            
            raiz = newton.raiz(pN, funcion.funcion(funcionOriginal, pN), 
                    funcion.funcion(primeraDerivada, pN));

            panelIteraciones.mostrarRaiz(raiz, contador);

            contador++;
            
            pN = raiz;
            
        } while (contador <= panelDatos.darNumeroMaximoIteraciones());

        panelDatos.mostrarRaiz(truncamiento.numeroTruncado(raiz));

    }

    public void borrar() {

        panelIteraciones.borrar();

    }

    public static void main(String[] args) {

        PanelPrincipal intefazPrincipal = new PanelPrincipal();
        intefazPrincipal.setVisible(true);

    }

}
