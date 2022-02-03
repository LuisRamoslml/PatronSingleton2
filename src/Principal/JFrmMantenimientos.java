
package Principal;
import Clases.PersonalAdministrativo;
import Clases.Policia;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class JFrmMantenimientos extends javax.swing.JFrame {
    private static JFrmMantenimientos unicainstancia;
    
    public static JFrmMantenimientos getInstancia()
    {
        if(unicainstancia == null)
            unicainstancia = new JFrmMantenimientos();
        return unicainstancia;
    }
    
    public ArrayList<Policia> ListaPolicia = new ArrayList();
    public ArrayList<PersonalAdministrativo> ListaAdministrativo = new ArrayList();
    public final String nombreComisaria = "AGUILAS NEGRAS";

    
    public JFrmMantenimientos() {
        initComponents();
        
        jLabel5.setVisible(true);
        txtsect.setVisible(true);
        jLabel6.setVisible(true);
        txtsal.setVisible(true);
        jLabel7.setVisible(true);
        txtrang.setVisible(true);
        jLabel8.setVisible(true);
        txtedad.setVisible(true);
        
    }
    
    public void rb()
    {
        if(rbtadm.isSelected()){
            jLabel5.setVisible(true);
            txtsect.setVisible(true);
            jLabel6.setVisible(false);
            txtsal.setVisible(false);
            jLabel7.setVisible(false);
            txtrang.setVisible(false);
            jLabel8.setVisible(false);
            txtedad.setVisible(false);
            
        }else if(rbtpoli.isSelected())
        {
            jLabel5.setVisible(false);
            txtsect.setVisible(false);
            jLabel6.setVisible(true);
            txtsal.setVisible(true);
            jLabel7.setVisible(true);
            txtrang.setVisible(true);
            jLabel8.setVisible(true);
            txtedad.setVisible(true);
        }else{
            jLabel5.setVisible(true);
            txtsect.setVisible(true);
            jLabel6.setVisible(true);
            txtsal.setVisible(true);
            jLabel7.setVisible(true);
            txtrang.setVisible(true);
            jLabel8.setVisible(true);
            txtedad.setVisible(true);
            
       }
        
        
        
    }
    
  
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        rbtadm = new javax.swing.JRadioButton();
        rbtpoli = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtapelli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtsect = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtrang = new javax.swing.JTextField();
        txtsal = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnregistrar = new javax.swing.JButton();
        btnreportes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstRep = new javax.swing.JTextArea();
        btnlimp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(rbtadm);
        rbtadm.setText("Administrativo");
        rbtadm.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtadmStateChanged(evt);
            }
        });

        buttonGroup1.add(rbtpoli);
        rbtpoli.setText("Policia");
        rbtpoli.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtpoliStateChanged(evt);
            }
        });

        jLabel1.setText("CODIGO :");

        jLabel2.setText("NOMBRE :");

        jLabel3.setText("APELLIDO :");

        txtcod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcodFocusLost(evt);
            }
        });
        txtcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodActionPerformed(evt);
            }
        });
        txtcod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodKeyTyped(evt);
            }
        });

        jLabel4.setText("DNI :");

        jLabel5.setText("SECTOR :");

        jLabel6.setText("RANGO :");

        jLabel7.setText("SALDO :");

        jLabel8.setText("EDAD :");

        txtedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel9.setText("COMISARIA");

        btnregistrar.setText("REGISTRAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnreportes.setText("REPORTES");
        btnreportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportesActionPerformed(evt);
            }
        });

        lstRep.setColumns(20);
        lstRep.setRows(5);
        jScrollPane1.setViewportView(lstRep);

        btnlimp.setText("Limpiar Campos");
        btnlimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtapelli, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(txtdni)
                            .addComponent(txtsect)
                            .addComponent(txtrang))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtedad, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(txtsal))
                                .addGap(33, 33, 33))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtadm)
                                    .addComponent(rbtpoli))
                                .addContainerGap(64, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(277, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnregistrar)
                                .addGap(32, 32, 32)
                                .addComponent(btnreportes)
                                .addGap(31, 31, 31)
                                .addComponent(btnlimp))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtadm)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtapelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(rbtpoli)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtsect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregistrar)
                    .addComponent(btnreportes)
                    .addComponent(btnlimp))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodActionPerformed
        
    }//GEN-LAST:event_txtcodActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        
        if(rbtadm.isSelected()){
            String codi = txtcod.getText();
            String nomb = txtnom.getText();
            String apel = txtapelli.getText();
            String dni = txtdni.getText();
            String sect = txtsect.getText();
             if(txtcod.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Ingrese CODIGO","error",JOptionPane.ERROR_MESSAGE);
       } 
       else if(txtnom.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Ingrese Nombre","error",JOptionPane.ERROR_MESSAGE);
       }else if(txtapelli.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Ingrese AEPLLIDO","error",JOptionPane.ERROR_MESSAGE);
       }else if(txtdni.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Ingrese DNI","error",JOptionPane.ERROR_MESSAGE);
       }else if(txtsect.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Ingrese SECTOR","error",JOptionPane.ERROR_MESSAGE);
       }else{
                       ListaAdministrativo.add(new PersonalAdministrativo(codi, nomb, apel, dni, sect));

       }
            
            
            
            
            
         
            
        }
        else if(rbtpoli.isSelected())
        {
            String codi = txtcod.getText();
            String nomb = txtnom.getText();
            String apel = txtapelli.getText();
            String dni = txtdni.getText();
            int ra = Integer.parseInt(txtrang.getText());
            double sal = Double.parseDouble(txtsal.getText());
            int eda = Integer.parseInt(txtedad.getText());
            
            
             if(txtcod.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Ingrese CODIGO","error",JOptionPane.ERROR_MESSAGE);
       } 
       else if(txtnom.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Ingrese Nombre","error",JOptionPane.ERROR_MESSAGE);
       }else if(txtapelli.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Ingrese AEPLLIDO","error",JOptionPane.ERROR_MESSAGE);
       }else if(txtdni.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Ingrese DNI","error",JOptionPane.ERROR_MESSAGE);
       }else if(txtrang.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Ingrese RANGO","error",JOptionPane.ERROR_MESSAGE);
       }else if(txtsal.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Ingrese SALARIO","error",JOptionPane.ERROR_MESSAGE);
       }else if(txtedad.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Ingrese EDAD","error",JOptionPane.ERROR_MESSAGE);
       }else{
            ListaPolicia.add(new Policia(nomb, apel, codi, dni, eda, ra, sal));

       }
            
            
            
            
            
            
        }
        
        
          
        
                
    }//GEN-LAST:event_btnregistrarActionPerformed

    public void limpiar()
    {
                txtcod.setText("");
                txtnom.setText("");
                txtapelli.setText("");
                txtdni.setText("");
                txtsect.setText("");
                txtedad.setText("");
                txtrang.setText("");
                txtsal.setText("");
        
    
    }
    private void btnreportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportesActionPerformed
        if(rbtadm.isSelected())
        {
            for( PersonalAdministrativo objA : ListaAdministrativo){
                lstRep.append(objA.toString());
        }
        
    } else if(rbtpoli.isSelected())
        {
            for( Policia objP : ListaPolicia){
                lstRep.append(objP   .toString());
        }   
        } 
    }//GEN-LAST:event_btnreportesActionPerformed

    private void rbtadmStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtadmStateChanged
      rb();        
    }//GEN-LAST:event_rbtadmStateChanged

    private void rbtpoliStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtpoliStateChanged
      rb();
    }//GEN-LAST:event_rbtpoliStateChanged

    private void txtedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadActionPerformed

    private void txtcodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodKeyTyped
       
    }//GEN-LAST:event_txtcodKeyTyped

    private void txtcodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcodFocusLost
       
    }//GEN-LAST:event_txtcodFocusLost

    private void btnlimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpActionPerformed
       limpiar();
    }//GEN-LAST:event_btnlimpActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmMantenimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmMantenimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmMantenimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmMantenimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmMantenimientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlimp;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnreportes;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea lstRep;
    private javax.swing.JRadioButton rbtadm;
    private javax.swing.JRadioButton rbtpoli;
    private javax.swing.JTextField txtapelli;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtrang;
    private javax.swing.JTextField txtsal;
    private javax.swing.JTextField txtsect;
    // End of variables declaration//GEN-END:variables
}
