package servlets;

import servicos.ServicoCadastro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cadastrar")
public class CadastroServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String cpf = req.getParameter("cpf");
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");
        String instituicao = req.getParameter("instituicao");
        String fone = req.getParameter("fone");
        String matricula = req.getParameter("matricula");

        new ServicoCadastro().cadastrar(cpf, email, nome, senha, instituicao, fone, matricula);

        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}