package br.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dao.PessoaDAO;
import br.com.model.Pessoa;

@WebServlet("/adicionarPessoa") //Mapear para atender ao action do fromulario.html
public class AdicionarPessoa extends HttpServlet {
	
	/*
	 * Diferenças entre utilizar o método GET e POST:
	 * performance: GET é relativamente mais rápido
	 * limitação: GET é limitado pela URL
	 * envio dos dados: GET envia pela URL e POST encapsula na requisição HTTP
	 * */
	
	/*
	 * "pegar" do formulário utilizando o método GET
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	*/
	
	/*
	 * "pegar" do formulário usando o método POST
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	*/
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// HttpServletResponse response ---- encapsula os dados vindos da requisição, podemos assim saber os dados da requisição
		
		// informações relativas ao objeto Pessoa
		String nome = request.getParameter("nome");
		String time = request.getParameter("time");
		// String hobie = request.getParameter("hobies");
		String hobie = "";
		switch (request.getParameter("hobies")) {
		case "jogar":
			hobie = "Jogar";
			break;
		case "cantar":
			hobie = "Cantar";
			break;
		case "correr":
			hobie = "Correr";
			break;
		default:
			break;
		}
		
		// instanciar a pessoa
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setTime(time);
		pessoa.setHobie(hobie);
		
		// realizar a manipulação dos dados da pessoa (salvar)
		/*
		 * Utilizando o padrão de projeto DAO (Objeto de acesso a dados)
		 * - esse padrão me provê uma uma interface para a abstração ao acesso dos dados
		 * - encapsula o acesso aos dados (
		 * */
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.cadastrarPessoa(pessoa);
		
		PrintWriter out = response.getWriter();
		
		out.println("Lista: " + pessoaDAO.toString());
		
	}
}
