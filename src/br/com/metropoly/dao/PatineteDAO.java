package br.com.metropoly.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.metropoly.beans.Patinete;

public class PatineteDAO {

	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public PatineteDAO(Connection con) {
		setCon(con);
	}

	public String inserirPatinete(Patinete patinete) {
		String sql = "insert into T_MTP_PATINETE (cd_patinete, cd_locadora, vl_valor_hora, nr_disponibilidade)"
				+ " values (?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);

			ps.setInt(1, patinete.getCdPatinete());
			
			ps.setInt(2, patinete.getCdLocadora());
			ps.setDouble(3, patinete.getValorHora());
			ps.setBoolean(4, false);

			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso.";
			} else {
				return "Erro ao inserir.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String deletar(Patinete patinete) {
		String sql = "delete from T_MTP_PATINETE where vl_valor_hora = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setDouble(1, patinete.getValorHora());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso.";
			} else {
				return "Erro ao deletar.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String alterar(Patinete patinete) {
		String sql = "update T_MTP_PATINETE set cd_patinete = ? where nr_disponibilidade = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, patinete.getCdPatinete());
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
	public ArrayList<Patinete> retornarDados() {
		String sql = "select * from T_MTP_PATINETE";
		ArrayList<Patinete> retornarPatinete = new ArrayList<Patinete>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					Patinete patinete = new Patinete();
					
					patinete.setValorHora(rs.getInt(2));
				

				}
				return retornarPatinete;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		}

	}

}