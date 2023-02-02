package br.ufjf.dcc.poo.model;

public class ItensPedidos {
	private int quantidade;
	private double preco;
	private Pedido pedido;
	private Produto produto;
	
	public int incluirItem() {
		return 0;
	}
	public int excluirItem() {
		return 0;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
