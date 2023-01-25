package br.ufjf.dcc.poo.exemplos;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ExemploDialog {

	public static void main(String[] args) {
		String nomeUsuario;
		nomeUsuario = JOptionPane.showInputDialog(null);
		JOptionPane.showMessageDialog(null, "Olá, "+nomeUsuario);
	}

}
