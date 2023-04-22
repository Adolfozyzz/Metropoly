package br.com.metropoly.bo;

import java.sql.Connection;


import br.com.metropoly.beans.Hospital;
import br.com.metropoly.conexao.Conexao;

import br.com.metropoly.dao.HospitalDAO;

public class HospitalBO {
	
	Connection con = Conexao.abrirConexao();

    HospitalDAO hospitaldao = new HospitalDAO(con);

	public void inserirBO(Hospital hospital) throws Excecao {
		
		String cnpj = Long.toString(hospital.getCnpj());
		String cdHospital = Integer.toString(hospital.getCdHospital());
		
		
		if ((cdHospital.length() == 5) || (hospital.getNomeHospital().length() < 100) || (hospital.getNomeRua().length()<100) || (hospital.getNomeBairro().length()<100)
				|| (hospital.getCidade().length()<100) || (hospital.getNumero()<5) || (hospital.getCep()==8) || (hospital.getCnpj()==14)||(hospital.getTelefone()==11)) {
			System.out.println("Quantidade de caracteres " + "do codigo do hospital, nome, rua, bairro, cidade, numero, cep, cnpj, telefone "
					+ "n�o atende o m�nimo");
		} else {
			hospital.setCdHospital(hospital.getCdHospital());
			hospital.setNomeHospital(hospital.getNomeHospital());
			hospital.setNomeRua(hospital.getNomeRua());
			hospital.setNomeBairro(hospital.getNomeBairro());
			hospital.setCidade(hospital.getCidade());
			hospital.setNumero(hospital.getNumero());
			hospital.setCep(hospital.getCep());
			hospital.setCnpj(hospital.getCnpj());
			hospital.setTelefone(hospital.getTelefone());
		
			if (cnpj.length() == 14 || cdHospital.length() == 5) {
				hospital.setCnpj(hospital.getCnpj());
				hospital.setCdHospital(hospital.getCdHospital());
			}
			
			
			
			System.out.println(hospitaldao.inserirHospital(hospital));
		}
	
	}

}
