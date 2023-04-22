package br.com.metropoly.main.hospital;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.metropoly.beans.Hospital;
import br.com.metropoly.conexao.Conexao;
import br.com.metropoly.dao.HospitalDAO;

public class ProgramaSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Connection con = Conexao.abrirConexao();
		HospitalDAO hospitaldao = new HospitalDAO(con);
		
		ArrayList<Hospital> lista = hospitaldao.retornarDados();
		if(lista != null) {
			for (Hospital h : lista) {
				System.out.println("Nome: " + h.getNomeHospital());
				System.out.println("Cep: " + h.getCep());
				System.out.println("Cidade" + h.getCidade());
			}
		}
		Conexao.fecharConexao(con);

	}

		

	}


