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
public class Produto {
    private int idproduto;
    private String nome;
    private double preco;
    private String dataentrada;
    private String datavalidade;
    private Fornecedor fornecedor;
    private Saida saida;
    private String status;

    public Produto(int idproduto, String nome, double preco, String dataentrada, String datavalidade, Fornecedor fornecedor) {
        this.idproduto = idproduto;
        this.nome = nome;
        this.preco = preco;
        this.dataentrada = dataentrada;
        this.datavalidade = datavalidade;
        this.fornecedor = fornecedor;
    }

    public Produto(String nome, double preco, String dataentrada, String datavalidade, Fornecedor fornecedor) {
        this.nome = nome;
        this.preco = preco;
        this.dataentrada = dataentrada;
        this.datavalidade = datavalidade;
        this.fornecedor = fornecedor;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDataentrada() {
        return dataentrada;
    }

    public void setDataentrada(String dataentrada) {
        this.dataentrada = dataentrada;
    }

    public String getDatavalidade() {
        return datavalidade;
    }

    public void setDatavalidade(String datavalidade) {
        this.datavalidade = datavalidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public void setSaida(Saida saida){
        this.saida = saida;
    }

    public Saida getSaida() {
        return saida;
    }
    
    @Override
    public String toString() {
        return "Produto{" + "idproduto=" + idproduto + ", nome=" + nome + ", preco=" + preco + ", dataentrada=" + dataentrada + ", datavalidade=" + datavalidade + ", fornecedor=" + fornecedor + '}';
    }
    
    
}
