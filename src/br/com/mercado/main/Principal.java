package br.com.mercado.main;

import java.util.Scanner;
import br.com.mercado.modelo.Produto;
import br.com.mercado.servico.GerenciadorEstoque;

public class Principal {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		GerenciadorEstoque gerenciador = new GerenciadorEstoque();
		int opcao = 0;
		
		while (opcao != 3) {
			System.out.println("\n- Menu mercado -");
			System.out.println("1 - Adicionar Produto");
			System.out.println("2 - Listar Estoque");
			System.out.println("3 - Sair");
			System.out.print("Escolha uma opcao: ");
			opcao = leitura.nextInt();
			leitura.nextLine(); //limpa o buffer do teclado
			
			if (opcao == 1) {
				System.out.print("Nome do produto: ");
				String nome = leitura.nextLine();
				System.out.print("Preço (digite apenas números): ");
				double preco = leitura.nextDouble();
				System.out.print("Quantidade: ");
				int qtd = leitura.nextInt();
				
				Produto novoProduto = new Produto(nome, preco, qtd);
				gerenciador.adicionar(novoProduto);
			} else if (opcao == 2) {
				gerenciador.listarTudo();
				
			}			
		}
		System.out.println("Sistema encerrado");
		leitura.close();
	}
}
