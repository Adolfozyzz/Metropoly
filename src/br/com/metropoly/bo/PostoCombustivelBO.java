package br.com.metropoly.bo;

import java.sql.Connection;


import br.com.metropoly.beans.PostoCombustivel;
import br.com.metropoly.conexao.Conexao;

import br.com.metropoly.dao.PostoCombustivelDAO;

public class PostoCombustivelBO {
	
	Connection con = Conexao.abrirConexao();

	PostoCombustivelDAO postocombustiveldao = new PostoCombustivelDAO(con);

	public void inserirBO(PostoCombustivel postocombustivel) throws Excecao {
		
		String cnpj = Long.toString(postocombustivel.getCnpj());
		String cdPostoCombustivel = Integer.toString(postocombustivel.getCdPostoCombustivel());
		
		
		if ((cdPostoCombustivel.length() == 5) || (postocombustivel.getNomePostoCombustivel().length() < 100) || (postocombustivel.getNomeRua().length()<100) || (postocombustivel.getNomeBairro().length()<100)
				|| (postocombustivel.getCidade().length()<100) || (postocombustivel.getNumero()<5) || (postocombustivel.getCep()==8) || (postocombustivel.getCnpj()==14)) {
			System.out.println("Quantidade de caracteres " + "do codigo do banco, nome, rua, bairro, cidade, numero, cep, cnpj "
					+ "n�o atende o m�nimo");
		} else {
			postocombustivel.setCdPostoCombustivel(postocombustivel.getCdPostoCombustivel());
			postocombustivel.setNomeRua(postocombustivel.getNomeRua());
			postocombustivel.setNomeBairro(postocombustivel.getNomeBairro());
			postocombustivel.setCidade(postocombustivel.getCidade());
			postocombustivel.setNumero(postocombustivel.getNumero());
			postocombustivel.setCep(postocombustivel.getCep());
			postocombustivel.setCnpj(postocombustivel.getCnpj());
			
		
			if (cnpj.length() == 14 || cdPostoCombustivel.length() == 5) {
				postocombustivel.setCnpj(postocombustivel.getCnpj());
				postocombustivel.setCdPostoCombustivel(postocombustivel.getCdPostoCombustivel());
			}
			
			
			
			System.out.println(postocombustiveldao.inserirPostoCombustivel(postocombustivel));
		}
	
	}

}
