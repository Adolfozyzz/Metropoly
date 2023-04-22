package br.com.metropoly.beans;

public class Banco extends Endereco {
	
	private int cdBanco;
	private String nomeBanco;
	private boolean status;
	public final int getCdBanco() {
		return cdBanco;
	}
	public final void setCdBanco(int cdBanco) {
		this.cdBanco = cdBanco;
	}
	public final String getNomeBanco() {
		return nomeBanco;
	}
	public final void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public final boolean isStatus() {
		return status;
	}
	public final void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String mostrarAtributos() {
		return "\nSobre:" + "\nRua: " + getNomeRua() + "\nBairro:" + getNomeBairro() + "\nCidade: " + getCidade() + "\nnumero:" + getNumero()
		+ "\nCnpj: " + getCnpj() + "\nCep: " + getCep() + "\nCodigo do banco: " + getCdBanco() + "\nNome do Banco: " + getNomeBanco();
		
		}

	
	
	@Deprecated
	public String retornarTeste() {
		return "Teste";
	}
	

}
