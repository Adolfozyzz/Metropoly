package br.com.metropoly.dao;


	


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;

	import br.com.metropoly.beans.Hospital;

	public class HospitalDAO {

		private Connection con;

		public final Connection getCon() {
			return con;
		}

		public final void setCon(Connection con) {
			this.con = con;
		}

		public HospitalDAO(Connection con) {
			setCon(con);
		}

		public String inserirHospital(Hospital hospital) {
			String sql = "insert into T_MTP_HOSPITAL (nm_hospital, nm_rua, nm_bairro, nm_cidade, nr_numero, nr_cep, nr_cnpj, nr_telefone)"
					+ " values (?,?,?,?,?,?,?,?)";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);

				
				ps.setString(1, hospital.getNomeHospital());
				ps.setString(2, hospital.getNomeRua());
				ps.setString(3, hospital.getNomeBairro());
				ps.setString(4, hospital.getCidade());
				ps.setInt(5, hospital.getNumero());
				ps.setInt(6, hospital.getCep());
				ps.setLong(7, hospital.getCnpj());
				ps.setInt(8, hospital.getTelefone());

				if (ps.executeUpdate() > 0) {
					return "Inserido com sucesso.";
				} else {
					return "Erro ao inserir.";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}
		}

		public String deletar(Hospital hospital) {
			String sql = "delete from T_MTP_HOSPITAL where nm_cidade = ?";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ps.setString(1, hospital.getCidade());
				if (ps.executeUpdate() > 0) {
					return "Deletado com sucesso.";
				} else {
					return "Erro ao deletar.";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}
		}

		public String alterar(Hospital hospital) {
			String sql = "update T_MTP_HOSPITAL set nm_cidade = ? where nr_numero = ?";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ps.setString(1, hospital.getCidade());
				ps.setInt(2, hospital.getNumero());
				if (ps.executeUpdate() > 0) {
					return "Alterado com sucesso";
				} else {
					return "Erro ao alterar";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}
		}

		// Select
		public ArrayList<Hospital> retornarDados() {
			String sql = "select * from T_MTP_HOSPITAL";
			ArrayList<Hospital> retornarHospital = new ArrayList<Hospital>();
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				if (rs != null) {
					while (rs.next()) {
						Hospital hospital = new Hospital();
						hospital.setNomeHospital(rs.getString(1));
						hospital.setCep(rs.getInt(2));
						hospital.setCidade(rs.getString(3));

					}
					return retornarHospital;
				} else {
					return null;
				}
			} catch (SQLException e) {
				return null;
			}

		}

	}


