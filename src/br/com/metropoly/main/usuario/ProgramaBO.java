package br.com.metropoly.main.usuario;

import java.sql.Connection;

import br.com.metropoly.beans.Usuario;
import br.com.metropoly.bo.Excecao;
import br.com.metropoly.bo.UsuarioBO;
import br.com.metropoly.conexao.Conexao;




public class ProgramaBO {
	
	public static void main(String[] args) throws Excecao {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();

		Usuario usuario = new Usuario();
		UsuarioBO usuariobo = new UsuarioBO();
		
		usuario.setNome("luca");
		usuario.setSobrenome("gomes");
		usuario.setCdUsuario(134134);
		usuario.setTelefone(1129384243);
		usuario.setEmail("iqfqinqwfsegse");
		usuario.setSenha("fwsefwefwwsegs");
		usuariobo.inserirBO(usuario);
		Conexao.fecharConexao(con);
	}

	}


