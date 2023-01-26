package br.ufjf.dcc.poo.exercicios;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExercicioSoma {

	public static void main(String[] args) {
		int soma = 0, quantNum=0;
		int valor = 0, media = 0;
		
		while(valor != -1)
		{
			valor =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));
			if(valor != -1)
			{
				soma = soma + valor;
				quantNum++;
			}
		}
		
		media = soma/quantNum;
		JOptionPane.showMessageDialog(null, "a media eh: "+ media);

	}

}
