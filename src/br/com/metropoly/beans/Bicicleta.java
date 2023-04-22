package br.com.metropoly.beans;

public class Bicicleta extends Veiculo {
	
	private int cdBicicleta;
	private double valorHora;
	public final int getCdBicicleta() {
		return cdBicicleta;
	}
	public final void setCdBicicleta(int cdBicicleta) {
		this.cdBicicleta = cdBicicleta;
	}
	public final double getValorHora() {
		return valorHora;
	}
	public final void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

}
