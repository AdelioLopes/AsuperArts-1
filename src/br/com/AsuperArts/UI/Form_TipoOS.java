package br.com.AsuperArts.UI;

import br.com.AsuperArts.BLL.TipoosBLL;
import br.com.AsuperArts.DTO.TipoosDTO;
import java.awt.Color;
import java.awt.event.ComponentEvent;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 * @author Aluno
 */
public class Form_TipoOS extends javax.swing.JInternalFrame {
    
    public Form_TipoOS() {
        initComponents();
        preencherJtable();
        btn_alterar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        /*btn_alterar.setBackground(new Color(255,255,255));
        btn_cadastrar.setBackground(new Color(255,255,255));
        btn_cancelar.setBackground(new Color(255,255,255));
        btn_editar.setBackground(new Color(255,255,255));
        btn_excluir.setBackground(new Color(255,255,255));*/
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_nome = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTipoOs = new javax.swing.JTable();
        btn_cadastrar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        setClosable(true);
        setMaximizable(true);
        setTitle("Tipo Os");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/IconeAsuperArts.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(1258, 777));

        jPanel1.setBackground(new java.awt.Color(247, 244, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Cadastro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N

        txt_nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_nome.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Nome/Tipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_id.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Cód", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(402, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Informações", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N

        jTableTipoOs.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTableTipoOs.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableTipoOs.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jTableTipoOs.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableTipoOs);
        if (jTableTipoOs.getColumnModel().getColumnCount() > 0) {
            jTableTipoOs.getColumnModel().getColumn(0).setResizable(false);
            jTableTipoOs.getColumnModel().getColumn(1).setResizable(false);
        }

        btn_cadastrar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/OS.png"))); // NOI18N
        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.setToolTipText("Cadastrar");
        btn_cadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/Cancelar.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setToolTipText("Cancelar");
        btn_cancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_alterar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/Salvar.png"))); // NOI18N
        btn_alterar.setText("Salvar ");
        btn_alterar.setToolTipText("Salvar Edição");
        btn_alterar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_excluir.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/Excluir.png"))); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.setToolTipText("Excluir");
        btn_excluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_editar.setBackground(new java.awt.Color(204, 204, 204));
        btn_editar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/editar.png"))); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.setToolTipText("Editar");
        btn_editar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_cadastrar)
                .addGap(77, 77, 77))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_excluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1050, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        // TODO add your handling code here:
        TipoosBLL rg = new TipoosBLL();
        TipoosDTO TipoosDTO = new TipoosDTO();
        if(!txt_nome.getText().equals("")){
                TipoosDTO.setNome(txt_nome.getText());
                rg.Inserir(TipoosDTO);
                preencherJtable();
                 txt_nome.setText("");
                JOptionPane.showMessageDialog(null, "Cadastrado");
             }else {
                 JOptionPane.showMessageDialog(null, "Campos vazios verifique e tente novamente");
            }
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        // TODO add your handling code here:
        TipoosBLL rg = new TipoosBLL();
        TipoosDTO tipoosDTO = new TipoosDTO();
        
        if(this.jTableTipoOs.getSelectedRowCount() > 0){
        int linha = this.jTableTipoOs.getSelectedRow();
        tipoosDTO.setId_tipoOs((int) this.jTableTipoOs.getValueAt(linha, 0));    
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(null, "deseja mesmo excluir?");
        if(resposta == JOptionPane.YES_OPTION){
                rg.Excluir(tipoosDTO);
                preencherJtable();
            JOptionPane.showMessageDialog(null, "Excluído!");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        TipoosBLL rg = new TipoosBLL();
        TipoosDTO tipoosDTO = new TipoosDTO();
        
        if(this.jTableTipoOs.getSelectedRowCount() > 0){
        int linha = this.jTableTipoOs.getSelectedRow();
        tipoosDTO.setId_tipoOs((int) this.jTableTipoOs.getValueAt(linha, 0));    
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(null, "deseja mesmo alterar?");
        if(resposta == JOptionPane.YES_OPTION){
                setar_campos();                
                btn_cadastrar.setEnabled(false);
                btn_editar.setEnabled(false);
                btn_excluir.setEnabled(false);
                btn_alterar.setEnabled(true);
                btn_cancelar.setEnabled(true);
                preencherJtable();
            }
        }else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        TipoosBLL rg = new TipoosBLL();
        TipoosDTO tipoosDTO = new TipoosDTO();
        if(!txt_nome.getText().equals("")){
                tipoosDTO.setId_tipoOs(Integer.parseInt(txt_id.getText()));
                tipoosDTO.setNome(txt_nome.getText());
                rg.Alterar(tipoosDTO);
                preencherJtable();
                btn_cadastrar.setEnabled(true);
                btn_editar.setEnabled(true);
                btn_excluir.setEnabled(true);
                btn_alterar.setEnabled(false);
                btn_cancelar.setEnabled(false);
                txt_id.setText("");
                txt_nome.setText("");
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
        txt_id.setText("");
        txt_nome.setText("");
    }//GEN-LAST:event_btn_cancelarActionPerformed
public void preencherJtable(){
        this.jTableTipoOs.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.jTableTipoOs.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel modelo = (DefaultTableModel)jTableTipoOs.getModel();
        modelo.setNumRows(0);
        TipoosBLL rg = new TipoosBLL();
        for(TipoosDTO tipoOs: rg.listaTipoOs()){
                modelo.addRow(new Object[]{
                tipoOs.getId_tipoOs(),
                tipoOs.getNome(),
            });
     }      
 }
public void setar_campos(){
    int setar = jTableTipoOs.getSelectedRow();
    txt_id.setText(jTableTipoOs.getModel().getValueAt(setar, 0).toString());
    txt_nome.setText(jTableTipoOs.getModel().getValueAt(setar, 1).toString());

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
    private javax.swing.JTable jTableTipoOs;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables
}
