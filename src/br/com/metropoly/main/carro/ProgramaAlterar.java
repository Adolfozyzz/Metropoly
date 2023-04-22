package br.com.metropoly.main.carro;

import java.sql.Connection;

import br.com.metropoly.beans.Carro;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.CarroDAO;

public class ProgramaAlterar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();
		Carro carro = new Carro();
		CarroDAO carrodao = new CarroDAO(con);
		
		
		carro.setNomeCarro("ferrari");
		carro.setValorDiario(1200);
		System.out.println(carrodao.alterar(carro));
		Conexao.fecharConexao(con);

	}

}
