package br.com.metropoly.main.postoeletrico;

import java.sql.Connection;

import br.com.metropoly.beans.PostoEletrico;

import br.com.metropoly.bo.Excecao;
import br.com.metropoly.bo.PostoEletricoBO;

import br.com.metropoly.conexao.Conexao;

public class ProgramaBO {

	public static void main(String[] args) throws Excecao {
		// TODO Auto-generated method stub
		

		Connection con = Conexao.abrirConexao();

		PostoEletrico postoeletrico = new PostoEletrico();
		PostoEletricoBO postoeletricobo = new PostoEletricoBO();
		

		postoeletrico.setCdPostoEletrico(12345);
		postoeletrico.setNomePostoEletrico("zyzz");
		postoeletrico.setNomeRua("olica");
		postoeletrico.setNomeBairro("brah");
		postoeletrico.setCidade("São Paulo");
		postoeletrico.setNumero(1200);
		postoeletrico.setCep(1324432);
		postoeletrico.setCnpj(12345678901012L);
	    postoeletricobo.inserirBO(postoeletrico);
		Conexao.fecharConexao(con);

	

	}

}
