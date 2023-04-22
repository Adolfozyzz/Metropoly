package br.com.metropoly.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.metropoly.beans.Carro;

public class CarroDAO {

	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public CarroDAO(Connection con) {
		setCon(con);
	}

	public String inserirCarro(Carro carro) {
		String sql = "insert into T_MTP_CARRO (cd_carro, nm_carro, cd_locadora, vl_valor_diario, nr_disponibilidade)"
				+ " values (?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);

			ps.setInt(1, carro.getCdCarro());
			ps.setString(2, carro.getNomeCarro());
			ps.setInt(3, carro.getCdLocadora());
			ps.setDouble(4, carro.getValorDiario());
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

	public String deletar(Carro carro) {
		String sql = "delete from T_MTP_CARRO where nm_carro = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getNomeCarro());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso.";
			} else {
				return "Erro ao deletar.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String alterar(Carro carro) {
		String sql = "update T_MTP_CARRO set nm_carro = ? where vl_valor_diario = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getNomeCarro());
			ps.setDouble(2, carro.getValorDiario());
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
	public ArrayList<Carro> retornarDados() {
		String sql = "select * from T_MTP_CARRO";
		ArrayList<Carro> retornarCarro = new ArrayList<Carro>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					Carro carro = new Carro();
					carro.setNomeCarro(rs.getString(1));
					carro.setValorDiario(rs.getInt(2));
					

				}
				return retornarCarro;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		}

	}

}

