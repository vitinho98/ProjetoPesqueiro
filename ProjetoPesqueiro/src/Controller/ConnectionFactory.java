package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    public static Connection getConnection(){
        
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/pesqueiro", "root", "<SENHA DO BANCO AQUI>");
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
