package br.com.metropoly.main.patinete;

import java.sql.Connection;
import java.util.ArrayList;


import br.com.metropoly.beans.Patinete;
import br.com.metropoly.conexao.Conexao;

import br.com.metropoly.dao.PatineteDAO;

public class ProgramaSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = Conexao.abrirConexao();
		PatineteDAO patinetedao = new PatineteDAO(con);
		
		ArrayList<Patinete> lista = patinetedao.retornarDados();
		if(lista != null) {
			for (Patinete p : lista) {
		
				System.out.println("Valor hora : " + p.getValorHora());
		
			}
		}
		Conexao.fecharConexao(con);




	}

}
