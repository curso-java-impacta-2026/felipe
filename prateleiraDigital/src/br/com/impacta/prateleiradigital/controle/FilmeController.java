package br.com.impacta.prateleiradigital.controle;

import br.com.impacta.prateleiradigital.negocio.Filme;
import br.com.impacta.prateleiradigital.persistencia.FilmeDAO;

/**
 * @author Felipe
 * 
 * 
 * 
 */


public class FilmeController {

	/**
	 * 
	 * @param titulo - O titulo do filme que será trabalhado durante o processo.
	 * @param diretores - Os diretores em questão.
	 * @param nota- As notas do filme do imdb.
	 * @param duracao- Duração do filme em minutos.
	 * @param ano- Ano de lançamento do filme no padrão YYYY.
	 * @param generos- Genero do filme tratado como: [Ação,comedia,drama,etc;]
	 * @param numDeVotos- A quantidade de votos positivos na plataforma da imdb.
	 * @param url- A url direta da pagina do filme na plataforma da imdb.
	 * @return Filme- Um objeto completo contendo todas as informações sobre Filme.
	 */
	
	public Filme criarFilme(String titulo, String diretores, double nota, int duracao, int ano, String generos,
			int numDeVotos, String url) {

		Filme filme = new Filme(titulo, diretores, nota, duracao, ano, generos, numDeVotos, url);

		System.out.println("Filme criado com sucesso!");

		return filme;
/**
 * 
 * 
 * 
 */
	
	}

	public Filme criarFilme(Filme filme) {

		FilmeDAO fd = new FilmeDAO();

		if (fd.insert(filme)) {
			System.out.println("Filme criado com SUCESSO!");
			return filme;
		}

		System.out.println("Ocorreu um erro ao tentar criar o FILME!");
		return null;

	}

}
