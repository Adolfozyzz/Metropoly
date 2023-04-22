package br.com.metropoly.bo;

import java.sql.Connection;

import br.com.metropoly.beans.Restaurante;

import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.RestauranteDAO;


public class RestauranteBO {
	
	Connection con = Conexao.abrirConexao();

	RestauranteDAO restaurantedao = new RestauranteDAO(con);

	public void inserirBO(Restaurante restaurante) throws Excecao {

		String cnpj = Long.toString(restaurante.getCnpj());
		
		if ((restaurante.getCdRestaurante() == 5) || (restaurante.getNomeRestaurante().length() < 100) || (restaurante.getNomeRua().length()<100) || (restaurante.getNomeBairro().length()<100)
				|| (restaurante.getCidade().length()<100) || (restaurante.getNumero()<10)|| (restaurante.getCep()==8) || (restaurante.getCnpj()==14)) {
			System.out.println("Quantidade de caracteres " + "do codigo do restaurante, nome, rua, bairro, cidade, numero, cep, cnpj  "
					+ "n�o atende o m�nimo");
		} else {
			restaurante.setCdRestaurante(restaurante.getCdRestaurante());
			restaurante.setNomeRestaurante(restaurante.getNomeRestaurante());
			restaurante.setNomeRua(restaurante.getNomeRua());
			restaurante.setNomeBairro(restaurante.getNomeBairro());
			restaurante.setCidade(restaurante.getCidade());
			restaurante.setNumero(restaurante.getNumero());
			restaurante.setCep(restaurante.getCep());
			restaurante.setCnpj(restaurante.getCnpj());
			
			if (cnpj.length() == 14) {
				restaurante.setCnpj(restaurante.getCnpj());
				
			}
			
			System.out.println(restaurantedao.inserirRestaurante(restaurante));
		}
	
	}

}
