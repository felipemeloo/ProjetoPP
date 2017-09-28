package daos;

import dominio.Usuario;


public interface IUsuarioDao {
    public void inserir(Usuario u);
    public Usuario recuperar(String cpf);

}
