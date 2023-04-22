package br.com.metropoly.main.postocombustivel;

import java.sql.Connection;

import br.com.metropoly.beans.PostoCombustivel;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.PostoCombustivelDAO;

public class ProgramaInserir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		
		PostoCombustivel postocombustivel = new PostoCombustivel();
		PostoCombustivelDAO postocombustiveldao = new PostoCombustivelDAO(con);
		
		postocombustivel.setCdPostoCombustivel(12345);
		postocombustivel.setNomePostoCombustivel("seid");
		postocombustivel.setNomeRua("lins");
		postocombustivel.setNomeBairro("aes");
		postocombustivel.setCidade("Campinas");
		postocombustivel.setNumero(1900);
		postocombustivel.setCep(123423);
		postocombustivel.setStatus(false);
		postocombustivel.setCnpj(12345678909876L);
		
		System.out.println(postocombustiveldao.inserirPostoCombustivel(postocombustivel));
		
		Conexao.fecharConexao(con);

	}

}
