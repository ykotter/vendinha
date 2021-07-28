package br.com.adryan.vendinha;

import java.math.BigDecimal;

import br.com.adryan.vendinha.Cliente;
import br.com.adryan.vendinha.Compra;
import br.com.adryan.vendinha.Produto;

public class App {

    public static void main(String[] args) {
    	
    	Produto p1 = new Produto("Café", BigDecimal.valueOf(2.53));
    	Produto p2 = new Produto("RXT 4098 TI", BigDecimal.valueOf(1985488.53));
    	Produto p3 = new Produto("Monitor Alienware", BigDecimal.valueOf(15.98));
    	
    	Cliente carlos = new Cliente("Carlos");
    	
    	Compra c = carlos.comprar(p1, 4);
    	
    	System.out.println("Cliente....: " + c.getCliente().getNome());
    	System.out.println("Produto....: " + c.getProduto().getNome());
    	System.out.println("Qtd........: " + c.getQtd());
    	System.out.println("Valor UN...: " + c.getProduto().getValor());
    	System.out.println("Total......: " + c.getTotal());
    }
}