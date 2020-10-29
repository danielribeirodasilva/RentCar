package model;

import java.sql.Connection;
import data.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.TelaLogin;
import view.TelaPrincipal;

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
                TelaPrincipal principal = new TelaPrincipal();
                principal.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Login ou senha invalidos, tente de novo!");
                TelaLogin lg = new TelaLogin();
                lg.Limpar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    
}
