<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
  <head>
    <title>Login</title>
  </head>
  <body>
    <form action="logar" method="post">
      CPF: <input type="text" name="cpf" />
      Password: <input type="password" name="senha" />
      <input type="submit" value="Entrar" />
    </form>

    <c:if test="${erro != null}">
      <p>${erro}</p>
    </c:if>

    <p>
      Para se cadastrar, clique <a href="cadastro.jsp">aqui</a>
    </p>
  </body>
</html>