package br.com.metropoly.main.bicicleta;

import java.sql.Connection;
import java.util.ArrayList;


import br.com.metropoly.beans.Bicicleta;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.BicicletaDAO;

public class ProgramaSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		BicicletaDAO bicicletadao = new BicicletaDAO(con);
		
		
		ArrayList<Bicicleta> lista = bicicletadao.retornarDados();
		if(lista != null) {
			for (Bicicleta b : lista) {
				System.out.println("Valor hora: " + b.getValorHora());
			}
		}
		Conexao.fecharConexao(con);

		
		

	}

}
