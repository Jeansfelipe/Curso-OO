package br.ufjf.dcc.poo.exercicio;

import java.util.*;
import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {
		List<Pessoa> p = new Vector<>();
		Scanner teclado = new Scanner (System.in);
		for (int i = 0; i < 5; i++) {
			Pessoa pi = new Pessoa();
			System.out.println("Digite o nome da pessoa "+(i+1)+": ");
			pi.setNome(teclado.nextLine());
			System.out.println("Digite agora a idade de " + pi.getNome() + ": ");
			pi.setIdade(Integer.parseInt(teclado.nextLine()));
			System.out.println("Digite agora o sexo, sendo 'masculino' ou 'feminino': ");
			pi.setSexo(teclado.nextLine());
			p.add(pi);
		}
		for(Pessoa pess:p)
		{
			System.out.println("Nome: "+ pess.getNome()); 
			System.out.println("Idade: "+ pess.getIdade());
			System.out.println("Sexo: "+ pess.getSexo());
		}
	}

}
