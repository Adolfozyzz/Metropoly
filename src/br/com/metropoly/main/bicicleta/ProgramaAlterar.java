package br.com.metropoly.main.bicicleta;

import java.sql.Connection;

import br.com.metropoly.beans.Bicicleta;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.BicicletaDAO;

public class ProgramaAlterar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		Bicicleta bicicleta = new Bicicleta();
		BicicletaDAO bicicletadao = new BicicletaDAO(con);
		
		bicicleta.setValorHora(1200);
		
		System.out.println(bicicletadao.alterar(bicicleta));
		
		Conexao.fecharConexao(con);
		

	}

}
