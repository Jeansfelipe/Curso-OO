package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class ExercicioSupermercado {

	public static void main(String[] args) {
	float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor gasto no supermercado"));
	if(valor <= 2)
	{
		valor = (float) (valor + 0.15);
	}
	else if(valor<= 5)
		valor = 1+1;
	}

}
