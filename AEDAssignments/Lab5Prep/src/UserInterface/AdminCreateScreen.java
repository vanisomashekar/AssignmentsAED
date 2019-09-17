/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Abstract.User;
import Business.Users.Admin;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author harshalneelkamal
 */
public class AdminCreateScreen extends javax.swing.JPanel {

    /**
     * Creates new form AdminScreen
     */
    private JPanel panelRight;
    private Admin admin;
    public AdminCreateScreen(JPanel panelRight, Admin admin) {
        initComponents();
        this.panelRight = panelRight;
        this.admin = admin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radiogroup = new javax.swing.ButtonGroup();
        btnCreate = new javax.swing.JButton();
        emailIDTF = new javax.swing.JTextField();
        txtPword = new javax.swing.JTextField();
        txtRePword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        radioCustomer = new javax.swing.JRadioButton();
        radioSupplier = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();
        pswdLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(825, 660));

        btnCreate.setBackground(new java.awt.Color(0, 153, 153));
        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("CREATE");
        btnCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        emailIDTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        emailIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailIDTFActionPerformed(evt);
            }
        });
        emailIDTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailIDTFKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailIDTFKeyReleased(evt);
            }
        });

        txtPword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPwordActionPerformed(evt);
            }
        });
        txtPword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPwordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPwordKeyReleased(evt);
            }
        });

        txtRePword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtRePword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRePwordActionPerformed(evt);
            }
        });
        txtRePword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRePwordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRePwordKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USERNAME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASSWORD");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RE-ENTER PASSWORD");

        radiogroup.add(radioCustomer);
        radioCustomer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        radioCustomer.setForeground(new java.awt.Color(255, 255, 255));
        radioCustomer.setText("Customer");
        radioCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radioCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCustomerActionPerformed(evt);
            }
        });

        radiogroup.add(radioSupplier);
        radioSupplier.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        radioSupplier.setForeground(new java.awt.Color(255, 255, 255));
        radioSupplier.setText("Supplier");
        radioSupplier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("< BACK");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 0, 0));

        pswdLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pswdLabel.setForeground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioCustomer)
                            .addComponent(radioSupplier))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pswdLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {emailIDTF, txtPword, txtRePword});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBack, btnCreate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pswdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addComponent(radioCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioSupplier)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnBack))
                .addGap(328, 328, 328))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {emailIDTF, txtPword, txtRePword});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, btnCreate});

    }// </editor-fold>//GEN-END:initComponents

    
    public boolean ismatched() {
   
       if(txtRePword.getText().equals(txtPword.getText()))
       {
          return true;
                   } 
       else
       {
           return false;
       }
     
        
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.remove(this);
        layout.previous(panelRight);
    }//GEN-LAST:event_btnBackActionPerformed

    private void emailIDTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailIDTFKeyPressed
        // TODO add your handling code here:

    
    }//GEN-LAST:event_emailIDTFKeyPressed

    private void emailIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailIDTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailIDTFActionPerformed

    private void txtPwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPwordKeyReleased
        if(isValidPassword(txtPword.getText()))
        {
            pswdLabel.setText("");
        }
        else {

            pswdLabel.setText("Invalid Password, should contain min 8 characters include atleast one Uppercase,lowercase,number or  _$+ ");
        }
    }//GEN-LAST:event_txtPwordKeyReleased

    private void txtPwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPwordKeyPressed
        // TODO add your handling code here:
        //        if(isValidPassword(txtPword.getText()))
        //        {
            //             pswdLabel.setText("");
            //        }
        //        else {
            //
            //            pswdLabel.setText("Invalid Password, should contin min 8 characters and include either _$+ ");
            //        }
    }//GEN-LAST:event_txtPwordKeyPressed

    private void txtPwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPwordActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtPwordActionPerformed

    private void txtRePwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRePwordKeyReleased
        // TODO add your handling code here:

        if(ismatched())
        {
            txtRePword.setBackground(Color.GREEN);
        }
        else
        {
            txtRePword.setBackground(Color.RED);
        }
    }//GEN-LAST:event_txtRePwordKeyReleased

    private void txtRePwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRePwordKeyPressed

    }//GEN-LAST:event_txtRePwordKeyPressed

    private void txtRePwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRePwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRePwordActionPerformed

    private void radioCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioCustomerActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if(!(emailIDTF.getText().equals("")) || !(txtPword.getText().equals("")))
       {
           
        if(isValidEmailAddress(emailIDTF.getText()) &&  isValidPassword(txtPword.getText()) && ismatched()){
            
            
            if(!(radiogroup.isSelected(null)))
            {
            if(radioCustomer.isSelected()){
                Customer c = new Customer(txtPword.getText(),emailIDTF.getText());
                Date d=new Date();
                c.setDateCreated(d);
                admin.getCustDir().addCustomer(c);
                LoginScreen cust = new LoginScreen(panelRight,admin.getCustDir().getCustomerList());
                JOptionPane.showMessageDialog(null, "Customer Created Successfully");
              
                CardLayout layout = (CardLayout)panelRight.getLayout();
                panelRight.add(cust);
                layout.next(panelRight);
            }
        
        if(radioSupplier.isSelected()){
            Supplier s = new Supplier(txtPword.getText(),emailIDTF.getText());
            admin.getSuppDir().addSupplier(s);
            LoginScreen sup = new LoginScreen(panelRight,admin.getSuppDir().getSupplierList());
             JOptionPane.showMessageDialog(null, "Supplier Created Successfully");
            CardLayout layout = (CardLayout)panelRight.getLayout();
            panelRight.add(sup);
            layout.next(panelRight);
        }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please select either Customer or Supplier");
            }
        }
  
        else
        {
             JOptionPane.showMessageDialog(null, "Please neter valid field values as specified");
        }
        
    }//GEN-LAST:event_btnCreateActionPerformed
   
        else{
            JOptionPane.showMessageDialog(null,"Please enter the username or password");
        }
    
        
    }
    private void emailIDTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailIDTFKeyReleased
            if(isValidEmailAddress(emailIDTF.getText()))
        {
            emailLabel.setText("");
        }
        else {

            emailLabel.setText("Invalid emailID, should contain only @_ and should not start with _");
        }
    }//GEN-LAST:event_emailIDTFKeyReleased
 public boolean isValidPassword(String password) {
        String PPattern = "^(?=.*[0-9])(?=.*[a-z])(?!.*[*?&@!#^()-])(?!.*[%.])(?=.*[A-Z])(?=.*[$+_])(?=.*[a-zA-Z]).{8,12}$";
        //String PPatern="[A-Za-z0-9\\+_\\$]{6,12}";
        java.util.regex.Pattern p1=java.util.regex.Pattern.compile(PPattern);
        java.util.regex.Matcher m1 = p1.matcher(password);
           return m1.matches();
    }
    public boolean isValidEmailAddress(String email) {
           String ePattern = "^(?!_)[a-zA-Z0-9_]+@(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,})$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           return m.matches();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JTextField emailIDTF;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel pswdLabel;
    private javax.swing.JRadioButton radioCustomer;
    private javax.swing.JRadioButton radioSupplier;
    private javax.swing.ButtonGroup radiogroup;
    private javax.swing.JTextField txtPword;
    private javax.swing.JTextField txtRePword;
    // End of variables declaration//GEN-END:variables
}
