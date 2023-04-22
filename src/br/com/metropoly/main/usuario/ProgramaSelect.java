package br.com.metropoly.main.usuario;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.metropoly.beans.Usuario;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.UsuarioDAO;



public class ProgramaSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		UsuarioDAO usuariodao = new UsuarioDAO(con);
		
		ArrayList<Usuario> lista = usuariodao.retornarDados();
		if(lista != null) {
			for (Usuario c : lista) {
				System.out.println("Nome: " + c.getNome());
				System.out.println("Email: " + c.getSenha());
				System.out.println("Telefone" + c.getTelefone());
			}
		}
		Conexao.fecharConexao(con);

	}


	}


