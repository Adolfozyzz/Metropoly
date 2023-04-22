package br.com.metropoly.main.postocombustivel;

import java.sql.Connection;

import br.com.metropoly.beans.PostoCombustivel;
import br.com.metropoly.bo.Excecao;
import br.com.metropoly.bo.PostoCombustivelBO;
import br.com.metropoly.conexao.Conexao;

public class PogramaBO {

	public static void main(String[] args) throws Excecao {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		
		PostoCombustivel postocombustivel = new PostoCombustivel();
		PostoCombustivelBO postocombustivelbo = new PostoCombustivelBO();
		
		postocombustivel.setCdPostoCombustivel(12345);
		postocombustivel.setNomePostoCombustivel("seid");
		postocombustivel.setNomeRua("lins");
		postocombustivel.setNomeBairro("aes");
		postocombustivel.setCidade("Campinas");
		postocombustivel.setNumero(1900);
		postocombustivel.setCep(123423);
		postocombustivel.setStatus(false);
		postocombustivel.setCnpj(12345678909876L);
		postocombustivelbo.inserirBO(postocombustivel);
		
		Conexao.fecharConexao(con);

	}

}
