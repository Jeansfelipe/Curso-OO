package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class ExercicioSorteio {

	public static void main(String[] args) {
		int numSorteado = (int) (Math.random() * 100);
		int numUsuario = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual valor foi sorteado? ", null));
		while (numUsuario != -1) {
			if (numUsuario < numSorteado) {
				JOptionPane.showMessageDialog(null, "O numero sorteado é maior que este");
				numUsuario = Integer.parseInt(
						JOptionPane.showInputDialog(null, "Qual valor foi sorteado? ", null));
			} else if (numUsuario > numSorteado) {
				JOptionPane.showMessageDialog(null, "O numero sorteado é menor que este");
				numUsuario = Integer.parseInt(
						JOptionPane.showInputDialog(null, "Qual valor foi sorteado? ", null));
			} else {
				JOptionPane.showMessageDialog(null, "Parabens, voce acertou o numero");
				break;
			}
		}

	}

}
