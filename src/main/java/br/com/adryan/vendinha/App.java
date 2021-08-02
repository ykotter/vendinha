package br.com.adryan.vendinha;

import java.math.BigDecimal;

import br.com.adryan.vendinha.Cliente;
import br.com.adryan.vendinha.Compra;
import br.com.adryan.vendinha.Produto;
import br.com.adryan.vendinha.ItemCompra;
import br.com.adryan.vendinha.EnumStatusPagamento;

public class App {

public static void main(String[] args) {
    	
    	Produto p1 = new Produto("Mouse ReDragon Cobra", BigDecimal.valueOf(115));
    	Produto p2 = new Produto("Monitor 165hz", BigDecimal.valueOf(1500.99));
    	Produto p3 = new Produto("Volante G29", BigDecimal.valueOf(2399.99));
    	Produto p4 = new Produto("Coquinha Gelada", BigDecimal.valueOf(4.99));
    	Produto p5 = new Produto("Miojo Saudável", BigDecimal.valueOf(1.99));
    	
    	Cliente adryan = new Cliente("Adryan");
    	
    	Compra c = adryan.comprar(p1, 1);
    	c.addProduto(p2, 2);
    	c.addProduto(p3, 1);
    	c.addProduto(p4, 2);
    	c.addProduto(p5, 4);
    	
    	c.pagar(BigDecimal.valueOf(0));
    	//c.getStatusPagamento();
    	
    	System.out.println("-----------------------------------------------------------");
    	System.out.println("CLIENTE");
    	System.out.println("\nCliente.......: " + c.getCliente().getId() + " -> " + c.getCliente().getNome());
    	System.out.println("-----------------------------------------------------------");
    	System.out.println("CARRINHO");
    	for (ItemCompra i : c.getItens()) {
			System.out.println("");
    		System.out.println("Produto.......: " + i.getProduto().getId() + " -> " + i.getProduto().getNome());
    		System.out.println("Quantidade....: " + i.getQtd());
    		System.out.println("Valor.........: " + i.getProduto().getValor());
    		System.out.println("Total.........: " + i.getTotal());
		}
    	System.out.println("\nTotal Compra..: " + c.getTotal());
    	System.out.println("-----------------------------------------------------------");
    	System.out.println("PAGAMENTO");
    	System.out.println("\nTroco.........: " + c.pagar(BigDecimal.valueOf(5534.92)));
    	//System.out.println("Status compra.: " + c.getStatusPagamento());
    	System.out.println("Data..........: " + c.getDataCompra());
    	System.out.println("-----------------------------------------------------------");
    }
}