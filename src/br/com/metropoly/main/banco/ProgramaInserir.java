package br.com.metropoly.main.banco;

import java.sql.Connection;

import br.com.metropoly.beans.Banco;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.BancoDAO;

public class ProgramaInserir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Connection con = Conexao.abrirConexao();
		
		Banco banco = new Banco();
		BancoDAO bancodao = new BancoDAO(con);
		
		
		banco.setNomeBanco("santander");
		banco.setNomeRua("Jorisvaldo da venue");
		banco.setNomeBairro("avenue");
		banco.setCidade("Rio grande do Sul");
		banco.setNumero(160);
		banco.setCep(1241441);
		banco.setStatus(false);
		banco.setCnpj(123456789);
	
			
		System.out.println(bancodao.inserirBanco(banco));
		
		Conexao.fecharConexao(con);
	}

	}




