package br.com.metropoly.main.restaurante;

import java.sql.Connection;

import br.com.metropoly.beans.Restaurante;

import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.RestauranteDAO;


public class ProgramaAlterar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();

		Restaurante restaurante = new Restaurante();
		RestauranteDAO restaurantedao = new RestauranteDAO(con);
		
		restaurante.setCidade("Campinas");
		restaurante.setNumero(1333);

		
		
		System.out.println(restaurantedao.alterar(restaurante));
		Conexao.fecharConexao(con);
	}

	}


