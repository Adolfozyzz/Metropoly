package br.com.metropoly.bo;

import java.sql.Connection;


import br.com.metropoly.beans.Carro;
import br.com.metropoly.conexao.Conexao;

import br.com.metropoly.dao.CarroDAO;

public class CarroBO {
	
	Connection con = Conexao.abrirConexao();

	CarroDAO carrodao = new CarroDAO(con);

	public void inserirBO(Carro carro) throws Excecao {
		
		
		String cdCarro = Integer.toString(carro.getCdCarro());
		String cdLocadora = Integer.toString(carro.getCdLocadora());
		
		
		if ((cdCarro.length() == 5) || (carro.getNomeCarro().length() < 50) ||(carro.getValorDiario()==4)||(cdLocadora.length()==5)) {
			System.out.println("Quantidade de caracteres " + "do codigo da locadora, carro, nome, valor diario "
					+ "n�o atende o m�nimo");
		} else {
			
			carro.setCdCarro(carro.getCdCarro());
			carro.setCdLocadora(carro.getCdLocadora());
			carro.setDisponilidade(false);
			carro.setNomeCarro(carro.getNomeCarro());
			carro.setValorDiario(carro.getValorDiario());
			
		
		
			if (cdLocadora.length()==5 ||cdCarro.length() == 5) {
				carro.setCdLocadora(carro.getCdLocadora());
				carro.setCdCarro(carro.getCdCarro());
			}
			
			
			
			System.out.println(carrodao.inserirCarro(carro));
		}
	
	}

}
