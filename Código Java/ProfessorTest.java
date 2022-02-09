import static org.junit.Assert.assertEquals;


public class TestProfessor() {
	
	public void testReservaTitulo() {
		
		UsuarioCadastrado usuario = new UsuarioCadastrado();
		
		usuario.reservaTitulo("Pequeno Principe");
		
		assertEquals(consultarTitulosReservados(), "Pequeno Principe")
	}
}
