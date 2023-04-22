package br.com.metropoly.main.moto;

import java.sql.Connection;

import br.com.metropoly.beans.Moto;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.MotoDAO;

public class ProgramaDeletar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		Moto moto = new Moto();
		MotoDAO motodao = new MotoDAO(con);
		
		moto.setNomeMoto("zyzz");
		System.out.println(motodao.deletar(moto));
		Conexao.fecharConexao(con);

	}

}
