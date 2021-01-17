/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Facade.Fachada;
import Modelo.Examen;
import java.awt.FlowLayout;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author tranc
 */
public class ProfesorExamen extends javax.swing.JFrame {
    private Examen examen;
    private ArrayList<ButtonGroup> listaGrupoBotones;
    
   
    public ProfesorExamen(Examen examen) {
        JPanel panelGrupo;
        listaGrupoBotones = new ArrayList<>();;
        ButtonGroup grupoRespuesta;
        JRadioButton opt;
        JLabel etiqueta;
        
        
        this.examen=examen;
        
        //compuebo que llegue la informacion bien
        for (int i = 0; i < examen.getPreguntas().size(); i++) {
            System.out.println("Pregunta: "+examen.getPreguntas().get(i).getNombre());
            for (int j = 0; j <examen.getPreguntas().get(i).getRepuestas().size() ; j++) {
                System.out.println("Respúesta: "+examen.getPreguntas().get(i).getRepuestas().get(j));
            }
        }
        initComponents();
        ((JTextField)jDate.getDateEditor()).setEditable(false);
        for (int i = 0; i < examen.getPreguntas().size(); i++) {
            etiqueta=new JLabel(examen.getPreguntas().get(i).getNombre());
            panel.add(etiqueta);
            
            panelGrupo=new JPanel(new FlowLayout(FlowLayout.LEFT));
            grupoRespuesta=new ButtonGroup();
            
            for (int j = 0; j <examen.getPreguntas().get(i).getRepuestas().size() ; j++) {
                 opt=new JRadioButton(examen.getPreguntas().get(i).getRepuestas().get(j));
                 grupoRespuesta.add(opt);
                 panelGrupo.add(opt);
                 
            }
            listaGrupoBotones.add(grupoRespuesta);
            panel.add(panelGrupo);
        }
        
        
//        etiqueta=new JLabel("Emmanuel de Jesus Navarro Villa");
//        JRadioButton opt=new JRadioButton("Rojo");//setText para agregar texto 
//        JRadioButton opt1=new JRadioButton("Azul");
//        grupoRespuesta= new ButtonGroup();
//        
//        grupoRespuesta.add(opt);
//        grupoRespuesta.add(opt1);
//        
//        panelGrupo=new JPanel(new FlowLayout(FlowLayout.LEFT));
//        
//        panelGrupo.add(opt);
//        panelGrupo.add(opt1);
//        
//        panel.add(etiqueta);
//        panel.add(panelGrupo);
        
//        panel.add(opt);
//        panel.add(opt1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        btnGuardarExamen = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Examen");
        setPreferredSize(new java.awt.Dimension(600, 500));

        panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Examén"));
        panel.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(panel);

        btnGuardarExamen.setText("Guardar Examén");
        btnGuardarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarExamenActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombre.setText("Nombrar examén como: ");

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFecha.setText("Fecha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 45, Short.MAX_VALUE)))
                        .addComponent(btnGuardarExamen)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFecha)
                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarExamenActionPerformed
        Fachada f=new Fachada();
        Date date=jDate.getDate();
        
        if(txtnombre.getText().equals("")||date==null){
            JOptionPane.showMessageDialog(this,"Ingresa campos");
        }else{
            LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int day   = localDate.getDayOfMonth();
            int month = localDate.getMonthValue();
            int year  = localDate.getYear();
            String fecha=day+"/"+month+"/"+year;
            examen.setFecha(fecha);
            examen.setNombre(txtnombre.getText());
            
            for (int i = 0; i <listaGrupoBotones.size(); i++) {
                System.out.println("Repuest");
            }
            
            
            f.guardarExamen(examen);
            System.out.println("Se guardo examen con fecha "+fecha);
        }
        
    }//GEN-LAST:event_btnGuardarExamenActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        //indico que solo se leean puros numeros enteros
        char valido=evt.getKeyChar();
        if(!Character.isDigit(valido)){
            
        }else{
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Ingresar letra");
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ProfesorExamen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarExamen;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}