package br.ufjf.dcc.poo.model;

import java.util.*;

public class Boleto {
	private String codBarra;
	private Date dataVenc;
	private double valor;
	private Socio socio;
	private Pagamento pagamento;
	
	public String getCodBarra() {
		return codBarra;
	}
	public void setCodBarra(String codBarra) {
		this.codBarra = codBarra;
	}
	public Date getDataVenc() {
		return dataVenc;
	}
	public void setDataVenc(Date dataVenc) {
		this.dataVenc = dataVenc;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
}
