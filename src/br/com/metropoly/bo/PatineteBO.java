package br.com.metropoly.bo;

import java.sql.Connection;


import br.com.metropoly.beans.Patinete;
import br.com.metropoly.conexao.Conexao;

import br.com.metropoly.dao.PatineteDAO;

public class PatineteBO {
	
	Connection con = Conexao.abrirConexao();

	PatineteDAO patinetedao = new PatineteDAO(con);

	public void inserirBO(Patinete patinete) throws Excecao {
		
		
		String cdPatinete = Integer.toString(patinete.getCdPatinete());
		String cdLocadora = Integer.toString(patinete.getCdLocadora());
		
		
		if ((cdPatinete.length() == 5)||(patinete.getValorHora()==4)||(cdLocadora.length()==5)) {
			System.out.println("Quantidade de caracteres " + "do codigo da locadora, patinete,  valor hora "
					+ "n�o atende o m�nimo");
		} else {
			patinete.setCdLocadora(patinete.getCdLocadora());
			patinete.setCdPatinete(patinete.getCdPatinete());
			patinete.setDisponilidade(false);
			patinete.setValorHora(patinete.getValorHora());
			
		
		
			if (cdLocadora.length()==5 ||cdPatinete.length() == 5) {
				patinete.setCdLocadora(patinete.getCdLocadora());
				patinete.setCdPatinete(patinete.getCdPatinete());
			}
			
			
			
			System.out.println(patinetedao.inserirPatinete(patinete));
		}
	


}
}
