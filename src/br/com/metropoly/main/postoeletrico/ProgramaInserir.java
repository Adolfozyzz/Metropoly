package br.com.metropoly.main.postoeletrico;

import java.sql.Connection;

import br.com.metropoly.beans.PostoEletrico;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.PostoEletricoDAO;

public class ProgramaInserir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		PostoEletrico postoeletrico = new PostoEletrico();
		PostoEletricoDAO postoeletricodao = new PostoEletricoDAO(con);
		
		postoeletrico.setCdPostoEletrico(12345);
		postoeletrico.setNomePostoEletrico("zyzz");
		postoeletrico.setNomeRua("olica");
		postoeletrico.setNomeBairro("brah");
		postoeletrico.setCidade("São Paulo");
		postoeletrico.setNumero(1200);
		postoeletrico.setCep(1324432);
		postoeletrico.setCnpj(12345678901012L);
		System.out.println(postoeletricodao.inserirPostoEletrico(postoeletrico));
		
		Conexao.fecharConexao(con);
		

	}

}
