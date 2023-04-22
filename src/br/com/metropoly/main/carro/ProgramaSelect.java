package br.com.metropoly.main.carro;

import java.sql.Connection;
import java.util.ArrayList;


import br.com.metropoly.beans.Carro;
import br.com.metropoly.conexao.Conexao;

import br.com.metropoly.dao.CarroDAO;

public class ProgramaSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		CarroDAO carrodao = new CarroDAO(con);
		
		ArrayList<Carro> lista = carrodao.retornarDados();
		if(lista != null) {
			for (Carro c : lista) {
				System.out.println("Nome: " + c.getNomeCarro());
				System.out.println("Valor diario: " + c.getValorDiario());
		
			}
		}
		Conexao.fecharConexao(con);


	}

}
