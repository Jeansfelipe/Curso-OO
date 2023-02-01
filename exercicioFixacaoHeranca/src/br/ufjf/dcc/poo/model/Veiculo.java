package br.ufjf.dcc.poo.model;

public abstract class Veiculo {
	
	private String marca;
	private float capacidadeTanque;
	private float kmPorLitro;
	private double CalcularConsumo(double precoLitro) {
			return 0;
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
