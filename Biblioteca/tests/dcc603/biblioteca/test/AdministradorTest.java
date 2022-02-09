package dcc603.biblioteca.test;

import static org.junit.Assert.assertEquals;

public class AdministradorTest {
	
	public void TestAdministradorCadastro() {
		
		Administrador administrador = new Administrador();
		
		administrador.Administrador("adm1", "senha123");
		
		assertEquals("adm1", administrador.login );
		assertEquals("senha123", administrador.senha );	
	
	}
	
	public void TestRemoverUsuario() {
		
		administrador.removerUsuario("Maria");
		assertNotEquals("Maria", usuario);
	}
		

}