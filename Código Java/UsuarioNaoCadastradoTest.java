import static org.junit.Assert.assertEquals;


public class TestUsuarioNaoCadastrado{
	
	//Construtor
	public void TestUsuarioNaoCadastrado() {
		
		UsuarioNaoCadastrado usuario = new UsuarioNaoCadastrado();
		
		usuario.UsuarioNaoCadastrado("Joao");
		
		assertEquals("Joao", usuario.nome);
		
	}
	
	public void TestSolicitarcadastro(){
		
		usuario.solicitarCadastro("12345678912")
		
		assertEquals("Joao", usuario.nome);
		assertEquals("12345678912", usuario.cpf);
	}
	
}