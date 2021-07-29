package br.com.adryan.vendinha;

import java.math.BigDecimal;

import br.com.adryan.vendinha.Cliente;
import br.com.adryan.vendinha.Compra;
import br.com.adryan.vendinha.Produto;
import br.com.adryan.vendinha.ItemCompra;

public class App {

public static void main(String[] args) {
    	
    	Produto p1 = new Produto("Mouse ReDragon Cobra", BigDecimal.valueOf(115));
    	Produto p2 = new Produto("Monitor 165hz", BigDecimal.valueOf(1500.99));
    	Produto p3 = new Produto("Volante G29", BigDecimal.valueOf(2399.99));
    	Produto p4 = new Produto("Coquinha Gelada", BigDecimal.valueOf(4.99));
    	Produto p5 = new Produto("Miojo Saudável", BigDecimal.valueOf(1.99));
    	
    	Cliente carlos = new Cliente("Adryan");
    	
    	Compra c = carlos.comprar(p1, 1);
    	c.addProduto(p2, 2);
    	c.addProduto(p3, 1);
    	c.addProduto(p4, 2);
    	c.addProduto(p5, 4);
    	
    	System.out.println("Cliente....: " + c.getCliente().getId() + " - " + c.getCliente().getNome());
    	for (ItemCompra i : c.getItens()) {
			System.out.println("");
    		System.out.println("Produto....: " + i.getProduto().getId() + " - " + i.getProduto().getNome());
    		System.out.println("Qtd........: " + i.getQtd());
    		System.out.println("Valor UN...: " + i.getProduto().getValor());
    		System.out.println("Total......: " + i.getTotal());
		}
    	System.out.println("Total G....: " + c.getTotal());
    }
}