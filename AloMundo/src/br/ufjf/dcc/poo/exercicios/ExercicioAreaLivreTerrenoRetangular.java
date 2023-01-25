package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class ExercicioAreaLivreTerrenoRetangular {
	public static void main(String args[])
	{
		Scanner teclado = new Scanner(System.in); // Leitor do teclado
		float largura, profundidade, larguraCasa, profundidadeCasa; // Dados de entrada
		float area; // Dados de saida
		float areaCasa;
		System.out.print("Informe a largura do terreno: ");
		largura = teclado.nextFloat();
		System.out.print("Informe a profundidade do terreno: ");
		profundidade = teclado.nextFloat();
		System.out.print("Informe a largura da casa: ");
		larguraCasa = teclado.nextFloat();
		System.out.print("Informe a profundidade da casa: ");
		profundidadeCasa = teclado.nextFloat();
		area = largura * profundidade;
		areaCasa = larguraCasa * profundidadeCasa;
		System.out.print("Area Restante em percentual igual a: "+ ((area-areaCasa)*100)/area + "%");
		
	}
}
