package br.com.metropoly.main.moto;

import java.sql.Connection;
import java.util.ArrayList;


import br.com.metropoly.beans.Moto;
import br.com.metropoly.conexao.Conexao;

import br.com.metropoly.dao.MotoDAO;

public class ProgramaSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Connection con = Conexao.abrirConexao();
		MotoDAO motodao = new MotoDAO(con);
		
		ArrayList<Moto> lista = motodao.retornarDados();
		if(lista != null) {
			for (Moto c : lista) {
				System.out.println("Nome: " + c.getNomeMoto());
				System.out.println("Valor diario: " + c.getValorDiario());
		
			}
		}
		Conexao.fecharConexao(con);



	}

}
