package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Cliente extends Pessoa{
	private double limiteCredito;
	private int cartaoCredito;
	private String contato;
	private boolean status;
	private ArrayList<Pedido> pedidos = new ArrayList<>();
	
	public double verificaCredito() {
		return 0;
	}
	public int validaCartao() {
		return 0;
	}
	
	
	
	public double getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	public int getCartaoCredito() {
		return cartaoCredito;
	}
	public void setCartaoCredito(int cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}
