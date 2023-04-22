package br.com.metropoly.main.bicicleta;

import java.sql.Connection;

import br.com.metropoly.beans.Bicicleta;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.BicicletaDAO;

public class ProgramaInserir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		Bicicleta bicicleta = new Bicicleta();
		BicicletaDAO bicicletadao = new BicicletaDAO(con);
		
		bicicleta.setCdLocadora(12345);
		bicicleta.setCdBicicleta(12346);
		bicicleta.setDisponilidade(false);
		bicicleta.setValorHora(12.2);
		
		System.out.println(bicicletadao.inserirBicicleta(bicicleta));
		
		Conexao.fecharConexao(con);
	}

}
