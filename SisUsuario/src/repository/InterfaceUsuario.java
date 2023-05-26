package repository;

import java.util.List;

import model.Usuario;

public interface InterfaceUsuario {
	
	public List<Usuario> ListaUsuario();
	
	public Usuario buscarUsuario(int identificacao,String senha);
	

}
