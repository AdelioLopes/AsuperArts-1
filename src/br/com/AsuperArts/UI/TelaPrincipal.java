package br.com.AsuperArts.UI;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.Timer;

/**
 * @author Equipe senac 2017
 */
public class TelaPrincipal extends javax.swing.JFrame{

    private Form_Cliente form_cadastroCliente = null;
    private Form_Usuario form_cadastroUsuario = null;
    private Form_Funcionario form_cadastroFuncionario = null;
    private Form_abrirOSNew form_GerarOSNew = null;
    private Form_Estoque form_Estoque = null;
    private Form_fecharOS form_fecharOS = null;
    private Form_RelatorioOS form_RelatorioOS = null;
    private Form_Servicos form_Servicos = null;
    private Form_Producao form_Producao = null;
    public TelaPrincipal() {
       initComponents();
       Tela_login tl = new Tela_login();
       tl.txtUsuario.setText("no login");
       lblUsuario.setText("no login");
    }
   
    public TelaPrincipal(Integer tipo) {
        initComponents();
        URL url = this.getClass().getResource("img/IconeAsuperArts.png");  
        Image icone = Toolkit.getDefaultToolkit().getImage(url);  
        this.setIconImage(icone);
        
        if(tipo == 1){
            restrito.setEnabled(true);
            lblUsuario.setText("Usuário: "+Tela_login.txtUsuario.getText());
        }else{
            restrito.setEnabled(false);
            lblUsuario.setText("Usuário: "+Tela_login.txtUsuario.getText());
        }     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        desktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        dt_sistema = new javax.swing.JLabel();
        h_sistema = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        TrocarUsuario = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenuItem();
        restrito = new javax.swing.JMenu();
        Cliente = new javax.swing.JMenuItem();
        Estoque = new javax.swing.JMenuItem();
        Funcionario = new javax.swing.JMenuItem();
        GerarOS = new javax.swing.JMenuItem();
        Usuario = new javax.swing.JMenuItem();
        FecharOS = new javax.swing.JMenuItem();
        RelatorioOS = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        FuncGerarOS = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("A super Art's Sistema de Ordens de Serviços");
        setBackground(new java.awt.Color(204, 204, 204));
        setSize(new java.awt.Dimension(1396, 617));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        desktop.setBackground(new java.awt.Color(255, 255, 255));
        desktop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desktop.setMaximumSize(new java.awt.Dimension(1050, 550));
        desktop.setMinimumSize(new java.awt.Dimension(1050, 550));
        desktop.setRequestFocusEnabled(false);
        desktop.setLayout(new javax.swing.OverlayLayout(desktop));

        lblUsuario.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(102, 102, 255));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/usuario.png"))); // NOI18N
        lblUsuario.setText("Usuário");
        lblUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));

        dt_sistema.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dt_sistema.setForeground(new java.awt.Color(51, 51, 255));

        h_sistema.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        h_sistema.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 916, Short.MAX_VALUE)
                .addComponent(h_sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dt_sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsuario)
                    .addComponent(dt_sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h_sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        dt_sistema.getAccessibleContext().setAccessibleName("dt_sistema");
        h_sistema.getAccessibleContext().setAccessibleName("h_sistema");

        jMenuBar1.setEnabled(false);

        jMenu6.setText("Arquivo");
        jMenu6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        TrocarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        TrocarUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TrocarUsuario.setText("Trocar Usuário");
        TrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrocarUsuarioActionPerformed(evt);
            }
        });
        jMenu6.add(TrocarUsuario);

        Sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        Sair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jMenu6.add(Sair);

        jMenuBar1.add(jMenu6);

        restrito.setText("Administrador");
        restrito.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        Cliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        Cliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-customer-32.png"))); // NOI18N
        Cliente.setText("Clientes");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        restrito.add(Cliente);

        Estoque.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Estoque.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Estoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-new-product-32.png"))); // NOI18N
        Estoque.setText("Estoque");
        Estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstoqueActionPerformed(evt);
            }
        });
        restrito.add(Estoque);

        Funcionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        Funcionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-administrator-male-32.png"))); // NOI18N
        Funcionario.setText("Funcionário");
        Funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuncionarioActionPerformed(evt);
            }
        });
        restrito.add(Funcionario);

        GerarOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        GerarOS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        GerarOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-documents-32.png"))); // NOI18N
        GerarOS.setText("Abrir OS");
        GerarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarOSActionPerformed(evt);
            }
        });
        restrito.add(GerarOS);

        Usuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        Usuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-person-32.png"))); // NOI18N
        Usuario.setText("Usuários");
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        restrito.add(Usuario);

        FecharOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        FecharOS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        FecharOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-pdf-32.png"))); // NOI18N
        FecharOS.setText("Fechar OS");
        FecharOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharOSActionPerformed(evt);
            }
        });
        restrito.add(FecharOS);

        RelatorioOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        RelatorioOS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        RelatorioOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-pdf-e32.png"))); // NOI18N
        RelatorioOS.setText("Relatório de OS");
        RelatorioOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioOSActionPerformed(evt);
            }
        });
        restrito.add(RelatorioOS);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-work-32.png"))); // NOI18N
        jMenuItem1.setText("Serviços ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        restrito.add(jMenuItem1);

        jMenuItem5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-preço-baixo-32.png"))); // NOI18N
        jMenuItem5.setText("Produção");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        restrito.add(jMenuItem5);

        jMenuBar1.add(restrito);

        jMenu2.setText("Funcionário");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        FuncGerarOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        FuncGerarOS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        FuncGerarOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-documents-32.png"))); // NOI18N
        FuncGerarOS.setText("Abrir OS");
        FuncGerarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuncGerarOSActionPerformed(evt);
            }
        });
        jMenu2.add(FuncGerarOS);

        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-customer-32.png"))); // NOI18N
        jMenuItem2.setText("Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-new-product-32.png"))); // NOI18N
        jMenuItem4.setText("Estoque");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 532, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        this.setExtendedState(MAXIMIZED_BOTH); 
    }//GEN-LAST:event_formWindowOpened

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void TrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrocarUsuarioActionPerformed
        Tela_login tela_login = new Tela_login();
        tela_login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TrocarUsuarioActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        fecharTelas();
        form_cadastroUsuario = new Form_Usuario();
        form_cadastroUsuario.setVisible(true);
        desktop.add(form_cadastroUsuario);
        
    }//GEN-LAST:event_UsuarioActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      SimpleDateFormat fd = new  SimpleDateFormat("dd/MM/yyyy");
        dt_sistema.setText( fd.format(new java.util.Date()));
        
        SimpleDateFormat fh = new  SimpleDateFormat("hh:mm:ss");
        h_sistema.setText(fh.format(new java.util.Date()));
        
        Timer timer = new Timer(1000, new hora());
        timer.start();
        
    }//GEN-LAST:event_formWindowActivated

    private void GerarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerarOSActionPerformed
        fecharTelas();
        form_GerarOSNew  = new Form_abrirOSNew();
        form_GerarOSNew.setVisible(true);
        desktop.add(form_GerarOSNew);   
    }//GEN-LAST:event_GerarOSActionPerformed

    private void FuncGerarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuncGerarOSActionPerformed
        fecharTelas();
        form_GerarOSNew  = new Form_abrirOSNew();
        form_GerarOSNew.setVisible(true);
        desktop.add(form_GerarOSNew);
        
    }//GEN-LAST:event_FuncGerarOSActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        fecharTelas();
        form_cadastroCliente = new Form_Cliente();
        form_cadastroCliente.setVisible(true);
        desktop.add(form_cadastroCliente);
       
        
    }//GEN-LAST:event_ClienteActionPerformed

    private void FuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuncionarioActionPerformed
        fecharTelas();
        form_cadastroFuncionario = new Form_Funcionario();
        form_cadastroFuncionario.setVisible(true);
        desktop.add(form_cadastroFuncionario);
    }//GEN-LAST:event_FuncionarioActionPerformed

    private void EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstoqueActionPerformed
        fecharTelas();
        form_Estoque = new Form_Estoque();
        form_Estoque.setVisible(true);
        desktop.add(form_Estoque);
    }//GEN-LAST:event_EstoqueActionPerformed

    private void FecharOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharOSActionPerformed
        fecharTelas();
        form_fecharOS = new Form_fecharOS();
        form_fecharOS.setVisible(true);
        desktop.add(form_fecharOS);
    }//GEN-LAST:event_FecharOSActionPerformed

    private void RelatorioOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioOSActionPerformed
       fecharTelas();
        form_RelatorioOS = new Form_RelatorioOS();
        form_RelatorioOS.setVisible(true);
        desktop.add(form_RelatorioOS);
    }//GEN-LAST:event_RelatorioOSActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        fecharTelas();
        form_Servicos = new Form_Servicos();
        form_Servicos.setVisible(true);
        desktop.add(form_Servicos);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        fecharTelas();
        form_cadastroCliente = new Form_Cliente();
        form_cadastroCliente.setVisible(true);
        desktop.add(form_cadastroCliente);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        fecharTelas();
        form_Estoque = new Form_Estoque();
        form_Estoque.setVisible(true);
        desktop.add(form_Estoque);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        fecharTelas();
        form_Producao = new Form_Producao();
        form_Producao.setVisible(true);
        desktop.add(form_Producao);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    public void fecharTelas(){
        if(form_cadastroCliente != null){form_cadastroCliente.setVisible(false);}
        form_cadastroCliente = null;   
        if(form_cadastroUsuario != null){form_cadastroUsuario.setVisible(false);}
        form_cadastroUsuario = null; 
        if(form_cadastroFuncionario != null){form_cadastroFuncionario.setVisible(false);}
        form_cadastroFuncionario = null;
        if(form_GerarOSNew != null){form_GerarOSNew.setVisible(false);}
        form_GerarOSNew = null;
        if(form_Estoque != null){form_Estoque.setVisible(false);}
        form_Estoque = null;
        if(form_fecharOS != null){form_fecharOS.setVisible(false);}
        form_fecharOS = null;
        if(form_RelatorioOS != null){form_RelatorioOS.setVisible(false);}
        form_RelatorioOS = null;
        if(form_Servicos != null){form_Servicos.setVisible(false);}
        form_Servicos = null;
        if(form_Producao != null){form_Producao.setVisible(false);}
        form_Producao = null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cliente;
    private javax.swing.JMenuItem Estoque;
    private javax.swing.JMenuItem FecharOS;
    private javax.swing.JMenuItem FuncGerarOS;
    private javax.swing.JMenuItem Funcionario;
    private javax.swing.JMenuItem GerarOS;
    private javax.swing.JMenuItem RelatorioOS;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem TrocarUsuario;
    private javax.swing.JMenuItem Usuario;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel dt_sistema;
    private javax.swing.JLabel h_sistema;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu restrito;
    // End of variables declaration//GEN-END:variables

    class hora implements ActionListener{
        public void actionPerformed(ActionEvent e){
           Calendar now = Calendar.getInstance();
           h_sistema.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }
    }
}

