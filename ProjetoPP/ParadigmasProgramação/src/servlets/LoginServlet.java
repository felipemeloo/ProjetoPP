package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Usuario;
import servicos.ServicoLogin;

@WebServlet("/logar")
public class LoginServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3282193949240670250L;

	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("cpf");
        String senha = req.getParameter("senha");
        Usuario usuarioLogado = new ServicoLogin().logar(login, senha);

        if (usuarioLogado != null) {
            req.getSession().setAttribute("usuarioLogado", usuarioLogado.getCpf());
            resp.sendRedirect("/listagemTopicos");
        } else {
            req.setAttribute("erro", "login e/ou senha inválido(s)");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
    }
}