package servlets;

import servicos.ServicoCadastro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.UsuarioDao;
import dominio.Usuario;

import java.io.IOException;

@WebServlet("/cadastrar")
public class CadastroServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cpf = req.getParameter("cpf");
        String email = req.getParameter("email");
        String nome = req.getParameter("nome");
        String senha = req.getParameter("senha");
        String instituicao = req.getParameter("instituicao");
        String fone = req.getParameter("fone");
        String matricula = req.getParameter("matricula");
        String tipo = req.getParameter("tipo");

        //new ServicoCadastro().cadastrar(cpf, email, nome, senha, instituicao, fone, matricula, tipo);
        Usuario usuario = new Usuario();
        usuario.setCpf(cpf);
        usuario.setEmail(email);
        usuario.setFone(fone);
        usuario.setInstituicao(instituicao);
        usuario.setMatricula(matricula);
        usuario.setNome(nome);
        usuario.setSenha(senha);
        usuario.setTipo(tipo);
        
        UsuarioDao usuarioDao = new UsuarioDao();
        usuarioDao.inserir(usuario);
        
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}