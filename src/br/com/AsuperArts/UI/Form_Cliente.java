package br.com.AsuperArts.UI;

import br.com.AsuperArts.BLL.ClienteBLL;
import br.com.AsuperArts.DAL.Conexao;
import br.com.AsuperArts.DTO.ClienteDTO;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
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
        btn_cancelar.setEnabled(false);
        
        btn_cadastrar.setBackground(new Color(255,255,255));
        btn_cancelar.setBackground(new Color(255,255,255));
        btn_excluir.setBackground(new Color(255,255,255));
        btn_salvar.setBackground(new Color(255,255,255));
        btn_editar.setBackground(new Color(255,255,255));
        
        btn_cadastrar.setBorder(new RoundedBorder(20));
        btn_editar.setBorder(new RoundedBorder(20));
        btn_excluir.setBorder(new RoundedBorder(20));
        btn_cancelar.setBorder(new RoundedBorder(20));
        btn_salvar.setBorder(new RoundedBorder(20));
        
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
            
    public void preencherTabela() {
        
        this.tb_cliente.getColumnModel().getColumn(0).setPreferredWidth(100);
        this.tb_cliente.getColumnModel().getColumn(0).setMaxWidth(100);
        this.tb_cliente.getColumnModel().getColumn(0).setMinWidth(100);
        
        this.tb_cliente.getColumnModel().getColumn(1).setPreferredWidth(200);
        this.tb_cliente.getColumnModel().getColumn(1).setMaxWidth(200);
        this.tb_cliente.getColumnModel().getColumn(1).setMinWidth(200);
        
        this.tb_cliente.getColumnModel().getColumn(2).setPreferredWidth(150);
        this.tb_cliente.getColumnModel().getColumn(2).setMaxWidth(150);
        this.tb_cliente.getColumnModel().getColumn(2).setMinWidth(150);
        
        this.tb_cliente.getColumnModel().getColumn(3).setPreferredWidth(100);
        this.tb_cliente.getColumnModel().getColumn(3).setMaxWidth(100);
        this.tb_cliente.getColumnModel().getColumn(3).setMinWidth(100);
        
        this.tb_cliente.getColumnModel().getColumn(4).setPreferredWidth(200);
        this.tb_cliente.getColumnModel().getColumn(4).setMaxWidth(200);
        this.tb_cliente.getColumnModel().getColumn(4).setMinWidth(200);
        
       
        //getContentPane().setBackground(new Color(255,255,255));
        this.tb_cliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel modelo = (DefaultTableModel) tb_cliente.getModel();
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

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtContato = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCodArea = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btn_cadastrar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_cliente = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        setClosable(true);
        setTitle("Cadastro de Clientes - asuperArt's");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/IconeAsuperArts.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manutenção de Clientes ");

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
                .addGap(234, 234, 234))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("ID");

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCodigo.setEnabled(false);
        txtCodigo.setPreferredSize(new java.awt.Dimension(16, 46));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Nome");

        txtCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCliente.setToolTipText("");
        txtCliente.setPreferredSize(new java.awt.Dimension(16, 46));
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Contato");

        txtContato.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtContato.setPreferredSize(new java.awt.Dimension(16, 46));
        txtContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContatoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("DDD");

        txtCodArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCodArea.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
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

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Telefone");

        txtTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTelefone.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTelefone.setPreferredSize(new java.awt.Dimension(16, 46));
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("E-mail");

        txtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_cadastrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-inserir-19.png"))); // NOI18N
        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.setToolTipText("Cadastrar");
        btn_cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cadastrar.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        btn_editar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-editar-19.png"))); // NOI18N
        btn_editar.setText("Editar");
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

        btn_salvar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-salvar-19.png"))); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.setToolTipText("Salvar Alteração");
        btn_salvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salvar.setMaximumSize(new java.awt.Dimension(60, 60));
        btn_salvar.setMinimumSize(new java.awt.Dimension(60, 60));
        btn_salvar.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-desfazer-19.png"))); // NOI18N
        btn_cancelar.setText("Desfazer");
        btn_cancelar.setToolTipText("Cancelar");
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_excluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-lixo-19.png"))); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.setToolTipText("Excluir");
        btn_excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_excluir.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        txtPesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Buscar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );

        tb_cliente.setAutoCreateRowSorter(true);
        tb_cliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tb_cliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tb_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_cliente", "cliente", "contato", "ddd", "telefone", "email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tb_clienteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tb_cliente);
        if (tb_cliente.getColumnModel().getColumnCount() > 0) {
            tb_cliente.getColumnModel().getColumn(0).setResizable(false);
            tb_cliente.getColumnModel().getColumn(1).setResizable(false);
            tb_cliente.getColumnModel().getColumn(2).setResizable(false);
            tb_cliente.getColumnModel().getColumn(3).setResizable(false);
            tb_cliente.getColumnModel().getColumn(4).setResizable(false);
            tb_cliente.getColumnModel().getColumn(5).setResizable(false);
        }

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmail))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))
                .addGap(68, 68, 68)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodArea, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtCodArea, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setBounds(0, 0, 1227, 582);
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
            txtCliente.requestFocus();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado");

        } else {
            JOptionPane.showMessageDialog(null, "Campos vazios verifique e tente novamente");
        }


    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void tb_clienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_clienteKeyReleased
        //evento na jtable para buscar por nome
        buscarCliente();
        
        
    }//GEN-LAST:event_tb_clienteKeyReleased

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        ClienteDTO c = new ClienteDTO();
        ClienteBLL clienteBLL = new ClienteBLL();
        if (this.tb_cliente.getSelectedRowCount() > 0) {
            int linha = this.tb_cliente.getSelectedRow();
            c.setId_cliente((int) this.tb_cliente.getValueAt(linha, 0));
            int resposta = 0;
            resposta = JOptionPane.showConfirmDialog(null, "deseja mesmo excluir?");
            if (resposta == JOptionPane.YES_OPTION) {
                clienteBLL.ExcluirCliente(c);
                preencherTabela();
                JOptionPane.showMessageDialog(null, "Excluído!");
                txtCliente.requestFocus();
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
        if (this.tb_cliente.getSelectedRowCount() > 0) {
            int linha = tb_cliente.getSelectedRow();
            clienteDTO.setId_cliente((int) this.tb_cliente.getValueAt(linha, 0));
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
                        txtCliente.requestFocus();
                }else{
                    JOptionPane.showMessageDialog(null, "Campos obrigatórios!");
                }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        
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
        txtCliente.requestFocus();
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
        
        int linha = tb_cliente.getSelectedRow();
        txtCodigo.setText(tb_cliente.getModel().getValueAt(linha, 0).toString());
        txtCliente.setText(tb_cliente.getModel().getValueAt(linha, 1).toString());
        txtContato.setText(tb_cliente.getModel().getValueAt(linha, 2).toString());
        txtCodArea.setText(tb_cliente.getModel().getValueAt(linha, 3).toString());
        txtTelefone.setText(tb_cliente.getModel().getValueAt(linha, 4).toString());
        txtEmail.setText(tb_cliente.getModel().getValueAt(linha, 5).toString());
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
            tb_cliente.setModel(DbUtils.resultSetToTableModel(rs));
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_cliente;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodArea;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtContato;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
