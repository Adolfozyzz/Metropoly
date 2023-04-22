package br.com.metropoly.main.postocombustivel;

import java.sql.Connection;

import br.com.metropoly.beans.PostoCombustivel;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.PostoCombustivelDAO;

public class ProgramaAlterar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		
		PostoCombustivel postocombustivel = new PostoCombustivel();
		PostoCombustivelDAO postocombustiveldao = new PostoCombustivelDAO(con);
		
		postocombustivel.setCidade("São Paulo");
		postocombustivel.setNumero(1900);
		
		System.out.println(postocombustiveldao.deletar(postocombustivel));

	}

}
