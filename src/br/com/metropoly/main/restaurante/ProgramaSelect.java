package br.com.metropoly.main.restaurante;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.metropoly.beans.Restaurante;

import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.RestauranteDAO;


public class ProgramaSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Connection con = Conexao.abrirConexao();
		RestauranteDAO restaurantedao = new RestauranteDAO(con);
		
		ArrayList<Restaurante> lista = restaurantedao.retornarDados();
		if(lista != null) {
			for (Restaurante r : lista) {
				System.out.println("Nome: " + r.getNomeRestaurante());
				System.out.println("Cep: " + r.getCep());
				System.out.println("Telefone" + r.getTelefone());
			}
		}
		Conexao.fecharConexao(con);

	}


	}


