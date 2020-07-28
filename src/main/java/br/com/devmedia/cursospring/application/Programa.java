package br.com.devmedia.cursospring.application;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.devmedia.cursospring.domain.Pessoa;
import br.com.devmedia.cursospring.domain.Usuario;
import br.com.devmedia.cursospring.domain.UsuarioServico;

@Configuration
@ComponentScan("br.com.devmedia.cursospring")
public class Programa {

	public static void main(String[] args) {
		Scanner lerDados = new Scanner(System.in);
		Usuario usuario =new Usuario("Fernando", "fernando@gmail.com", "fernando123");
		
		System.out.println("Deseja recuperar a senha (S/N)?");
		String resposta = lerDados.nextLine();
		
		if (resposta.equalsIgnoreCase("S")) {
			ApplicationContext context = 
					new AnnotationConfigApplicationContext(Programa.class);
		UsuarioServico usuarioServico = context.getBean(UsuarioServico.class);
		
		usuarioServico.setUsuario(usuario);
		usuarioServico.lembrarSenhaPorEmail();
		}
	
		
	
		
	}
}
