package br.com.metropoly.main.banco;

import java.sql.Connection;

import br.com.metropoly.beans.Banco;

import br.com.metropoly.bo.BancoBO;
import br.com.metropoly.bo.Excecao;
import br.com.metropoly.conexao.Conexao;

public class ProgramaBO {

	public static void main(String[] args) throws Excecao {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();

		Banco banco = new Banco();
		BancoBO bancobo = new BancoBO();
		
		banco.setCdBanco(12345);
		banco.setNomeBanco("santander");
		banco.setNomeRua("Jorisvaldo da venue");
		banco.setNomeBairro("avenue");
		banco.setCidade("Rio grande do Sul");
		banco.setNumero(160);
		banco.setCep(12345678);
		banco.setStatus(false);
		banco.setCnpj(12345678910121L);
		
		bancobo.inserirBO(banco);
		
	
	
		Conexao.fecharConexao(con);
	}

	}


