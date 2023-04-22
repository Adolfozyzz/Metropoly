package br.com.metropoly.main.postocombustivel;

import java.sql.Connection;

import br.com.metropoly.beans.PostoCombustivel;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.PostoCombustivelDAO;

public class ProgramaDeletar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		
		PostoCombustivel postocombustivel = new PostoCombustivel();
		PostoCombustivelDAO postocombustiveldao = new PostoCombustivelDAO(con);
		
		postocombustivel.setCidade("Campinas");
		
		System.out.println(postocombustiveldao.deletar(postocombustivel));
		
		Conexao.fecharConexao(con);
		
	}

}
