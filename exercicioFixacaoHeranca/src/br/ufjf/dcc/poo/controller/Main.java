package br.ufjf.dcc.poo.controller;

import java.util.ArrayList;

import br.ufjf.dcc.poo.model.Aluno;
import br.ufjf.dcc.poo.model.Disciplina;
import br.ufjf.dcc.poo.model.Professor;

public class Main {

	public static void main(String[] args) {
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setNome("POO");
		disciplina1.setCargaHoraria(60);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setNome("Modelagem");
		disciplina2.setCargaHoraria(60);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setNome("Banco de Dados");
		disciplina3.setCargaHoraria(60);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setNome("Redes");
		disciplina4.setCargaHoraria(60);
		

		
		
		ArrayList<Disciplina> disciplinasAluno = new ArrayList<>();
		disciplinasAluno.add(disciplina1);
		disciplinasAluno.add(disciplina2);
		disciplinasAluno.add(disciplina3);
		
		ArrayList<Disciplina> disciplinaProfessor = new ArrayList<>();
		disciplinaProfessor.add(disciplina3);
		disciplinaProfessor.add(disciplina4);
		
		Aluno aluno = new Aluno();
		aluno.setNome("Pedro");
		aluno.setIdade(23);
		aluno.setSexo("M");
		aluno.setMatricula("1234567");
		aluno.setMensalidade(950);
		aluno.setBolsa(120);
		aluno.setDisciplinas(disciplinasAluno);
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Ana");
		aluno1.setIdade(27);
		aluno1.setSexo("F");
		aluno1.setMatricula("1234567");
		aluno1.setMensalidade(950);
		aluno1.setBolsa(100);
		aluno1.setDisciplinas(disciplinasAluno);
		
		Professor professor = new Professor();
		professor.setNome("Gleiph");
		professor.setIdade(36);
		professor.setSexo("M");
		professor.setFormacao("Doutorado");
		professor.setHoraAula(43);
		professor.setQuantidadeAulas(15);
		professor.setDisciplinas(disciplinaProfessor);
		
		ArrayList<Aluno> alunosDisciplina = new ArrayList<>();
		alunosDisciplina.add(aluno);
		alunosDisciplina.add(aluno1);
		
		Disciplina disciplina5 = new Disciplina();
		disciplina5.setNome("Prog Web");
		disciplina5.setCargaHoraria(60);
		disciplina5.setProfessor(professor);
		disciplina5.setAlunos(alunosDisciplina);
		
		for(Aluno alunos: disciplina5.getAlunos())
		{
			System.out.println(alunos.getNome());
			System.out.println(alunos.getSexo());
		}
		
	}

}
