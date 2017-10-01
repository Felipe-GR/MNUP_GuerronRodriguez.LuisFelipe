package interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Metodos numericos. 
 * Universidad Piloto de Colombia.
 *
 * @author Luis Felipe Guerrón Rodríguez.
 */
public class PanelBotones extends JPanel implements ActionListener {

    @SuppressWarnings("FieldMayBeFinal")
    private PanelPrincipal intefazPrincipal;

    private final static String CALCULAR = "Calcular";
    private final static String BORRAR = "Borrar";

    @SuppressWarnings("FieldMayBeFinal")
    private JButton botonCalcular;
    private JButton botonBorrar;

    @SuppressWarnings({"OverridableMethodCallInConstructor", "LeakingThisInConstructor"})
    public PanelBotones(PanelPrincipal principal) {

        setLayout(new GridLayout(1, 2));

        TitledBorder titulo = BorderFactory.createTitledBorder("Calcular");
        titulo.setTitleColor(Color.BLACK);
        setBorder(titulo);

        this.intefazPrincipal = principal;

        botonCalcular = new JButton(CALCULAR);
        botonCalcular.setActionCommand(CALCULAR);
        botonCalcular.addActionListener(this);

        botonBorrar = new JButton(BORRAR);
        botonBorrar.setActionCommand(BORRAR);
        botonBorrar.addActionListener(this);

        add(botonCalcular);
        add(botonBorrar);

    }

    public void actionPerformed(ActionEvent e) {

        String texto = e.getActionCommand();

        if (texto.equalsIgnoreCase(CALCULAR)) {

            intefazPrincipal.metodoBiseccion();

        }

        if (texto.equalsIgnoreCase(BORRAR)) {

            intefazPrincipal.borrar();

        }

    }

}
