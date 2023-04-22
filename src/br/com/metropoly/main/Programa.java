package br.com.metropoly.main;


import javax.swing.JOptionPane;

import br.com.metropoly.beans.Usuario;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String recebeNome = JOptionPane.showInputDialog("Digite o nome do usuario");
		String recebeSobrenome = JOptionPane.showInputDialog("Digite o sobrenome");
		int recebeCdUsuario = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do usuario"));
		String recebeEmail = JOptionPane.showInputDialog("Digite o email do usuario");
		String recebeSenha = JOptionPane.showInputDialog("Digite a senha");
		int recebeTelefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de telefone"));

		Usuario usuario;
		usuario = new Usuario(recebeCdUsuario, recebeSobrenome, recebeNome, recebeEmail, recebeSenha, recebeTelefone);
		
	
		System.out.println(usuario.mostrarAtributos());
		
		

		

	}

	}


