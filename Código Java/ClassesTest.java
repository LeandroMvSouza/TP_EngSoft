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


public class PeriodicoTest {
	

	public void TestPeriodicoCadastro() {
	
		Periodico periodico = new Periodico();
		
		periodico.Periodico("20/11/2020", 3, 5.5);
		
		assertEquals("20/11/2020", periodico.getDiaContratado() );
		assertEquals(3, periodico.getPeriodo() );
		assertEquals(5.5, periodico.getValor() );
		
	}
		
}


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



public class TestExemplar {

	
	public void TestCriaExemplar() {
		
		Exemplar exemplar = new Exemplar();
		
		exemplar.Exemplar(0,0,0,0,0,0);
		
		assertEquals(0, exemplar.emprestado );
	}

	
	public void TestAlterarStatus() {
		
        Exemplar exemplar = new Exemplar();
		
		exemplar.Exemplar(0,0,0,0,0,0);
		
		exemplar.alterarStatus(1);
		
		assertEquals(1, exemplar.emprestado );
	
	}
	
}



public class TestTitulo {

	
	 public void TestCriarTitulo() {
		 
		 Titulo titulo = new Titulo();
		 
		 titulo.Titulo("Titulo 1", "Paulo Ricardo", 0, 0, "Um jovem...",30); 
		 
		 
		 assertEquals("Titulo 1", titulo.novoNome );
		 assertEquals("Paulo Ricardo", titulo.novoAutor );
		 assertEquals(0, titulo.novoPeriodoEmprestimo );
		 assertEquals(0, titulo.novoPeriodoReserva );
		 assertEquals("Um jovem...", titulo.novaDescricao );
		 assertEquals(30, titulo.novosExemplares );
		 
	 }
		
		 
}



public class TestProfessor() {
	
	public void testReservaTitulo() {
		
		UsuarioCadastrado usuario = new UsuarioCadastrado();
		
		usuario.reservaTitulo("Pequeno Principe");
		
		assertEquals(consultarTitulosReservados(), "Pequeno Principe")
	}
}


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





