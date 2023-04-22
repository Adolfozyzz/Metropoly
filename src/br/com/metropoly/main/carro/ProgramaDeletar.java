package br.com.metropoly.main.carro;

import java.sql.Connection;

import br.com.metropoly.beans.Carro;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.CarroDAO;

public class ProgramaDeletar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();
		Carro carro = new Carro();
		CarroDAO carrodao = new CarroDAO(con);
		
		carro.setNomeCarro("zyzz");
		System.out.println(carrodao.deletar(carro));
		
		Conexao.fecharConexao(con);
	}

}
