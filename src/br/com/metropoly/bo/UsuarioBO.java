package br.com.metropoly.bo;

import java.sql.Connection;


import br.com.metropoly.beans.Usuario;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.UsuarioDAO;

public class UsuarioBO {
	
	Connection con = Conexao.abrirConexao();

	UsuarioDAO usuariodao = new UsuarioDAO(con);

	public void inserirBO(Usuario usuario) throws Excecao {
		if ((usuario.getCdUsuario() > 5) || (usuario.getNome().length() > 3) || (usuario.getEmail().length()>6) || (usuario.getTelefone()>14)
				|| (usuario.getSenha().length()>5) || (usuario.getSobrenome().length()>5)) {
			System.out.println("Quantidade de caracteres " + "do codigo do usuario, nome, sobrenome, telefone, email, senha "
					+ "n�o atende o m�nimo");
		} else {
			usuario.setCdUsuario(usuario.getCdUsuario());
			usuario.setNome(usuario.getNome());
			usuario.setSobrenome(usuario.getSobrenome());
			usuario.setEmail(usuario.getEmail());
			usuario.setTelefone(usuario.getTelefone());
			usuario.setSenha(usuario.getSenha());
			
			
			
			System.out.println(usuariodao.inserirUsuario(usuario));
		}
	
	}
}
