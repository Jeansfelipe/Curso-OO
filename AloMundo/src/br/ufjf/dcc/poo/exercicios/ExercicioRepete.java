package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class ExercicioRepete {

	public static void main(String[] args) {
		int vezes = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantas vezes a frase deve ser impressa?"));
		for(int i = 1; i < vezes; i++)
		{
			JOptionPane.showMessageDialog(null, "Faça os exercicios novamente");
		}
	}

}
