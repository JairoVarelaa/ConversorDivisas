
package conversor.vista;

import conversor.controlador.controller;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {

    controller control = new controller();
    
    public Interfaz() {
        initComponents();
        Jlabel_Resultado.setVisible(false);
        Jlabel_valorOrigen.setVisible(false);

        control.ValidarJTextField(txtValorInicial);
        comboBox_1.setSelectedIndex(5);
        comboBox_2.setSelectedIndex(0);
        ActualizarBandera();
    }
    private void ActualizarBandera(){
        controller control = new controller();
        Jlabel_icono_1.setIcon(control.GetIconoMoneda(comboBox_1.getSelectedIndex()));
  
        Jlabel_icono_2.setIcon(control.GetIconoMoneda(comboBox_2.getSelectedIndex()));  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtValorInicial = new javax.swing.JTextField();
        comboBox_1 = new javax.swing.JComboBox<>();
        Jlabel_intercambio = new javax.swing.JLabel();
        Jlabel_Resultado = new javax.swing.JLabel();
        Jlabel_icono_1 = new javax.swing.JLabel();
        Jlabel_icono_2 = new javax.swing.JLabel();
        comboBox_2 = new javax.swing.JComboBox<>();
        Jlabel_valorOrigen = new javax.swing.JLabel();
        btn_convertir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de moneda internacional Alura");
        setBackground(new java.awt.Color(255, 255, 0));

        jPanel1.setBackground(new java.awt.Color(248, 248, 253));
        jPanel1.setPreferredSize(new java.awt.Dimension(835, 468));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/img/Logo.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        txtValorInicial.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        txtValorInicial.setText("0.0");
        txtValorInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        comboBox_1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboBox_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolar- USD- $", "Euros - EUR- € ", "Libras Esterlina - GBP - £", "Won Sur Koreano - KRW- ₩", "Yen Japones - JPY - ¥", "Peso Colombiano - COP - $" }));
        comboBox_1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBox_1ItemStateChanged(evt);
            }
        });

        Jlabel_intercambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/img/icons8-datos-en-ambas-direcciones-32.png"))); // NOI18N
        Jlabel_intercambio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jlabel_intercambio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jlabel_intercambioMouseClicked(evt);
            }
        });

        Jlabel_Resultado.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        Jlabel_Resultado.setText("Mostrar el valor final");

        Jlabel_icono_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/img/PesoColombiano.png"))); // NOI18N

        Jlabel_icono_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/img/Dolar.png"))); // NOI18N

        comboBox_2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboBox_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolar- USD- $", "Euros - EUR- € ", "Libras Esterlina - GBP - £", "Won Sur Koreano - KRW- ₩", "Yen Japones - JPY - ¥", "Peso Colombiano - COP - $" }));
        comboBox_2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBox_2ItemStateChanged(evt);
            }
        });

        Jlabel_valorOrigen.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        Jlabel_valorOrigen.setForeground(new java.awt.Color(51, 51, 51));
        Jlabel_valorOrigen.setText("valor inicial");

        btn_convertir.setBackground(new java.awt.Color(38, 38, 196));
        btn_convertir.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        btn_convertir.setForeground(new java.awt.Color(255, 255, 255));
        btn_convertir.setText("Convertir");
        btn_convertir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_convertirMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Cantidad");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("De:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("A");

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Visita nuestra pagina de Alura Latam.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Jlabel_valorOrigen)
                        .addGap(0, 725, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValorInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(comboBox_1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Jlabel_intercambio))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Jlabel_icono_1)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(comboBox_2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_convertir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Jlabel_icono_2))))
                            .addComponent(Jlabel_Resultado)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Jlabel_icono_1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboBox_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Jlabel_icono_2)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboBox_2)
                                .addComponent(Jlabel_intercambio)
                                .addComponent(btn_convertir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jlabel_valorOrigen)
                .addGap(18, 18, 18)
                .addComponent(Jlabel_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Jlabel_intercambioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jlabel_intercambioMouseClicked
        // TODO add your handling code here:
        int indice_1 = this.comboBox_1.getSelectedIndex();
        int indice_2 = this.comboBox_2.getSelectedIndex();
        
        comboBox_1.setSelectedIndex(indice_2);
        comboBox_2.setSelectedIndex(indice_1);
        ActualizarBandera();
        
    }//GEN-LAST:event_Jlabel_intercambioMouseClicked

    private void comboBox_1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBox_1ItemStateChanged
        // TODO add your handling code here:
        ActualizarBandera();
    }//GEN-LAST:event_comboBox_1ItemStateChanged

    private void comboBox_2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBox_2ItemStateChanged
        // TODO add your handling code here:
         ActualizarBandera();
    }//GEN-LAST:event_comboBox_2ItemStateChanged

    private void btn_convertirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_convertirMouseClicked
        
        if ("".equals(txtValorInicial.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese un cantidad correcta por favor.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
        else{
            double cantidad = Double.parseDouble(txtValorInicial.getText());
            String resultado = control.CambioDeDivisa(cantidad, comboBox_1.getSelectedIndex(),comboBox_2.getSelectedIndex() );
            Jlabel_Resultado.setText(resultado +" "+ control.ModificarLabels(comboBox_2.getSelectedIndex()));
            Jlabel_Resultado.setVisible(true);
            Jlabel_valorOrigen.setText(txtValorInicial.getText() +" "+ control.ModificarLabels(comboBox_1.getSelectedIndex()) );
            Jlabel_valorOrigen.setVisible(true);
            
        }
        
    }//GEN-LAST:event_btn_convertirMouseClicked
    /**
     * Metodo para usar URL en la logo principal
     * @param evt No es usada
     */
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
          try {
            Desktop.getDesktop().browse(new URI("https://www.aluracursos.com/"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel_Resultado;
    private javax.swing.JLabel Jlabel_icono_1;
    private javax.swing.JLabel Jlabel_icono_2;
    private javax.swing.JLabel Jlabel_intercambio;
    private javax.swing.JLabel Jlabel_valorOrigen;
    private javax.swing.JButton btn_convertir;
    private javax.swing.JComboBox<String> comboBox_1;
    private javax.swing.JComboBox<String> comboBox_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtValorInicial;
    // End of variables declaration//GEN-END:variables
}
