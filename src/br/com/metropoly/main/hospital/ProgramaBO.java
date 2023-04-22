package br.com.metropoly.main.hospital;

import java.sql.Connection;

import br.com.metropoly.beans.Hospital;
import br.com.metropoly.bo.Excecao;
import br.com.metropoly.bo.HospitalBO;
import br.com.metropoly.conexao.Conexao;

public class ProgramaBO {

	public static void main(String[] args) throws Excecao {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();

		Hospital hospital = new Hospital();
		HospitalBO hospitalbo = new HospitalBO();
		
		hospital.setCdHospital(12345);
		hospital.setNomeBairro("alura");
		hospital.setNomeBairro("alilas");
		hospital.setCidade("São Paulo");
		hospital.setNumero(133);
		hospital.setCep(1234556);
		hospital.setCnpj(12345678901111L);
		hospital.setTelefone(122342352);
		hospitalbo.inserirBO(hospital);
		
		Conexao.fecharConexao(con);
	}

	

	}


