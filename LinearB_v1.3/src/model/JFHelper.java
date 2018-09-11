/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 * <h1>JHELPER</h1>
 * <p>
 * A classe em questão contém métodos que auxiliam ao realizar procedimentos no
 * JFrame
 * </p>
 *
 * @version 1.3.0
 * @author Felipe Palombo
 */
public class JFHelper {
    private static String numbers = "0123456789";
    public JFHelper() {
    }

    
    /****************************** MÉTODOS PARA DEIXAR CAMPOS VAZIOS *******************************/
    
    /**
     * Esse método é usado para transformar o texto de um array de JTextFields
     * para vazio, mais especificamente igual a ""
     *
     * @param fields Esse parametro recebe o Array que vai ficar vazio
     */
    public static void clearFields(JTextField[] fields) {
        for (int x = 0; x < fields.length; x++) {
            fields[x].setText("");
        }
    }

    /**
     * Esse método é usado para transformar o texto de um array de
     * JFormattedTextFields para vazio, mais especificamente igual a ""
     *
     * @param fields Esse parâmetro recebe o Array que vai ficar vazio
     */
    public static void clearFields(JFormattedTextField[] fields) {
        for (int x = 0; x < fields.length; x++) {
            fields[x].setText("");
        }
    }
    
    /**
     * Esse método é usado para transformar o texto de arrays 
     * de JFormattedTextFields e de JTextField
     * para vazio, mais especificamente igual a ""
     *
     * @param ffields Esse parâmetro recebe o Array de JFormattedTextField que irão ficar vazios
     * @param fields Esse parâmetro recebe o Array de JTextField que irão ficar vazios
     */
    public static void clearFields(JFormattedTextField[] ffields, JTextField[] fields) {
        clearFields(ffields);
        clearFields(fields);
    }

    /**
     * Limpa todas as linhas de uma tabela 
     * @param t Parâmetro que recebe a DefaultTableModel
     */
    public static void clearTable(DefaultTableModel t) {
        for (int x = t.getRowCount() - 1; x >= 0; x--) {
            t.removeRow(x);
        }
    }
    
    
    /****************************** MÉTODOS DE VERIFICAÇÃO DE CAMPO VAZIO *******************************/
    
    /**
     * Esse método é usado para verificar se o texto de um array de JTextField é
     * vazio, mais especificamente igual a "". Se o campo for vazio sua borda ficará
     * em vermelho.
     * @return se encontrar algum campo vazio retorna true e gera uma mensagem
     * de aviso aos campos em branco, se não retorna false
     * @param fields Esse parametro recebe o Array que vai ser verificado
     */
    public static boolean verifyBlankFields(JTextField[] fields) {
        boolean isBlank = false;
        for (int x = 0; x < fields.length; x++) {
            if (fields[x].getText().equalsIgnoreCase("")) {
                System.out.println("TF");
                setWarningBorder(fields[x]);
                isBlank = true;
            }
        }
        return isBlank;
    }

    /**
     * Esse método é usado para verificar se o texto de um array de
     * JFormattedTextField é vazio, mais especificamente igual a ""
     * Se o campo for vazio sua borda ficará em vermelho.
     * @return se encontrar algum campo vazio retorna true e gera uma mensagem
     * de aviso aos campos em branco, se não retorna false
     * @param fields Esse parâmetro recebe o Array que vai ser verificado
     */
    public static boolean verifyBlankFields(JFormattedTextField[] fields) {
        boolean isBlank = false;
        for (int x = 0; x < fields.length; x++) {
            System.out.println(fields[x].getText());
            System.out.println("FFIELDS V: "+containsNumber(fields[x].getText())+" & "+containsLetter(fields[x].getText()));
            if (!(containsNumber(fields[x].getText()) || containsLetter(fields[x].getText()))) {
                System.out.println("TFF");
                setWarningBorder(fields[x]);
                isBlank = true;
            }
        }
        return isBlank;
    }

    /**
     * Esse método é usado para verificar se um array de JComboBox não foi
     * selecionado, mais especificamente igual a -1. Se o campo for -1 sua 
     * borda ficará em vermelho.
     * @return se encontrar algum campo for -1 retorna true e gera uma mensagem
     * de aviso aos campos não selecionado, se não retorna false
     * @param cbs Esse parâmetro recebe o Array que vai ser verificado
     */
    public static boolean verifyUnmarkedCB(JComboBox[] cbs) {
        boolean isUnmarked = false;
        for (int x = 0; x < cbs.length; x++) {
            if (cbs[x].getSelectedIndex() == -1) {
                
                setWarningBorder(cbs[x]);
                isUnmarked = true;
            }
        }
        return isUnmarked;
    }

    /**
     * Esse é um método complementar, para verificar as verificações todas de
     * uma vez só ele verifica os arrays JTextFields, JFormattedTextFields e
     * JComboBoxes
     *
     * @return É retornado true se algum dos arrays for true (significa que há campos vazios), senão false
     * @param fields Esse parâmetro recebe o Array de JTextFields que vai ser
     * verificado
     * @param ffields Esse parâmetro recebe o Array de JFormattedTextFields que
     * vai ser verificado
     * @param cbs Esse parâmetro recebe o Array de JComboBoxes que vai ser
     * verificado
     */
    public static boolean verifyAll(JTextField[] fields, JFormattedTextField[] ffields, JComboBox[] cbs) {
        boolean v1 = verifyBlankFields(ffields);
        boolean v2 = verifyBlankFields(fields);
        boolean v3 = verifyUnmarkedCB(cbs);
        if (v1 || v2 || v3) {
            return true;            
        } else {
            return false;
        }
    }
    
    
    /****************************** MÉTODOS DE ALTERAÇÃO DE BORDA *******************************/
    
    /**
     * Transforma a borda de um determinado JTextField na borda padrão
     * no caso LineBorder, cinza.
     * @param field Parâmetro que recebe o JTextField que terá a borda mudada.
     */
    public static void setStandardBorder(JTextField field){
        field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }
    
    /**
     * Transforma a borda de um determinado JFormattedTextField na borda padrão
     * no caso LineBorder, cinza.
     * @param field Parâmetro que recebe o JFormattedTextField que terá a borda mudada.
     */
    public static void setStandardBorder(JFormattedTextField field){
        field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }
    
    /**
     * Transforma a borda de uma determinada JComboBox na borda padrão
     * no caso LineBorder, cinza.
     * @param cb Parâmetro que recebe a JComboBox que terá a borda mudada.
     */
    public static void setStandardBorder(JComboBox cb){
        cb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }
    
    /**
     * Transforma a borda de um determinado JTextField para uma de alerta para algo errado.
     * @param field Parâmetro que recebe o JTextField que terá a borda mudada.
     */
    public static void setWarningBorder(JTextField field){
        field.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
    }
    
    /**
     * Transforma a borda de um determinado JFormattedTextField para uma de alerta para algo errado.
     * @param field Parâmetro que recebe o JFormattedTextField que terá a borda mudada.
     */
    public static void setWarningBorder(JFormattedTextField field){
        field.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
    }
    
    /**
     * Transforma a borda de uma determinada JComboBox para uma de alerta para algo errado.
     * @param cb Parâmetro que recebe a JComboBox que terá a borda mudada.
     */
    public static void setWarningBorder(JComboBox cb){
        cb.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
    }
    
    
    /****************************** MÉTODOS PARA VERIFICAÇÃO DE ENTRADA *******************************/
    
    /**
     * Recebe um evento KeyTyped no qual bloqueia a inserção de qualquer
     * caracter que não seja "0123456789"
     *
     * @param evt Parâmetro que recebe o KeyEvent
     */
    public static void onlyNumbers(java.awt.event.KeyEvent evt) {
        if (!numbers.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }
    
    /**
     * Recebe um evento KeyTyped no qual bloqueia a inserção de qualquer
     * caracter que não seja uma letra.
     *
     * @param evt Parâmetro que recebe o KeyEvent
     */
    public static void onlyLetters(java.awt.event.KeyEvent evt) {
        if (!Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
    }
    
    
    /****************************** MÉTODOS NÃO RELACIONADOS ESPECIFICAMENTE AO JFRAME *******************************/
    
    /**
     * Pega a data atual formatada em ddMMyyyy, exemplo 12081999
     *
     * @return Retorna a String da data atual formatada
     */
    public static String getDataAtual() {
        Date data = new Date(System.currentTimeMillis());
        SimpleDateFormat formatador = new SimpleDateFormat("ddMMyyyy");
        return formatador.format(data);
    }
    
    /**
     * Verifica uma String procurando se há uma letra
     * @param stg String que será verificada
     * @return True se houver uma letra na String e false se não tiver
     */
    public static boolean containsLetter(String stg){
        for(int x = 0; x < stg.length(); x++){
            if(Character.isLetter(stg.charAt(x)))
                return true;
        }
        return false;
    }
    
    /**
     * Verifica uma String procurando se há um número
     * @param stg String que será verificada
     * @return True se houver um número na String e false se não tiver
     */
    public static boolean containsNumber(String stg){
        for(int x = 0; x < stg.length(); x++){
            if(numbers.contains(stg.charAt(x)+""))
                return true;
        }
        return false;
    }
}
