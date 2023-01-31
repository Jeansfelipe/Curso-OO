package br.ufjf.dcc.poo.exercicio;

public class Aluno {
	private 
		String nome;
		String matricula;
		float nota1, nota2;
		float notatrabalho;
		float media;
		void calculaMedia()
		{
			this.media = (float) ((nota1+ nota2+ notatrabalho)/3);
		}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public float getNota1() {
		return nota1;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	public float getNota2() {
		return nota2;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	public float getNotatrabalho() {
		return notatrabalho;
	}
	public void setNotatrabalho(float notatrabalho) {
		this.notatrabalho = notatrabalho;
	}
	public float getMedia() {
		this.calculaMedia();
		return media;
	}
}

