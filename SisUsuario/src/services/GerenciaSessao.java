package services;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;
import repository.RepositorioUsuario;

public class GerenciaSessao {
	
	public Usuario validarAcessoUsuario(int identificacao,String senha) {
		
		RepositorioUsuario  repositorioUsuario = new RepositorioUsuario();
		Usuario usuario = new Usuario();
		usuario = repositorioUsuario.buscarUsuario(identificacao, senha);
		
		if (usuario != null ) {
			System.out.println("Usuario e senha corretos");
			return usuario;
			
		} else{
			System.out.println("Usuario e senha incorretos");
		}
		
		return null;
	}

}
