package br.com.AsuperArts.UI;
import br.com.AsuperArts.BLL.LoginBLL;
import static br.com.AsuperArts.UI.Form_Usuario.convertPasswordToMD5;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 * @author Equipe senac 2017
 */
public class Tela_login extends javax.swing.JFrame {

    public Tela_login() {
        initComponents();
       URL url = this.getClass().getResource("img/IconeAsuperArts.png");  
       Image icone = Toolkit.getDefaultToolkit().getImage(url);  
       this.setIconImage(icone);
        
       
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        painelLogin = new javax.swing.JPanel();
        txtSenha = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        btnLogar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        painelLogin.setBackground(new java.awt.Color(204, 204, 204));
        painelLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        painelLogin.setPreferredSize(new java.awt.Dimension(400, 350));

        txtSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        txtUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtUsuario.setDoubleBuffered(true);
        txtUsuario.setDragEnabled(true);

        btnLogar.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        btnLogar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnLogar.setForeground(new java.awt.Color(102, 102, 102));
        btnLogar.setText("Fazer Login");
        btnLogar.setBorder(new javax.swing.border.LineBorder(null, 1, true));
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/logoadelio.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(91, 51, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/cadeado-iloveimg-resized.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(91, 51, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/User-iloveimg-resized.png"))); // NOI18N

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(117, Short.MAX_VALUE))
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(316, 316, 316))
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(952, 619));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


        
    }//GEN-LAST:event_formWindowOpened

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        LoginBLL rg = new LoginBLL();
        TelaPrincipal telaPrincipal;
        if(!"".equals(txtUsuario.getText())&&
            !"".equals(txtSenha.getPassword())){
            try {
                //usando o metodo publico criado -> converPasswordToMD5 para verificar no banco se a senha bate com a senha digitada :)
            int tipo = rg.Validar(txtUsuario.getText(),convertPasswordToMD5(txtSenha.getPassword()));
            if(tipo !=0){

                if(tipo == 1){

                    JOptionPane.showMessageDialog(null, "Bem Vindo, "+txtUsuario.getText());
                    telaPrincipal = new TelaPrincipal(tipo);
                    telaPrincipal.setSize(500, 500);
                    telaPrincipal.setVisible(true);
                    this.dispose();

                }else if( tipo == 2){
                    JOptionPane.showMessageDialog(null, "Bem Vindo, "+txtUsuario.getText());
                    telaPrincipal = new TelaPrincipal(tipo);
                    telaPrincipal.setSize(500, 500);
                    telaPrincipal.setVisible(true);
                    this.dispose();

                }

            }else{

                JOptionPane.showMessageDialog(null, "Error usuario "+txtUsuario.getText()+" não existe! verifique nome de usuário ou senha.");
            }

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Tela_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            JOptionPane.showMessageDialog(null, "Campos vazios verifique e tente novamente");
        }
    }//GEN-LAST:event_btnLogarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
