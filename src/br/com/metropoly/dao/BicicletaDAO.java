package br.com.metropoly.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.metropoly.beans.Bicicleta;

public class BicicletaDAO {

	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public BicicletaDAO(Connection con) {
		setCon(con);
	}

	public String inserirBicicleta(Bicicleta bicicleta) {
		String sql = "insert into T_MTP_BICICLETA (cd_bicicleta, cd_locadora, vl_valor_hora, nr_disponibilidade)"
				+ " values (?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);

			ps.setInt(1, bicicleta.getCdBicicleta());
		
			ps.setInt(2, bicicleta.getCdLocadora());
			ps.setDouble(3, bicicleta.getValorHora());
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

	public String deletar(Bicicleta bicicleta) {
		String sql = "delete from T_MTP_BICICLETA where vl_valor_hora = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setDouble(1, bicicleta.getValorHora());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso.";
			} else {
				return "Erro ao deletar.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String alterar(Bicicleta bicicleta) {
		String sql = "update T_MTP_BICICLETA set vl_valor_hora = ? where nr_disponibilidade = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setDouble(1, bicicleta.getValorHora());
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
	public ArrayList<Bicicleta> retornarDados() {
		String sql = "select * from T_MTP_BICICLETA";
		ArrayList<Bicicleta> retornarBicicleta = new ArrayList<Bicicleta>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					Bicicleta bicicleta = new Bicicleta();
					
					bicicleta.setValorHora(rs.getInt(2));
				

				}
				return retornarBicicleta;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		}

	}

}