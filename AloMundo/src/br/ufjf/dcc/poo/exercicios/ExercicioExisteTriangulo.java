package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class ExercicioExisteTriangulo {

	public static void main(String[] args) {
		int lado1, lado2, lado3;
		lado1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do primeiro lado: "));
		lado2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do segundo lado: "));
		lado3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do terceiro lado: "));

		if((Math.abs(lado2-lado3)< lado1 && lado1 < (lado2 + lado3))&&
		(Math.abs(lado1-lado3)< lado2 && lado2 < (lado1 + lado3))&&
		(Math.abs(lado1-lado2)< lado3 && lado3 < (lado1 + lado2)))
		{
			JOptionPane.showMessageDialog(null, "Isto eh um triangulo");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Isto nao eh um triangulo");
		}
	}

}
