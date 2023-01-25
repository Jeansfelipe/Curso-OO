package br.ufjf.dcc.poo.exemplos;
import java.util.Scanner;

public class ExemploMedia {

	public static void main(String[] args) {
		float valor1, valor2, valor3, media;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		valor1 = teclado.nextFloat();
		System.out.print("Digite o segundo valor: ");
		valor2 = teclado.nextFloat();
		System.out.print("Digite o terceiro valor: ");
		valor3 = teclado.nextFloat();
		media = (valor1+valor2+valor3)/3;
		System.out.println("A media eh: "+ media);
	}

}
