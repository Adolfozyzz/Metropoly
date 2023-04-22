package br.com.metropoly.beans;

public class PostoCombustivel extends Endereco {
	
	private int cdPostoCombustivel;
	private String nomePostoCombustivel;
	private boolean status;
	public int getCdPostoCombustivel() {
		return cdPostoCombustivel;
	}
	public void setCdPostoCombustivel(int cdPostoCombustivel) {
		this.cdPostoCombustivel = cdPostoCombustivel;
	}
	public String getNomePostoCombustivel() {
		return nomePostoCombustivel;
	}
	public void setNomePostoCombustivel(String nomePostoCombustivel) {
		this.nomePostoCombustivel = nomePostoCombustivel;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String mostrarAtributos() {
		return "\nSobre:" + "\nRua: " + getNomeRua() + "\nBairro:" + getNomeBairro() + "\nCidade: " + getCidade() + "\nnumero:" + getNumero()
		+ "\nCnpj: " + getCnpj() + "\nCep: " + getCep() + "\nCodigo do posto do combustivel;" + getCdPostoCombustivel() + "\nNome: " + getNomePostoCombustivel();
		
		
		}
	@Deprecated
	public String retornarTeste() {
		return "Teste";
	}

	

}
