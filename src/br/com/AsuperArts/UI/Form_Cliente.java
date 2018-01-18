package br.com.AsuperArts.UI;

import br.com.AsuperArts.BLL.ClienteBLL;
import br.com.AsuperArts.DAL.Conexao;
import br.com.AsuperArts.DTO.ClienteDTO;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 * @author Equipe senac 2017
 */
public class Form_Cliente extends javax.swing.JInternalFrame {

    public Form_Cliente() {
        initComponents();
        preencherTabela();
        btn_alterar.setEnabled(false);
        getContentPane().setBackground(new Color(240,240,240));
        btn_cancelar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        /*btn_alterar.setBackground(new Color(255,255,255));
        btn_cadastrar.setBackground(new Color(51,102,255));
        btn_cancelar.setBackground(new Color(255,255,255));
        btn_editar.setBackground(new Color(255,255,51));
        btn_excluir.setBackground(new Color(255,51,51));*/
        
    }

    public void preencherTabela() {
         getContentPane().setBackground(new Color(255,255,255));
        this.jTableCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel modelo = (DefaultTableModel) jTableCliente.getModel();
        modelo.setNumRows(0);
        ClienteBLL rg = new ClienteBLL();
        for (ClienteDTO cli : rg.listaCliente()) {
            modelo.addRow(new Object[]{
                cli.getId_cliente(),
                cli.getNome(),
                cli.getContato(),
                cli.getDdd(),
                cli.getTelefone()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCliente = new javax.swing.JTextField();
        txtContato = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtCodArea = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        btn_cancelar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_cadastrar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Clientes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/IconeAsuperArts.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(247, 244, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Cadastro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N

        txtCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCliente.setToolTipText("");
        txtCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N
        txtCliente.setPreferredSize(new java.awt.Dimension(16, 46));
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        txtContato.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtContato.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Contato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N
        txtContato.setPreferredSize(new java.awt.Dimension(16, 46));
        txtContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContatoActionPerformed(evt);
            }
        });

        txtTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Telefone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N
        txtTelefone.setPreferredSize(new java.awt.Dimension(16, 46));

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Cód", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N
        txtCodigo.setEnabled(false);
        txtCodigo.setPreferredSize(new java.awt.Dimension(16, 46));

        txtCodArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCodArea.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "DDD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N
        txtCodArea.setPreferredSize(new java.awt.Dimension(16, 46));
        txtCodArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodAreaActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodArea, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodArea, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Informações", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N

        jTableCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CLIENTE", "CONTATO", "DDD", "TELEFONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCliente.getTableHeader().setReorderingAllowed(false);
        jTableCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableClienteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCliente);
        if (jTableCliente.getColumnModel().getColumnCount() > 0) {
            jTableCliente.getColumnModel().getColumn(0).setResizable(false);
            jTableCliente.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTableCliente.getColumnModel().getColumn(1).setResizable(false);
            jTableCliente.getColumnModel().getColumn(2).setResizable(false);
            jTableCliente.getColumnModel().getColumn(3).setResizable(false);
            jTableCliente.getColumnModel().getColumn(4).setResizable(false);
        }

        btn_cancelar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/Desfazer.png"))); // NOI18N
        btn_cancelar.setText("Desfazer");
        btn_cancelar.setToolTipText("Cancelar");
        btn_cancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_alterar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/Salvar.png"))); // NOI18N
        btn_alterar.setText("SALVAR");
        btn_alterar.setToolTipText("Salvar Alteração");
        btn_alterar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_alterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_alterar.setMaximumSize(new java.awt.Dimension(60, 60));
        btn_alterar.setMinimumSize(new java.awt.Dimension(60, 60));
        btn_alterar.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_cadastrar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/Cadastro_user.png"))); // NOI18N
        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.setToolTipText("Cadastrar");
        btn_cadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cadastrar.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        btn_excluir.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/Excluir.png"))); // NOI18N
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

        btn_editar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/editar.png"))); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.setToolTipText("Editar");
        btn_editar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar.setMaximumSize(new java.awt.Dimension(60, 60));
        btn_editar.setMinimumSize(new java.awt.Dimension(60, 60));
        btn_editar.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        txtPesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.white, java.awt.Color.white), "Buscar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPesquisa)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 1050, 655);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        if (!txtCliente.getText().equals("") && !txtContato.getText().equals("") && !txtTelefone.getText().equals("")) {
            ClienteBLL rg = new ClienteBLL();
            ClienteDTO clienteDTO = new ClienteDTO();
            clienteDTO.setNome(txtCliente.getText());
            clienteDTO.setContato(txtContato.getText());
            clienteDTO.setDdd(Integer.parseInt(txtCodArea.getText()));
            clienteDTO.setTelefone(Integer.parseInt(txtTelefone.getText()));
            rg.cadastrarCliente(clienteDTO);
            preencherTabela();
            txtCliente.setText("");
            txtContato.setText("");
            txtCodArea.setText("");
            txtTelefone.setText("");
            JOptionPane.showMessageDialog(null, "Cliente cadastrado");

        } else {
            JOptionPane.showMessageDialog(null, "Campos vazios verifique e tente novamente");
        }


    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void jTableClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableClienteKeyReleased
        //evento na jtable para buscar por nome
        buscarCliente();
    }//GEN-LAST:event_jTableClienteKeyReleased

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        ClienteDTO c = new ClienteDTO();
        ClienteBLL clienteBLL = new ClienteBLL();
        if (this.jTableCliente.getSelectedRowCount() > 0) {
            int linha = this.jTableCliente.getSelectedRow();
            c.setId_cliente((int) this.jTableCliente.getValueAt(linha, 0));
            int resposta = 0;
            resposta = JOptionPane.showConfirmDialog(null, "deseja mesmo excluir?");
            if (resposta == JOptionPane.YES_OPTION) {
                clienteBLL.ExcluirCliente(c);
                preencherTabela();
                JOptionPane.showMessageDialog(null, "Excluído!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }

    }//GEN-LAST:event_btn_excluirActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        buscarCliente();
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        ClienteBLL clienteBLL = new ClienteBLL();
        ClienteDTO clienteDTO = new ClienteDTO();
        if (this.jTableCliente.getSelectedRowCount() > 0) {
            int linha = jTableCliente.getSelectedRow();
            clienteDTO.setId_cliente((int) this.jTableCliente.getValueAt(linha, 0));
            int resposta = 0;
            resposta = JOptionPane.showConfirmDialog(null, "deseja mesmo alterar?");
            if (resposta == JOptionPane.YES_OPTION) {
                setandoCampos();
                btn_cadastrar.setEnabled(false);
                btn_editar.setEnabled(false);
                btn_excluir.setEnabled(false);
                btn_alterar.setEnabled(true);
                btn_cancelar.setEnabled(true);
                preencherTabela();
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");

        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        if(!txtCliente.getText().equals("") && !txtContato.getText().equals("") && !txtCodArea.getText().equals("") && !txtTelefone.getText().equals("")){
                    ClienteBLL clienteBLL = new ClienteBLL();
                    ClienteDTO clienteDTO = new ClienteDTO();        
                    clienteDTO.setId_cliente(Integer.parseInt(txtCodigo.getText()));
                    clienteDTO.setNome(txtCliente.getText());
                    clienteDTO.setContato(txtContato.getText());
                    clienteDTO.setDdd(Integer.parseInt(txtCodArea.getText()));
                    clienteDTO.setTelefone(Integer.parseInt(txtTelefone.getText()));
                    
                        JOptionPane.showMessageDialog(null, "Alterado");
                        clienteBLL.alterar(clienteDTO);
                        preencherTabela();
                        btn_cadastrar.setEnabled(true);
                        btn_editar.setEnabled(true);
                        btn_excluir.setEnabled(true);
                        btn_alterar.setEnabled(false);
                        btn_cancelar.setEnabled(false);
                        txtCodigo.setText("");
                        txtCliente.setText("");
                        txtContato.setText("");
                        txtCodArea.setText("");
                        txtTelefone.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "Campos obrigatórios!");
                }
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        btn_alterar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_cadastrar.setEnabled(true);
        btn_editar.setEnabled(true);
        btn_excluir.setEnabled(true);
        txtCodigo.setText("");
        txtCliente.setText("");
        txtContato.setText("");
        txtCodArea.setText("");
        txtTelefone.setText("");
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txtContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContatoActionPerformed

    private void txtCodAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodAreaActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed
    public void setandoCampos(){
        
        int linha = jTableCliente.getSelectedRow();
        txtCodigo.setText(jTableCliente.getModel().getValueAt(linha, 0).toString());
        txtCliente.setText(jTableCliente.getModel().getValueAt(linha, 1).toString());
        txtContato.setText(jTableCliente.getModel().getValueAt(linha, 2).toString());
        txtCodArea.setText(jTableCliente.getModel().getValueAt(linha, 3).toString());
        txtTelefone.setText(jTableCliente.getModel().getValueAt(linha, 4).toString());
    }
    
    public void buscarCliente() {
        String sql;
        ResultSet rs;
        Connection con = new Conexao().abrirConexao();
        sql = "SELECT * FROM tb_cliente WHERE nome LIKE ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, txtPesquisa.getText() + "%");
            rs = ps.executeQuery();
            // a linha baiaxo usa a biblioteca rs2xml.jar para preencher a tabela
            jTableCliente.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(ClienteBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodArea;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtContato;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
