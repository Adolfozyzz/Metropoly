package br.com.metropoly.bo;

import java.sql.Connection;


import br.com.metropoly.beans.PostoEletrico;
import br.com.metropoly.conexao.Conexao;

import br.com.metropoly.dao.PostoEletricoDAO;


public class PostoEletricoBO {
	
	Connection con = Conexao.abrirConexao();

	PostoEletricoDAO postoeletricodao = new PostoEletricoDAO(con);

	public void inserirBO(PostoEletrico postoeletrico) throws Excecao {
		
		String cnpj = Long.toString(postoeletrico.getCnpj());
		String cdpostoeletrico = Integer.toString(postoeletrico.getCdPostoEletrico());
		
		
		if ((cdpostoeletrico.length() == 5) || (postoeletrico.getNomePostoEletrico().length() < 100) || (postoeletrico.getNomeRua().length()<100) || (postoeletrico.getNomeBairro().length()<100)
				|| (postoeletrico.getCidade().length()<100) || (postoeletrico.getNumero()<5) || (postoeletrico.getCep()==8) || (postoeletrico.getCnpj()==14)) {
			System.out.println("Quantidade de caracteres " + "do codigo do banco, nome, rua, bairro, cidade, numero, cep, cnpj "
					+ "n�o atende o m�nimo");
		} else {
			postoeletrico.setCdPostoEletrico(postoeletrico.getCdPostoEletrico());
			postoeletrico.setNomeRua(postoeletrico.getNomeRua());
			postoeletrico.setNomeBairro(postoeletrico.getNomeBairro());
			postoeletrico.setCidade(postoeletrico.getCidade());
			postoeletrico.setNumero(postoeletrico.getNumero());
			postoeletrico.setCep(postoeletrico.getCep());
			postoeletrico.setCnpj(postoeletrico.getCnpj());
			
			
		
			if (cnpj.length() == 14 || cdpostoeletrico.length() == 5) {
				postoeletrico.setCnpj(postoeletrico.getCnpj());
				postoeletrico.setCdPostoEletrico(postoeletrico.getCdPostoEletrico());
			}
			
			
			
			System.out.println(postoeletricodao.inserirPostoEletrico(postoeletrico));
		}
	
	}
}

	

