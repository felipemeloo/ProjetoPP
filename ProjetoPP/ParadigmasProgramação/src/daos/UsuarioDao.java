package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dominio.Usuario;



public class UsuarioDao implements IUsuarioDao {
    private Conexao conexao;
    public Connection con = null;

    public UsuarioDao() {
        this.conexao = new Conexao();
    }
    @Override
    public void inserir(Usuario u) {
        String sql = "INSERT INTO usuario" + "(cpf, email, nome, senha, instituicao, fone, matricula)" + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        initConexao();
        try {
        PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, u.getCpf());
            stm.setString(2, u.getEmail());
            stm.setString(3, u.getNome());
            stm.setString(4, u.getSenha());
            stm.setString(5, u.getInstituicao());
            stm.setString(6, u.getFone());
            stm.setString(7, u.getMatricula());
//            stm.setString(8, u.getTipo());
            stm.executeUpdate();
            stm.close();
       
        } catch (SQLException e) {
            throw  new RuntimeException("Não foi possível executar o acesso ao banco de dados", e);
        }
    }

    @Override
    public Usuario recuperar(String login) {
        Usuario resultado = null;
        String sql = "SELECT * FROM usuario WHERE login = ?";
        initConexao();

        try(PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, login);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                resultado = constroiUsuario(rs);
            }
        } catch (SQLException e) {
            throw  new RuntimeException("Não foi possível executar o acesso ao banco de dados", e);
        }

        return resultado;
    }

    private Usuario constroiUsuario(ResultSet rs) {
        try {
            return new Usuario(
            rs.getString("cpf"),
            rs.getString("senha"),
            rs.getString("email"),
            rs.getString("fone"),
            rs.getString("matricula"),
            rs.getString("instituicao"),
//            rs.getString("tipo"),
            rs.getString("nome"));
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao carregar entidade do banco", e);
        }
    }
    public void initConexao() {
    if(con==null) {
    con=new Conexao().getConexao();
    }
    }
}
