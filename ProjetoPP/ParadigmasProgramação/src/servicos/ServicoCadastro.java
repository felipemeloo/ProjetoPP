package servicos;

import daos.IUsuarioDao;
import daos.UsuarioDao;
import dominio.Usuario;

public class ServicoCadastro {
    private IUsuarioDao usuarioDao;

    public ServicoCadastro() {
        this.usuarioDao = new UsuarioDao();
    }

    public void cadastrar(String cpf, String email, String nome, String senha, String instituicao, String fone, String matricula) {
        usuarioDao.inserir(new Usuario(cpf, email, nome, senha, instituicao, fone, matricula));
    }
}
