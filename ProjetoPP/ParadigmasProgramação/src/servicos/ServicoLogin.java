package servicos;


import daos.IUsuarioDao;
import daos.UsuarioDao;
import dominio.Usuario;

public class ServicoLogin {
    IUsuarioDao usuarioDao;


    public ServicoLogin() {
        this.usuarioDao = new UsuarioDao();
       
    }

    public Usuario logar(String login, String senha) {
        Usuario usuario = usuarioDao.recuperar(login);

        if (usuario == null || !usuario.getSenha().equals(senha)) {
            return null;
        }

        return usuario;
    }
}
