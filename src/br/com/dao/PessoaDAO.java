package br.com.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.model.Pessoa;

public class PessoaDAO {
	
	// criar a lista de pessoas
	private List<Pessoa> pessoas;
	
	public PessoaDAO() {
		pessoas = new ArrayList<Pessoa>();
	}
	
	public void cadastrarPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
	}

	@Override
	public String toString() {
		return "PessoaDAO [pessoas=" + pessoas.toString() + "]";
	}

}
