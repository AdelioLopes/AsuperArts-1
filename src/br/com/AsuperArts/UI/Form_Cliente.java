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
        btn_salvar.setEnabled(false);
        getContentPane().setBackground(new Color(255,255,255));
        btn_cancelar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_salvar.setBackground(new Color(51,255,0));
        btn_cadastrar.setBackground(new Color(51,102,255));
        btn_cancelar.setBackground(new Color(255,255,255));
        btn_editar.setBackground(new Color(204,204,204));
        btn_excluir.setBackground(new Color(255,51,51));
        
        
    }

    public void preencherTabela() {
        
        this.jTableCliente.getColumnModel().getColumn(0).setPreferredWidth(50);
        this.jTableCliente.getColumnModel().getColumn(0).setMaxWidth(50);
        this.jTableCliente.getColumnModel().getColumn(0).setMinWidth(50);
        
        this.jTableCliente.getColumnModel().getColumn(1).setPreferredWidth(100);
        this.jTableCliente.getColumnModel().getColumn(1).setMaxWidth(100);
        this.jTableCliente.getColumnModel().getColumn(1).setMinWidth(100);
        
        this.jTableCliente.getColumnModel().getColumn(2).setPreferredWidth(100);
        this.jTableCliente.getColumnModel().getColumn(2).setMaxWidth(100);
        this.jTableCliente.getColumnModel().getColumn(2).setMinWidth(100);
        
        this.jTableCliente.getColumnModel().getColumn(3).setPreferredWidth(50);
        this.jTableCliente.getColumnModel().getColumn(3).setMaxWidth(50);
        this.jTableCliente.getColumnModel().getColumn(3).setMinWidth(50);
        
        this.jTableCliente.getColumnModel().getColumn(4).setPreferredWidth(100);
        this.jTableCliente.getColumnModel().getColumn(4).setMaxWidth(100);
        this.jTableCliente.getColumnModel().getColumn(4).setMinWidth(100);
        
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
                cli.getTelefone(),
                cli.getEmail()
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
        txtEmail = new javax.swing.JTextField();
        btn_cadastrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        btn_cancelar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        setClosable(true);
        setTitle("Cadastro de Clientes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/IconeAsuperArts.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Cadastro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N

        txtCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCliente.setToolTipText("");
        txtCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        txtCliente.setPreferredSize(new java.awt.Dimension(16, 46));
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        txtContato.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtContato.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Contato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        txtContato.setPreferredSize(new java.awt.Dimension(16, 46));
        txtContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContatoActionPerformed(evt);
            }
        });

        txtTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Telefone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        txtTelefone.setPreferredSize(new java.awt.Dimension(16, 46));
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyTyped(evt);
            }
        });

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        txtCodigo.setEnabled(false);
        txtCodigo.setPreferredSize(new java.awt.Dimension(16, 46));

        txtCodArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCodArea.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DDD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        txtCodArea.setPreferredSize(new java.awt.Dimension(16, 46));
        txtCodArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodAreaActionPerformed(evt);
            }
        });
        txtCodArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodAreaKeyTyped(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "E-mail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        btn_cadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(255, 255, 255))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCodArea, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75))
                            .addComponent(txtCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEmail))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodArea, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Informações", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N

        jTableCliente.setAutoCreateRowSorter(true);
        jTableCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CLIENTE", "CONTATO", "DDD", "TELEFONE", "EMAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            jTableCliente.getColumnModel().getColumn(5).setResizable(false);
        }

        btn_cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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

        btn_salvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/Salvar.png"))); // NOI18N
        btn_salvar.setText("SALVAR");
        btn_salvar.setToolTipText("Salvar Alteração");
        btn_salvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_salvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salvar.setMaximumSize(new java.awt.Dimension(60, 60));
        btn_salvar.setMinimumSize(new java.awt.Dimension(60, 60));
        btn_salvar.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_excluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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

        btn_editar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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
        txtPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPesquisa)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1023, 555);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        if (!txtCliente.getText().equals("") && !txtContato.getText().equals("") && !txtCodArea.getText().equals("") && !txtTelefone.getText().equals("")
                && !txtEmail.getText().equals("")){
            ClienteBLL rg = new ClienteBLL();
            ClienteDTO clientesDTO = new ClienteDTO();
            
            clientesDTO.setNome(txtCliente.getText());
            clientesDTO.setContato(txtContato.getText());
            clientesDTO.setDdd(Integer.parseInt(txtCodArea.getText()));
            clientesDTO.setTelefone(Integer.parseInt(txtTelefone.getText()));
            clientesDTO.setEmail(txtEmail.getText());
            rg.cadastrarCliente(clientesDTO);
            preencherTabela();
            txtCliente.setText("");
            txtContato.setText("");
            txtCodArea.setText("");
            txtTelefone.setText("");
            txtEmail.setText("");
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
                btn_salvar.setEnabled(true);
                btn_cancelar.setEnabled(true);
                preencherTabela();
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");

        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        if(!txtCliente.getText().equals("") && !txtContato.getText().equals("") && !txtCodArea.getText().equals("") && !txtTelefone.getText().equals("")){
                    ClienteBLL clienteBLL = new ClienteBLL();
                    ClienteDTO clienteDTO = new ClienteDTO();        
                    clienteDTO.setId_cliente(Integer.parseInt(txtCodigo.getText()));
                    clienteDTO.setNome(txtCliente.getText());
                    clienteDTO.setContato(txtContato.getText());
                    clienteDTO.setDdd(Integer.parseInt(txtCodArea.getText()));
                    clienteDTO.setTelefone(Integer.parseInt(txtTelefone.getText()));
                    clienteDTO.setEmail(txtEmail.getText());
                    
                        JOptionPane.showMessageDialog(null, "Alterado");
                        clienteBLL.alterar(clienteDTO);
                        preencherTabela();
                        btn_cadastrar.setEnabled(true);
                        btn_editar.setEnabled(true);
                        btn_excluir.setEnabled(true);
                        btn_salvar.setEnabled(false);
                        btn_cancelar.setEnabled(false);
                        txtCodigo.setText("");
                        txtCliente.setText("");
                        txtContato.setText("");
                        txtCodArea.setText("");
                        txtTelefone.setText("");
                        txtEmail.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "Campos obrigatórios!");
                }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        btn_salvar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_cadastrar.setEnabled(true);
        btn_editar.setEnabled(true);
        btn_excluir.setEnabled(true);
        txtCodigo.setText("");
        txtCliente.setText("");
        txtContato.setText("");
        txtCodArea.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
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

    private void txtCodAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodAreaKeyTyped
        String caracteres ="0123456789";
        if(!caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
        }
    }//GEN-LAST:event_txtCodAreaKeyTyped

    private void txtTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyTyped
        String caracteres ="0123456789";
        if(!caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
        }
    }//GEN-LAST:event_txtTelefoneKeyTyped
    public void setandoCampos(){
        
        int linha = jTableCliente.getSelectedRow();
        txtCodigo.setText(jTableCliente.getModel().getValueAt(linha, 0).toString());
        txtCliente.setText(jTableCliente.getModel().getValueAt(linha, 1).toString());
        txtContato.setText(jTableCliente.getModel().getValueAt(linha, 2).toString());
        txtCodArea.setText(jTableCliente.getModel().getValueAt(linha, 3).toString());
        txtTelefone.setText(jTableCliente.getModel().getValueAt(linha, 4).toString());
        txtEmail.setText(jTableCliente.getModel().getValueAt(linha, 5).toString());
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
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodArea;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtContato;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
