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
import javax.swing.JOptionPane;
import model.Fornecedor;

/**
 *
 * @author Felipe
 */
public class FornecedorDAO {
    Fornecedor fornecedor;
    private Connection con;

    public FornecedorDAO(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
        this.con = new ConnectionFactory().getConnection();
    }

    public FornecedorDAO() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    
    
    public void cadastrar(Fornecedor fnc) throws SQLException {
        String sql = "insert into fornecedor (nome) values ('" + fnc.getNome() + "')";
        Statement stmt = con.createStatement();
        stmt.execute(sql);
        stmt.close();
    }
    
    public ArrayList<Fornecedor> buscarTudo() throws SQLException {
        ArrayList<Fornecedor> f = new ArrayList<>();
        String sql = "select * from fornecedor";        
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rse = stmt.executeQuery();
        while (rse.next()) {
            f.add(new Fornecedor(Integer.parseInt(rse.getString("idfornecedor")),rse.getString("nome")));
        }
        stmt.close();
        return f;
    }
    
    public int getLastCode() throws SQLException{
        ArrayList<Fornecedor> f = new ArrayList<>();
        String sql = "select * from fornecedor where idfornecedor = (select max(idfornecedor) from fornecedor);";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rse = stmt.executeQuery();
        while (rse.next()) {
            f.add(new Fornecedor(Integer.parseInt(rse.getString("idfornecedor")),rse.getString("nome")));
        }
        stmt.close();
        return f.get(0).getIdfornecedor();
    }
}
