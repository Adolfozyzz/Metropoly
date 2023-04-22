package br.com.metropoly.main.restaurante;

import java.sql.Connection;

import br.com.metropoly.beans.Restaurante;
import br.com.metropoly.bo.Excecao;
import br.com.metropoly.bo.RestauranteBO;
import br.com.metropoly.conexao.Conexao;

public class ProgramaBO {

	public static void main(String[] args) throws Excecao {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();

		Restaurante restaurante = new Restaurante();
		RestauranteBO restaurantebo = new RestauranteBO();
		
		restaurante.setCdRestaurante(12345);
		restaurante.setNomeRestaurante("zizi");
		restaurante.setNomeRua("augu");
		restaurante.setNomeBairro("augusta");
		restaurante.setCidade("São Paulo");
		restaurante.setNumero(1333);
		restaurante.setCep(12434131);
		restaurante.setStatus(true);
		restaurante.setCnpj(12345678901234L);
		restaurante.setNumeroQuantidadeEstrelas(5);
		restaurante.setTelefone(112243525);
		restaurantebo.inserirBO(restaurante);
		Conexao.fecharConexao(con);

	}

}
