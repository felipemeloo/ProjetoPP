package dominio;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Aluno extends Usuario {
	private Connection conexao;
	
	public void inserir(Aluno u) {
        String sql = "INSERT INTO usuario" + "(cpf, email, nome, senha, instituicao, fone, matricula, tipo)" + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
        	PreparedStatement stm = conexao.prepareStatement(sql);
            stm.setString(1, u.getCpf());
            stm.setString(3, u.getNome());
            stm.setString(7, u.getMatricula());
            stm.close();
       
        } catch (SQLException e) {
            throw  new RuntimeException("Não foi possível executar o acesso ao banco de dados", e);
        }
    }

}
