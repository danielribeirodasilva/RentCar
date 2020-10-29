package controller;

import java.sql.Connection;
import data.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login {

    public void Logar(String usuario, String senha){
        Connection con = new ConnectionFactory().getConnection();
        String sql = "select * from usuario where usuario = ? and senha = ?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, usuario);
            pst.setString(2, senha);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Benvindo " + usuario + " ao sistema!");
            }else{
                JOptionPane.showMessageDialog(null, "Login ou senha invalidos, tente de novo!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    
}
