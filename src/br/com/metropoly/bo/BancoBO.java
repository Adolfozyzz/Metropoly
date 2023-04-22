package br.com.metropoly.bo;

import java.sql.Connection;

import br.com.metropoly.beans.Banco;

import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.BancoDAO;

public class BancoBO {
	
	Connection con = Conexao.abrirConexao();

	BancoDAO bancodao = new BancoDAO(con);

	public void inserirBO(Banco banco) throws Excecao {
		
		String cnpj = Long.toString(banco.getCnpj());
		String cdBanco = Integer.toString(banco.getCdBanco());
		
		
		if ((cdBanco.length() == 5) || (banco.getNomeBanco().length() < 100) || (banco.getNomeRua().length()<100) || (banco.getNomeBairro().length()<100)
				|| (banco.getCidade().length()<100) || (banco.getNumero()<5) || (banco.getCep()==8) || (banco.getCnpj()==14)) {
			System.out.println("Quantidade de caracteres " + "do codigo do banco, nome, rua, bairro, cidade, numero, cep, cnpj "
					+ "n�o atende o m�nimo");
		} else {
			banco.setCdBanco(banco.getCdBanco());
			banco.setNomeBanco(banco.getNomeBanco());
			banco.setNomeRua(banco.getNomeRua());
			banco.setNomeBairro(banco.getNomeBairro());
			banco.setCidade(banco.getCidade());
			banco.setNumero(banco.getNumero());
			banco.setCep(banco.getCep());
			banco.setCnpj(banco.getCnpj());
		
		
			if (cnpj.length() == 14 || cdBanco.length() == 5) {
				banco.setCnpj(banco.getCnpj());
				banco.setCdBanco(banco.getCdBanco());
			}
			
			
			
			System.out.println(bancodao.inserirBanco(banco));
		}
	
	}

}
