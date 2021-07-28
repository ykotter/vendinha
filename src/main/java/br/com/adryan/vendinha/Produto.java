package br.com.adryan.vendinha;

import java.math.BigDecimal;

public class Produto {
	
	private String nome;
	private BigDecimal valor;
	
	public Produto(String nome, BigDecimal valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public BigDecimal getValor() {
		return valor;
	}
	
}
