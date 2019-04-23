package br.com.ufc.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.ufc.model.Pessoa;

public class PessoaDao {
	private List<Pessoa> pessoas;
	
	public PessoaDao() {
		pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("guilherme", "123"));
		pessoas.add(new Pessoa("cobblepot", "729"));
	}
	
	public Pessoa buscarPessoa(String username, String password) {
		Pessoa pessoa = new Pessoa(username, password);
		return pessoas.contains(pessoa) ? pessoa : null; // Compara a referência
	}
}
