import static org.junit.Assert.assertEquals;


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
