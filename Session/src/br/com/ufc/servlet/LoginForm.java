package br.com.ufc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginFormulario") // Mapear o Servlet para que ele seja acessado a partir da raiz da aplicação {Pode ser feito no XML}
public class LoginForm extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * O objetivo dessa página é apenas despachar o cliente para outra página, para que assim eu não tenha que sempre digitar o .html
		 * Para encaminhar via HTTP, posso usar o sendRedirect("url")
		 * Tem também o RequestDispatcher rd = request.getRequestDispatcher(String path);
		 * {?} sendRedirect("url") VS RequestDispatcher
		 * */
		
		// Criando um despachante, indicando para onde ele vai despachar (URL) o cliente 
		RequestDispatcher rd = request.getRequestDispatcher("resources/login.html");
		// Realizar o redirecionamento, passando a request e reponse para tratar isso depois
		rd.forward(request, response);
	}

}
