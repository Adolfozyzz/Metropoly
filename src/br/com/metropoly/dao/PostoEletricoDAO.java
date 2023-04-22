package br.com.metropoly.dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;

	import br.com.metropoly.beans.PostoEletrico;

	public class PostoEletricoDAO {

		private Connection con;

		public final Connection getCon() {
			return con;
		}

		public final void setCon(Connection con) {
			this.con = con;
		}

		public PostoEletricoDAO(Connection con) {
			setCon(con);
		}

		public String inserirPostoEletrico(PostoEletrico postoEletrico) {
			String sql = "insert into T_MTP_POSTOELETRICO (cd_postoEletrico, nm_postoEletrico, nm_rua, nm_bairro, nm_cidade, nr_numero, nr_cep, nr_cnpj)"
					+ " values (?,?,?,?,?,?,?,?)";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);

				ps.setInt(1, postoEletrico.getCdPostoEletrico());
				ps.setString(2, postoEletrico.getNomePostoEletrico());
				ps.setString(3, postoEletrico.getNomeRua());
				ps.setString(4, postoEletrico.getNomeBairro());
				ps.setString(5, postoEletrico.getCidade());
				ps.setInt(6, postoEletrico.getNumero());
				ps.setInt(7, postoEletrico.getCep());
				ps.setLong(8, postoEletrico.getCnpj());

				if (ps.executeUpdate() > 0) {
					return "Inserido com sucesso.";
				} else {
					return "Erro ao inserir.";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}
		}

		public String deletar(PostoEletrico postoEletrico) {
			String sql = "delete from T_MTP_POSTOELETRICO where nm_cidade = ?";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ps.setString(1, postoEletrico.getCidade());
				if (ps.executeUpdate() > 0) {
					return "Deletado com sucesso.";
				} else {
					return "Erro ao deletar.";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}
		}

		public String alterar(PostoEletrico postoEletrico) {
			String sql = "update T_MTP_POSTOELETRICO set nm_cidade = ? where nr_numero = ?";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ps.setString(1, postoEletrico.getCidade());
				ps.setInt(2, postoEletrico.getNumero());
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
		public ArrayList<PostoEletrico> retornarDados() {
			String sql = "select * from T_MTP_POSTOELETRICO";
			ArrayList<PostoEletrico> retornarPostoEletrico = new ArrayList<PostoEletrico>();
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				if (rs != null) {
					while (rs.next()) {
						PostoEletrico postoEletrico = new PostoEletrico();
						postoEletrico.setNomePostoEletrico(rs.getString(1));
						postoEletrico.setCep(rs.getInt(2));
						postoEletrico.setCidade(rs.getString(3));

					}
					return retornarPostoEletrico;
				} else {
					return null;
				}
			} catch (SQLException e) {
				return null;
			}

		}

}
