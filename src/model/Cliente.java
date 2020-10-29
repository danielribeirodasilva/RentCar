package model;

import java.sql.Connection;
import data.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Cliente {

    public int cliente_id;
    public String nome;
    public String valido;
    
    public void Buscar(String nome, String cpf, String nascimento){
        String cpf1 = cpf.replace(".", "");
        String novocpf = cpf1.replace("-", "");
        String nasc = nascimento.replace("/", "");
        Connection con = new ConnectionFactory().getConnection();
        String busca = "select cliente_id,nome,cpf,nascimento,ativo from cliente where cpf = ? order by cliente_id asc";
        try {
            PreparedStatement pst = con.prepareStatement(busca);
            pst.setString(1, novocpf);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                cliente_id = rs.getInt("cliente_id");
                nome = rs.getString("nome");
                valido = rs.getString("ativo");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Inserir(String nome, String cpf, String nascimento, String ativo){
        String cpf1 = cpf.replace(".", "");
        String novocpf = cpf1.replace("-", "");
        String nasc = nascimento.replace("/", "");
        Connection con = new ConnectionFactory().getConnection();
        String sql = "insert into cliente (nome,cpf,nascimento,ativo) values (?,?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, novocpf);
            pst.setString(3, nasc);
            pst.setString(4, ativo);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cliente " + nome + " cadastrado com sucesso!");
            pst.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public void Alterar(String nome, String cpf, String nascimento, String ativo){
        String cpf1 = cpf.replace(".", "");
        String novocpf = cpf1.replace("-", "");
        String nasc = nascimento.replace("/", "");
        Connection con = new ConnectionFactory().getConnection();
        String sql = "select cliente_id from cliente where cpf = ?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, novocpf);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                cliente_id = rs.getInt(1);
                String muda = "update cliente set nome = ?, cpf = ?, nascimento = ?, ativo = ? where cliente_id = " + cliente_id;
                PreparedStatement ps = con.prepareStatement(muda);
                ps.setString(1, nome);
                ps.setString(2, novocpf);
                ps.setString(3, nasc);
                ps.setString(4, ativo);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cliente " + nome + " atualizado com sucesso!");
                ps.close();
                con.close();                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public void Apagar(String nome, String cpf){
        String cpf1 = cpf.replace(".", "");
        String novocpf = cpf1.replace("-", "");
        Connection con = null;
        PreparedStatement del = null;
        con = new ConnectionFactory().getConnection();
        String apg =  "delete from cliente where nome = ? and cpf = ?";
        try {
            del = con.prepareStatement(apg);
            del.setString(1, nome);
            del.setString(2, novocpf);
            del.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente foi deletado da base de dados!");
            del.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }        



    
}
