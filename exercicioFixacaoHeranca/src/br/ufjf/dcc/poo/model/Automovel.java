package br.ufjf.dcc.poo.model;

public class Automovel extends Veiculo{
	public
		double calcularConsumo (double precoLitro){
			return (this.getCapacidadeTanque() / this.getKmPorLitro()) * precoLitro;
		}
}
