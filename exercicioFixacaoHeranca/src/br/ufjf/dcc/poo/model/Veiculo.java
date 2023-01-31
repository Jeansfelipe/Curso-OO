package br.ufjf.dcc.poo.model;

public abstract class Veiculo {
	private
		String marca;
		float capacidadeTanque;
		float kmRodados;
		float kmPorLitro;
		double CalcularConsumo(double precoLitro) {
			return (double) kmPorLitro * precoLitro;
		}
	public
		String getMarca() {
			return marca;
		}
		void setMarca(String marca) {
			this.marca = marca;
		}
		float getCapacidadeTanque() {
			return capacidadeTanque;
		}
		void setCapacidadeTanque(float capacidadeTanque) {
			this.capacidadeTanque = capacidadeTanque;
		}
		float getKmPorLitro() {
			return kmPorLitro;
		}
}
