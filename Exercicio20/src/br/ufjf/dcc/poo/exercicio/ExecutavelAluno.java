package br.ufjf.dcc.poo.exercicio;
import java.util.*;

public class ExecutavelAluno {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		List<Aluno> alunos = new Vector<>();
		for (int i = 0; i < 3; i++) {
			Aluno a = new Aluno();
			System.out.println("Digite o nome do aluno "+(i+1)+": ");
			a.setNome(teclado.nextLine());
			System.out.println("Digite a matricula do aluno "+(i+1)+": ");
			a.setMatricula(teclado.nextLine());
			System.out.println("Digite a 1ª nota do aluno "+(i+1)+": ");
			a.setNota1(Float.parseFloat(teclado.nextLine()));
			System.out.println("Digite a 2ª nota do aluno "+(i+1)+": ");
			a.setNota2(Float.parseFloat(teclado.nextLine()));
			System.out.println("Digite a nota do trabalho do aluno "+(i+1)+": ");
			a.setNotatrabalho(Float.parseFloat(teclado.nextLine()));
			alunos.add(a);
		}
		
		for(Aluno aluno: alunos) {
			if(aluno.getMedia() >= 60)
			{
				System.out.println("Aprovado");
			}
			else if(aluno.getMedia() >= 40)
			{
				System.out.println("Prova Final");
			}
			else
			{
				System.out.println("Reprovado");
			}
		}
		teclado.close();
	}

}
