package br.com.devmedia.cursospring.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mailer {

	private String destinario;
	
	@Value("contato@devmedia.com.br")
	private String remetente;
	
	@Value("Lembrete de senha DevMedia")
	private String titulo;
	private String mensagem;
	public String getDestinario() {
		return destinario;
	}
	public void setDestinario(String destinario) {
		this.destinario = destinario;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public void enviarEmail() {
		//Simulando envio de e-mail
		System.out.println("** E-mail enviado com sucesso!");
		System.out.println("Titulo do e-mail: "+titulo);
		System.out.println("Remetente: "+remetente);
		System.out.println("Destinatario: "+destinario);
		System.out.println("Mensagem "+mensagem);
	}
	
}
