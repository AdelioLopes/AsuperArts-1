/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.AsuperArts.DTO;

import java.awt.Color;  
import java.awt.event.*;
import java.math.RoundingMode;
import java.text.*;
import javax.swing.*; 
/**
 *
 * @author Aluno
 */
public class CampoDecimal  extends JFormattedTextField {  

    /**Constantes para definir o formato*/ 
    /** Valor com nenhuma casa decimal */
    public static final String VALOR0 = "#,##0; -#,##0";  
    /** Valor com uma casa decimal */
    public static final String VALOR1 = "#,##0.0; -#,##0.0";    
    /** Valor com duas casas decimais */ 
    public static final String VALOR2 = "#,##0.00; -#,##0.00";    
    /** Valor com três casas decimais */ 
    public static final String VALOR3 = "#,##0.000; -#,##0.000";  
    /** Moeda em Real com duas casas decimais */  
    public static final String REAL = "R$ #,##0.00;R$ -#,##0.00";  
    /** Porcentagem sem nenhuma casa decimal */   
    public static final String PORCENTAGEM0 = "#,##0'%';-#,##0'%'"; 
    /** Porcentagem com uma casa decimal */   
    public static final String PORCENTAGEM1 = "#,##0.0'%';-#,##0.0'%'"; 
    /** Porcentagem com duas casas decimais */   
    public static final String PORCENTAGEM2 = "#,##0.00'%';-#,##0.00'%'";  
    /** Porcentagem com três casas decimais */   
    public static final String PORCENTAGEM3 = "#,##0.000'%';-#,##0.000'%'"; 
    /** Porcentagem com quatro casas decimais */   
    public static final String PORCENTAGEM4 = "#,##0.0000'%';-#,##0.0000'%'"; 

    /**Formato sendo utilizado*/  
    private DecimalFormat df;  

    /**Valor inserido no campo*/  
    private double dValue = 0.0;  

    /**Valor inserido no campo*/  
    private double valendo = 0.0;  

    /**Ultimo valor válido*/  
    private String oldValue = "0.0";  

    /**String que será exibida em caso de valor inválido ou fora do formato*/  
    public static final String ERRO = "0";  


    /** 
     * Cria um novo objeto CampoDecimal, com o formato especificado 
     * @param formato Uma String que será o formato (pattern) do DecimalFormat a ser utilizado 
     */  
    public CampoDecimal(String formato) {  
        super();  

        df = new DecimalFormat();  
        df.setRoundingMode(RoundingMode.UP);  
        df.applyPattern(formato);  

        this.setHorizontalAlignment(JTextField.RIGHT);  

        setValue(oldValue);  
        applyActions();  
    }  

    /**Aplica um novo DecimalForma
     * @param df*/  
    public void setDf(DecimalFormat df) {  
        this.df = df;  
        setValue("0.0");  
        this.thisFocusGained(null);  
        setText("0.0");  
    }  

    /**Retorna o DecimalFormat sendo usado atualment
     * @return e*/  
    public DecimalFormat getDf() {  
        return df;  
    }  

    /** 
     * Cria as ações de focus para setar e verificar os valores digitados 
     */  
    private void applyActions() {  

        this.addActionListener(new ActionListener() {  

            @Override  
            public void actionPerformed(ActionEvent e) {  
                transferFocus();  
            }  
        });  

        this.addFocusListener(new FocusListener() {  

            @Override  
            public void focusLost(FocusEvent evt) {  
                thisFocusLost(evt);  
            }  

            @Override  
            public void focusGained(FocusEvent evt) {  
                thisFocusGained(evt);  
            }  
        });  

    }  

    /**Verifica se o valor digitado é válido, e insere os novos valore
     * @param evt*/  
    public void thisFocusLost(FocusEvent evt) {  
        String valor = getText().replace(',', '.');  
        if (!valor.equals("") && !valor.trim().isEmpty()) {  
            oldValue = valor;  
        }  
        setValue(valor);  
    }  

    /**Limpa o campo para que seja digitado novo valo
     * @param fe*/  
    public void thisFocusGained(FocusEvent fe) {  
        super.setText("");  
        normalText();  
    }  

    /**Seta os valores no campo*/  
    private void setValue(String value) {  
        try {  
            dValue = arredondar(Double.parseDouble(value));              
        } catch (NumberFormatException e) {  
            /**Aqui o valor é inválido, então coloca novamente o valor antigo*/  
            value = oldValue;
        }  
        valendo = arredondar(Double.parseDouble(value)); 
        showValue(value);  
    }  

    @Override  
    public void setValue(Object value) {  
        if(value instanceof Double){  
            double d = (Double) value;  
            this.setText(String.format("%f", d));  
        }else{  
            this.setText(value.toString());  
        }  
    }  

    /** 
     * Mostra o valor formatado no padrão do DecimalFormat 
     * @param s valor informado no campo 
     */  
    public void showValue(String s) {  
        try {  
            super.setText(df.format(new java.math.BigDecimal(s)));  
        } catch (Exception e) {  
            /**Valor inválido, exibe mensagem de erro*/  
            error();  
            dValue = Double.NaN;  
        }  
    }  

    /** 
     * Retorna o valor inserido no campo. 
     * @return dValue double value 
     */  
    public double getDoubleValue() {  
        return dValue;  
    }  

    @Override  
    public Object getValue() {  
        return getDoubleValue();  
    }  

    /** 
     * Mostra o texto ERRO em vermelho. 
     */  
    private void error() {  
        this.setForeground(Color.red);  
        super.setText(ERRO);  
    }  

    /** 
     * Volta o texto ao formato original 
     */  
    private void normalText() {  
        this.setForeground(null);  
    }  

    @Override  
    public void setText(String valor) {  
        super.setText(valor);  
        this.thisFocusLost(null);  
    }  

    /**Arredondamento para corrigir possíveis diferenças em decimal do valor exibido com o valor retornad
     * @param d  
     * @return */  
    public double arredondar(double d) {  
        if (d > 0) {  
            return (Math.ceil((d * 100.0))) / 100.0;  
        } else {  
            return (Math.floor((d * 100.0))) / 100.0;  
        }  
    } 

    /**
     * @return the valendo
     */
    public double getValendo() {
        return valendo;
    }

}
