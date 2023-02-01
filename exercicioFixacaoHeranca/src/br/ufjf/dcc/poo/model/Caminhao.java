package br.ufjf.dcc.poo.model;

public class Caminhao extends Veiculo{
	private float Tara;
	private int licenca;
	private int valorEstimado;
	
	
	public double calcularConsumo(double precoLitro) {
			return ((this.getCapacidadeTanque() / this.getKmPorLitro()) * precoLitro) / Tara;
		}
	public float getTara() {
		return Tara;
	}
	public void setTara(float tara) {
		Tara = tara;
	}
	public int getLicenca() {
		return licenca;
	}
	public void setLicenca(int licenca) {
		this.licenca = licenca;
	}
	public int getValorEstimado() {
		return valorEstimado;
	}
	public void setValorEstimado(int valorEstimado) {
		this.valorEstimado = valorEstimado;
	}

}
