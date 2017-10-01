package interfaz;

import javax.swing.JFrame;
import logica.Funcion;
import logica.Metodo_Secante;
import logica.Truncamiento;

/**
 * Metodos numericos. 
 * Universidad Piloto de Colombia.
 *
 * @author Luis Felipe Guerrón Rodríguez.
 */
public class PanelPrincipal extends JFrame {

    Funcion funcion;
    Metodo_Secante secante;
    Truncamiento truncamiento;

    PanelDatos panelDatos;
    PanelIteraciones panelIteraciones;
    PanelBotones panelBotones;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public PanelPrincipal() {

        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(null);

        setTitle("Metodo de la secante");
        setResizable(false);

        funcion = new Funcion();
        secante = new Metodo_Secante();
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

    public void metodoSecante() {

        int contador = 2;

        double P0 = panelDatos.darP0();
        double P1 = panelDatos.darP1(); 
        
        double raiz = 0;

        String funcionOriginal = panelDatos.darFuncion();
        
        do {

            raiz = secante.raiz(P0, P1, funcion.funcion(funcionOriginal, P0), 
                    funcion.funcion(funcionOriginal, P1));

            P0 = P1;
            P1 = raiz;
            
            panelIteraciones.mostrarRaiz(raiz, contador);
            
            contador++;
            
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
