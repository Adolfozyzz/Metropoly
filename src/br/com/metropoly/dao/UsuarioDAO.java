package br.com.metropoly.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.metropoly.beans.Usuario;

public class UsuarioDAO {
	
	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public UsuarioDAO(Connection con) {
		setCon(con);
	}

	public String inserirUsuario(Usuario usuario) {
		String sql = "insert into T_MTP_USUARIO (  nm_nome, nm_sobrenome, ds_email, ds_senha, nr_telefone)" + 
	" values (?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			
			
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getSobrenome());
			ps.setString(3, usuario.getEmail());
			ps.setString(4, usuario.getSenha());
			ps.setInt(5, usuario.getTelefone());
			
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso.";
			} else {
				return "Erro ao inserir.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
			public String deletar(Usuario usuario) {
				String sql = "delete from T_MTP_USUARIO where ds_email = ?";
				try {
					PreparedStatement ps = getCon().prepareStatement(sql);
					ps.setString(1, usuario.getEmail());
					if (ps.executeUpdate() > 0) {
						return "Deletado com sucesso.";
					} else {
						return "Erro ao deletar.";
					}
				} catch (SQLException e) {
					return e.getMessage();
				}
			}
			

			public String alterar(Usuario usuario) {
				String sql = "update T_MTP_USUARIO set ds_senha = ? where nr_telefone = ?";
				try {
					PreparedStatement ps = getCon().prepareStatement(sql);
					ps.setString(1, usuario.getSenha());
					ps.setInt(2, usuario.getTelefone());
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
			public ArrayList<Usuario> retornarDados(){
				String sql = "select * from T_MTP_USUARIO";
				ArrayList<Usuario> retornarUsuario = new ArrayList<Usuario>();
				try {
					PreparedStatement ps = getCon().prepareStatement(sql);
					ResultSet rs = ps.executeQuery();
					if (rs != null) {
						while (rs.next()) {
							Usuario usuario = new Usuario();
							
							usuario.setNome(rs.getString(1));
							usuario.setSenha(rs.getNString(2));
							usuario.setTelefone(rs.getInt(3));
							retornarUsuario.add(usuario);
						}
						return retornarUsuario;
					}else {
						return null;
					}
				}catch (SQLException e) {
					return null;
				}

}

}
