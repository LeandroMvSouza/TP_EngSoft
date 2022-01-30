/**
 * 
 */
package dcc603.biblioteca.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dcc603.biblioteca.Projeto;

/**
 * @author Eduardo.
 *
 * Atencao! Este caso de teste eh um esqueleto. 
 * Voce pode (e deve) mudar e ampliar sua implementacao.
 * 
 */
public class ProjetoTest {
	
	
	/*
	 * Template para a criacao de um caso de teste:
	 * 
	 * 		@Test
	 * 		public void test(){
	 * 			// dado que eu tenho...
	 * 			// quando eu fa�o...
	 * 			// entao eu epero que aconteca...
	 * 		}
	 */

	@Test
	public void testFecharProjetoPassa(){
		// nota que eu tenho...
		Projeto projeto = new Projeto();
		
		// quando eu faco...
		projeto.fecharProjeto();
		
		// entao eu epero que aconteca...
		assertTrue("O projeto deveria estar fechado.", projeto.projetoFechadoCerto() );
	}
	
	@Test
	public void testFecharProjetoFalha(){
		// nota que eu tenho...
		Projeto projeto = new Projeto();
		
		// quando eu faco...
		projeto.fecharProjeto();
		
		// entao eu epero que aconteca...
		assertTrue("O projeto deveria estar fechado.", projeto.projetoFechadoErrado() );
	}
	
}
