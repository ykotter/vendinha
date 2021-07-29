package br.com.adryan.vendinha;

import java.util.SplittableRandom;

public class Cliente {
	
	private Long id;
	private String nome;

	public Cliente(String nome) {
		this.id = new SplittableRandom().nextLong(1, Long.MAX_VALUE);
		this.nome = nome;
	}

	public Compra comprar(Produto p, Integer qtd) {
		return new Compra(this, p, qtd);
	}
	
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
}

