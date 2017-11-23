package dominio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Professor extends Usuario {
	
	private Connection conection;
	public List<Aluno> getlistaChamada(){
		try {
		List<Aluno> alunos = new ArrayList<Aluno>();
		PreparedStatement stmt = (PreparedStatement) this.conection.prepareStatement("select * from alunos");
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			Aluno aluno = new Aluno();
			aluno.setMatricula("matricula");
			aluno.setNome("nome");
			aluno.setCpf("cpf");
			
			aluno.inserir(aluno);
		}
		rs.close();
		stmt.close();
		return alunos;
		} catch (SQLException e) {
	         throw new RuntimeException(e);
	}
	
	}
}
