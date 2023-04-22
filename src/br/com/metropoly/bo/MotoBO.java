package br.com.metropoly.bo;

import java.sql.Connection;


import br.com.metropoly.beans.Moto;
import br.com.metropoly.conexao.Conexao;

import br.com.metropoly.dao.MotoDAO;

public class MotoBO {
	
	Connection con = Conexao.abrirConexao();

	MotoDAO motodao = new MotoDAO(con);

	public void inserirBO(Moto moto) throws Excecao {
		
		
		String cdMoto = Integer.toString(moto.getCdMoto());
		String cdLocadora = Integer.toString(moto.getCdLocadora());
		
		
		if ((cdMoto.length() == 5) || (moto.getNomeMoto().length() < 50) ||(moto.getValorDiario()==4)||(cdLocadora.length()==5)) {
			System.out.println("Quantidade de caracteres " + "do codigo da locadora, moto, nome, valor diario "
					+ "n�o atende o m�nimo");
		} else {
			
			moto.setCdMoto(moto.getCdMoto());
			moto.setCdLocadora(moto.getCdLocadora());
			moto.setDisponilidade(false);
			moto.setNomeMoto(moto.getNomeMoto());
			moto.setValorDiario(moto.getValorDiario());
			
		
		
			if (cdLocadora.length()==5 ||cdMoto.length() == 5) {
				moto.setCdLocadora(moto.getCdLocadora());
				moto.setCdMoto(moto.getCdMoto());
			}
			
			
			
			System.out.println(motodao.inserirMoto(moto));
		}
	

}
}
