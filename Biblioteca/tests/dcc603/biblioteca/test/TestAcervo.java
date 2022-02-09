package dcc603.biblioteca.test;

import static org.junit.Assert.assertEquals;

public class TestAcervo{
	
	public void TestCriaAcervo() {
		
		Acervo acervo = new Acervo("Pequeno Principe");
		
		assertEquals("Pequeno Principe", acervo.titulos);
		
	}
	
	public void TestConsultarAcervo() {
		
		acervo.consultaAcervo();
		
		assertNotNull(null, acervo);
	}
}