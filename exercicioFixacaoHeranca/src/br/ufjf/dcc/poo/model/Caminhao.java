package br.ufjf.dcc.poo.model;

public class Caminhao extends Veiculo{
	float Tara;
	double calcularConsumo(double precoLitro) {
		return ((this.capacidadeTanque / this.kmPorLitro) * precoLitro) / Tara;
	}
}
