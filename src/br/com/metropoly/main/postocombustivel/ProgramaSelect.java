package br.com.metropoly.main.postocombustivel;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.metropoly.beans.PostoCombustivel;

import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.PostoCombustivelDAO;

public class ProgramaSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		PostoCombustivelDAO postocombustiveldao = new PostoCombustivelDAO(con);
		
		ArrayList<PostoCombustivel> lista = postocombustiveldao.retornarDados();
		if(lista != null) {
			for (PostoCombustivel c : lista) {
				System.out.println("Nome: " + c.getNomePostoCombustivel());
				System.out.println("Cep: " + c.getCep());
				System.out.println("Cidade" + c.getCidade());
			}
		}
		Conexao.fecharConexao(con);


	}

}
