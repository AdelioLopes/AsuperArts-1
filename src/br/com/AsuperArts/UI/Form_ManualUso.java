package br.com.AsuperArts.UI;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Equipe senac 2017
 */
public class Form_ManualUso extends javax.swing.JInternalFrame {

    public Form_ManualUso() {
        initComponents();
        btnManual.setBackground(new Color(255,255,255));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManual = new javax.swing.JButton();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Abrir Manual de Instruções");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/IconeAsuperArts.png"))); // NOI18N

        btnManual.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/Pdflogogt.png"))); // NOI18N
        btnManual.setText("Manual do sistema");
        btnManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnManual, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 610, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnManual, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 423, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1050, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManualActionPerformed
        try {
            Desktop.getDesktop().open(new File(""));
        } catch (IOException ex) {
            Logger.getLogger(Form_ManualUso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnManualActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManual;
    // End of variables declaration//GEN-END:variables
}
