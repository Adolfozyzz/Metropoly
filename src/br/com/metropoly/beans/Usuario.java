package br.com.metropoly.beans;
/**
* @author shark
*/

public class Usuario {
	private int cdUsuario;
	private String nome;
	private String sobrenome;
	private String email;
	private String senha;
	private int telefone;
	
	
	
	public Usuario(int cdUsuario, String nome, String sobrenome, String email, String senha, int telefone) {
		super();
		this.cdUsuario = cdUsuario;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
	}
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	public int getCdUsuario() {
		return cdUsuario;
	}
	public void setCdUsuario(int cdUsuario) {
		this.cdUsuario = cdUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String mostrarAtributos(){
		return "\nUsuario" + "\nNome: " + getNome() + "\nSobrenome: " + getSobrenome() + "\nEmail: " + getEmail() + "\nSenha: " + getSenha()
		+ "\nTelefone: " + getTelefone();
	
	
	}
	@Deprecated
	public String retornarTeste() {
		return "Teste";
	}

	
	
	

}
