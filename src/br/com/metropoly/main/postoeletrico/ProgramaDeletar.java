package br.com.metropoly.main.postoeletrico;

import java.sql.Connection;

import br.com.metropoly.beans.PostoEletrico;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.PostoEletricoDAO;

public class ProgramaDeletar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		PostoEletrico postoeletrico = new PostoEletrico();
		PostoEletricoDAO postoeletricodao = new PostoEletricoDAO(con);
		
		postoeletrico.setCidade("São Paulo");
		
		System.out.println(postoeletricodao.deletar(postoeletrico));
		
		Conexao.fecharConexao(con);
		
		

	}

}
