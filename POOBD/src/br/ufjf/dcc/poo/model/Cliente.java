package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Cliente {
	private int pkCliente;
	private String codCliente;
	private String nome;
	private String endRua;
	private int endNumero;
	private String endComplemento;
	private String endBairro;
	private String cidade;
	private ArrayList<Pedido> pedidos = new ArrayList<>();
	
	
	public int getCliente() {
		return pkCliente;
	}
	public void setCliente(int cliente) {
		this.pkCliente = cliente;
	}
	public String getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndRua() {
		return endRua;
	}
	public void setEndRua(String endRua) {
		this.endRua = endRua;
	}
	public int getEndNumero() {
		return endNumero;
	}
	public void setEndNumero(int endNumero) {
		this.endNumero = endNumero;
	}
	public String getEndBairro() {
		return endBairro;
	}
	public void setEndBairro(String endBairro) {
		this.endBairro = endBairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public int getPkCliente() {
		return pkCliente;
	}
	public void setPkCliente(int pkCliente) {
		this.pkCliente = pkCliente;
	}
	public void setEndComplemento(String endComplemento) {
		this.endComplemento = endComplemento;
	}
	public String getEndComplemento() {
		return endComplemento;
	}
}
