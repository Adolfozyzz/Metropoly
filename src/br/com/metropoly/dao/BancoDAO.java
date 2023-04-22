package br.com.metropoly.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.metropoly.beans.Banco;

public class BancoDAO {
	
	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public BancoDAO(Connection con) {
		setCon(con);
	}

	public String inserirBanco(Banco banco) {
		String sql = "insert into T_MTP_BANCO ( nm_banco, nm_rua, nm_bairro, nm_cidade, nr_numero, nr_cep, st_status, nr_cnpj)" + 
	" values (?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			
			
			ps.setString(1, banco.getNomeBanco());
			ps.setString(2, banco.getNomeRua());
			ps.setString(3, banco.getNomeBairro());
			ps.setString(4, banco.getCidade());
			ps.setInt(5, banco.getNumero());
			ps.setInt(6, banco.getCep());
			ps.setBoolean(7, false);
			ps.setLong(8, banco.getCnpj());
			
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso.";
			} else {
				return "Erro ao inserir.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
			public String deletar(Banco banco) {
				String sql = "delete from T_MTP_BANCO where nm_cidade = ?";
				try {
					PreparedStatement ps = getCon().prepareStatement(sql);
					ps.setString(1, banco.getCidade());
					if (ps.executeUpdate() > 0) {
						return "Deletado com sucesso.";
					} else {
						return "Erro ao deletar.";
					}
				} catch (SQLException e) {
					return e.getMessage();
				}
			}
			

			public String alterar(Banco banco) {
				String sql = "update T_MTP_BANCO set nm_cidade = ? where nr_telefone = ?";
				try {
					PreparedStatement ps = getCon().prepareStatement(sql);
					ps.setString(1, banco.getCidade());
					ps.setInt(2, banco.getNumero());
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
			public ArrayList<Banco> retornarDados(){
				String sql = "select * from T_MTP_BANCO";
				ArrayList<Banco> retornarBanco = new ArrayList<Banco>();
				try {
					PreparedStatement ps = getCon().prepareStatement(sql);
					ResultSet rs = ps.executeQuery();
					if (rs != null) {
						while (rs.next()) {
							Banco banco = new Banco();
							banco.setNomeBanco(rs.getString(1));
							banco.setCep(rs.getInt(2));
							banco.setCidade(rs.getString(3));
						
						}
						return retornarBanco;
					}else {
						return null;
					}
				}catch (SQLException e) {
					return null;
				}

}

}
