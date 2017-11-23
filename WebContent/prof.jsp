<html>
  <head>
    <title>Professor</title>
    <style>
	.texto{    
		 margin-top: 138px;
			text-align: center;
		}
		
		p.sansserif {
    			font-family: Arial, Helvetica, sans-serif;
			}

 	
	body { 
  	color: grey; 
		}


input[type=text], select {
    width: 70%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
input[type=submit] {
    width: 60%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}
.page-bg {
  background: url(' http://www.brockpress.com/wp-content/uploads/2015/01/Edu-school-books.jpg');
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

body {
  font-family: "Arial";
 
}


</style>
  </head>
  <body> 
	<img src=" https://lh5.googleusercontent.com/proxy/bmR_KPT9JF4PohoeG6RW50JVGjXSwTtg-lbnjztlZjkdoMIadbtpO_qlml7YQ3y_gt5wXDkldP67aR7yMXKDwJCQKQAwDa9uW_s4WTCY=w5000-h5000" width="400px";  margin-left = "460px"; >
<div class="page-bg">
</div>
<div id="caixinha">
	<div><h1>Página do Professor</h1>
      <form action="logar" method="post">
	 <label for="cursos">Cursos  </label>
    <select id="cursos" name="cursos">
      <option value="ABI">ABI- Ciência da Computação</option>
      <option value="fisica"> Licenciatura em Física</option>
      <option value="automacao">Automação Industrial</option>
      <option value="design">Design de Moda</option>
    </select>

      <div> <input type="submit" value="Procurar" /> </div>
<p>
      Para sair, clique <a href="login.jsp">aqui</a>
    </p>
    </form>

    <c:if test="${erro != null}">
      <p>${erro}</p>
    </c:if>
</div>
</div>
    
  </body>
</html>