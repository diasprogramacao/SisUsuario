package model;

public class Usuario {
	
	   int identificacao; 
	   String nome;
	   String email;
	   String TipoUsuario;
	   String senha;
	   
	   
	public int getId() {
		return identificacao;
	}
	public void setId(int id) {
		this.identificacao = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTipoUsuario() {
		return TipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		TipoUsuario = tipoUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	   
}
