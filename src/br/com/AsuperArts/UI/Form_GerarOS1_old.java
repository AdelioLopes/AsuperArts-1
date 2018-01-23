
package br.com.AsuperArts.UI;

import br.com.AsuperArts.BLL.ClienteBLL;
import br.com.AsuperArts.BLL.OrdemServicoBLL;
import br.com.AsuperArts.BLL.ProdutoBLL;
import br.com.AsuperArts.BLL.TipoosBLL;
import br.com.AsuperArts.DTO.ClienteDTO;
import br.com.AsuperArts.DTO.OrdemDeServicoDTO;
import br.com.AsuperArts.DTO.ProdutoDTO;
import br.com.AsuperArts.DTO.TipoosDTO;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


/**
 * @author Equipe senac 2017
 */
public class Form_GerarOS1_old extends javax.swing.JInternalFrame {
    
    DefaultListModel lista = new DefaultListModel();
    
    public Form_GerarOS1_old() {
        initComponents();
        btn_add.setBackground(new Color(255,255,255));
        btn_gerarOS.setBackground(new Color(255,255,255));
        btn_remover.setBackground(new Color(255,255,255));
        ClienteBLL clienteBLL = new ClienteBLL();
        ProdutoBLL produtoBLL = new ProdutoBLL();
        TipoosBLL tipoosBLL = new TipoosBLL();
        
        txt_Responsavel.setText(Tela_login.txtUsuario.getText());
        txt_Empresa.removeAllItems();
        for(ClienteDTO c : clienteBLL.listaCliente()){
            txt_Empresa.addItem(c);
            
        }
        txt_Tipo_OS.removeAllItems();
        for(TipoosDTO tipo:tipoosBLL.listaTipoOs()){
        txt_Tipo_OS.addItem(String.valueOf(tipo));
        }
        txt_Produto.removeAllItems();
        for(ProdutoDTO p : produtoBLL.listaProduto()){
            txt_Produto.addItem(String.valueOf(p));
        }     
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_Empresa = new javax.swing.JComboBox<>();
        txt_Arquivo = new javax.swing.JTextField();
        btn_add = new javax.swing.JToggleButton();
        txtValorUnitario = new javax.swing.JTextField();
        btn_gerarOS = new javax.swing.JButton();
        btn_remover = new javax.swing.JButton();
        txt_Responsavel = new javax.swing.JTextField();
        txt_Valor_Total_Produto = new javax.swing.JTextField();
        txt_Dt_OS = new javax.swing.JTextField();
        txt_Num_OS = new javax.swing.JTextField();
        txt_Tipo_OS = new javax.swing.JComboBox<>();
        txt_Solicitante = new javax.swing.JTextField();
        txt_Quantidade = new javax.swing.JTextField();
        txt_Produto = new javax.swing.JComboBox<>();
        txt_Valor_Total_OS = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista_OS = new javax.swing.JList<>();
        txt_DataSaida = new com.toedter.calendar.JDateChooser();
        txt_DataEntrada = new com.toedter.calendar.JDateChooser();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        setClosable(true);
        setMaximizable(true);
        setTitle("Gerar OS");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/IconeAsuperArts.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 480));

        txt_Empresa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_Empresa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empresa", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        txt_Empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmpresaActionPerformed(evt);
            }
        });

        txt_Arquivo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_Arquivo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Arquivo", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N

        btn_add.setBackground(new java.awt.Color(204, 204, 204));
        btn_add.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/adicionar.png"))); // NOI18N
        btn_add.setText("Adicionar");
        btn_add.setToolTipText("ADICIONAR");
        btn_add.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        txtValorUnitario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtValorUnitario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtValorUnitario.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Valor Unitário", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        txtValorUnitario.setEnabled(false);
        txtValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorUnitarioActionPerformed(evt);
            }
        });

        btn_gerarOS.setBackground(new java.awt.Color(204, 204, 204));
        btn_gerarOS.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_gerarOS.setText("FECHAR OS");
        btn_gerarOS.setToolTipText("GERAR OS");
        btn_gerarOS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_gerarOS.setMaximumSize(new java.awt.Dimension(60, 60));
        btn_gerarOS.setMinimumSize(new java.awt.Dimension(60, 60));
        btn_gerarOS.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_gerarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerarOSActionPerformed(evt);
            }
        });

        btn_remover.setBackground(new java.awt.Color(204, 204, 204));
        btn_remover.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_remover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/cancelar.png"))); // NOI18N
        btn_remover.setText("Cancelar");
        btn_remover.setToolTipText("CANCELAR");
        btn_remover.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_remover.setMaximumSize(new java.awt.Dimension(60, 60));
        btn_remover.setMinimumSize(new java.awt.Dimension(60, 60));
        btn_remover.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerActionPerformed(evt);
            }
        });

        txt_Responsavel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_Responsavel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Responsável", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        txt_Responsavel.setEnabled(false);

        txt_Valor_Total_Produto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_Valor_Total_Produto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_Valor_Total_Produto.setText("00.00");
        txt_Valor_Total_Produto.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Total", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        txt_Valor_Total_Produto.setEnabled(false);
        txt_Valor_Total_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Valor_Total_ProdutoActionPerformed(evt);
            }
        });

        txt_Dt_OS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_Dt_OS.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Data OS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        txt_Dt_OS.setEnabled(false);

        txt_Num_OS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_Num_OS.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "N° OS", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        txt_Num_OS.setEnabled(false);

        txt_Tipo_OS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_Tipo_OS.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo OS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N

        txt_Solicitante.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_Solicitante.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Solicitante", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        txt_Solicitante.setEnabled(false);

        txt_Quantidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_Quantidade.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Quantidade", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N

        txt_Produto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_Produto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produto", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        txt_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ProdutoActionPerformed(evt);
            }
        });

        txt_Valor_Total_OS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_Valor_Total_OS.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_Valor_Total_OS.setText("00.00");
        txt_Valor_Total_OS.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Valor Total OS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        txt_Valor_Total_OS.setEnabled(false);
        txt_Valor_Total_OS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Valor_Total_OSActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(Lista_OS);

        txt_DataSaida.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data de Saída", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        txt_DataSaida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txt_DataEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data de Entrada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        txt_DataEntrada.setFocusable(false);
        txt_DataEntrada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_gerarOS, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Valor_Total_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Valor_Total_OS, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_Dt_OS, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_Num_OS, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_Empresa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_Tipo_OS, 0, 149, Short.MAX_VALUE)
                                    .addComponent(txt_Solicitante))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_DataEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(txt_Responsavel))
                                .addGap(18, 18, 18)
                                .addComponent(txt_DataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_Arquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_DataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_DataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_Tipo_OS)
                        .addComponent(txt_Num_OS)
                        .addComponent(txt_Dt_OS)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Solicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_Empresa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Arquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Produto))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Valor_Total_Produto)
                                .addComponent(txt_Valor_Total_OS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_Quantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(btn_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_gerarOS, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1232, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 1258, 777);
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorUnitarioActionPerformed
       
    }//GEN-LAST:event_txtValorUnitarioActionPerformed

    private void btn_gerarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerarOSActionPerformed
        OrdemServicoBLL rg = new OrdemServicoBLL();
        OrdemDeServicoDTO dto = new OrdemDeServicoDTO();
         Document document = new Document();
        
        try {
            PdfWriter.getInstance(document, new FileOutputStream("documento.pdf"));
            
            document.open();
            document.add(new Paragraph("Primeiro Paragrafo de teste."));
            document.add(new Paragraph("Segundo Paragrafo de teste."));
            
        } catch (DocumentException ex) {
            System.out.println("Error:"+ex);
        } catch (FileNotFoundException ex) {
            System.out.println("Error:"+ex);
        }finally{
            document.close();
        }
        
        try {
            Desktop.getDesktop().open(new File("documento.pdf"));
        } catch (IOException ex) {
            System.out.println("Error:"+ex);
        }
        
        
        
        
        /*if(!listaServicos.equals("")&&!txtValorUnitario.equals("")){
            dto.setCliente(txtCliente.getSelectedItem().toString());
            dto.setData_os(Date.valueOf(txtData.getText()));
            dto.setServicoSolicitado(txtServico.getText());
            dto.setFuncionario(txtFuncionario.getText());
            dto.setValorUnitario(txtValorUnitario.getText());
            dto.setValorTotal(txtValorTotal.getText());
            rg.gerarOS(dto);
        
        }else{
            JOptionPane.showMessageDialog(null, "Campos obrigatórios!");
        }*/
    }//GEN-LAST:event_btn_gerarOSActionPerformed
    
    private void txt_EmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmpresaActionPerformed
            String nomeEmpresa = txt_Empresa.getSelectedItem().toString();
            ClienteBLL cb = new ClienteBLL();
            ClienteDTO cliente = cb.listaClienteNome(nomeEmpresa);
            txt_Solicitante.setText(cliente.getContato());
    }//GEN-LAST:event_txt_EmpresaActionPerformed

    private void txt_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ProdutoActionPerformed
            String nomeProduto = txt_Produto.getSelectedItem().toString();
            ProdutoBLL pb = new ProdutoBLL();
            ProdutoDTO produto = pb.listarValorUnitarioProduto(nomeProduto);
           // txtValorUnitario.setText(produto.getValor_unitario().toString());
    }//GEN-LAST:event_txt_ProdutoActionPerformed

    private void btn_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerActionPerformed

        this.lista.remove(1);

    }//GEN-LAST:event_btn_removerActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        OrdemDeServicoDTO ordemDeServicoDTO = new OrdemDeServicoDTO();

        SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
        String txt_data_entrada = fd.format(txt_DataEntrada.getDate());
        String txt_data_saida = fd.format(txt_DataSaida.getDate());

        Double res,v1,v2,v3,soma;
        v1 = Double.valueOf(txt_Quantidade.getText());
        v2 = Double.valueOf(txtValorUnitario.getText());
        v3 = Double.valueOf(txt_Valor_Total_OS.getText());
        res = v1 * v2;
        soma = res += v3;
        txt_Valor_Total_Produto.setText(String.valueOf(res));

        txt_Valor_Total_OS.setText(String.valueOf(soma));

        JOptionPane.showMessageDialog(null, soma);

        lista.addElement("TIPO: "+this.txt_Tipo_OS.getSelectedItem() +" - ENTRADA: "+ txt_data_entrada +" - ´SAÍDA: "+ txt_data_saida +" - EMPRESA: "+this.txt_Empresa.getSelectedItem()+" - SOLICITANTE: "+txt_Solicitante.getText()+" - RESPONSÁVEL; "+this.txt_Responsavel.getText()+" - ARQUIVO: "+this.txt_Arquivo.getText()+" - PRODUTO: "+ this.txt_Produto.getSelectedItem()+" - QUANTIDADE: "+this.txt_Quantidade.getText()+" - V.UNITÁRIO: "+ this.txtValorUnitario.getText()+" "+ this.txt_Valor_Total_Produto.getText());
        this.Lista_OS.setModel(lista);

    }//GEN-LAST:event_btn_addActionPerformed

    private void txt_Valor_Total_OSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Valor_Total_OSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Valor_Total_OSActionPerformed

    private void txt_Valor_Total_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Valor_Total_ProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Valor_Total_ProdutoActionPerformed
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Lista_OS;
    private javax.swing.JToggleButton btn_add;
    private javax.swing.JButton btn_gerarOS;
    private javax.swing.JButton btn_remover;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtValorUnitario;
    private javax.swing.JTextField txt_Arquivo;
    private com.toedter.calendar.JDateChooser txt_DataEntrada;
    private com.toedter.calendar.JDateChooser txt_DataSaida;
    private javax.swing.JTextField txt_Dt_OS;
    private javax.swing.JComboBox<Object> txt_Empresa;
    private javax.swing.JTextField txt_Num_OS;
    private javax.swing.JComboBox<String> txt_Produto;
    private javax.swing.JTextField txt_Quantidade;
    private javax.swing.JTextField txt_Responsavel;
    private javax.swing.JTextField txt_Solicitante;
    private javax.swing.JComboBox<String> txt_Tipo_OS;
    private javax.swing.JTextField txt_Valor_Total_OS;
    private javax.swing.JTextField txt_Valor_Total_Produto;
    // End of variables declaration//GEN-END:variables
}
