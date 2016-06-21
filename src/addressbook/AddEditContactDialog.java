/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import addressbook.database.dao.ContactDAO;
import addressbook.subject.contact.Contact;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import addressbook.listeners.IAddEditContactListener;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Igor Gayvan
 */
public class AddEditContactDialog extends javax.swing.JDialog {

    private Contact contact;
    private EModeAddEditForm modeAddEditForm;

    private List<IAddEditContactListener> addEditContactListeners;

    public AddEditContactDialog() {
    }

    public AddEditContactDialog(Contact contact, EModeAddEditForm modeAddEditForm) {
        this.addEditContactListeners = new ArrayList<>();

        initComponents();
        jtfNameFull.requestFocus();
        switch (modeAddEditForm) {
            case ADD: {
                this.setTitle("Добавление");
                Image img = new ImageIcon(getClass().getResource("/addressbook/images/add.png")).getImage();
                this.setIconImage(img);

                jbAccept.setVisible(true);
                jbCancel.setVisible(true);
                jbExit.setVisible(false);
                break;
            }
            case EDIT: {
                this.setTitle("Изменение");
                Image img = new ImageIcon(getClass().getResource("/addressbook/images/edit_blue.png")).getImage();
                this.setIconImage(img);

                jbAccept.setVisible(true);
                jbCancel.setVisible(true);
                jbExit.setVisible(false);
                break;
            }
            case VIEW: {
                this.setTitle("Просмотр");
                Image img = new ImageIcon(getClass().getResource("/addressbook/images/view_yellow.png")).getImage();
                this.setIconImage(img);

                jbAccept.setVisible(false);
                jbCancel.setVisible(false);
                jbExit.setVisible(true);
                break;
            }
        }
        this.modeAddEditForm = modeAddEditForm;
        this.setModal(true);
        this.contact = contact;

        initFields();
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public JTextField getJtfEmail() {
        return jtfEmail;
    }

    public void setJtfEmail(JTextField jtfEmail) {
        this.jtfEmail = jtfEmail;
    }

    public JTextField getJtfId() {
        return jtfId;
    }

    public void setJtfId(JTextField jtfId) {
        this.jtfId = jtfId;
    }

    public JTextField getJtfNameFull() {
        return jtfNameFull;
    }

    public void setJtfNameFull(JTextField jtfNameFull) {
        this.jtfNameFull = jtfNameFull;
    }

    public JTextField getJtfPhone() {
        return jtfPhone;
    }

    public void setJtfPhone(JTextField jtfPhone) {
        this.jtfPhone = jtfPhone;
    }

    public JTextField getJtfSkype() {
        return jtfSkype;
    }

    public void setJtfSkype(JTextField jtfSkype) {
        this.jtfSkype = jtfSkype;
    }

    public EModeAddEditForm getModeAddEditForm() {
        return modeAddEditForm;
    }

    public void setModeAddEditFrom(EModeAddEditForm modeAddEditForm) {
        this.modeAddEditForm = modeAddEditForm;
    }

    private void initFields() {
        jtfId.setText("0".equals(String.valueOf(contact.getId())) ? "" : String.valueOf(contact.getId()));
        jtfNameFull.setText(contact.getNameFull() != null ? contact.getNameFull() : "");
        jtfPhone.setText(contact.getPhone() != null ? contact.getPhone() : "");
        jtfSkype.setText(contact.getSkype() != null ? contact.getSkype() : "");
        jtfEmail.setText(contact.getEmail() != null ? contact.getEmail() : "");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jtfNameFull = new javax.swing.JTextField();
        jtfPhone = new javax.swing.JTextField();
        jtfSkype = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        jbAccept = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Добавление");
        setName("jfrAddEdditContact"); // NOI18N
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" Контакт "));

        jLabel1.setText("ID");

        jLabel2.setText("Полное наименование");

        jLabel3.setText("Телефон");

        jLabel4.setText("Email");

        jLabel5.setText("Скайп");

        jtfId.setEditable(false);
        jtfId.setBackground(new java.awt.Color(204, 204, 204));
        jtfId.setText("jTextField1");
        jtfId.setAutoscrolls(false);
        jtfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdActionPerformed(evt);
            }
        });

        jtfNameFull.setText("jTextField1");

        jtfPhone.setText("jTextField1");

        jtfSkype.setText("jTextField1");

        jtfEmail.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfId, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(jtfNameFull)
                    .addComponent(jtfPhone)
                    .addComponent(jtfSkype)
                    .addComponent(jtfEmail))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNameFull, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfSkype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setFocusable(false);

        jbAccept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addressbook/images/ok.png"))); // NOI18N
        jbAccept.setToolTipText("Принять");
        jbAccept.setName(""); // NOI18N
        jbAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAcceptActionPerformed(evt);
            }
        });
        jToolBar1.add(jbAccept);

        jbCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addressbook/images/cancel.png"))); // NOI18N
        jbCancel.setToolTipText("Отменить");
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });
        jToolBar1.add(jbCancel);

        jbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addressbook/images/exit.png"))); // NOI18N
        jbExit.setToolTipText("Закрыть");
        jbExit.setFocusable(false);
        jbExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });
        jToolBar1.add(jbExit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
        dispose();
    }//GEN-LAST:event_jbCancelActionPerformed

    private void jbAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAcceptActionPerformed
        this.contact.setNameFull(jtfNameFull.getText());
        this.contact.setPhone(jtfPhone.getText());
        this.contact.setSkype(jtfSkype.getText());
        this.contact.setEmail(jtfEmail.getText());

        for (IAddEditContactListener addEditContactListener : addEditContactListeners) {
            addEditContactListener.addEditContact();
        }

        dispose();
    }//GEN-LAST:event_jbAcceptActionPerformed

    private void jtfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (KeyEvent.VK_ESCAPE == evt.getKeyCode()) {
            jbCancel.doClick();
        }
    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        if (KeyEvent.VK_ESCAPE == evt.getKeyCode()) {
            jbCancel.doClick();
        }
    }//GEN-LAST:event_formKeyReleased

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        if (KeyEvent.VK_ESCAPE == evt.getKeyCode()) {
            jbCancel.doClick();
        }
    }//GEN-LAST:event_formKeyTyped

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        dispose();
    }//GEN-LAST:event_jbExitActionPerformed

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
            java.util.logging.Logger.getLogger(AddEditContactDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEditContactDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEditContactDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEditContactDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEditContactDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbAccept;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbExit;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfNameFull;
    private javax.swing.JTextField jtfPhone;
    private javax.swing.JTextField jtfSkype;
    // End of variables declaration//GEN-END:variables

    public void addActionListener(IAddEditContactListener addEditContactListener) {
        addEditContactListeners.add(addEditContactListener);
    }

}
