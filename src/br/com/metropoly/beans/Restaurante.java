package br.com.metropoly.beans;

public class Restaurante extends Endereco {
	
	private int cdRestaurante;
	private String nomeRestaurante;
	private int numeroQuantidadeEstrelas;
	private int telefone;
	private boolean status;
	public int getCdRestaurante() {
		return cdRestaurante;
	}
	public void setCdRestaurante(int cdRestaurante) {
		this.cdRestaurante = cdRestaurante;
	}
	public String getNomeRestaurante() {
		return nomeRestaurante;
	}
	public void setNomeRestaurante(String nomeRestaurante) {
		this.nomeRestaurante = nomeRestaurante;
	}
	public int getNumeroQuantidadeEstrelas() {
		return numeroQuantidadeEstrelas;
	}
	public void setNumeroQuantidadeEstrelas(int numeroQuantidadeEstrelas) {
		this.numeroQuantidadeEstrelas = numeroQuantidadeEstrelas;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String mostrarAtributos() {
		return "\nSobre:" + "\nRua: " + getNomeRua() + "\nBairro:" + getNomeBairro() + "\nCidade: " + getCidade() + "\nnumero:" + getNumero()
		+ "\nCnpj: " + getCnpj() + "\nCep: " + getCep() + "\nCodigo do restaurante: " + getCdRestaurante() + "\nNome:" + getNomeRestaurante()
		+ "\nQuantidade de Estrelas: " + getNumeroQuantidadeEstrelas() + "\nTelefone: " + getTelefone();
		
		}
	@Deprecated
	public String retornarTeste() {
		return "Teste";
	}

	
	
	
	

}
