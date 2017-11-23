package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private final String DATABASE_URL = "jdbc:postgresql://localhost/forum";
    private final String DATABASE_USUARIO = "postgres";
    private final String DATABASE_SENHA = "admin";
    private Connection conexao;

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw  new RuntimeException("Driver do banco de dados não encontrado", e);
        }
    }

    public Connection getConexao() {
        try {
            if (conexao != null) {
                return conexao;
            }

            conexao = DriverManager.getConnection(DATABASE_URL, DATABASE_USUARIO, DATABASE_SENHA);
            return conexao;
        } catch (SQLException e) {
            throw  new RuntimeException("Não foi possível estabelecer uma conexão com o banco de dados", e);
        }
    }
}