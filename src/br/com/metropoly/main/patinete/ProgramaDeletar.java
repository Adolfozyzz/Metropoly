package br.com.metropoly.main.patinete;

import java.sql.Connection;

import br.com.metropoly.beans.Patinete;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.PatineteDAO;

public class ProgramaDeletar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Connection con = Conexao.abrirConexao();
		 Patinete patinete = new Patinete();
		 PatineteDAO patinetedao = new PatineteDAO(con);
		 
		 patinete.setValorHora(1200);
		 System.out.println(patinetedao.deletar(patinete));
		 Conexao.fecharConexao(con);
		 

	}

}
