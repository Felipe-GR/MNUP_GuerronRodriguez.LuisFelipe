package interfaz;

import javax.swing.JFrame;
import logica.Funcion;
import logica.MetodoBiseccion;
import logica.Truncamiento;

/**
 * Metodos numericos. 
 * Universidad Piloto de Colombia.
 *
 * @author Luis Felipe Guerrón Rodríguez.
 */
public class PanelPrincipal extends JFrame {

    Funcion funcion;
    MetodoBiseccion biseccion;
    Truncamiento truncamiento;

    PanelDatos panelDatos;
    PanelIteraciones panelIteraciones;
    PanelBotones panelBotones;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public PanelPrincipal() {

        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(null);

        setTitle("Metodo de bisección");
        setResizable(false);

        funcion = new Funcion();
        biseccion = new logica.MetodoBiseccion();
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

    public void metodoBiseccion() {

        int contador = 1;

        double a = panelDatos.darIntervaloA();
        double b = panelDatos.darIntervaloB();

        double c = 0;

        String funcionOriginal = panelDatos.darFuncion();

        do {
            
            c = biseccion.raiz(a, b);

            if ((funcion.funcion(funcionOriginal, a) * funcion.funcion(funcionOriginal, c))
                    > 0) {

                a = c;

            } else {

                b = c;

            }

            panelIteraciones.mostrarRaiz(c, contador);

            contador++;

        } while (contador <= panelDatos.darNumeroMaximoIteraciones());

        panelDatos.mostrarRaiz(truncamiento.numeroTruncado(c));

    }

    public void borrar() {

        panelIteraciones.borrar();

    }

    public static void main(String[] args) {

        PanelPrincipal intefazPrincipal = new PanelPrincipal();
        intefazPrincipal.setVisible(true);

    }

}
