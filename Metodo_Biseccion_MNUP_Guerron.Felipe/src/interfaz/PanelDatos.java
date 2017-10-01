package interfaz;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * Metodos numericos. 
 * Universidad Piloto de Colombia.
 *
 * @author Luis Felipe Guerrón Rodríguez.
 */
public class PanelDatos extends JPanel {

    @SuppressWarnings("FieldMayBeFinal")
    private JLabel lblFuncion;

    @SuppressWarnings("FieldMayBeFinal")
    private JLabel lblIntervalo;

    @SuppressWarnings("FieldMayBeFinal")
    private JLabel lblNumIteraciones;

    @SuppressWarnings("FieldMayBeFinal")
    private JLabel lblRaiz;

    @SuppressWarnings("FieldMayBeFinal")
    private JTextField txtExpresion;

    @SuppressWarnings("FieldMayBeFinal")
    private JTextField txtA;

    @SuppressWarnings("FieldMayBeFinal")
    private JTextField txtB;

    @SuppressWarnings("FieldMayBeFinal")
    private JTextField txtNumeroIteraciones;

    @SuppressWarnings("FieldMayBeFinal")
    private JTextField txtRespuesta;

    private String expresionMatematica;

    private double a;
    private double b;
    private double precision;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public PanelDatos() {

        setLayout(null);

        TitledBorder titulo = BorderFactory.createTitledBorder("Función: ");
        titulo.setTitleColor(Color.BLACK);
        setBorder(titulo);

        lblFuncion = new JLabel("f(x) = ");
        lblIntervalo = new JLabel("Intervalos [a,b]: ");
        lblNumIteraciones = new JLabel("Numero de iteraciones: ");
        lblRaiz = new JLabel("Raiz: ");

        txtExpresion = new JTextField(20);
        txtA = new JTextField(20);
        txtB = new JTextField(20);
        txtNumeroIteraciones = new JTextField(20);
        txtRespuesta = new JTextField(20);

        lblFuncion.setBounds(15, 15, 50, 34);
        add(lblFuncion);

        txtExpresion.setBounds(50, 15, 340, 34);
        add(txtExpresion);

        lblIntervalo.setBounds(15, 60, 100, 34);
        add(lblIntervalo);

        txtA.setBounds(110, 60, 100, 34);
        add(txtA);

        txtB.setBounds(230, 60, 100, 34);
        add(txtB);

        lblNumIteraciones.setBounds(15, 105, 150, 34);
        add(lblNumIteraciones);

        txtNumeroIteraciones.setBounds(155, 105, 70, 34);
        add(txtNumeroIteraciones);

        lblRaiz.setBounds(235, 105, 70, 34);
        add(lblRaiz);

        txtRespuesta.setBounds(270, 105, 100, 34);
        txtRespuesta.setEditable(false);

        add(txtRespuesta);

    }

    public String darFuncion() {

        expresionMatematica = txtExpresion.getText();

        return expresionMatematica;

    }

    public double darIntervaloA() {

        try {

            a = Double.parseDouble(txtA.getText());

        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "Ponga un numero valido, por favor");

        }

        return a;

    }

    public double darIntervaloB() {

        try {

            b = Double.parseDouble(txtB.getText());

        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "Ponga un numero valido, por favor");

        }

        return b;

    }

    public double darNumeroMaximoIteraciones() {

        try {

            precision = Double.parseDouble(txtNumeroIteraciones.getText());

        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "Ponga un numero valido, por favor");

        }

        return precision;

    }

    public void mostrarRaiz(double raiz) {

        String texto = Double.toString(raiz);
        txtRespuesta.setText(texto);

    }
    
    public void mostrarDerivada(double derivada) {
        
        String texto = Double.toString(derivada);
        txtRespuesta.setText(texto);

    }
        
    public void mostrarSegundaDerivada(double segundaDerivada) {

        String texto = Double.toString(segundaDerivada);
        txtRespuesta.setText(texto);

    }

}
