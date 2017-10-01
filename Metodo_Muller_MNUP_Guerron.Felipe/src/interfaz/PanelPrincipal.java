package interfaz;

import javax.swing.JFrame;
import logica.Funcion;
import logica.Metodo_Muller;
import logica.Truncamiento;

/**
 * Metodos numericos. 
 * Universidad Piloto de Colombia.
 *
 * @author Luis Felipe Guerrón Rodríguez.
 */
public class PanelPrincipal extends JFrame {

    Funcion funcion;
    Metodo_Muller muller;
    Truncamiento truncamiento;

    PanelDatos panelDatos;
    PanelIteraciones panelIteraciones;
    PanelBotones panelBotones;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public PanelPrincipal() {

        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(null);

        setTitle("Metodo de Muller");
        setResizable(false);

        funcion = new Funcion();
        muller = new Metodo_Muller();
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

    public void metodoMuller() {

        int contador = 3;

        double X0 = panelDatos.darIntervaloX0();
        double X1 = panelDatos.darIntervaloX1();
        double X2 = panelDatos.darIntervaloX2();

        double raiz = 0;

        String funcionOriginal = panelDatos.darFuncion();
        
        double valorX0 = funcion.funcion(funcionOriginal, X0);
        double valorX1 = funcion.funcion(funcionOriginal, X1);
        double valorX2 = funcion.funcion(funcionOriginal, X2);
        
        double h0 = (X0 - X1);
        double h1 = (X2 - X1);
        
        double d0 = ((valorX1 - valorX0) / (X1 - X0));
        double d1 = ((valorX2 - valorX1) / (X2 - X1));


        double a = ((d1 - d0) / (h1 - h0));
        double b = (a * h1 + d1);
        double c = valorX2;        
        
        do {
            
            if (b > 0) {
                
                raiz = muller.raizPositiva(X2, a, b, c);

            } else {
                
                raiz = muller.raizNegativa(X2, a, b, c);
            
            }
            
            X1 = X2;
            X2 = raiz;
            
            h0 = h1;
            h1 = (X2 - X1);
            
            valorX1 = valorX2;
            valorX2 = funcion.funcion(funcionOriginal, X2);

            d0 = d1;
            d1 = ((valorX2 - valorX1) / (X2 - X1));
            
            a = ((d1 - d0) / (h1 - h0));
            b = (a * h1 + d1);
            c = valorX2;  
            
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
