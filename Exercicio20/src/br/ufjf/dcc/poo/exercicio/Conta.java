package br.ufjf.dcc.poo.exercicio;

public class Conta {
	private
		String nomeTitular;
		int numeroConta;
		String agencia;
		double saldo;
		String DataAbertura;
		double calculaRendimento(){
			double rendimento = (saldo*10)/100;
			return rendimento;
		}
		double getSaldo() {
			return saldo;
		}
	public
		Conta(String nomeTitular, int numeroConta, String agencia, String dataAbertura) {
			this.nomeTitular = nomeTitular;
			this.numeroConta = numeroConta;
			this.agencia = agencia;
			DataAbertura = dataAbertura;
			this.saldo=0;
		}
		void adicionarRendimento()
		{
			System.out.println("o rendimento total desse mes eh de: "+ calculaRendimento()
			+ " esse rendimento sera adicionado ao seu saldo atual de: "+ saldo);
			saldo+= calculaRendimento();
			System.out.println("pronto, seu saldo atual eh de: "+ saldo);
		}
		void Sacar(double valor)
		{
		saldo-= valor;
		}
		void Depositar(double valor)
		{
		saldo+= valor;
		}
		double Extrato()
		{
			return this.getSaldo();
		}
		public String getNomeTitular() {
			return nomeTitular;
		}
		public void setNomeTitular(String nomeTitular) {
			this.nomeTitular = nomeTitular;
		}
		public int getNumeroConta() {
			return numeroConta;
		}
		public String getAgencia() {
			return agencia;
		}
		public String getDataAbertura() {
			return DataAbertura;
		}
}

