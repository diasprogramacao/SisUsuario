package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaLogin {
	
	
	public void telaAutenticacaoUsuario () {
		
		String campoUsuario = "Usuário";
		String campoSenha = "Senha";
		
		JFrame frameTelaLogin = new JFrame();
		frameTelaLogin.setSize(300,300);
		
		JPanel painelTelaLogin = new JPanel();
		
		GridLayout gridTelaLogin = new GridLayout(0,1);
		painelTelaLogin.setLayout(gridTelaLogin);
		
		JLabel labelCampoUsuario = new JLabel();
		labelCampoUsuario.setText(campoUsuario);
		painelTelaLogin.add(labelCampoUsuario);
		JTextField respostaCampoUsuario = new JTextField(10);
		painelTelaLogin.add(respostaCampoUsuario);
		
		JLabel labelCampoSenha = new JLabel();
		labelCampoSenha.setText(campoSenha);
		painelTelaLogin.add(labelCampoSenha);
		JTextField respostaCampoSenha = new JTextField(10);
		painelTelaLogin.add(respostaCampoSenha);
		
		JButton botaoEntrar = new JButton("Entrar");
		painelTelaLogin.add(botaoEntrar);
		
		frameTelaLogin.add(painelTelaLogin);
		frameTelaLogin.setVisible(true);
		
		
		
	}

}
