<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Cadastro</title>
</head>
<body>
    <form action="/cadastrar" method="post">
        Nome: <input type="text" name="nome" />
        Login: <input type="text" name="login" />
        Email: <input type="text" name="email" />
        Matricula: <input type="text" name="matricula" />
        Instituicao: <input type="text" name="instituicao" />
        Phone: <input type="text" name="fone"/>
        Senha: <input type="password" name="senha" />
        <input type="submit" value="Cadastrar" />
    </form>
</body>
</html>