package br.com.adryan.vendinha;

public class Cliente {
	
	// Long id
		private String nome;

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
