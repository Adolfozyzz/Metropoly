package br.com.metropoly.main.hospital;

import java.sql.Connection;


import br.com.metropoly.beans.Hospital;
import br.com.metropoly.conexao.Conexao;

import br.com.metropoly.dao.HospitalDAO;

public class ProgramaInserir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection con = Conexao.abrirConexao();
		
		Hospital hospital = new Hospital();
		HospitalDAO hospitaldao = new HospitalDAO(con);
		
	
		hospital.setNomeBairro("alura");
		hospital.setNomeBairro("alilas");
		hospital.setCidade("São Paulo");
		hospital.setNumero(133);
		hospital.setCep(1234556);
		hospital.setCnpj(12345678901111L);
		hospital.setTelefone(122342352);
			
		System.out.println(hospitaldao.inserirHospital(hospital));
		
		Conexao.fecharConexao(con);
	}

	}


