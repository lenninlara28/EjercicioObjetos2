/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.DenominadorCeroException;
import clases.NumeroMixto;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author hp 14
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtParte_Entera1 = new javax.swing.JTextField();
        txtNumerador1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtDenominador1 = new javax.swing.JTextField();
        cmbOperacion = new javax.swing.JComboBox<>();
        txtParte_Entera2 = new javax.swing.JTextField();
        txtNumerador2 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtDenominador2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtParte_Entera3 = new javax.swing.JTextField();
        txtNumerador3 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtDenominador3 = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        cmdConvertir = new javax.swing.JButton();
        txtNumeradorFraccion = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txtDenominadorFranccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 204, 255));
        jLabel1.setText("Operaciones Con Numeros Mixtos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        txtParte_Entera1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParte_Entera1ActionPerformed(evt);
            }
        });
        txtParte_Entera1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtParte_Entera1KeyTyped(evt);
            }
        });
        jPanel1.add(txtParte_Entera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 30, 40));

        txtNumerador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumerador1ActionPerformed(evt);
            }
        });
        txtNumerador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador1KeyTyped(evt);
            }
        });
        jPanel1.add(txtNumerador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 50, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 90, 10));

        txtDenominador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDenominador1ActionPerformed(evt);
            }
        });
        txtDenominador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominador1KeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 50, -1));

        cmbOperacion.setBackground(new java.awt.Color(0, 0, 0));
        cmbOperacion.setForeground(new java.awt.Color(102, 255, 255));
        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " + ", " -", " *", "/" }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        txtParte_Entera2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParte_Entera2ActionPerformed(evt);
            }
        });
        txtParte_Entera2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtParte_Entera2KeyTyped(evt);
            }
        });
        jPanel1.add(txtParte_Entera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 30, 40));

        txtNumerador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumerador2ActionPerformed(evt);
            }
        });
        txtNumerador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador2KeyTyped(evt);
            }
        });
        jPanel1.add(txtNumerador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 50, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 90, 10));

        txtDenominador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDenominador2ActionPerformed(evt);
            }
        });
        txtDenominador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominador2KeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 50, -1));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        txtParte_Entera3.setEditable(false);
        jPanel1.add(txtParte_Entera3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 30, 40));

        txtNumerador3.setEditable(false);
        jPanel1.add(txtNumerador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 50, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 90, 10));

        txtDenominador3.setEditable(false);
        jPanel1.add(txtDenominador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 50, -1));

        cmdCalcular.setBackground(new java.awt.Color(0, 0, 0));
        cmdCalcular.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmdCalcular.setForeground(new java.awt.Color(153, 255, 255));
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        cmdBorrar.setBackground(new java.awt.Color(0, 0, 0));
        cmdBorrar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmdBorrar.setForeground(new java.awt.Color(153, 255, 255));
        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        cmdConvertir.setBackground(new java.awt.Color(0, 0, 0));
        cmdConvertir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmdConvertir.setForeground(new java.awt.Color(153, 255, 255));
        cmdConvertir.setText("Convertir A Fraccionario");
        cmdConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConvertirActionPerformed(evt);
            }
        });
        jPanel1.add(cmdConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        txtNumeradorFraccion.setEditable(false);
        jPanel1.add(txtNumeradorFraccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 50, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 90, 10));

        txtDenominadorFranccion.setEditable(false);
        jPanel1.add(txtDenominadorFranccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 50, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(606, 373));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
    int op,parte_entera1,num1,den1,parte_entera2,num2,den2;
    NumeroMixto mx1,mx2,mx3=null;
    if(txtNumerador1.getText().trim().isEmpty()|| txtDenominador1.getText().trim().isEmpty()
            || txtParte_Entera1.getText().trim().isEmpty()||txtParte_Entera2.getText().trim().isEmpty()
            ||txtNumerador2.getText().trim().isEmpty()||txtDenominador2.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this,"No Se Aceptan Espacios En Blanco","Error",JOptionPane.ERROR_MESSAGE);
            txtParte_Entera1.requestFocusInWindow();
    }else{
    op=cmbOperacion.getSelectedIndex();
    parte_entera1= Integer.parseInt(txtParte_Entera1.getText());
    num1=Integer.parseInt(txtNumerador1.getText());
    den1=Integer.parseInt(txtDenominador1.getText());
    parte_entera2=Integer.parseInt(txtParte_Entera2.getText());
    num2=Integer.parseInt(txtNumerador2.getText());
    den2=Integer.parseInt(txtDenominador2.getText());
    try{
    mx1= new NumeroMixto(parte_entera1, num1, den1);
    mx2= new NumeroMixto(parte_entera2, num2, den2);
    
    
    switch (op){
        case 0:
            mx3= mx1.Sumar(mx2);
        break;
        case 1:
            mx3=mx1.Restar(mx2);
            break;
        case 2 :
            mx3=mx1.Multiplicar(mx2);
            break;
        case 3 :
            mx3=mx1.Dividir(mx2);
            break;
    }
    txtParte_Entera3.setText(""+mx3.getParte_Entera());
    txtNumerador3.setText(""+mx3.getNumerador());
    txtDenominador3.setText(""+mx3.getDenominador());
    }catch(DenominadorCeroException e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_cmdCalcularActionPerformed
    private void cmdConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConvertirActionPerformed
     int parte_entera,num_fraccion,den_Fraccion;
     NumeroMixto mx1,f;
     parte_entera=Integer.parseInt(txtParte_Entera3.getText());
     num_fraccion=Integer.parseInt(txtNumerador3.getText());
     den_Fraccion=Integer.parseInt(txtDenominador3.getText());
     try{
     mx1= new NumeroMixto(parte_entera,num_fraccion, den_Fraccion);
     f=mx1.Convertir(mx1);
     txtNumeradorFraccion.setText(""+f.getNumerador());
     txtDenominadorFranccion.setText(""+f.getDenominador());
     }catch(DenominadorCeroException e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmdConvertirActionPerformed

    private void txtParte_Entera1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtParte_Entera1KeyTyped
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume();}
    }//GEN-LAST:event_txtParte_Entera1KeyTyped

    private void txtNumerador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador1KeyTyped
       char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume();}
    }//GEN-LAST:event_txtNumerador1KeyTyped

    private void txtDenominador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominador1KeyTyped
      char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume();}
    }//GEN-LAST:event_txtDenominador1KeyTyped

    private void txtParte_Entera2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtParte_Entera2KeyTyped
       char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume();}
    }//GEN-LAST:event_txtParte_Entera2KeyTyped

    private void txtNumerador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador2KeyTyped
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume();}
    }//GEN-LAST:event_txtNumerador2KeyTyped

    private void txtDenominador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominador2KeyTyped
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume();}
    }//GEN-LAST:event_txtDenominador2KeyTyped

    private void txtParte_Entera1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParte_Entera1ActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        txtNumerador1.requestFocus();
    }//GEN-LAST:event_txtParte_Entera1ActionPerformed

    private void txtNumerador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumerador1ActionPerformed
       evt.setSource((char) KeyEvent.VK_CLEAR);
        txtDenominador1.requestFocus();
    }//GEN-LAST:event_txtNumerador1ActionPerformed

    private void txtDenominador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDenominador1ActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        txtParte_Entera2.requestFocus();
    }//GEN-LAST:event_txtDenominador1ActionPerformed

    private void txtParte_Entera2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParte_Entera2ActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        txtNumerador2.requestFocus();
    }//GEN-LAST:event_txtParte_Entera2ActionPerformed

    private void txtNumerador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumerador2ActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        txtDenominador2.requestFocus();
    }//GEN-LAST:event_txtNumerador2ActionPerformed

    private void txtDenominador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDenominador2ActionPerformed
       evt.setSource((char) KeyEvent.VK_CLEAR);
        cmbOperacion.requestFocus();
    }//GEN-LAST:event_txtDenominador2ActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
       txtParte_Entera1.setText("");
       txtParte_Entera2.setText("");
       txtParte_Entera3.setText("");
       txtNumerador1.setText("");
       txtNumerador2.setText("");
       txtNumerador3.setText("");
       txtDenominador1.setText("");
       txtDenominador2.setText("");
       txtDenominador3.setText("");
       txtNumeradorFraccion.setText("");
       txtDenominadorFranccion.setText("");
       cmbOperacion.setSelectedIndex(0);
       txtParte_Entera1.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdConvertir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField txtDenominador1;
    private javax.swing.JTextField txtDenominador2;
    private javax.swing.JTextField txtDenominador3;
    private javax.swing.JTextField txtDenominadorFranccion;
    private javax.swing.JTextField txtNumerador1;
    private javax.swing.JTextField txtNumerador2;
    private javax.swing.JTextField txtNumerador3;
    private javax.swing.JTextField txtNumeradorFraccion;
    private javax.swing.JTextField txtParte_Entera1;
    private javax.swing.JTextField txtParte_Entera2;
    private javax.swing.JTextField txtParte_Entera3;
    // End of variables declaration//GEN-END:variables
}
