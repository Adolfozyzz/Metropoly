package br.com.metropoly.main.patinete;

import java.sql.Connection;

import br.com.metropoly.beans.Patinete;
import br.com.metropoly.bo.Excecao;
import br.com.metropoly.bo.PatineteBO;
import br.com.metropoly.conexao.Conexao;


public class ProgramaBO {

	public static void main(String[] args) throws Excecao {
		// TODO Auto-generated method stub
		
		 Connection con = Conexao.abrirConexao();
		 Patinete patinete = new Patinete();
		 PatineteBO patinetebo = new PatineteBO();
		 

		 patinete.setCdLocadora(12345);
		 patinete.setCdPatinete(12345);
		 patinete.setDisponilidade(true);
		 patinete.setValorHora(1200);
		 patinetebo.inserirBO(patinete);
		 Conexao.fecharConexao(con);
		 

	}

}
