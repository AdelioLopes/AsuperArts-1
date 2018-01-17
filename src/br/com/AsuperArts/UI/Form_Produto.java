package br.com.AsuperArts.UI;

import br.com.AsuperArts.BLL.MedidasBLL;
import br.com.AsuperArts.BLL.ProdutoBLL;
import br.com.AsuperArts.DAL.Conexao;
import br.com.AsuperArts.DTO.CampoDecimal;
import br.com.AsuperArts.DTO.MedidasDTO;
import br.com.AsuperArts.DTO.ProdutoDTO;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
        /*btn_alterar.setBackground(new Color(255,255,255));
        btn_cadastrar.setBackground(new Color(255,255,255));
        btn_cancelar.setBackground(new Color(255,255,255));
        btn_editar.setBackground(new Color(255,255,255));
        btn_excluir.setBackground(new Color(255,255,255));*/
        preencherTabela();
         MedidasBLL rg = new MedidasBLL();
        
        for(MedidasDTO l : rg.listaMedidas()){
            
            txt_largura.addItem(String.valueOf(l.getLargura()));
        }
        for(MedidasDTO c : rg.listaMedidas()){
            
            txt_comprimento.addItem(String.valueOf(c.getComprimento()));
        }
        for(MedidasDTO e : rg.listaMedidas()){
            txt_espessura.addItem(String.valueOf(e.getEspessura()));
        }
        
        
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

        jPanel1 = new javax.swing.JPanel();
        txt_nome_produto = new javax.swing.JTextField();
        txt_qnt = new javax.swing.JTextField();
        txt_vl_unitario = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_largura = new javax.swing.JComboBox<>();
        txt_comprimento = new javax.swing.JComboBox<>();
        txt_espessura = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProduto = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        btn_cadastrar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Produtos");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/IconeAsuperArts.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(1050, 550));

        jPanel1.setBackground(new java.awt.Color(247, 244, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Cadastro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N

        txt_nome_produto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_nome_produto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N
        txt_nome_produto.setPreferredSize(new java.awt.Dimension(16, 46));
        txt_nome_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nome_produtoActionPerformed(evt);
            }
        });

        txt_qnt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_qnt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quantidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N
        txt_qnt.setPreferredSize(new java.awt.Dimension(16, 46));
        txt_qnt.setRequestFocusEnabled(false);

        txt_vl_unitario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_vl_unitario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_vl_unitario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor Unitário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N
        txt_vl_unitario.setPreferredSize(new java.awt.Dimension(16, 46));
        txt_vl_unitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vl_unitarioActionPerformed(evt);
            }
        });

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_id.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Cód", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N
        txt_id.setMinimumSize(new java.awt.Dimension(16, 46));
        txt_id.setPreferredSize(new java.awt.Dimension(16, 46));

        txt_largura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_largura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        txt_largura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Largura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N

        txt_comprimento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_comprimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        txt_comprimento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comprimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N
        txt_comprimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_comprimentoActionPerformed(evt);
            }
        });

        txt_espessura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_espessura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        txt_espessura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Espessura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N
        txt_espessura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_espessuraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_largura, 0, 162, Short.MAX_VALUE)
                    .addComponent(txt_nome_produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_comprimento, 0, 175, Short.MAX_VALUE)
                    .addComponent(txt_qnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_espessura, 0, 196, Short.MAX_VALUE)
                    .addComponent(txt_vl_unitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(297, 297, 297))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_qnt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_vl_unitario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_comprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_espessura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_largura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Informações", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N

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

        txt_buscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_buscar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });

        btn_cadastrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.setToolTipText("Cadastrar");
        btn_cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        btn_editar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.setToolTipText("Editar");
        btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_excluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.setToolTipText("Excluir");
        btn_excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setToolTipText("Cancelar");
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_alterar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_alterar.setText("Salvar Edição");
        btn_alterar.setToolTipText("Salvar Edição");
        btn_alterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_buscar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        setBounds(0, 0, 1269, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        
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
      
        if (!txt_nome_produto.getText().equals("") && !txt_qnt.getText().equals("") && !txt_vl_unitario.getText().equals("") && !txt_largura.getSelectedItem().equals("") ) {
            ProdutoBLL rg = new ProdutoBLL();
            ProdutoDTO produtoDTO = new ProdutoDTO();
            produtoDTO.setNome(txt_nome_produto.getText());
            produtoDTO.setQuantidade(Integer.parseInt(txt_qnt.getText()));
            produtoDTO.setPreco_compra(Double.valueOf(txt_vl_unitario.getText().replace(".", "").replace(",", ".").replace(" ","")));
            produtoDTO.setLargura(Integer.valueOf(txt_largura.getSelectedItem().toString()));
            JOptionPane.showMessageDialog(null, txt_largura.getSelectedItem());
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
        if(!txt_nome_produto.getText().equals("") && !txt_qnt.getText().equals("")&& !txt_vl_unitario.getText().equals("") && !txt_largura.getSelectedItem().equals("")){
                produtoDTO.setId_produto(Integer.parseInt(txt_id.getText()));
                produtoDTO.setNome(txt_nome_produto.getText());
                produtoDTO.setQuantidade(Integer.parseInt(txt_qnt.getText()));
                produtoDTO.setPreco_compra(Double.valueOf(txt_vl_unitario.getText().replace(".", "").replace(",", ".").replace(" ","")));
                produtoDTO.setLargura(Integer.valueOf(txt_largura.getSelectedItem().toString()));
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
        txt_largura.setSelectedItem("");
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txt_comprimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_comprimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_comprimentoActionPerformed

    private void txt_nome_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nome_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nome_produtoActionPerformed

    private void txt_espessuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_espessuraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_espessuraActionPerformed
public void setar_campos(){
    int setar = jTableProduto.getSelectedRow();
    txt_id.setText(jTableProduto.getModel().getValueAt(setar, 0).toString());
    txt_nome_produto.setText(jTableProduto.getModel().getValueAt(setar, 1).toString());
    txt_qnt.setText(jTableProduto.getModel().getValueAt(setar, 2).toString());
    txt_vl_unitario.setText(jTableProduto.getModel().getValueAt(setar, 3).toString());
    txt_largura.setSelectedItem(jTableProduto.getModel().getValueAt(setar, 4).toString());
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProduto;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JComboBox<String> txt_comprimento;
    private javax.swing.JComboBox<String> txt_espessura;
    private javax.swing.JTextField txt_id;
    private javax.swing.JComboBox<String> txt_largura;
    private javax.swing.JTextField txt_nome_produto;
    private javax.swing.JTextField txt_qnt;
    private javax.swing.JTextField txt_vl_unitario;
    // End of variables declaration//GEN-END:variables

}

        
