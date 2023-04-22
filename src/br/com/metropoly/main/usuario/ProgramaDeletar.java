package br.com.metropoly.main.usuario;

import java.sql.Connection;

import br.com.metropoly.beans.Usuario;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.UsuarioDAO;



public class ProgramaDeletar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();
		Usuario usuario = new Usuario();
		UsuarioDAO usuariodao = new UsuarioDAO(con);
		
		usuario.setEmail("oafnosefnses");
		
		System.out.println(usuariodao.deletar(usuario));

		Conexao.fecharConexao(con);
	}


	}


