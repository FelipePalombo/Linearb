/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
                + produto.getDatavalidade()+"',"+produto.getFornecedor().getIdfornecedor()+",'Ativo'"
                + ")";
        Statement stmt = con.createStatement();
        stmt.execute(sql);
        stmt.close();
    }
    
    public int getLastCode() throws SQLException{
        Produto p;
        String sql = "select * from produto where idproduto = (select max(idproduto) from produto);";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rse = pstmt.executeQuery();
        if(rse.next()){
            p = new Produto(Integer.parseInt(rse.getString("idproduto")));
        }else{
            return -1;
        }
        return p.getIdproduto();
    }
}
