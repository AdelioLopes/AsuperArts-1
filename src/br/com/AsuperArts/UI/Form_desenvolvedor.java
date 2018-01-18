package br.com.AsuperArts.UI;

/**
 *
 * @author Equipe senac 2017
 */
public class Form_desenvolvedor extends javax.swing.JInternalFrame {
    public Form_desenvolvedor() {
        initComponents();
        lbl_desenvoldedor.setText("<html> <h1>Software desenvoldido pela equipe Senac-df 2017. Integrantes:  </h1></html>");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_desenvoldedor = new javax.swing.JLabel();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Desenvolvedor");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/IconeAsuperArts.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_desenvoldedor, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 636, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(lbl_desenvoldedor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1050, 550);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_desenvoldedor;
    // End of variables declaration//GEN-END:variables
}
