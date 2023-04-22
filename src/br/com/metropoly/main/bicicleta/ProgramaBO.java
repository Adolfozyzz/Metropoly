package br.com.metropoly.main.bicicleta;

import java.sql.Connection;

import br.com.metropoly.beans.Bicicleta;
import br.com.metropoly.bo.BicicletaBO;
import br.com.metropoly.bo.Excecao;
import br.com.metropoly.conexao.Conexao;


public class ProgramaBO {

	public static void main(String[] args) throws Excecao {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		Bicicleta bicicleta = new Bicicleta();
		BicicletaBO bicicletabo = new BicicletaBO();
		
		bicicleta.setCdLocadora(12345);
		bicicleta.setCdBicicleta(12346);
		bicicleta.setDisponilidade(false);
		bicicleta.setValorHora(12.2);
		bicicletabo.inserirBO(bicicleta);
		Conexao.fecharConexao(con);
		

	}

}
