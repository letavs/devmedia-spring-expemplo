package br.com.devmedia.cursospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.devmedia.cursospring.domain.Pessoa;

@Configuration
@ComponentScan
public class Programa {

	public static void main(String[] args) {
	
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(Programa.class);

		Pessoa pessoa = context.getBean(Pessoa.class);
		
		pessoa.setNome("Fernando");
		pessoa.setIdade(5);
		System.out.println(pessoa);
		
	}
}
