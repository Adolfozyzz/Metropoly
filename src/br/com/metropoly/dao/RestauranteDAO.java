package br.com.metropoly.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import br.com.metropoly.beans.Restaurante;

public class RestauranteDAO {
	
	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public RestauranteDAO(Connection con) {
		setCon(con);
	}

	public String inserirRestaurante(Restaurante restaurante) {
		String sql = "insert into T_MTP_RESTAURANTE (cd_restaurante, nm_restaurante, nm_rua, nm_bairro, nm_cidade, nr_numero, nr_cep, st_status, nr_cnpj, nr_quant_estrelas, nr_quant_estrelas, nr_telefone)" + 
	" values (?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			
			
			ps.setInt(1, restaurante.getCdRestaurante());
			ps.setString(2, restaurante.getNomeRestaurante());
			ps.setString(4, restaurante.getNomeRua());
			ps.setString(5, restaurante.getNomeBairro());
			ps.setString(6, restaurante.getCidade());
			ps.setInt(7, restaurante.getNumero());
			ps.setInt(8, restaurante.getCep());
			ps.setBoolean(9, false);
			ps.setLong(10, restaurante.getCnpj());
			ps.setInt(11, restaurante.getNumeroQuantidadeEstrelas());
			ps.setInt(12, restaurante.getTelefone());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso.";
			} else {
				return "Erro ao inserir.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
			public String deletar(Restaurante restaurante) {
				String sql = "delete from T_MTP_RESTAURANTE where nm_cidade = ?";
				try {
					PreparedStatement ps = getCon().prepareStatement(sql);
					ps.setString(1, restaurante.getCidade());
					if (ps.executeUpdate() > 0) {
						return "Deletado com sucesso.";
					} else {
						return "Erro ao deletar.";
					}
				} catch (SQLException e) {
					return e.getMessage();
				}
			}
			

			public String alterar(Restaurante restaurante) {
				String sql = "update T_MTP_RESTAURANTE set nm_cidade = ? where nr_telefone = ?";
				try {
					PreparedStatement ps = getCon().prepareStatement(sql);
					ps.setString(1, restaurante.getCidade());
					ps.setInt(2, restaurante.getNumero());
					if (ps.executeUpdate() > 0) {
						return "Alterado com sucesso";
					} else {
						return "Erro ao alterar";
					}
				} catch (SQLException e) {
					return e.getMessage();
				}
			}
		//Select
			public ArrayList<Restaurante> retornarDados(){
				String sql = "select * from T_MTP_RESTAURANTE";
				ArrayList<Restaurante> retornarRestaurante = new ArrayList<Restaurante>();
				try {
					PreparedStatement ps = getCon().prepareStatement(sql);
					ResultSet rs = ps.executeQuery();
					if (rs != null) {
						while (rs.next()) {
							Restaurante restaurante = new Restaurante();
							restaurante.setNomeRestaurante(rs.getString(1));
							restaurante.setCep(rs.getInt(2));
							restaurante.setCidade(rs.getString(3));
						
						}
						return retornarRestaurante;
					}else {
						return null;
					}
				}catch (SQLException e) {
					return null;
				}

}

}
