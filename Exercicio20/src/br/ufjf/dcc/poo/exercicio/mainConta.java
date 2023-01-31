package br.ufjf.dcc.poo.exercicio;

public class mainConta {

	public static void main(String[] args) {
		Conta numero1 = new Conta("Sabrina", 1234567890, "112233", "30/01");
		numero1.Depositar(150);
		numero1.Sacar(10);
		numero1.Depositar(860);
		numero1.adicionarRendimento();

	}

}
