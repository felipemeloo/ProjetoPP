package servlets;

import dominio.Usuario;
import servicos.ServicoLogin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/logar")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("cpf");
        String senha = req.getParameter("senha");
        Usuario usuarioLogado = new ServicoLogin().logar(cpf, senha);

        if (usuarioLogado != null) {
            req.getSession().setAttribute("usuarioLogado", usuarioLogado.getCpf());
            resp.sendRedirect("/listagemTopicos");
        } else {
            req.setAttribute("erro", "login e/ou senha inválido(s)");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
    }
}