package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class ExercicioMoeda {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // Leitor do teclado
		int valor,valorRestante; // Dados de entrada
		int moeda100, moeda50, moeda25, moeda10,moeda5,moeda1; // Dados de saida
		String existeReal;
		System.out.print("Informe o valor em centavos: ");
		valor = teclado.nextInt();
		System.out.print("Deseja que apareca moeda de 1 real? Digite 'sim' ou 'nao':  ");
		existeReal = teclado.next();
		if(existeReal.contains("sim"))
		{
			valorRestante = valor;
			moeda100 = valorRestante/100;
			valorRestante-= 100*moeda100;
			moeda50 = valorRestante/50;
			valorRestante-= 50*moeda50;
			moeda25 = valorRestante/25;
			valorRestante-= 25*moeda25;
			moeda10 = valorRestante/10;
			valorRestante-= 10*moeda10;
			moeda5 = valorRestante/5;
			valorRestante-= 5*moeda5;
			moeda1 = valorRestante/1;
			valorRestante-= 1*moeda1;
			System.out.println("O valor de " + valor + " centavos pode ser descrito como: " 
			+ moeda100 + " Moedas de 1 real, " + moeda50 + " Moedas de 50 centavos, " + 
					moeda25 + " Moedas de 25 centavos, "+ moeda10 + " Moedas de 10 centavos, "
					+ moeda5 + " Moedas de 5 centavos e "+ moeda1 + " Moedas de 1 centavo");
		}
		else
		{

			valorRestante = valor;
			moeda50 = valorRestante/50;
			valorRestante-= 50*moeda50;
			moeda25 = valorRestante/25;
			valorRestante-= 25*moeda25;
			moeda10 = valorRestante/10;
			valorRestante-= 10*moeda10;
			moeda5 = valorRestante/5;
			valorRestante-= 5*moeda5;
			moeda1 = valorRestante/1;
			valorRestante-= 1*moeda1;
			System.out.println("O valor de " + valor + " centavos pode ser descrito como: " 
			+ moeda50 + " Moedas de 50 centavos, " + moeda25 + " Moedas de 25 centavos, "+
			moeda10 + " Moedas de 10 centavos, "+ moeda5 + " Moedas de 5 centavos e "+
			moeda1 + " Moedas de 1 centavo");
		}
	}

}
