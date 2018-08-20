/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import model.Produto;

/**
 *
 * @author Felipe
 */
public class ProdutoDAO {
    private Connection con;
    private Produto produto;

    public ProdutoDAO(Produto produto) {
        this.con = new ConnectionFactory().getConnection();
        this.produto = produto;
    }

    public ProdutoDAO() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void cadastrar(Produto produto) throws SQLException{
        String sql = "insert into produto(nome, preco, dataentrada, datavalidade, id_fornecedor, status)"
                + "values ('"+produto.getNome()+"',"+produto.getPreco()+","+"'"+produto.getDataentrada()+"',"+"'"
                + produto.getDatavalidade()+"',"+produto.getFornecedor().getIdfornecedor()+"'Ativo'"
                + ")";
        Statement stmt = con.createStatement();
        stmt.execute(sql);
        stmt.close();
    }
    
    
}
