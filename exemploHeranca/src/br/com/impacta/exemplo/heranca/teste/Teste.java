package br.com.impacta.exemplo.heranca.teste;

import br.com.impacta.exemplo.heranca.Programador;

public class Teste {

	public static void main(String[] args) {
		
		Programador p = new Programador("Joaquim", 3678, "Java");
		
		
		//p.setNome("José");
		//p.setSalario(2.567);
		//p.setLinguagem("Java");
		
		System.out.println("Dados do programador: ");
		System.out.println("Nome : " + p.getNome());
		
		
		
		
	}

}
