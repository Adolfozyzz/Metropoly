package br.com.metropoly.main.usuario;

import java.sql.Connection;


import br.com.metropoly.beans.Usuario;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.UsuarioDAO;

public class ProgramaInserir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();
		
		Usuario usuario = new Usuario();
		UsuarioDAO usuariodao = new UsuarioDAO(con);
		
		
		usuario.setNome("Luca");
		usuario.setEmail("lala@gmail.com.br");
		usuario.setSenha("oafnosefnses");
		usuario.setTelefone(1231244151);
		usuario.setSobrenome("katsuki");
		
			
		System.out.println(usuariodao.inserirUsuario(usuario));
		
		Conexao.fecharConexao(con);
	}

	}


