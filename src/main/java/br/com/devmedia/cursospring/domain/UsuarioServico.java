package br.com.devmedia.cursospring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServico {
	private Usuario usuario;
	
	@Autowired
	private Mailer mailer;

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void lembrarSenhaPorEmail() {
		//O banco de dados poderia ser acessado aqui
		//para recuperacao da senha do usuario
		
		mailer.setDestinario(usuario.getEmail());
		mailer.setMensagem("A senha do usuario" + usuario.getLogin()+ "e xxx");
		mailer.enviarEmail();
	}
	
}
