package br.com.metropoly.bo;

import java.sql.Connection;

import br.com.metropoly.beans.Bicicleta;

import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.BicicletaDAO;


public class BicicletaBO {
	Connection con = Conexao.abrirConexao();

	BicicletaDAO bicicletadao = new BicicletaDAO(con);

	public void inserirBO(Bicicleta bicicleta) throws Excecao {
		
		
		String cdBicicleta = Integer.toString(bicicleta.getCdBicicleta());
		String cdLocadora = Integer.toString(bicicleta.getCdLocadora());
		
		
		if ((cdBicicleta.length() == 5) ||(bicicleta.getValorHora()==4)||(cdLocadora.length()==5)) {
			System.out.println("Quantidade de caracteres " + "do codigo da locadora, bicicleta, valor hora "
					+ "n�o atende o m�nimo");
		} else {
			
			bicicleta.setCdBicicleta(bicicleta.getCdBicicleta());
			bicicleta.setCdLocadora(bicicleta.getCdLocadora());
			bicicleta.setDisponilidade(false);
			bicicleta.setValorHora(bicicleta.getValorHora());
		
		
			if (cdLocadora.length()==5 ||cdBicicleta.length() == 5) {
				bicicleta.setCdLocadora(bicicleta.getCdLocadora());
				bicicleta.setCdBicicleta(bicicleta.getCdBicicleta());
			}
			
			
			
			System.out.println(bicicletadao.inserirBicicleta(bicicleta));
		}

}
}
