package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dominio.Usuario;


public class Conexao {


 
    public Connection getConexao(){
    try {
    //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    return DriverManager.getConnection(
"jdbc:mysql://localhost:3306/forum", "root", "admin");
     } catch (SQLException e) {
         throw new RuntimeException(e);
     } catch (InstantiationException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (IllegalAccessException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
    return null;
     }
     

}