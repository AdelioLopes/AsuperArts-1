package br.com.AsuperArts.UI;


//import java.awt.Image;
//import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.Timer;

/**
 * @author Equipe senac 2017
 */
public class TelaPrincipal extends javax.swing.JFrame{
    private Form_Medidas form_cadastroMedidas = null;
    private Form_Produtos form_cadastroProdutos = null;
    private Form_Cliente form_cadastroCliente = null;
    private Form_Usuario form_cadastroUsuario = null;
    private Form_Funcionario form_cadastroFuncionario = null;
    private Form_GerarOS form_GerarOS = null;
    private Form_relatorio form_relatorio = null;
    private Form_desenvolvedor form_desenvolvedor = null;
    private Form_ManualUso form_ManualUso = null;
    private Form_TipoOS form_TipoOS = null;
    
    public TelaPrincipal() {
       initComponents();
       

       Tela_login tl = new Tela_login();
       tl.txtUsuario.setText("no login");
       lblUsuario.setText("no login");
    }
 public TelaPrincipal(Integer tipo) {
        initComponents();
        /*URL url = this.getClass().getResource("img/IconeAsuperArts.png");  
        Image icone = Toolkit.getDefaultToolkit().getImage(url);  
        this.setIconImage(icone);*/
        
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
        Usuario = new javax.swing.JMenuItem();
        Cliente = new javax.swing.JMenuItem();
        Produto = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Funcionario = new javax.swing.JMenuItem();
        TipoOS = new javax.swing.JMenuItem();
        GerarOS = new javax.swing.JMenuItem();
        RelatorioOS = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        FuncGerarOS = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        ManualUso = new javax.swing.JMenuItem();
        Desenvolvedor = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("A super Art's Sistema de Ordens de Serviços");
        setResizable(false);
        setSize(new java.awt.Dimension(1396, 617));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        desktop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desktop.setMinimumSize(new java.awt.Dimension(1050, 550));
        desktop.setRequestFocusEnabled(false);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        lblUsuario.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(102, 102, 255));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/usuario.png"))); // NOI18N
        lblUsuario.setText("Usuário");
        lblUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));

        dt_sistema.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dt_sistema.setForeground(new java.awt.Color(173, 153, 255));

        h_sistema.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        h_sistema.setForeground(new java.awt.Color(173, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dt_sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h_sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(h_sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dt_sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dt_sistema.getAccessibleContext().setAccessibleName("dt_sistema");
        h_sistema.getAccessibleContext().setAccessibleName("h_sistema");

        jMenuBar1.setEnabled(false);

        jMenu6.setText("Logout/Sair");
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

        restrito.setText("Restrito");
        restrito.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        Usuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        Usuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Usuario.setText("Usuário do Sistema");
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        restrito.add(Usuario);

        Cliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        Cliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Cliente.setText("Clientes");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        restrito.add(Cliente);

        Produto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        Produto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Produto.setText("Produtos");
        Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutoActionPerformed(evt);
            }
        });
        restrito.add(Produto);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem1.setText("Medidas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        restrito.add(jMenuItem1);

        Funcionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        Funcionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Funcionario.setText("Funcionário");
        Funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuncionarioActionPerformed(evt);
            }
        });
        restrito.add(Funcionario);

        TipoOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        TipoOS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TipoOS.setText("Tipo OS");
        TipoOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoOSActionPerformed(evt);
            }
        });
        restrito.add(TipoOS);

        GerarOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        GerarOS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        GerarOS.setText("Gerar OS");
        GerarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarOSActionPerformed(evt);
            }
        });
        restrito.add(GerarOS);

        RelatorioOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        RelatorioOS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        RelatorioOS.setText("Relatórios OS");
        RelatorioOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioOSActionPerformed(evt);
            }
        });
        restrito.add(RelatorioOS);

        jMenuBar1.add(restrito);

        jMenu2.setText("Funcionário");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        FuncGerarOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        FuncGerarOS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        FuncGerarOS.setText("Gerar OS");
        FuncGerarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuncGerarOSActionPerformed(evt);
            }
        });
        jMenu2.add(FuncGerarOS);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Ajuda");
        jMenu4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        ManualUso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        ManualUso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ManualUso.setText("Manual de Uso");
        ManualUso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManualUsoActionPerformed(evt);
            }
        });
        jMenu4.add(ManualUso);

        Desenvolvedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        Desenvolvedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Desenvolvedor.setText("Desenvolvedor");
        Desenvolvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesenvolvedorActionPerformed(evt);
            }
        });
        jMenu4.add(Desenvolvedor);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 1003, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(393, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1412, 678));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //this.setSize(1148, 669);
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
        form_GerarOS  = new Form_GerarOS();
        form_GerarOS.setVisible(true);
        desktop.add(form_GerarOS);
    }//GEN-LAST:event_GerarOSActionPerformed

    private void ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutoActionPerformed
        fecharTelas();
        form_cadastroProdutos  = new Form_Produtos();
        form_cadastroProdutos.setVisible(true);
        desktop.add(form_cadastroProdutos);
    }//GEN-LAST:event_ProdutoActionPerformed

    private void RelatorioOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioOSActionPerformed
        fecharTelas();
        form_relatorio = new Form_relatorio();
        form_relatorio.setVisible(true);
        desktop.add(form_relatorio);
    }//GEN-LAST:event_RelatorioOSActionPerformed

    private void DesenvolvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesenvolvedorActionPerformed
        fecharTelas();
        form_desenvolvedor = new Form_desenvolvedor();
        form_desenvolvedor.setVisible(true);
        desktop.add(form_desenvolvedor);
    }//GEN-LAST:event_DesenvolvedorActionPerformed

    private void FuncGerarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuncGerarOSActionPerformed
        fecharTelas();
        form_GerarOS  = new Form_GerarOS();
        form_GerarOS.setVisible(true);
        desktop.add(form_GerarOS);
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

    private void ManualUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManualUsoActionPerformed
        fecharTelas();
        form_ManualUso = new Form_ManualUso();
        form_ManualUso.setVisible(true);
        desktop.add(form_ManualUso);
    }//GEN-LAST:event_ManualUsoActionPerformed

    private void TipoOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoOSActionPerformed
        fecharTelas();
        form_TipoOS = new Form_TipoOS();
        form_TipoOS.setVisible(true);
        desktop.add(form_TipoOS);
    }//GEN-LAST:event_TipoOSActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        form_cadastroMedidas = new Form_Medidas();
        form_cadastroMedidas.setVisible(true);
        desktop.add(form_cadastroMedidas);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    public void fecharTelas(){
        if(form_cadastroProdutos != null){form_cadastroProdutos.setVisible(false);}
        form_cadastroProdutos = null;
        if(form_cadastroCliente != null){form_cadastroCliente.setVisible(false);}
        form_cadastroCliente = null;   
        if(form_cadastroUsuario != null){form_cadastroUsuario.setVisible(false);}
        form_cadastroUsuario = null; 
        if(form_cadastroFuncionario != null){form_cadastroFuncionario.setVisible(false);}
        form_cadastroFuncionario = null;
        if(form_GerarOS != null){form_GerarOS.setVisible(false);}
        form_GerarOS = null;
        if(form_relatorio != null){form_relatorio.setVisible(false);}
        form_relatorio = null;       
        if(form_desenvolvedor != null){form_desenvolvedor.setVisible(false);}
        form_desenvolvedor = null;
        if(form_ManualUso != null){form_ManualUso.setVisible(false);}
        form_ManualUso = null;
        if(form_TipoOS != null){form_TipoOS.setVisible(false);}
        form_TipoOS = null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cliente;
    private javax.swing.JMenuItem Desenvolvedor;
    private javax.swing.JMenuItem FuncGerarOS;
    private javax.swing.JMenuItem Funcionario;
    private javax.swing.JMenuItem GerarOS;
    private javax.swing.JMenuItem ManualUso;
    private javax.swing.JMenuItem Produto;
    private javax.swing.JMenuItem RelatorioOS;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem TipoOS;
    private javax.swing.JMenuItem TrocarUsuario;
    private javax.swing.JMenuItem Usuario;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel dt_sistema;
    private javax.swing.JLabel h_sistema;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
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

