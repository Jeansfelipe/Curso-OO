package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class ExercicioIdade {

	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a sua idade: ", null));
		if (idade <= 3) 
		{
			JOptionPane.showMessageDialog(null, "Bebe");
		} 
		else if(idade <= 13)
		{
			JOptionPane.showMessageDialog(null, "Criança");
		}
		else if(idade < 20)
		{
			JOptionPane.showMessageDialog(null, "Adolescente");
		}
		else if(idade < 65)
		{
			JOptionPane.showMessageDialog(null, "Adulto");
		}
		else if(idade >= 65)
		{
			JOptionPane.showMessageDialog(null, "Idoso");
		}
	}

}
