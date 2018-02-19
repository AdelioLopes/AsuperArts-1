
package br.com.AsuperArts.UI;

import br.com.AsuperArts.BLL.ClienteBLL;
import br.com.AsuperArts.BLL.OrdemServicoBLL;
import br.com.AsuperArts.DTO.ClienteDTO;
import br.com.AsuperArts.DTO.OrdemDeServicoDTO;
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
import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;



/**
 * @author Equipe senac 2017
 */
public class Form_AbrirOS extends javax.swing.JInternalFrame {
    
    DefaultListModel lista = new DefaultListModel();
    
    public Form_AbrirOS() {
        initComponents();
        
        lblInformação.setText("<html>O valor será definido ao fechar a Ordem de Serviço. Sempre verifique se a OS está em aberto. </html>");
        
        SimpleDateFormat fd = new  SimpleDateFormat("dd/MM/yyyy");
        txt_data.setText( fd.format(new java.util.Date()));
  
        btn_gerarOS.setBackground(new Color(255,255,255));
        
        
        txt_Empresa.setBackground(new Color(255,255,255));   
        ClienteBLL clienteBLL = new ClienteBLL();
        
        txt_Responsavel.setText(Tela_login.txtUsuario.getText());
        txt_Empresa.removeAllItems();
        for(ClienteDTO c : clienteBLL.listaCliente()){
            txt_Empresa.addItem(c);
            
        }
 
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_Empresa = new javax.swing.JComboBox<>();
        txt_servico = new javax.swing.JTextField();
        txt_Responsavel = new javax.swing.JTextField();
        txt_Valor = new javax.swing.JTextField();
        txt_data = new javax.swing.JTextField();
        txt_Num_OS = new javax.swing.JTextField();
        txt_Solicitante = new javax.swing.JTextField();
        btn_gerarOS = new javax.swing.JButton();
        lblInformação = new javax.swing.JLabel();
        txt_estado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_desc = new javax.swing.JTextArea();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        setClosable(true);
        setTitle("Ordem de Serviços - AsuperArts");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/IconeAsuperArts.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(1050, 550));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 480));

        txt_Empresa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_Empresa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empresa/Cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        txt_Empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmpresaActionPerformed(evt);
            }
        });

        txt_servico.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_servico.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Serviço Solicitado", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N

        txt_Responsavel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_Responsavel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Responsável", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        txt_Responsavel.setEnabled(false);
        txt_Responsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ResponsavelActionPerformed(evt);
            }
        });

        txt_Valor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_Valor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_Valor.setText("0");
        txt_Valor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        txt_Valor.setEnabled(false);

        txt_data.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_data.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Data OS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        txt_data.setEnabled(false);

        txt_Num_OS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_Num_OS.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "N° OS", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        txt_Num_OS.setEnabled(false);

        txt_Solicitante.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_Solicitante.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Solicitante", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        txt_Solicitante.setEnabled(false);

        btn_gerarOS.setBackground(new java.awt.Color(204, 204, 204));
        btn_gerarOS.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_gerarOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/OS.png"))); // NOI18N
        btn_gerarOS.setText("Abrir OS");
        btn_gerarOS.setToolTipText("GERAR OS");
        btn_gerarOS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_gerarOS.setMaximumSize(new java.awt.Dimension(60, 60));
        btn_gerarOS.setMinimumSize(new java.awt.Dimension(60, 60));
        btn_gerarOS.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_gerarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerarOSActionPerformed(evt);
            }
        });

        lblInformação.setBorder(javax.swing.BorderFactory.createTitledBorder("Aviso"));

        txt_estado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aberta", "Fechada" }));
        txt_estado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado de OS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        txt_desc.setColumns(20);
        txt_desc.setRows(5);
        txt_desc.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição"));
        jScrollPane1.setViewportView(txt_desc);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_Num_OS, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_gerarOS, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txt_Solicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lblInformação, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Num_OS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_servico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Solicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btn_gerarOS, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblInformação, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1001, 386);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gerarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerarOSActionPerformed
        OrdemServicoBLL rg = new OrdemServicoBLL();
        OrdemDeServicoDTO ordemDeServicoDTO = new OrdemDeServicoDTO();
        
        if(!txt_servico.getText().equals("")&& !txt_servico.getText().equals("") && !txt_desc.getText().equals("")){
        SimpleDateFormat fd = new  SimpleDateFormat("yyyy-MM-dd");
        txt_data.setText( fd.format(new java.util.Date()));
        ordemDeServicoDTO.setData_os(txt_data.getText());
        ordemDeServicoDTO.setServico(txt_servico.getText());
        ordemDeServicoDTO.setEmpresa(txt_Empresa.getSelectedItem().toString());
        ordemDeServicoDTO.setSolicitante(txt_Solicitante.getText());
        ordemDeServicoDTO.setResponsavel(txt_Responsavel.getText());
        ordemDeServicoDTO.setValor(Double.parseDouble(txt_Valor.getText()));
        ordemDeServicoDTO.setDescricao(txt_desc.getText());
        ordemDeServicoDTO.setEstado(txt_estado.getSelectedItem().toString());
        rg.abrir(ordemDeServicoDTO);
        txt_servico.setText("");
        txt_desc.setText("");
        JOptionPane.showMessageDialog(null, "Ordem de Serviço aberta!");
        }else{
        
        JOptionPane.showMessageDialog(null, "Campos vazio verifique e tente novamente");
        }
        
        
       /*
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
        */
        
        
        
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

    private void txt_ResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ResponsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ResponsavelActionPerformed
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_gerarOS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInformação;
    private javax.swing.JComboBox<Object> txt_Empresa;
    private javax.swing.JTextField txt_Num_OS;
    private javax.swing.JTextField txt_Responsavel;
    private javax.swing.JTextField txt_Solicitante;
    private javax.swing.JTextField txt_Valor;
    private javax.swing.JTextField txt_data;
    private javax.swing.JTextArea txt_desc;
    private javax.swing.JComboBox<String> txt_estado;
    private javax.swing.JTextField txt_servico;
    // End of variables declaration//GEN-END:variables
}
