package dcc603.biblioteca.test;

import static org.junit.Assert.assertEquals;

public class UsuarioCadastradoTest {
	
	//Construtor
	public void TestUsuarioCadastrado() {
		
		UsuarioCadastrado usuario = new UsuarioCadastrado();
		
		usuario.UsuarioCadastrado("Maria", "11122233345");
		
		assertEquals("Maria", usuario.getNome() );
		assertEquals("11122233345", usuario.getCpf() );
		
	}
	
	public void TestConsultarStatusEmprestimo() {
		
		assertEquals(usuario.consultarStatusEmprestimo(), "Pode realizar empréstimo");
		
	}
	
	public void TestRealizarEmprestimo() {
		
		assertEquals(1, usuario.podeRealizarEmprestimo);
		usuario.realizarEmprestimo("Pequeno Principe");
		assertEquals(0, usuario.podeRealizarEmprestimo);
	}
}
