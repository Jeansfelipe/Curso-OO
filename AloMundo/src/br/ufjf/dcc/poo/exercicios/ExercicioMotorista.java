package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class ExercicioMotorista {

	public static void main(String[] args) {
		int km, litro;
		float kmPorLitro;
		km = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a Kmtragem: ", null));
		litro = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantos litros tem o tanque cheio: ", null));
		
		kmPorLitro  = km/litro;
		
		JOptionPane.showMessageDialog(null, "A quilometragem por litro eh: " + kmPorLitro);

	}

}
