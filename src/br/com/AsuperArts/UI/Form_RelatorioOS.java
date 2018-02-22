/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.AsuperArts.UI;

import br.com.AsuperArts.BLL.OrdemServicoBLL;
import br.com.AsuperArts.DTO.OrdemDeServicoDTO;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class Form_RelatorioOS extends javax.swing.JInternalFrame {

    /**
     * Creates new form Form_RelatorioOS
     */
    public Form_RelatorioOS() {
        initComponents();
        preencherTabela();
    }
    public void preencherTabela() {
        this.tb_OsFechadas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel modelo = (DefaultTableModel) tb_OsFechadas.getModel();
        modelo.setNumRows(0);
        OrdemServicoBLL rg = new OrdemServicoBLL();
        for(OrdemDeServicoDTO servico : rg.listaFechada()){
        modelo.addRow(new Object[]{
        servico.getId_os(),
        servico.getData_os(),
        servico.getServico(),
        servico.getEmpresa(),
        servico.getSolicitante(),
        servico.getResponsavel(),
        servico.getValor().toString().replace(".", ","),
        servico.getDescricao(),
        servico.getEstado(),
        servico.getDataFechada()
        });
        }
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_OsFechadas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        data_inicial = new com.toedter.calendar.JDateChooser();
        data_final = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_imprimir = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Ordens de Serviço Fechadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        tb_OsFechadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_OS", "Dt_OS", "Serviço", "Empresa", "Solicitante", "Responsável", "Valor", "Descrição", "Estado", "Dt_Fechada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_OsFechadas);
        if (tb_OsFechadas.getColumnModel().getColumnCount() > 0) {
            tb_OsFechadas.getColumnModel().getColumn(0).setMinWidth(70);
            tb_OsFechadas.getColumnModel().getColumn(0).setPreferredWidth(10);
            tb_OsFechadas.getColumnModel().getColumn(0).setMaxWidth(100);
            tb_OsFechadas.getColumnModel().getColumn(1).setMinWidth(80);
            tb_OsFechadas.getColumnModel().getColumn(1).setPreferredWidth(10);
            tb_OsFechadas.getColumnModel().getColumn(1).setMaxWidth(100);
            tb_OsFechadas.getColumnModel().getColumn(2).setMinWidth(140);
            tb_OsFechadas.getColumnModel().getColumn(2).setPreferredWidth(10);
            tb_OsFechadas.getColumnModel().getColumn(2).setMaxWidth(200);
            tb_OsFechadas.getColumnModel().getColumn(3).setMinWidth(120);
            tb_OsFechadas.getColumnModel().getColumn(3).setPreferredWidth(10);
            tb_OsFechadas.getColumnModel().getColumn(3).setMaxWidth(190);
            tb_OsFechadas.getColumnModel().getColumn(4).setMinWidth(120);
            tb_OsFechadas.getColumnModel().getColumn(4).setPreferredWidth(10);
            tb_OsFechadas.getColumnModel().getColumn(4).setMaxWidth(190);
            tb_OsFechadas.getColumnModel().getColumn(5).setMinWidth(120);
            tb_OsFechadas.getColumnModel().getColumn(5).setPreferredWidth(10);
            tb_OsFechadas.getColumnModel().getColumn(5).setMaxWidth(190);
            tb_OsFechadas.getColumnModel().getColumn(6).setMinWidth(80);
            tb_OsFechadas.getColumnModel().getColumn(6).setPreferredWidth(10);
            tb_OsFechadas.getColumnModel().getColumn(6).setMaxWidth(150);
            tb_OsFechadas.getColumnModel().getColumn(7).setMinWidth(160);
            tb_OsFechadas.getColumnModel().getColumn(7).setPreferredWidth(10);
            tb_OsFechadas.getColumnModel().getColumn(7).setMaxWidth(200);
            tb_OsFechadas.getColumnModel().getColumn(8).setResizable(false);
            tb_OsFechadas.getColumnModel().getColumn(9).setMinWidth(120);
            tb_OsFechadas.getColumnModel().getColumn(9).setPreferredWidth(10);
            tb_OsFechadas.getColumnModel().getColumn(9).setMaxWidth(150);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Gerar Relatórios ou Imprimir O.S", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Total de Ganhos ao mês");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, null, null));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("0.00");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton1.setBackground(new java.awt.Color(244, 244, 244));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        data_inicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        data_final.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("De:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Até:");

        btn_imprimir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_imprimir.setText("Imprimir O.S");
        btn_imprimir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(data_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(data_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(158, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(data_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(data_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
       OrdemDeServicoDTO ordemDeServicoDTO = new OrdemDeServicoDTO();
       OrdemServicoBLL ordemServicoBLL = new OrdemServicoBLL();
       
       if (this.tb_OsFechadas.getSelectedRowCount() > 0) {
            int linha = tb_OsFechadas.getSelectedRow();
            ordemDeServicoDTO.setId_os((int) this.tb_OsFechadas.getValueAt(linha, 0));
            int resposta = 0;
            resposta = JOptionPane.showConfirmDialog(null, "deseja mesmo alterar?");
            if (resposta == JOptionPane.YES_OPTION) {
                
                Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream("documento.pdf"));

            document.open();
            Image image = Image.getInstance("logoadelio.png");
            document.add(image);
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Entre em contato conosco: (61) 3458-4612"));
            document.add(new Paragraph(" "));
            PdfPTable tabela = new PdfPTable(2);
            tabela.addCell("Número de Ordem de serviço");
            tabela.addCell(tb_OsFechadas.getValueAt(linha, 0).toString());
            tabela.addCell("Data de Entrada");
            tabela.addCell(tb_OsFechadas.getValueAt(linha, 1).toString());
            tabela.addCell("Serviço Solicitado");
            tabela.addCell(tb_OsFechadas.getValueAt(linha, 2).toString());
            tabela.addCell("Empresa");
            tabela.addCell(tb_OsFechadas.getValueAt(linha, 3).toString());
            tabela.addCell("Solicitante");
            tabela.addCell(tb_OsFechadas.getValueAt(linha, 4).toString());
            tabela.addCell("Responsável");
            tabela.addCell(tb_OsFechadas.getValueAt(linha, 5).toString());
            tabela.addCell("Valor Total");
            tabela.addCell(tb_OsFechadas.getValueAt(linha, 6).toString().replace(".", ","));
            tabela.addCell("Descrição");
            tabela.addCell(tb_OsFechadas.getValueAt(linha, 7).toString());
            //tabela.addCell("Estado de Ordem de Serviço");
            //tabela.addCell(tb_OsFechadas.getValueAt(linha, 8).toString());
            tabela.addCell("Data de Fechamento");
            tabela.addCell(tb_OsFechadas.getValueAt(linha, 9).toString());
            document.add(tabela);
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Recebido por:______________________________________________   Data:__ /__ /_____"));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Obrigado pela preferência e volte sempre! "));
            document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
            document.add(new Paragraph(" "));
            document.add(tabela);
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Recebido por:__________________________________________________   Data:__ /__ /_____"));
            
            
            
        } catch (DocumentException ex) {
            System.out.println("Error:"+ex);
        } catch (FileNotFoundException ex) {
            System.out.println("Error:"+ex);
        } catch (IOException ex) {
                    Logger.getLogger(Form_RelatorioOS.class.getName()).log(Level.SEVERE, null, ex);
                }finally{
            document.close();
        }

        try {
            Desktop.getDesktop().open(new File("documento.pdf"));
        } catch (IOException ex) {
            System.out.println("Error:"+ex);
        }
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");

        }
    }//GEN-LAST:event_btn_imprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_imprimir;
    private com.toedter.calendar.JDateChooser data_final;
    private com.toedter.calendar.JDateChooser data_inicial;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_OsFechadas;
    // End of variables declaration//GEN-END:variables
}
