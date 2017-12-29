/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.AsuperArts.UI;

import br.com.AsuperArts.BLL.LoginBLL;
import br.com.AsuperArts.DTO.LoginDTO;
import java.awt.Color;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Gabriel Duarte
 */
public class Form_Usuario extends javax.swing.JInternalFrame {
    public Form_Usuario() {
        initComponents();
        preencherTabela();
        btn_alterar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        /*txtAcesso.setBackground(new Color(255,255,255));
        btn_alterar.setBackground(new Color(255,255,255));
        btn_cadastrar.setBackground(new Color(255,255,255));
        btn_cancelar.setBackground(new Color(255,255,255));
        btn_editar.setBackground(new Color(255,255,255));
        btn_excluir.setBackground(new Color(255,255,255));*/
        
        //getContentPane().setBackground(new Color(255,255,255));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtAcesso = new javax.swing.JComboBox<>();
        txt_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLogin = new javax.swing.JTable();
        btn_excluir = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Usuários");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/IconeAsuperArts.png"))); // NOI18N
        setMaximumSize(null);
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1050, 550));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N

        txtUsuario.setBackground(new java.awt.Color(240, 240, 240));
        txtUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtSenha.setBackground(new java.awt.Color(240, 240, 240));
        txtSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtAcesso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtAcesso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2" }));

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_id.setEnabled(false);
        txt_id.setPreferredSize(new java.awt.Dimension(16, 46));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Usuário");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Senha");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Nível de Usuário");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(txtAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N

        jTableLogin.setBorder(new javax.swing.border.MatteBorder(null));
        jTableLogin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "USUÁRIO", "SENHA", "ACESSO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableLogin.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableLogin);
        if (jTableLogin.getColumnModel().getColumnCount() > 0) {
            jTableLogin.getColumnModel().getColumn(0).setResizable(false);
            jTableLogin.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTableLogin.getColumnModel().getColumn(1).setResizable(false);
            jTableLogin.getColumnModel().getColumn(2).setResizable(false);
            jTableLogin.getColumnModel().getColumn(3).setResizable(false);
            jTableLogin.getColumnModel().getColumn(3).setPreferredWidth(5);
        }

        btn_excluir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.setToolTipText("Excluir");
        btn_excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_excluir.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_editar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_editar.setText("Editar Usuário");
        btn_editar.setToolTipText("Editar");
        btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar.setMaximumSize(new java.awt.Dimension(60, 60));
        btn_editar.setMinimumSize(new java.awt.Dimension(60, 60));
        btn_editar.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_cancelar.setText("Desfazer");
        btn_cancelar.setToolTipText("Cancelar");
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.setMargin(new java.awt.Insets(41, 41, 41, 41));
        btn_cancelar.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_alterar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_alterar.setText("Salvar");
        btn_alterar.setToolTipText("Salvar Alteração");
        btn_alterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_alterar.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_editar.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1050, 550);
    }// </editor-fold>//GEN-END:initComponents
    
public void preencherTabela(){    
        this.jTableLogin.getColumnModel().getColumn(0).setPreferredWidth(50);
        this.jTableLogin.getColumnModel().getColumn(0).setMaxWidth(50);
        this.jTableLogin.getColumnModel().getColumn(0).setMinWidth(50);
        
        this.jTableLogin.getColumnModel().getColumn(1).setPreferredWidth(200);
        this.jTableLogin.getColumnModel().getColumn(1).setMaxWidth(200);
        this.jTableLogin.getColumnModel().getColumn(1).setMinWidth(200);
        
        this.jTableLogin.getColumnModel().getColumn(2).setPreferredWidth(0);
        this.jTableLogin.getColumnModel().getColumn(2).setMaxWidth(0);
        this.jTableLogin.getColumnModel().getColumn(2).setMinWidth(0);
        
        this.jTableLogin.getColumnModel().getColumn(3).setPreferredWidth(100);
        this.jTableLogin.getColumnModel().getColumn(3).setMaxWidth(100);
        this.jTableLogin.getColumnModel().getColumn(3).setMinWidth(100);
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        this.jTableLogin.getColumnModel().getColumn(3).setCellRenderer(centralizado);
        
        
        this.jTableLogin.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.jTableLogin.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel modelo = (DefaultTableModel)jTableLogin.getModel();
        modelo.setNumRows(0);
        LoginBLL rg = new LoginBLL();
        for(LoginDTO login: rg.ListarUsuarios()){
                modelo.addRow(new Object[]{
                login.getId_login(),
                login.getUsuario(),
                login.getSenha(),
                login.getTipoUser()
            });

        }
     }      
    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        LoginBLL rg = new LoginBLL();
        LoginDTO loginDTO = new LoginDTO();     
        if(this.jTableLogin.getSelectedRowCount() > 0){
        int linha = this.jTableLogin.getSelectedRow();
        loginDTO.setId_login((int) this.jTableLogin.getValueAt(linha, 0));    
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(null, "deseja mesmo alterar?");
        if(resposta == JOptionPane.YES_OPTION){
                setar_campos();                
                jButton1.setEnabled(false);
                btn_editar.setEnabled(false);
                btn_excluir.setEnabled(false);
                btn_alterar.setEnabled(true);
                btn_cancelar.setEnabled(true);
                preencherTabela();
            }
        }else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        LoginBLL rg = new LoginBLL();
        LoginDTO loginDTO = new LoginDTO();
        if(!txtUsuario.getText().equals("") && !String.valueOf(txtSenha.getPassword()).equals("") && !"".equals(txtAcesso.getSelectedItem())){
            try {
                loginDTO.setId_login(Integer.parseInt(txt_id.getText()));
                loginDTO.setUsuario(txtUsuario.getText());
                loginDTO.setSenha(convertPasswordToMD5(txtSenha.getPassword()));
                loginDTO.setTipoUser(Integer.parseInt(txtAcesso.getSelectedItem().toString()));
                
                rg.Alterar(loginDTO);
                preencherTabela();
                jButton1.setEnabled(true);
                btn_editar.setEnabled(true);
                btn_excluir.setEnabled(true);
                btn_alterar.setEnabled(false);
                btn_cancelar.setEnabled(false);
                txt_id.setText("");
                txtUsuario.setText("");
                txtSenha.setText("");
                txtAcesso.setSelectedItem("");                
                JOptionPane.showMessageDialog(null, "Alterado");
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(Form_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
             }else {
                 JOptionPane.showMessageDialog(null, "Campos vazios verifique e tente novamente");
            }
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        btn_alterar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        jButton1.setEnabled(true);
        btn_editar.setEnabled(true);
        btn_excluir.setEnabled(true);
        txt_id.setText("");
        txtUsuario.setText("");
        txtSenha.setText("");
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        LoginBLL rg = new LoginBLL();
        LoginDTO loginDTO = new LoginDTO();
        if (this.jTableLogin.getSelectedRowCount() > 0) {
            int linha = this.jTableLogin.getSelectedRow();
            loginDTO.setId_login((int) this.jTableLogin.getValueAt(linha, 0));
            int resposta = 0;
            resposta = JOptionPane.showConfirmDialog(null, "deseja mesmo excluir?");
            if (resposta == JOptionPane.YES_OPTION) {
                rg.Excluir(loginDTO);
                preencherTabela();
                JOptionPane.showMessageDialog(null, "Excluído!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        } 
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LoginBLL rg = new LoginBLL();
        LoginDTO loginDTO = new LoginDTO();
        if(!txtUsuario.getText().equals("") && !txtSenha.getPassword().equals("") && !"".equals(txtAcesso.getSelectedItem())){
            try {
                loginDTO.setUsuario(txtUsuario.getText());
                loginDTO.setSenha(convertPasswordToMD5(txtSenha.getPassword()));
                loginDTO.setTipoUser(Integer.parseInt(txtAcesso.getSelectedItem().toString()));
                rg.Inserir(loginDTO);
                preencherTabela();

                JOptionPane.showMessageDialog(null, "Usuário cadastrado");
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(Form_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else {
            JOptionPane.showMessageDialog(null, "Campos vazios verifique e tente novamente");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
public void setar_campos(){
    int setar = jTableLogin.getSelectedRow();
    txt_id.setText(jTableLogin.getModel().getValueAt(setar, 0).toString());
    txtUsuario.setText(jTableLogin.getModel().getValueAt(setar, 1).toString());
    txtAcesso.setSelectedItem(jTableLogin.getModel().getValueAt(setar, 3).toString());
}
    
public static String convertPasswordToMD5(char[] cadeia) throws NoSuchAlgorithmException {
                   String password =  new String(cadeia);
                   MessageDigest md = MessageDigest.getInstance("MD5");
                   BigInteger hash = new BigInteger(1, md.digest(password.getBytes()));
                   return String.format("%32x", hash);
               }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLogin;
    private javax.swing.JComboBox<String> txtAcesso;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
