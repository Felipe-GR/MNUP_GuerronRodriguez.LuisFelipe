package interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

/**
 * Metodos numericos. 
 * Universidad Piloto de Colombia.
 *
 * @author Luis Felipe Guerrón Rodríguez.
 */
public class PanelIteraciones extends JPanel {

    @SuppressWarnings("FieldMayBeFinal")
    private JScrollPane scrollPane;

    @SuppressWarnings("FieldMayBeFinal")
    private JTextArea txtIteraciones;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public PanelIteraciones() {

        setLayout(new GridLayout(1, 1));

        TitledBorder titulo = BorderFactory.createTitledBorder("Iteraciones: ");
        titulo.setTitleColor(Color.BLACK);
        setBorder(titulo);

        txtIteraciones = new JTextArea();
        txtIteraciones.setEditable(false);

        scrollPane = new JScrollPane(txtIteraciones);

        add(scrollPane);

    }

    public void mostrarRaiz(double raizIteracion, int contador) {

        String texto = "P" + contador + " = " + Double.toString(raizIteracion) + "\n";
        txtIteraciones.setText(txtIteraciones.getText() + texto);

    }

    public void borrar() {

        txtIteraciones.setText("");

    }

}
