package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.Usuario;
import services.GerenciaSessao;
import view.TelaMenuInicial;

public class ControladorTelaLogin implements ActionListener {

	JFrame    frameTelaLoginRecebido;
	JTextField campoUsuarioRecebido;
	JTextField campoSenhaRecebido;
	
	public ControladorTelaLogin(JFrame frameTelaLoginRecebido, JTextField campoUsuarioRecebido,
			JTextField campoSenhaRecebido) {
		this.frameTelaLoginRecebido = frameTelaLoginRecebido;
		this.campoUsuarioRecebido = campoUsuarioRecebido;
		this.campoSenhaRecebido = campoSenhaRecebido;
	}

	GerenciaSessao gerenciaSessao = new GerenciaSessao();
	TelaMenuInicial telaMenuInicial = new TelaMenuInicial();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Usuario usuario;
		usuario = gerenciaSessao.validarAcessoUsuario(Integer.parseInt(campoUsuarioRecebido.getText()),campoSenhaRecebido.getText());
		
		if(usuario != null) {
			telaMenuInicial.telaMenuInicial();
			JOptionPane.showMessageDialog(null, "Seja Bem-Vindo " + usuario.getNome());
		}else {
			JOptionPane.showMessageDialog(null, "Usuário Invalido");
		}
		
	}

	
	
}
