package br.ufjf.dcc.poo.model;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	private int chavePedido;
	private int codPedido;
	private String descricao;
	private Date data;
	private int estKeyCliente;
	private Cliente cliente;
	private ArrayList<Produto> produtos = new ArrayList<>();
	
	public int getChavePedido() {
		return chavePedido;
	}
	public void setChavePedido(int chavePedido) {
		this.chavePedido = chavePedido;
	}
	public int getCodPedido() {
		return codPedido;
	}
	public void setCodPedido(int codPedido) {
		this.codPedido = codPedido;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getEstKeyCliente() {
		return estKeyCliente;
	}
	public void setEstKeyCliente(int estKeyCliente) {
		this.estKeyCliente = estKeyCliente;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
}
