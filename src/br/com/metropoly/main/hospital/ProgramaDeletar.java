package br.com.metropoly.main.hospital;

import java.sql.Connection;

import br.com.metropoly.beans.Hospital;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.HospitalDAO;

public class ProgramaDeletar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		Hospital hospital = new Hospital();
		HospitalDAO hospitaldao = new HospitalDAO(con);
		
		hospital.setCidade("São Paulo");
		
		System.out.println(hospitaldao.deletar(hospital));
		
		Conexao.fecharConexao(con);

	}

}
