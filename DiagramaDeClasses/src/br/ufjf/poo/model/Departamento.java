package br.ufjf.poo.model;

import java.util.ArrayList;

public class Departamento {
	
	private int codigo;
	private ArrayList<Funcionario> funcionarios;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
}
