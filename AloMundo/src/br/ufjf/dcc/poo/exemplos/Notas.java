package br.ufjf.dcc.poo.exemplos;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
public class Notas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		List<String> nomeAluno = new Vector<>();
		List<Float> notas = new Vector<>();
		float media = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print("Informe o nome do aluno "+(i+1)+": ");
			nomeAluno.add(teclado.nextLine());			
		}
		for (int j = 0; j < nomeAluno.size(); j++) {
			System.out.print("Informe a nota de " + nomeAluno.get(j) + ": ");
			float notaAluno = teclado.nextFloat();
			notas.add(notaAluno);
			media += notaAluno;
		}
		media = media/3;
		for (int n = 0; n < nomeAluno.size(); n++) {
			if (notas.get(n) >= media)
				System.out.println("Parabéns " + nomeAluno.get(n));			
		}
	}
}