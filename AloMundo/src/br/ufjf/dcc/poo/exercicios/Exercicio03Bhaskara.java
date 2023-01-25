package br.ufjf.dcc.poo.exercicios;
import java.util.Scanner;

public class Exercicio03Bhaskara {

	public static void main(String[] args) {
		int coef1, coef2, coef3,delta;
		double x1,x2;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o primeiro coeficiente: ");
		coef1 = teclado.nextInt();
		System.out.print("Digite o segundo coeficiente: ");
		coef2 = teclado.nextInt();
		System.out.print("Digite o terceiro coeficiente: ");
		coef3 = teclado.nextInt();
		delta = ((coef2*coef2) - (4*coef1*coef3));
		if(delta<0)
		{
			System.out.println("Nao existe raiz real");
		}
		else
		{
			x1 = ((coef2*(-1) + Math.sqrt(delta))/2*coef1);
			x2 = ((coef2*(-1) - Math.sqrt(delta))/2*coef1);			
			System.out.println("Delta eh: "+ delta +" e"+" as raizes sao: "+x1 + " e " + x2);
		}
	}

}
