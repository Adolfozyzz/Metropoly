package br.com.metropoly.beans;

public class Moto extends Veiculo{
	
	private int cdMoto;
	private String nomeMoto;
	private double valorDiario;
	public final int getCdMoto() {
		return cdMoto;
	}
	public final void setCdMoto(int cdMoto) {
		this.cdMoto = cdMoto;
	}
	public final String getNomeMoto() {
		return nomeMoto;
	}
	public final void setNomeMoto(String nomeMoto) {
		this.nomeMoto = nomeMoto;
	}
	public final double getValorDiario() {
		return valorDiario;
	}
	public final void setValorDiario(double valorDiario) {
		this.valorDiario = valorDiario;
	}
	
	

}
