package br.ufjf.dcc.poo.model;

import java.util.*;

public class Estadia {
	private Date dataHoraEnt;
	private Date dataHoraSai;
	private double valor;
	private Veiculo veiculo;
	
	
	public Date getDataHoraEnt() {
		return dataHoraEnt;
	}
	public void setDataHoraEnt(Date dataHoraEnt) {
		this.dataHoraEnt = dataHoraEnt;
	}
	public Date getDataHoraSai() {
		return dataHoraSai;
	}
	public void setDataHoraSai(Date dataHoraSai) {
		this.dataHoraSai = dataHoraSai;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
}
