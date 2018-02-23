/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.AsuperArts.UI;

import br.com.AsuperArts.BLL.OrdemServicoBLL;
import br.com.AsuperArts.DAL.Conexao;
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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
    public void preencherTabela2() {
        OrdemServicoBLL rg = new OrdemServicoBLL();
        this.tb_valor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel modelo = (DefaultTableModel) tb_valor.getModel();
        modelo.setNumRows(0);
        for(OrdemDeServicoDTO servico : rg.relatorio()){
        modelo.addRow(new Object[]{
        servico.getValor()
        });
        }
        
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
        servico.getValor(),
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
        btn_calc = new javax.swing.JButton();
        data_final = new com.toedter.calendar.JDateChooser();
        data_inicial = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_imprimir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_valor = new javax.swing.JTable();
        txt_valor = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Relatório - asuperArt's");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AsuperArts/UI/img/IconeAsuperArts.png"))); // NOI18N

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
            tb_OsFechadas.getColumnModel().getColumn(0).setMinWidth(40);
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
            tb_OsFechadas.getColumnModel().getColumn(6).setMinWidth(50);
            tb_OsFechadas.getColumnModel().getColumn(6).setPreferredWidth(10);
            tb_OsFechadas.getColumnModel().getColumn(6).setMaxWidth(100);
            tb_OsFechadas.getColumnModel().getColumn(7).setMinWidth(260);
            tb_OsFechadas.getColumnModel().getColumn(7).setPreferredWidth(10);
            tb_OsFechadas.getColumnModel().getColumn(7).setMaxWidth(300);
            tb_OsFechadas.getColumnModel().getColumn(8).setMinWidth(120);
            tb_OsFechadas.getColumnModel().getColumn(8).setPreferredWidth(10);
            tb_OsFechadas.getColumnModel().getColumn(8).setMaxWidth(190);
            tb_OsFechadas.getColumnModel().getColumn(9).setMinWidth(50);
            tb_OsFechadas.getColumnModel().getColumn(9).setPreferredWidth(10);
            tb_OsFechadas.getColumnModel().getColumn(9).setMaxWidth(200);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Gerar Relatórios ou Imprimir O.S", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Total de Lucros");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, null, null));

        btn_calc.setBackground(new java.awt.Color(244, 244, 244));
        btn_calc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_calc.setText("Calcular");
        btn_calc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcActionPerformed(evt);
            }
        });

        data_final.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        data_inicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

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

        tb_valor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tb_valor);

        txt_valor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_valor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(data_inicial, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(data_final, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(btn_calc, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                                .addComponent(btn_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel3))
                                    .addComponent(data_inicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(data_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(27, 27, 27))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_calc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
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
                        .addGap(0, 464, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
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

    private void btn_calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcActionPerformed
       OrdemServicoBLL rg = new OrdemServicoBLL();
  
        SimpleDateFormat fd = new  SimpleDateFormat("yyyy-MM-dd");
        Date texto = data_inicial.getDate();
        Date texto2 = data_final.getDate();
        String data1 = fd.format(texto);
        String data2 = fd.format(texto2);
        txt_valor.setText(rg.valorSomatorio(data1,data2));
        //preencherTabela2();
    }//GEN-LAST:event_btn_calcActionPerformed
 
    
    private String CalculaTotal() {
        Double Orcamento = 0.0;
        for ( int i = 0; i < tb_OsFechadas.getRowCount(); i++){
            
            
            Orcamento += Double.parseDouble( tb_OsFechadas.getValueAt(i, 6).toString());
        }
        return Orcamento.toString();        
    }
   
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calc;
    private javax.swing.JButton btn_imprimir;
    public static com.toedter.calendar.JDateChooser data_final;
    public static com.toedter.calendar.JDateChooser data_inicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_OsFechadas;
    private javax.swing.JTable tb_valor;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
}
