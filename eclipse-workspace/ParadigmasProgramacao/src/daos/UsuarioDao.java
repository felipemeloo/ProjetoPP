package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dominio.Usuario;



public class UsuarioDao implements IUsuarioDao {
    private Connection conexao;

    public UsuarioDao() {
        this.conexao = new Conexao().getConexao();
    }
    @Override
    public void inserir(Usuario u) {
        String sql = "INSERT INTO usuario" + "(cpf, email, nome, senha, instituicao, fone, matricula, tipo)" + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
        	PreparedStatement stm = conexao.prepareStatement(sql);
            stm.setString(1, u.getCpf());
            stm.setString(2, u.getEmail());
            stm.setString(3, u.getNome());
            stm.setString(4, u.getSenha());
            stm.setString(5, u.getInstituicao());
            stm.setString(6, u.getFone());
            stm.setString(7, u.getMatricula());
            stm.setString(8, u.getTipo());
            stm.executeUpdate();
            stm.close();
       
        } catch (SQLException e) {
            throw  new RuntimeException("Não foi possível executar o acesso ao banco de dados", e);
        }
    }
	@Override
	public Usuario recuperar(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}
	

   /* @Override
    public Usuario recuperar(String cpf) {
        Usuario resultado = null;
        String sql = "SELECT * FROM usuario WHERE cpf = ?";

        try(PreparedStatement stm = conexao.getConexao().prepareStatement(sql)) {
            stm.setString(1, cpf);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                //resultado = constroiUsuario(rs);
            }
        } catch (SQLException e) {
            throw  new RuntimeException("Não foi possível executar o acesso ao banco de dados", e);
        }

        return resultado;
    }*/

/*    private Usuario constroiUsuario(ResultSet rs) {
        try {
            return new Usuario(
                    rs.getString("cpf"),
                    rs.getString("email"),
                    rs.getString("nome"),
                    rs.getString("senha"),
                    rs.getString("instituicao"),
                    rs.getString("fone"),
                    rs.getString("matricula"),
                    rs.getString("tipo")
            );
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao carregar entidade do banco", e);
        }
    }*/
    
    
    

}