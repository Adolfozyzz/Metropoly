package br.com.metropoly.main.postoeletrico;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.metropoly.beans.PostoEletrico;

import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.PostoEletricoDAO;


public class ProgramaSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Connection con = Conexao.abrirConexao();
		PostoEletricoDAO postoeletricodao = new PostoEletricoDAO(con);
		
		ArrayList<PostoEletrico> lista = postoeletricodao.retornarDados();
		if(lista != null) {
			for (PostoEletrico e : lista) {
				System.out.println("Nome: " + e.getNomePostoEletrico());
				System.out.println("Cep: " + e.getCep());
				System.out.println("Cidade" + e.getCidade());
			}
		}
		Conexao.fecharConexao(con);

	}


	}


