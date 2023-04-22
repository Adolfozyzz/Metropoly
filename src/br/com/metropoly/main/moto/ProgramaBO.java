package br.com.metropoly.main.moto;

import java.sql.Connection;

import br.com.metropoly.beans.Moto;
import br.com.metropoly.bo.Excecao;
import br.com.metropoly.bo.MotoBO;
import br.com.metropoly.conexao.Conexao;

public class ProgramaBO {

	public static void main(String[] args) throws Excecao {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		Moto moto = new Moto();
		MotoBO motobo = new MotoBO();
		moto.setNomeMoto("zyzz");
		moto.setCdLocadora(12345);
		moto.setCdMoto(12345);
		moto.setValorDiario(1300);
		moto.setDisponilidade(false);
		motobo.inserirBO(moto);
		Conexao.fecharConexao(con);

	}

}
