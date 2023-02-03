package br.ufjf.dcc.poo.model;

import java.util.Date;

public class Pagamento {
	private int numBanco;
	private Date data;
	private Boleto boleto;
	
	
	
	public int getNumBanco() {
		return numBanco;
	}
	public void setNumBanco(int numBanco) {
		this.numBanco = numBanco;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Boleto getBoleto() {
		return boleto;
	}
	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}
	
}
