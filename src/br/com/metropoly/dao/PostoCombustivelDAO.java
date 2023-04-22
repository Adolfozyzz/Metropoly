package br.com.metropoly.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.metropoly.beans.PostoCombustivel;

public class PostoCombustivelDAO {

	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public PostoCombustivelDAO(Connection con) {
		setCon(con);
	}

	public String inserirPostoCombustivel(PostoCombustivel postoCombustivel) {
		String sql = "insert into T_MTP_POSTOCOMBUSTIVEL (cd_postoCombustivel, nm_postoCombustivel, nm_rua, nm_bairro, nm_cidade, nr_numero, nr_cep, st_status, nr_cnpj)"
				+ " values (?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);

			ps.setInt(1, postoCombustivel.getCdPostoCombustivel());
			ps.setString(2, postoCombustivel.getNomePostoCombustivel());
			ps.setString(3, postoCombustivel.getNomeRua());
			ps.setString(4, postoCombustivel.getNomeBairro());
			ps.setString(5, postoCombustivel.getCidade());
			ps.setInt(6, postoCombustivel.getNumero());
			ps.setInt(7, postoCombustivel.getCep());
			ps.setBoolean(8, false);
			ps.setLong(9, postoCombustivel.getCnpj());

			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso.";
			} else {
				return "Erro ao inserir.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String deletar(PostoCombustivel postoCombustivel) {
		String sql = "delete from T_MTP_POSTOCOMBUSTIVEL where nm_cidade = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, postoCombustivel.getCidade());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso.";
			} else {
				return "Erro ao deletar.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String alterar(PostoCombustivel postoCombustivel) {
		String sql = "update T_MTP_POSTOCOMBUSTIVEL set nm_cidade = ? where nr_telefone = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, postoCombustivel.getCidade());
			ps.setInt(2, postoCombustivel.getNumero());
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
	public ArrayList<PostoCombustivel> retornarDados() {
		String sql = "select * from T_MTP_POSTOCOMBUSTIVEL";
		ArrayList<PostoCombustivel> retornarPostoCombustivel = new ArrayList<PostoCombustivel>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					PostoCombustivel postoCombustivel = new PostoCombustivel();
					postoCombustivel.setNomePostoCombustivel(rs.getString(1));
					postoCombustivel.setCep(rs.getInt(2));
					postoCombustivel.setCidade(rs.getString(3));

				}
				return retornarPostoCombustivel;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		}

	}

}
