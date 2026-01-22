package br.com.mercado.servico;

import java.util.ArrayList;
import br.com.mercado.modelo.Produto;

public class GerenciadorEstoque {
	
	//lista para armazenar os produtos
	
	private ArrayList<Produto> listaDeProdutos = new ArrayList<>();
	
	//metodo para adicionar um produto a lista
	
	public void adicionar(Produto p) {
		listaDeProdutos.add(p);
		System.out.println("Produto " + p.getNome() + " adicionado com sucesso!");
	}
	
	//metodo para listar os produtos
	
	public void listarTudo() {
		if (listaDeProdutos.isEmpty()) {
			System.out.println("O estoque esta vazio.");
		} else {
			System.out.println("- Lista de Estoque -");
			
			for (Produto p : listaDeProdutos) {
				System.out.println(p);
			}
		}
	}
	
	
	
}
