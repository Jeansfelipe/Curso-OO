package br.ufjf.dcc.poo.model;

public class Automovel extends Veiculo{
	double calcularConsumo (double precoLitro){
		return (this.capacidadeTanque / this.kmPorLitro) * precoLitro;
	}
}
