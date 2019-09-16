package Controller;

import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioController {
    
    public boolean login(Usuario usuario){
        
        String comando = "SELECT * FROM usuarios WHERE login = ? AND senha = ?";
        
        try{
            
            Connection conexao = ConnectionFactory.getConnection();
            PreparedStatement ps = conexao.prepareStatement(comando);

            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            
            ResultSet resultado = ps.executeQuery();
            
            return resultado.next();
            
        }catch(SQLException e){
            return false;
        }
    }
}
