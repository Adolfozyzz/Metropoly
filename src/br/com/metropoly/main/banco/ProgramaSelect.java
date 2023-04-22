package br.com.metropoly.main.banco;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.metropoly.beans.Banco;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.BancoDAO;

public class ProgramaSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Connection con = Conexao.abrirConexao();
		BancoDAO bancodao = new BancoDAO(con);
		
		ArrayList<Banco> lista = bancodao.retornarDados();
		if(lista != null) {
			for (Banco b : lista) {
				System.out.println("Nome: " + b.getNomeBanco());
				System.out.println("Cep: " + b.getCep());
				System.out.println("Cidade" + b.getCidade());
			}
		}
		Conexao.fecharConexao(con);

	}


	

}
