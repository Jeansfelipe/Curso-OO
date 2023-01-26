package br.ufjf.dcc.poo.exercicios;
import javax.swing.JOptionPane;

public class ExercicioImprimeIntervalo {

	public static void main(String[] args) {
		int valor,contador;
		contador = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de inicio: "));
		valor =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor final: "));
		
		int contNum = 0;
		while(contador != (valor+1))
		{
			JOptionPane.showMessageDialog(null, "O "+ (contNum+1) + " º numero eh: "+ contador);
			contador++;
			contNum++;
		}
	}

}
