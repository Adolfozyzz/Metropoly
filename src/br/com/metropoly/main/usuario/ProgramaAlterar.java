package br.com.metropoly.main.usuario;

import java.sql.Connection;

import br.com.metropoly.beans.Usuario;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.UsuarioDAO;



public class ProgramaAlterar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();

		Usuario usuario = new Usuario();
		UsuarioDAO usuariodao = new UsuarioDAO(con);

		usuario.setSenha("desparl");
		usuario.setTelefone(11088687);
		
		System.out.println(usuariodao.alterar(usuario));
		Conexao.fecharConexao(con);
	}

	}


