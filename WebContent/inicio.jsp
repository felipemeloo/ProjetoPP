<html>
  <head>
    <title>Login</title>
	<style>
	.texto{    
		 margin-top: 70px;
			text-align: center;
		}
		
		p.sansserif {
    			font-family: Arial, Helvetica, sans-serif;
			}

 	
	body { 
  	color: grey; 
		}
	input[type=submit] {
    width: 50%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}
input[type=text], select {
    width: 70%;
    padding: 12px 20px;
    margin: 10px 0;
    display: inline-block;
    border: 2px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
input[type=password], select {
    width: 70%;
    padding: 12px 20px;
    margin: 10px 0;
    display: inline-block;
    border: 2px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
} 
.page-bg {
  background: url('https://abrilveja.files.wordpress.com/2016/05/reitoria-3-original1.jpeg?quality=70&strip=info&w=999');
background-size: cover;
  -webkit-filter: blur(5px);
  -moz-filter: blur(5px);
  -o-filter: blur(5px);
  -ms-filter: blur(5px);
  filter: blur(5px);
  position: fixed;
  width: 100%;
  height: 100%;
  top: 0;
  left: 0;
  z-index: -1;
}
div {
    border-radius: 40px;
    background-color: #f2f2f2;
    padding: 8px;
    width:  60%;
    margin: 0 auto;
   
}
#caixinha {
    opacity: 0.8;
}

	</style>
  </head>
  <body>
	<img src="https://lh5.googleusercontent.com/proxy/bmR_KPT9JF4PohoeG6RW50JVGjXSwTtg-lbnjztlZjkdoMIadbtpO_qlml7YQ3y_gt5wXDkldP67aR7yMXKDwJCQKQAwDa9uW_s4WTCY=w5000-h5000" width="400px";  margin-left = "460px"; >
<div class="page-bg">
</div>
<div id="caixinha">	
	<div class= "texto">
    <form action="logar" method="post">
	<h1> <center> Sistema de Gestão Acadêmica</h1>
	
      <p class="sansserif"> Login <p> <input type="text" name="login" placeholder=" CPF.." />
     <p class="sansserif"> Senha <p>  <input type="password" name="senha" placeholder="Senha.." />
      <div> <input type="submit" value="Entrar" /> </div>
    </form>

    <c:if test="${erro != null}">
      <p>${erro}</p>
    </c:if>

    <p class="sansserif">
      Para se cadastrar, clique <a href="cadastro.jsp">aqui</a>
    </p>
	</div>
	</div>
  </body>
</html>