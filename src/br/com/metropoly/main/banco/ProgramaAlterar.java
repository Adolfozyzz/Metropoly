package br.com.metropoly.main.banco;

import java.sql.Connection;

import br.com.metropoly.beans.Banco;

import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.BancoDAO;


public class ProgramaAlterar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();

		Banco banco = new Banco();
		BancoDAO bancodao = new BancoDAO(con);
		
		banco.setCidade("Rio grande do Sul");
		banco.setNumero(160);

		
		
		System.out.println(bancodao.alterar(banco));
		Conexao.fecharConexao(con);
	}

	}


