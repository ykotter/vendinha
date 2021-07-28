package br.com.adryan.vendinha;

import java.math.BigDecimal;

public class Compra {
	
	private Cliente cliente;
	private Produto produto;
	private Integer qtd;
	private BigDecimal total;

	public Compra(Cliente c, Produto p, Integer qtd) {
		this.cliente = c;
		this.produto = p;
		this.qtd = qtd;
		this.total = p.getValor().multiply(BigDecimal.valueOf(qtd));
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public Integer getQtd() {
		return qtd;
	}

	public BigDecimal getTotal() {
		return total;
	}
}
