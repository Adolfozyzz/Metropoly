package br.com.metropoly.main.postoeletrico;

import java.sql.Connection;

import br.com.metropoly.beans.PostoEletrico;

import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.PostoEletricoDAO;


public class ProgramaAlterar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Connection con = Conexao.abrirConexao();

		PostoEletrico postoeletrico = new PostoEletrico();
		PostoEletricoDAO postoeletricodao = new PostoEletricoDAO(con);
		
		postoeletrico.setCidade("Campinas");
		postoeletrico.setNumero(1200);
		
		
		
		System.out.println(postoeletricodao.alterar(postoeletrico));
		Conexao.fecharConexao(con);
	}

	}


