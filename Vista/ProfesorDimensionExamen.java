/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author tranc
 */
public class ProfesorDimensionExamen extends javax.swing.JFrame {

    /**
     * Creates new form ProfesorExamen
     */
    public ProfesorDimensionExamen() {
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

        lbPregunta = new javax.swing.JLabel();
        txtPreguntas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        cmbNumeroPregunta = new javax.swing.JComboBox<>();
        btnAtras = new javax.swing.JButton();
        lbImagenPregunta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Planeando examen");
        setPreferredSize(new java.awt.Dimension(500, 250));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbPregunta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbPregunta.setText("¿Cuantas preguntas deseas realizar?");
        getContentPane().add(lbPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 230, 20));

        txtPreguntas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPreguntasKeyTyped(evt);
            }
        });
        getContentPane().add(txtPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 100, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("¿Cuantas opciones de respuesta deseas por cada pregunta?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 350, -1));

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, 40));

        cmbNumeroPregunta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "2", "3", "4" }));
        getContentPane().add(cmbNumeroPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 100, -1));

        btnAtras.setText("Atrás");
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 70, 40));

        lbImagenPregunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pregunta.jpg"))); // NOI18N
        getContentPane().add(lbImagenPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 130, 80));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPreguntasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPreguntasKeyTyped
        //indico que solo se leean puros numeros enteros
        char valido=evt.getKeyChar();
        if(Character.isDigit(valido)){
            
        }else{
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Ingresar solo numero");
        }
    }//GEN-LAST:event_txtPreguntasKeyTyped

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        
        if(txtPreguntas.getText().equals("") || cmbNumeroPregunta.getSelectedItem().equals("Seleccionar")){
          JOptionPane.showMessageDialog(this,"Faltan campos por ingresar");
        }else{    
            
            ProfesorPreguntasExamen ventana= new ProfesorPreguntasExamen(Integer.parseInt(txtPreguntas.getText()),Integer.valueOf((String)cmbNumeroPregunta.getSelectedItem()));
            ventana.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProfesorDimensionExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfesorDimensionExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfesorDimensionExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfesorDimensionExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfesorDimensionExamen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cmbNumeroPregunta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbImagenPregunta;
    private javax.swing.JLabel lbPregunta;
    private javax.swing.JTextField txtPreguntas;
    // End of variables declaration//GEN-END:variables
}
