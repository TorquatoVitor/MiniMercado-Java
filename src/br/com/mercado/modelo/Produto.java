package br.com.mercado.modelo;

public class Produto {

	private	String nome; 
	private double preco;
	private	int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//getters para permitir que outras classes leiam os dados
	public String getNome() {return nome; }
	public double getPreco() {return preco; }
	public int getQuantidade() {return quantidade; }
	
	//metodo para atulizar o estoque
	public void reduzirEstoque(int qtd) {
		this.quantidade -=qtd;
	}
	
	//metodo para exibir dados no console 
	@Override
	public String toString() {
		return String.format("Produto: %s | Preco: R$ %.2f | Estoque: %d", 
								nome, preco, quantidade);
	}
}




