package br.com.metropoly.main.carro;

import java.sql.Connection;

import br.com.metropoly.beans.Carro;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.CarroDAO;

public class ProgramaInserir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		Carro carro = new Carro();
		CarroDAO carrodao = new CarroDAO(con);
		
		carro.setCdLocadora(12345);
		carro.setCdCarro(12345);
		carro.setDisponilidade(false);
		carro.setNomeCarro("zyzz");
		carro.setValorDiario(1000);
		System.out.println(carrodao.inserirCarro(carro));
		Conexao.fecharConexao(con);

	}

}
