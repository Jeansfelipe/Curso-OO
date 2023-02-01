package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Professor extends Pessoa{
	private String codigo;
	private String formacao;
	private double horaAula;
	private int quantidadeAulas;
	ArrayList<Disciplina> disciplinas;
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public double getHoraAula() {
		return horaAula;
	}

	public void setHoraAula(double horaAula) {
		this.horaAula = horaAula;
	}

	public int getQuantidadeAulas() {
		return quantidadeAulas;
	}

	public void setQuantidadeAulas(int quantidadeAulas) {
		this.quantidadeAulas = quantidadeAulas;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public float calcularPagamento() {
		return 0;
	}
}
