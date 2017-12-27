package br.com.AsuperArts.UI;

import br.com.AsuperArts.BLL.ProdutoBLL;
import br.com.AsuperArts.DAL.Conexao;
import br.com.AsuperArts.DTO.CampoDecimal;
import br.com.AsuperArts.DTO.ProdutoDTO;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 * @author Equipe senac 2017
 */
public class Form_Produto extends javax.swing.JInternalFrame {
    public Form_Produto() {
        initComponents();
        btn_alterar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_alterar.setBackground(new Color(255,255,255));
        btn_cadastrar.setBackground(new Color(255,255,255));
        btn_cancelar.setBackground(new Color(255,255,255));
        btn_editar.setBackground(new Color(255,255,255));
        btn_excluir.setBackground(new Color(255,255,255));
        preencherTabela();
        
        //txt_vl_unitario = new CampoDecimal(CampoDecimal.REAL);
    }
    
     public void preencherTabela() {
        this.jTableProduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel modelo = (DefaultTableModel) jTableProduto.getModel();
        modelo.setNumRows(0);
        ProdutoBLL rg = new ProdutoBLL();
        this.jTableProduto.setModel(modelo);
        this.jTableProduto.getColumnModel().getColumn(0).setPreferredWidth(50);
        this.jTableProduto.getColumnModel().getColumn(0).setMaxWidth(50);
        this.jTableProduto.getColumnModel().getColumn(0).setMinWidth(50);
        
        this.jTableProduto.setModel(modelo);
        this.jTableProduto.getColumnModel().getColumn(1).setPreferredWidth(200);
        this.jTableProduto.getColumnModel().getColumn(1).setMaxWidth(200);
        this.jTableProduto.getColumnModel().getColumn(1).setMinWidth(200);
        
        this.jTableProduto.setModel(modelo);
        this.jTableProduto.getColumnModel().getColumn(2).setPreferredWidth(55);
        this.jTableProduto.getColumnModel().getColumn(2).setMaxWidth(55);
        this.jTableProduto.getColumnModel().getColumn(2).setMinWidth(55);
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        this.jTableProduto.getColumnModel().getColumn(3).setCellRenderer(direita);
        
        for (ProdutoDTO pro : rg.listaProduto()) {
            modelo.addRow(new Object[]{
                pro.getId_produto(),
                pro.getNome(),
                pro.getQuantidade(),
                pro.getPreco_compra(),
                pro.getLargura()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProduto = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txt_nome_produto = new javax.swing.JTextField();
        txt_qnt = new javax.swing.JTextField();
        txt_vl_unitario = new javax.swing.JTextField();
        btn_cadastrar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        btn_cancelar = new javax.swing.JButton();
        txt_unidadeMedida = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        btn_excluir = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_editar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Produtos");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/IconeAsuperArts.png"))); // NOI18N

        jTableProduto.setBorder(new javax.swing.border.MatteBorder(null));
        jTableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUTO", "QNT", "VALOR UNITÁRIO", "LARGURA", "COMPRIMENTO", "ESPESSURA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProduto.getTableHeader().setReorderingAllowed(false);
        jTableProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableProdutoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProduto);
        if (jTableProduto.getColumnModel().getColumnCount() > 0) {
            jTableProduto.getColumnModel().getColumn(0).setResizable(false);
            jTableProduto.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTableProduto.getColumnModel().getColumn(2).setResizable(false);
            jTableProduto.getColumnModel().getColumn(3).setResizable(false);
            jTableProduto.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_nome_produto.setBackground(new java.awt.Color(244, 244, 255));
        txt_nome_produto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_nome_produto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome do Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        txt_nome_produto.setPreferredSize(new java.awt.Dimension(16, 46));

        txt_qnt.setBackground(new java.awt.Color(244, 244, 255));
        txt_qnt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_qnt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quantidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        txt_qnt.setPreferredSize(new java.awt.Dimension(16, 46));

        txt_vl_unitario.setBackground(new java.awt.Color(244, 244, 255));
        txt_vl_unitario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_vl_unitario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_vl_unitario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preço Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        txt_vl_unitario.setPreferredSize(new java.awt.Dimension(16, 46));
        txt_vl_unitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vl_unitarioActionPerformed(evt);
            }
        });

        btn_cadastrar.setBackground(new java.awt.Color(204, 204, 204));
        btn_cadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/Cadastrar_1.png"))); // NOI18N
        btn_cadastrar.setToolTipText("Cadastrar");
        btn_cadastrar.setBorder(null);
        btn_cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        btn_alterar.setBackground(new java.awt.Color(204, 204, 204));
        btn_alterar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/Salvar.png"))); // NOI18N
        btn_alterar.setToolTipText("Salvar Edição");
        btn_alterar.setBorder(null);
        btn_alterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_id.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        txt_id.setMinimumSize(new java.awt.Dimension(16, 46));
        txt_id.setPreferredSize(new java.awt.Dimension(16, 46));

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/Desfazer.png"))); // NOI18N
        btn_cancelar.setToolTipText("Cancelar");
        btn_cancelar.setBorder(null);
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        txt_unidadeMedida.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Largura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder("Comprimento"));

        jComboBox2.setBorder(javax.swing.BorderFactory.createTitledBorder("Espessura"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_nome_produto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_qnt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_vl_unitario, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_unidadeMedida, 0, 108, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_qnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_vl_unitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_unidadeMedida)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btn_excluir.setBackground(new java.awt.Color(204, 204, 204));
        btn_excluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/Excluir.png"))); // NOI18N
        btn_excluir.setToolTipText("Excluir");
        btn_excluir.setBorder(null);
        btn_excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        txt_buscar.setBackground(new java.awt.Color(244, 244, 255));
        txt_buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/icons8-pesquisar-40.png"))); // NOI18N

        btn_editar.setBackground(new java.awt.Color(204, 204, 204));
        btn_editar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/Editar_1.png"))); // NOI18N
        btn_editar.setToolTipText("Editar");
        btn_editar.setBorder(null);
        btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );

        setBounds(0, 0, 1050, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        // TODO add your handling code here:
        ProdutoDTO p = new ProdutoDTO();
        ProdutoBLL produtoBLL = new ProdutoBLL();
        if (this.jTableProduto.getSelectedRowCount() > 0) {
            int linha = this.jTableProduto.getSelectedRow();
            p.setId_produto((int) this.jTableProduto.getValueAt(linha, 0));
            int resposta = 0;
            resposta = JOptionPane.showConfirmDialog(null, "deseja mesmo excluir?");
            if (resposta == JOptionPane.YES_OPTION) {
                produtoBLL.ExcluirProduto(p);
                preencherTabela();
                JOptionPane.showMessageDialog(null, "Excluído!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }       
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        // TODO add your handling code here:
        buscarProduto();
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void jTableProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableProdutoKeyReleased
        // TODO add your handling code here:
        buscarProduto();
    }//GEN-LAST:event_jTableProdutoKeyReleased

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
      
        if (!txt_nome_produto.getText().equals("") && !txt_qnt.getText().equals("") && !txt_vl_unitario.getText().equals("") && !txt_unidadeMedida.getSelectedItem().equals("") ) {
            ProdutoBLL rg = new ProdutoBLL();
            ProdutoDTO produtoDTO = new ProdutoDTO();
            produtoDTO.setNome(txt_nome_produto.getText());
            produtoDTO.setQuantidade(Integer.parseInt(txt_qnt.getText()));
            produtoDTO.setPreco_compra(Double.valueOf(txt_vl_unitario.getText().replace(".", "").replace(",", ".").replace(" ","")));
            produtoDTO.setLargura(Integer.valueOf(txt_unidadeMedida.getSelectedItem().toString()));
            JOptionPane.showMessageDialog(null, txt_unidadeMedida.getSelectedItem());
            rg.cadastrarProduto(produtoDTO);
            preencherTabela();
            txt_nome_produto.setText("");
            txt_qnt.setText("");
            txt_vl_unitario.setText("");
            JOptionPane.showMessageDialog(null, "Produto cadastrado");

        } else {
            JOptionPane.showMessageDialog(null, "Campos vazios verifique e tente novamente");
        }
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        ProdutoBLL rg = new ProdutoBLL();
        ProdutoDTO produtoDTO = new ProdutoDTO();
        
        if(this.jTableProduto.getSelectedRowCount() > 0){
        int linha = this.jTableProduto.getSelectedRow();
        produtoDTO.setId_produto((int) this.jTableProduto.getValueAt(linha, 0));    
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
        ProdutoBLL rg = new ProdutoBLL();
       ProdutoDTO produtoDTO = new ProdutoDTO();
        if(!txt_nome_produto.getText().equals("") && !txt_qnt.getText().equals("")&& !txt_vl_unitario.getText().equals("") && !txt_unidadeMedida.getSelectedItem().equals("")){
                produtoDTO.setId_produto(Integer.parseInt(txt_id.getText()));
                produtoDTO.setNome(txt_nome_produto.getText());
                produtoDTO.setQuantidade(Integer.parseInt(txt_qnt.getText()));
                produtoDTO.setPreco_compra(Double.valueOf(txt_vl_unitario.getText().replace(".", "").replace(",", ".").replace(" ","")));
                produtoDTO.setLargura(Integer.valueOf(txt_unidadeMedida.getSelectedItem().toString()));
                rg.Alterar(produtoDTO);
                preencherTabela();
                btn_cadastrar.setEnabled(true);
                btn_editar.setEnabled(true);
                btn_excluir.setEnabled(true);
                btn_alterar.setEnabled(false);
                btn_cancelar.setEnabled(false);
                txt_id.setText("");
                txt_nome_produto.setText("");
                txt_qnt.setText("");
                txt_vl_unitario.setText("");
                JOptionPane.showMessageDialog(null, "Alterado");
             }else {
                 JOptionPane.showMessageDialog(null, "Campos vazios verifique e tente novamente");
            }
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void txt_vl_unitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_vl_unitarioActionPerformed
        // TODO add your handling code here:
        CampoDecimal tx = new CampoDecimal(CampoDecimal.REAL);
        txt_vl_unitario.setText(tx.REAL);
        
    }//GEN-LAST:event_txt_vl_unitarioActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        btn_alterar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_cadastrar.setEnabled(true);
        btn_editar.setEnabled(true);
        btn_excluir.setEnabled(true);
        txt_id.setText("");
        txt_nome_produto.setText("");
        txt_qnt.setText("");
        txt_vl_unitario.setText("");
        txt_unidadeMedida.setSelectedItem("");
    }//GEN-LAST:event_btn_cancelarActionPerformed
public void setar_campos(){
    int setar = jTableProduto.getSelectedRow();
    txt_id.setText(jTableProduto.getModel().getValueAt(setar, 0).toString());
    txt_nome_produto.setText(jTableProduto.getModel().getValueAt(setar, 1).toString());
    txt_qnt.setText(jTableProduto.getModel().getValueAt(setar, 2).toString());
    txt_vl_unitario.setText(jTableProduto.getModel().getValueAt(setar, 3).toString());
    txt_unidadeMedida.setSelectedItem(jTableProduto.getModel().getValueAt(setar, 4).toString());
}
    
    public void buscarProduto(){
        String sql;
        ResultSet rs;
        Connection con = new Conexao().abrirConexao();
        sql = "SELECT * FROM tb_produto WHERE nome_produto LIKE ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + txt_buscar.getText() + "%");
            rs = ps.executeQuery();
            // a linha baiaxo usa a biblioteca rs2xml.jar para preencher a tabela
            DefaultTableModel dftm = new DefaultTableModel();
            Vector t = new Vector();
            t.add("ID");   
            t.add("PRODUTO");   
            t.add("QNT");
            t.add("VALOR UNITÁRIO");
            t.add("UNIDADE DE MEDIDA");
            dftm.setColumnIdentifiers(t);
            while (rs.next()){
                dftm.addRow(new String[] {
                    Integer.toString(rs.getInt("id_produto")),
                    rs.getString("nome_produto"),
                    Long.toString(rs.getLong("quantidade")),
                    Double.toString(rs.getDouble("valor_unitario")),
                    rs.getString("uni_medida")
                });
            }
            jTableProduto.setModel(dftm);
            jTableProduto.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableProduto.getColumnModel().getColumn(0).setMaxWidth(50);
            jTableProduto.getColumnModel().getColumn(0).setMinWidth(50);

            jTableProduto.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTableProduto.getColumnModel().getColumn(1).setMaxWidth(200);
            jTableProduto.getColumnModel().getColumn(1).setMinWidth(200);

            jTableProduto.getColumnModel().getColumn(2).setPreferredWidth(55);
            jTableProduto.getColumnModel().getColumn(2).setMaxWidth(55);
            jTableProduto.getColumnModel().getColumn(2).setMinWidth(55);
            DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
            direita.setHorizontalAlignment(SwingConstants.RIGHT);
            jTableProduto.getColumnModel().getColumn(3).setCellRenderer(direita);
       
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
}        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProduto;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nome_produto;
    private javax.swing.JTextField txt_qnt;
    private javax.swing.JComboBox<String> txt_unidadeMedida;
    private javax.swing.JTextField txt_vl_unitario;
    // End of variables declaration//GEN-END:variables

}

        
