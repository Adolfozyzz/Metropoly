package br.com.metropoly.main.patinete;

import java.sql.Connection;

import br.com.metropoly.beans.Patinete;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.PatineteDAO;

public class ProgramaInserir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Connection con = Conexao.abrirConexao();
		 Patinete patinete = new Patinete();
		 PatineteDAO patinetedao = new PatineteDAO(con);
		 
		 
		 patinete.setCdLocadora(12345);
		 patinete.setCdPatinete(12345);
		 patinete.setDisponilidade(true);
		 patinete.setValorHora(1200);
		 System.out.println(patinetedao.inserirPatinete(patinete));
		 Conexao.fecharConexao(con);

	}

}
