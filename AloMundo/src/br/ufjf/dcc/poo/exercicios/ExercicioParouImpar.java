package br.ufjf.dcc.poo.exercicios;

import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;

public class ExercicioParouImpar {

	public static void main(String[] args) {
		String ParouImpar = JOptionPane.showInputDialog(null, "Digite quais deseja ver: 'par' para os pares ou 'impar' para os impares");
		int qtdNumeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero para verificar: "));
		System.out.println(ParouImpar);
		List<Integer> pares = new Vector<>();
		List<Integer> impares = new Vector<>();
		while (qtdNumeros != -1)
		{
			if(qtdNumeros %2 == 0)
			{
				pares.add(qtdNumeros);
			}
			else
			{
				impares.add(qtdNumeros);
			}
			qtdNumeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero para verificar ou -1 para sair: "));

		}
		
		if(ParouImpar.equals("par"))
		{
			for(Integer inteirosPares : pares)
			{
				System.out.println(inteirosPares + " ");
			}
		}
		if(ParouImpar.equals("impar"))
		{
			for(Integer inteirosImpares : impares)
			{
				System.out.println(inteirosImpares + " ");
			}
		}

	}

}
