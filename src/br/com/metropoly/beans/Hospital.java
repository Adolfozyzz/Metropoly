package br.com.metropoly.beans;

public class Hospital extends Endereco {
	
	private int cdHospital;
	private String nomeHospital;
	private int telefone;
	public int getCdHospital() {
		return cdHospital;
	}
	public void setCdHospital(int cdHospital) {
		this.cdHospital = cdHospital;
	}
	public String getNomeHospital() {
		return nomeHospital;
	}
	public void setNomeHospital(String nomeHospital) {
		this.nomeHospital = nomeHospital;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	@Override
	public String mostrarAtributos() {
		return "\nSobre:" + "\nRua: " + getNomeRua() + "\nBairro:" + getNomeBairro() + "\nCidade: " + getCidade() + "\nnumero:" + getNumero()
		+ "\nCnpj: " + getCnpj() + "\nCep: " + getCep() + "\nCodigo do Hospital: " + getCdHospital() + "\nNome:" + getNomeHospital() + "\nTelefone:" + getTelefone();
		
		}
	@Deprecated
	public String retornarTeste() {
		return "Teste";
	}

	

}
