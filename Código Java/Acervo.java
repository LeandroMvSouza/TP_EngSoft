public class Acervo {

	//Construtor
	public Acervo(Titulo[] novosTitulos) {
		setTitulos(novosTitulos);
	}
	
	//Atributos
	protected Titulo[] titulos = new Titulo[N];
	protected Exemplar[] exemplaresDisponiveis = new Exemplar[N];
	
	//Métodos		
	public Titulo[] consultarAcervo() {
		return titulos;
	}
	
	//Sets
	private void setTitulos(Titulo[] novosTitulos) {
		titulos = novosTitulos;
	}
	
	//Gets
	public Titulo[] getTitulos() {
		return titulos;
	}
	
	public Exemplar[] getExemplaresDisponiveis() {
		return exemplaresDisponiveis;
	}
	
}
