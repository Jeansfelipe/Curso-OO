package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class exemploDialogSoma {

	public static void main(String[] args) {
		int valor1, valor2;
		int soma;
        
		valor1= Integer.parseInt( JOptionPane.showInputDialog(null, "Digite o primeiro valor: ", JOptionPane.QUESTION_MESSAGE));

		valor2= Integer.parseInt( JOptionPane.showInputDialog(null, "Digite o segundo valor: ", JOptionPane.QUESTION_MESSAGE));

		soma = valor1 + valor2;
		
		JOptionPane.showMessageDialog(null,"A soma de "+valor1 + " + " + valor2 + " eh: " + soma);
	}

}
