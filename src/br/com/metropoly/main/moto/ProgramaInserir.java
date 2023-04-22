package br.com.metropoly.main.moto;

import java.sql.Connection;

import br.com.metropoly.beans.Moto;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.MotoDAO;

public class ProgramaInserir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();
		Moto moto = new Moto();
		MotoDAO motodao = new MotoDAO(con);
		
		moto.setNomeMoto("zyzz");
		moto.setCdLocadora(12345);
		moto.setCdMoto(12345);
		moto.setValorDiario(1300);
		moto.setDisponilidade(false);
		System.out.println(motodao.inserirMoto(moto));
		Conexao.fecharConexao(con);

	}

}
