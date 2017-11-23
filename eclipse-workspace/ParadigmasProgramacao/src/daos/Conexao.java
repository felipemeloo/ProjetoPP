package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dominio.Usuario;


public class Conexao {


    public Connection getConexao(){
    	try {
    		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
    			return DriverManager.getConnection(
		 "jdbc:mysql://localhost/forum", "root", "admin");
		     } catch (SQLException e) {
		         throw new RuntimeException(e);
		     }
     }
    

}
