package br.com.adryan.vendinha;

import java.util.Random;

public class Cliente {
	
	private String nome;
	Random r = new Random();
	private Long id = r.nextLong();

	public Long getClienteId() {
		if (id < 0) {
			id = id * -1;
		}
	    return id;
	}
	
	public Cliente(String nome) {
		this.nome = nome;
	}

	public Compra comprar(Produto p, Integer qtd) {
		return new Compra(this, p, qtd);
	}
		
	public String getNome() {
		return nome;
	}
}
