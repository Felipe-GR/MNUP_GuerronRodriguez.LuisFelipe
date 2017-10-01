/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author LuisG
 */
public class PanelDatos extends javax.swing.JPanel {

    /**
     * Creates new form PanelDatos
     */
    public PanelDatos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFuncion = new javax.swing.JLabel();
        txtFuncion = new javax.swing.JTextField();
        lblP0 = new javax.swing.JLabel();
        txtP0 = new javax.swing.JTextField();
        txtNumeroIteraciones = new javax.swing.JTextField();
        lblP1 = new javax.swing.JLabel();
        lblRaiz = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        txtP1 = new javax.swing.JTextField();
        lblNumeroIteraciones = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Función"));
        setMaximumSize(new java.awt.Dimension(395, 150));
        setMinimumSize(new java.awt.Dimension(395, 150));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(395, 150));

        lblFuncion.setText("Función: f(x) =");

        txtFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuncionActionPerformed(evt);
            }
        });

        lblP0.setText("P0 = ");

        lblP1.setText("P1 =");

        lblRaiz.setText("Raiz =");

        txtResultado.setEditable(false);

        lblNumeroIteraciones.setText("Numero de iteraciones:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(txtFuncion))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumeroIteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(txtNumeroIteraciones)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblP0)
                            .addComponent(lblP1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtP0)
                            .addComponent(txtP1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFuncion)
                    .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtP0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblP0))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblP1)
                    .addComponent(txtP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroIteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumeroIteraciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRaiz)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFuncionActionPerformed
    }//GEN-LAST:event_txtFuncionActionPerformed

    public String darFuncion() {

        expresionMatematica = txtFuncion.getText();

        return expresionMatematica;

    }
    
    public double darP0() {

        try {

            P0 = Double.parseDouble(txtP0.getText());

        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "Ponga un numero valido, por favor");

        }

        return P0;

    }

    public double darP1() {

        try {

            P1 = Double.parseDouble(txtP1.getText());

        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "Ponga un numero valido, por favor");

        }

        return P1;

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
        txtResultado.setText(texto);

    }
    
    private String expresionMatematica;

    private double P0;
    private double P1;
    private double precision;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFuncion;
    private javax.swing.JLabel lblNumeroIteraciones;
    private javax.swing.JLabel lblP0;
    private javax.swing.JLabel lblP1;
    private javax.swing.JLabel lblRaiz;
    private javax.swing.JTextField txtFuncion;
    private javax.swing.JTextField txtNumeroIteraciones;
    private javax.swing.JTextField txtP0;
    private javax.swing.JTextField txtP1;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
