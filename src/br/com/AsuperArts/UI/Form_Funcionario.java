
package br.com.AsuperArts.UI;
import br.com.AsuperArts.BLL.FuncionarioBLL;
import br.com.AsuperArts.DTO.FuncionarioDTO;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Equipe Senac 2017
 */
public class Form_Funcionario extends javax.swing.JInternalFrame {

    public Form_Funcionario() {
        initComponents();
        preencherTabela();
        btn_alterar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_alterar.setBackground(new Color(255,255,255));
        btn_cadastrar.setBackground(new Color(255,255,255));
        btn_cancelar.setBackground(new Color(255,255,255));
        btn_editar.setBackground(new Color(255,255,255));
        btn_excluir.setBackground(new Color(255,255,255));
    }
    public void preencherTabela(){
    this.tb_funcionario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    DefaultTableModel modelo = (DefaultTableModel) tb_funcionario.getModel();
    modelo.setNumRows(0);
    FuncionarioBLL rn = new FuncionarioBLL();
    
        this.tb_funcionario.getColumnModel().getColumn(0).setPreferredWidth(50);
        this.tb_funcionario.getColumnModel().getColumn(0).setMaxWidth(50);
        this.tb_funcionario.getColumnModel().getColumn(0).setMinWidth(50);
    
        for(FuncionarioDTO func: rn.listar()){
            modelo.addRow(new Object[]{
            func.getId_funcionario(),
            func.getNome()
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_funcionario = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        btn_cadastrar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        btn_cancelar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setForeground(new java.awt.Color(51, 51, 51));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("A super Art's");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/IconeAsuperArts.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 500));

        tb_funcionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtNome.setBackground(new java.awt.Color(244, 244, 255));
        txtNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome Completo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        btn_cadastrar.setBackground(new java.awt.Color(204, 204, 204));
        btn_cadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/Cadastrar_1.png"))); // NOI18N
        btn_cadastrar.setToolTipText("Cadastrar");
        btn_cadastrar.setBorder(null);
        btn_cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cadastrar.setMaximumSize(new java.awt.Dimension(60, 60));
        btn_cadastrar.setMinimumSize(new java.awt.Dimension(60, 60));
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        btn_alterar.setBackground(new java.awt.Color(204, 204, 204));
        btn_alterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/Salvar.png"))); // NOI18N
        btn_alterar.setToolTipText("Salvar Edição");
        btn_alterar.setBorder(null);
        btn_alterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtId.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/Desfazer.png"))); // NOI18N
        btn_cancelar.setToolTipText("Cancelar");
        btn_cancelar.setBorder(null);
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_excluir.setBackground(new java.awt.Color(204, 204, 204));
        btn_excluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/Excluir.png"))); // NOI18N
        btn_excluir.setToolTipText("Excluir");
        btn_excluir.setBorder(null);
        btn_excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_excluir.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_editar.setBackground(new java.awt.Color(204, 204, 204));
        btn_editar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/Editar_1.png"))); // NOI18N
        btn_editar.setToolTipText("Editar");
        btn_editar.setBorder(null);
        btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(btn_excluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(366, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1050, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        FuncionarioBLL rn = new FuncionarioBLL();
        FuncionarioDTO funcionario = new FuncionarioDTO();
        if(!txtNome.getText().equals("")){
            funcionario.setNome(txtNome.getText());
            rn.inserir(funcionario);
            preencherTabela();
            txtNome.setText("");
            
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
                btn_alterar.setEnabled(true);
                btn_cancelar.setEnabled(true);
                preencherTabela();
            }
        }else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        FuncionarioBLL rg = new FuncionarioBLL();
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        if(!txtNome.getText().equals("")){
                funcionarioDTO.setId_funcionario(Integer.parseInt(txtId.getText()));
                funcionarioDTO.setNome(txtNome.getText());
                rg.Alterar(funcionarioDTO);
                preencherTabela();
                btn_cadastrar.setEnabled(true);
                btn_editar.setEnabled(true);
                btn_excluir.setEnabled(true);
                btn_alterar.setEnabled(false);
                btn_cancelar.setEnabled(false);
                txtId.setText("");
                txtNome.setText("");
                JOptionPane.showMessageDialog(null, "Alterado");
             }else {
                 JOptionPane.showMessageDialog(null, "Campos vazios verifique e tente novamente");
            }
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        btn_alterar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_cadastrar.setEnabled(true);
        btn_editar.setEnabled(true);
        btn_excluir.setEnabled(true);
        txtId.setText("");
        txtNome.setText("");
        
    }//GEN-LAST:event_btn_cancelarActionPerformed
public void setar_campos(){
    int setar = tb_funcionario.getSelectedRow();
    txtId.setText(tb_funcionario.getModel().getValueAt(setar, 0).toString());
    txtNome.setText(tb_funcionario.getModel().getValueAt(setar, 1).toString());
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_funcionario;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}