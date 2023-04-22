package br.com.metropoly.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.metropoly.beans.Moto;

public class MotoDAO {

	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public MotoDAO(Connection con) {
		setCon(con);
	}

	public String inserirMoto(Moto moto) {
		String sql = "insert into T_MTP_MOTO (cd_moto, nm_moto, cd_locadora, vl_valor_diario, nr_disponibilidade)"
				+ " values (?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);

			ps.setInt(1, moto.getCdMoto());
			ps.setString(2, moto.getNomeMoto());
			ps.setInt(3, moto.getCdLocadora());
			ps.setDouble(4, moto.getValorDiario());
			ps.setBoolean(5, false);

			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso.";
			} else {
				return "Erro ao inserir.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String deletar(Moto moto) {
		String sql = "delete from T_MTP_MOTO where nm_moto = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, moto.getNomeMoto());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso.";
			} else {
				return "Erro ao deletar.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String alterar(Moto moto) {
		String sql = "update T_MTP_MOTO set nm_moto = ? where nr_disponibilidade = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, moto.getNomeMoto());
			ps.setBoolean(2, false);
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
	public ArrayList<Moto> retornarDados() {
		String sql = "select * from T_MTP_MOTO";
		ArrayList<Moto> retornarMoto = new ArrayList<Moto>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					Moto moto = new Moto();
					moto.setNomeMoto(rs.getString(1));
					moto.setValorDiario(rs.getInt(2));
				

				}
				return retornarMoto;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		}

	}

}