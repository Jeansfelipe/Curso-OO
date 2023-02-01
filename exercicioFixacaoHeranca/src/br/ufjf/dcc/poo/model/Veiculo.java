package br.ufjf.dcc.poo.model;

public abstract class Veiculo {
	
	private String marca;
	private float capacidadeTanque;
	private float kmPorLitro;
	private double CalcularConsumo(double precoLitro) {
			return 0;
		}
	private String numPlaca;
	private String modelo;
	private Date dataUltimaRevisao;
	private Date proximaRevisao;
	
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
		public String getNumPlaca() {
			return numPlaca;
		}
		public void setNumPlaca(String numPlaca) {
			this.numPlaca = numPlaca;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public Date getDataUltimaRevisao() {
			return dataUltimaRevisao;
		}
		public void setDataUltimaRevisao(Date dataUltimaRevisao) {
			this.dataUltimaRevisao = dataUltimaRevisao;
		}
		public Date getProximaRevisao() {
			return proximaRevisao;
		}
		public void setProximaRevisao(Date proximaRevisao) {
			this.proximaRevisao = proximaRevisao;
		}
}
