package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Produto {
	private int pkProduto;
	private int codProduto;
	private String nome;
	private String descricao;
	private String unidade;
	private float precoUnitario;
	private ArrayList<Pedido> pedidos = new ArrayList<>();

	
	
	public int getPkProduto() {
		return pkProduto;
	}
	public void setPkProduto(int pkProduto) {
		this.pkProduto = pkProduto;
	}
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public float getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(float precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}
