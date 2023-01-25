package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class ExercicioDistanciaPontos {

	public static void main(String[] args) {
		float x1,x2,y1,y2;
		float resultado;
		x1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor de x1", null));
		y1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor de y1", null));
		x2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor de x2", null));
		y2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor de y2", null));
		
		resultado = (float) Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2 - y1),2));
		
		JOptionPane.showMessageDialog(null,"O Resultado da distancia entre pontos eh: " + resultado);
	}

}
