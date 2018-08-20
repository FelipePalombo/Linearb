/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.FornecedorDAO;

/**
 *
 * @author Felipe
 */
public class Fornecedor {
    private int idfornecedor;
    private String nome;

    public Fornecedor(int idfornecedor, String nome) {
        this.idfornecedor = idfornecedor;
        this.nome = nome;       
    }
    
    public Fornecedor(String nome) {
        this.nome = nome;
    }

    public Fornecedor() {
    }

    public int getIdfornecedor() {
        return idfornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "idfornecedor=" + idfornecedor + ", nome=" + nome + '}';
    }
    
    
}
