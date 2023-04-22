package br.com.metropoly.beans;

public class PostoEletrico extends Endereco {
	
	private int cdPostoEletrico;
	private String nomePostoEletrico;
	public int getCdPostoEletrico() {
		return cdPostoEletrico;
	}
	public void setCdPostoEletrico(int cdPostoEletrico) {
		this.cdPostoEletrico = cdPostoEletrico;
	}
	public String getNomePostoEletrico() {
		return nomePostoEletrico;
	}
	public void setNomePostoEletrico(String nomePostoEletrico) {
		this.nomePostoEletrico = nomePostoEletrico;
	}
	@Override
	public String mostrarAtributos() {
		return "\nSobre:" + "\nRua: " + getNomeRua() + "\nBairro:" + getNomeBairro() + "\nCidade: " + getCidade() + "\nnumero:" + getNumero()
		+ "\nCnpj: " + getCnpj() + "\nCep: " + getCep() + "\nCodigo do posto eletrico" + getCdPostoEletrico() + "\nNome: " + getNomePostoEletrico();
		
		}
	
	@Deprecated
	public String retornarTeste() {
		return "Teste";
	}

	

}
