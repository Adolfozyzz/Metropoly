package br.com.metropoly.main.patinete;

import java.sql.Connection;

import br.com.metropoly.beans.Patinete;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.PatineteDAO;

public class ProgramaAlterar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Connection con = Conexao.abrirConexao();
		 Patinete patinete = new Patinete();
		 PatineteDAO patinetedao = new PatineteDAO(con);
		 
		 patinete.setCdPatinete(12346);
		 patinete.setDisponilidade(false);
		 
		 System.out.println(patinetedao.alterar(patinete));
		 Conexao.fecharConexao(con);

	}

}
