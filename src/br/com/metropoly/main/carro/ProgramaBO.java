package br.com.metropoly.main.carro;

import java.sql.Connection;

import br.com.metropoly.beans.Carro;
import br.com.metropoly.bo.CarroBO;
import br.com.metropoly.bo.Excecao;
import br.com.metropoly.conexao.Conexao;

public class ProgramaBO {

	public static void main(String[] args) throws Excecao {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		Carro carro = new Carro();
		CarroBO carrobo = new CarroBO();
		
		carro.setCdLocadora(12345);
		carro.setCdCarro(12345);
		carro.setDisponilidade(false);
		carro.setNomeCarro("zyzz");
		carro.setValorDiario(1000);
		carrobo.inserirBO(carro);
		Conexao.fecharConexao(con);
	}

}
