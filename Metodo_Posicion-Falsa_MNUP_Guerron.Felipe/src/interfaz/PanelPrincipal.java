package interfaz;

import javax.swing.JFrame;
import logica.Funcion;
import logica.Metodo_PoscionFalsa;
import logica.Truncamiento;

/**
 * Metodos numericos. 
 * Universidad Piloto de Colombia.
 *
 * @author Luis Felipe Guerrón Rodríguez.
 */
public class PanelPrincipal extends JFrame {

    Funcion funcion;
    Metodo_PoscionFalsa pFalsa;
    Truncamiento truncamiento;

    PanelDatos panelDatos;
    PanelIteraciones panelIteraciones;
    PanelBotones panelBotones;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public PanelPrincipal() {

        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(null);

        setTitle("Metodo de la posición falsa");
        setResizable(false);

        funcion = new Funcion();
        pFalsa = new Metodo_PoscionFalsa();
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

    public void metodoPFalsa() {

        int contador = 1;

        double a = panelDatos.darIntervaloA();
        double b = panelDatos.darIntervaloB(); 
        
        double raiz = 0;

        String funcionOriginal = panelDatos.darFuncion();
        
        do {

            raiz = pFalsa.raiz(a, b, funcion.funcion(funcionOriginal, a), 
                    funcion.funcion(funcionOriginal, b));

            if ((funcion.funcion(funcionOriginal, a) * 
                    funcion.funcion(funcionOriginal, raiz)) < 0) {
                
                b = raiz;
            
            } else if ((funcion.funcion(funcionOriginal, a) * 
                    funcion.funcion(funcionOriginal, raiz)) > 0) {
                
                a = raiz;
                        
            }

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
