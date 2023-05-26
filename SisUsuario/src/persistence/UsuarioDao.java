package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connectionFactory.FabricaConexaoBancoDados;
import model.Usuario;

public class UsuarioDao   {
	
public List<Usuario> ListaUsuario() {

		
		String comandoSql = "Select * from usuario";
		Connection conexao = null;
		PreparedStatement declaracaoComando = null;
		ResultSet resultadoConsulta = null;
		
		List<Usuario> listaUsuario = new ArrayList();
		FabricaConexaoBancoDados fabricaConexaoBancoDados = new FabricaConexaoBancoDados();
		
		try {
			conexao = fabricaConexaoBancoDados.criarConexao();	
			declaracaoComando = (PreparedStatement)conexao.prepareStatement(comandoSql);
			resultadoConsulta = declaracaoComando.executeQuery();
			
			while(resultadoConsulta.next()) {
				
				Usuario usuario = new Usuario();
				usuario.setId(resultadoConsulta.getInt("identificacao"));
				usuario.setNome(resultadoConsulta.getString("nome"));
				usuario.setEmail(resultadoConsulta.getString("email"));
				usuario.setTipoUsuario(resultadoConsulta.getString("tipoUsuario"));
				usuario.setSenha(resultadoConsulta.getString("senha"));
				listaUsuario.add(usuario);
				
			}
			
		} catch(Exception MensagemErro) {
			
			System.out.println("Erro ao retornar lista de usuário");
		}
		
		return listaUsuario;
	}
	

	}
