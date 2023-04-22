package br.com.metropoly.beans;

public class Carro extends Veiculo {
	
	private int cdCarro;
	private String nomeCarro;
	private double valorDiario;
	public final int getCdCarro() {
		return cdCarro;
	}
	public final void setCdCarro(int cdCarro) {
		this.cdCarro = cdCarro;
	}
	public final String getNomeCarro() {
		return nomeCarro;
	}
	public final void setNomeCarro(String nomeCarro) {
		this.nomeCarro = nomeCarro;
	}
	public final double getValorDiario() {
		return valorDiario;
	}
	public final void setValorDiario(double valorDiario) {
		this.valorDiario = valorDiario;
	}
	
	

}
