package br.ufjf.dcc.poo.model;

public class Caminhao extends Veiculo{
	private
		float Tara;
	public
		double calcularConsumo(double precoLitro) {
			return ((this.getCapacidadeTanque() / this.getKmPorLitro()) * precoLitro) / Tara;
		}

}
