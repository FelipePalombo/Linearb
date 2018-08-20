/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Felipe
 */
public class Saida {
    private Produto produto;
    private String descsaida;
    private String datasaida;

    public Saida(String descsaida, String datasaida) {
        this.descsaida = descsaida;
        this.datasaida = datasaida;
    }

    public String getDescsaida() {
        return descsaida;
    }

    public void setDescsaida(String descsaida) {
        this.descsaida = descsaida;
    }

    public String getDatasaida() {
        return datasaida;
    }

    public void setDatasaida(String datasaida) {
        this.datasaida = datasaida;
    }

    @Override
    public String toString() {
        return "Saida{" + "descsaida=" + descsaida + ", datasaida=" + datasaida + '}';
    }
    
    
}
