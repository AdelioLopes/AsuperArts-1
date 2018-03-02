
package br.com.AsuperArts.UI;
import br.com.AsuperArts.BLL.FuncionarioBLL;
import br.com.AsuperArts.DTO.FuncionarioDTO;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Equipe Senac 2017
 */
public class Form_Funcionario extends javax.swing.JInternalFrame {

    public Form_Funcionario() {
        initComponents();
        preencherTabela();
        btn_salvar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        
        btn_cadastrar.setBorder(new Form_Funcionario.RoundedBorder(12));
        btn_editar.setBorder(new Form_Funcionario.RoundedBorder(12));
        btn_excluir.setBorder(new Form_Funcionario.RoundedBorder(12));
        btn_cancelar.setBorder(new Form_Funcionario.RoundedBorder(12));
        btn_salvar.setBorder(new Form_Funcionario.RoundedBorder(12));
    }
    
    private class RoundedBorder implements Border {

    private int radius;

    RoundedBorder(int radius) {
        this.radius = radius;
    }
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    }


    public boolean isBorderOpaque() {
        return true;
    }


    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x,y,width-1,height-1,radius,radius);
    }
}
    public void preencherTabela(){
    
    DefaultTableModel modelo = (DefaultTableModel) tb_funcionario.getModel();
    modelo.setNumRows(0);
    FuncionarioBLL rn = new FuncionarioBLL();
    /*
        this.tb_funcionario.getColumnModel().getColumn(0).setPreferredWidth(100);
        this.tb_funcionario.getColumnModel().getColumn(0).setMaxWidth(100);
        this.tb_funcionario.getColumnModel().getColumn(0).setMinWidth(100);
        
        this.tb_funcionario.getColumnModel().getColumn(1).setPreferredWidth(200);
        this.tb_funcionario.getColumnModel().getColumn(1).setMaxWidth(200);
        this.tb_funcionario.getColumnModel().getColumn(1).setMinWidth(200);
        
        this.tb_funcionario.getColumnModel().getColumn(2).setPreferredWidth(100);
        this.tb_funcionario.getColumnModel().getColumn(2).setMaxWidth(100);
        this.tb_funcionario.getColumnModel().getColumn(2).setMinWidth(100);
        
        this.tb_funcionario.getColumnModel().getColumn(3).setPreferredWidth(200);
        this.tb_funcionario.getColumnModel().getColumn(3).setMaxWidth(200);
        this.tb_funcionario.getColumnModel().getColumn(3).setMinWidth(200);*/
    
        for(FuncionarioDTO func: rn.listar()){
            modelo.addRow(new Object[]{
            func.getId_funcionario(),
            func.getNome(),
            func.getDt_nascimento(),
            func.getEmail()
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmail = new javax.swing.JTextField();
        txtDt_nascimento = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_cadastrar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_funcionario = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        setClosable(true);
        setForeground(new java.awt.Color(51, 51, 51));
        setTitle("Cadastro de Funcionários - asuperArt's");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/IconeAsuperArts.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(1023, 555));

        txtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        try {
            txtDt_nascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDt_nascimento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDt_nascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDt_nascimentoActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manutenção de Funcionários");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("aSuperArts - Comunicação Visual & Sinalização Arquitetônica");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(139, 139, 139))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel2.setText("ID");

        jLabel3.setText("Nome Completo");

        jLabel4.setText("Data de Nascimento");

        jLabel5.setText("E-mail");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_cadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-inserir-19.png"))); // NOI18N
        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.setToolTipText("Cadastrar");
        btn_cadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cadastrar.setMaximumSize(new java.awt.Dimension(60, 60));
        btn_cadastrar.setMinimumSize(new java.awt.Dimension(60, 60));
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        btn_editar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-editar-24.png"))); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.setToolTipText("Editar");
        btn_editar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_salvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-salvar-19.png"))); // NOI18N
        btn_salvar.setText("Salvar ");
        btn_salvar.setToolTipText("Salvar Edição");
        btn_salvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_salvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-desfazer-24.png"))); // NOI18N
        btn_cancelar.setText("Desfazer");
        btn_cancelar.setToolTipText("Cancelar");
        btn_cancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_excluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-lixo-19.png"))); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.setToolTipText("Excluir");
        btn_excluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_excluir.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tb_funcionario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tb_funcionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Dt_ Nascimento", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_funcionario.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_funcionario);
        if (tb_funcionario.getColumnModel().getColumnCount() > 0) {
            tb_funcionario.getColumnModel().getColumn(0).setResizable(false);
            tb_funcionario.getColumnModel().getColumn(1).setResizable(false);
            tb_funcionario.getColumnModel().getColumn(2).setResizable(false);
            tb_funcionario.getColumnModel().getColumn(3).setResizable(false);
        }

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDt_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDt_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 941, 555);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        FuncionarioBLL rn = new FuncionarioBLL();
        FuncionarioDTO funcionario = new FuncionarioDTO();
        if(!txtNome.getText().equals("")){
            funcionario.setNome(txtNome.getText());
            funcionario.setDt_nascimento(txtDt_nascimento.getText());
            funcionario.setEmail(txtEmail.getText());
            rn.inserir(funcionario);
            preencherTabela();
            txtNome.setText("");
            txtDt_nascimento.setText("");
            txtEmail.setText("");
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!","Aviso",JOptionPane.INFORMATION_MESSAGE );
        }else{
            JOptionPane.showMessageDialog(null, "Preencha o campo","Aviso",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        FuncionarioDTO f = new FuncionarioDTO();
        FuncionarioBLL funcionarioBLL = new FuncionarioBLL();
        if (this.tb_funcionario.getSelectedRowCount() > 0) {
            int linha = this.tb_funcionario.getSelectedRow();
            f.setId_funcionario((int) this.tb_funcionario.getValueAt(linha, 0));
            int resposta = 0;
            resposta = JOptionPane.showConfirmDialog(null, "deseja mesmo excluir?");
            if (resposta == JOptionPane.YES_OPTION) {
                funcionarioBLL.excluir(f);
                preencherTabela();
                JOptionPane.showMessageDialog(null, "Excluído!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        FuncionarioBLL rg = new FuncionarioBLL();
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();     
        if(this.tb_funcionario.getSelectedRowCount() > 0){
        int linha = this.tb_funcionario.getSelectedRow();
        funcionarioDTO.setId_funcionario((int) this.tb_funcionario.getValueAt(linha, 0));    
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(null, "deseja mesmo alterar?");
        if(resposta == JOptionPane.YES_OPTION){
                setar_campos();                
                btn_cadastrar.setEnabled(false);
                btn_editar.setEnabled(false);
                btn_excluir.setEnabled(false);
                btn_salvar.setEnabled(true);
                btn_cancelar.setEnabled(true);
                preencherTabela();
            }
        }else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        FuncionarioBLL rg = new FuncionarioBLL();
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        if(!txtNome.getText().equals("")){
                funcionarioDTO.setId_funcionario(Integer.parseInt(txtId.getText()));
                funcionarioDTO.setNome(txtNome.getText());
                funcionarioDTO.setDt_nascimento(txtDt_nascimento.getText());
                funcionarioDTO.setEmail(txtEmail.getText());
                rg.Alterar(funcionarioDTO);
                preencherTabela();
                btn_cadastrar.setEnabled(true);
                btn_editar.setEnabled(true);
                btn_excluir.setEnabled(true);
                btn_salvar.setEnabled(false);
                btn_cancelar.setEnabled(false);
                txtId.setText("");
                txtNome.setText("");
                txtDt_nascimento.setText("");
                txtEmail.setText("");
                JOptionPane.showMessageDialog(null, "Alterado");
             }else {
                 JOptionPane.showMessageDialog(null, "Campos vazios verifique e tente novamente");
            }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        btn_salvar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_cadastrar.setEnabled(true);
        btn_editar.setEnabled(true);
        btn_excluir.setEnabled(true);
        txtId.setText("");
        txtNome.setText("");
        txtDt_nascimento.setText("");
        txtEmail.setText("");
        
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtDt_nascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDt_nascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDt_nascimentoActionPerformed
public void setar_campos(){
    int setar = tb_funcionario.getSelectedRow();
    txtId.setText(tb_funcionario.getModel().getValueAt(setar, 0).toString());
    txtNome.setText(tb_funcionario.getModel().getValueAt(setar, 1).toString());
    txtDt_nascimento.setText(tb_funcionario.getModel().getValueAt(setar, 2).toString());
    txtEmail.setText(tb_funcionario.getModel().getValueAt(setar, 3).toString());
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_funcionario;
    private javax.swing.JFormattedTextField txtDt_nascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
