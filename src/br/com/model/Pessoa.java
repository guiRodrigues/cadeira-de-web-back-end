package br.com.model;

public class Pessoa {

	private String nome;
	private String time;
	private String hobie;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String time, String hobie) {
		super();
		this.nome = nome;
		this.time = time;
		this.hobie = hobie;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHobie() {
		return hobie;
	}

	public void setHobie(String hobie) {
		this.hobie = hobie;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", time=" + time + ", hobie=" + hobie + "]";
	}

}
