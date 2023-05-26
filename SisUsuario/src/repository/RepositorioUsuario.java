package repository;

import java.util.List;

import model.Usuario;
import persistence.UsuarioDao;

public class RepositorioUsuario implements InterfaceUsuario{

	@Override
	public List<Usuario> ListaUsuario() {
		
		UsuarioDao UsuarioDao = new UsuarioDao();	
		
		return UsuarioDao.ListaUsuario();
	}

	@Override
	public Usuario buscarUsuario(int identificacao,String senha) {
		
		String id = Integer.toString(identificacao);
		
		for(Usuario usuario:ListaUsuario()) {
			
			if(id.equals(Integer.toString(usuario.getId()))) {
				
				if(senha.equals(usuario.getSenha())) {
					
					System.out.println("Usuário Encontrado");
					return usuario;		
				}
				
				
			} else {
				System.out.println("Usuário não encontrado");
				
			}

		}
		return null;
	}

	
}
