

public class Titulo {

	//Construtor
	public Titulo(String novoNome, String novoAutor, int novoPeriodoEmprestimo, int novoPeriodoReserva, String novaDescricao, Exemplar[] novosExemplares) {
		setNome(novoNome);
		setAutor(novoAutor);
		setPeriodoEmprestimo(novoPeriodoEmprestimo);
		setPeriodoReserva(novoPeriodoReserva);
		setDescricao(novaDescricao);
		setExemplares(novosExemplares);
	}
	
	//Atributos
	protected String nome;
	protected String autor;
	protected int periodoEmprestimo;
	protected int periodoReverva;
	protected String descricao;
	protected Exemplar[] exemplares = new Exemplar[N];
	
	//Sets
	private void setNome(String novoNome) {
		nome = novoNome;
	}
	
	private void setAutor(String novoAutor) {
		autor = novoAutor;
	}
	
	private void setPeriodoEmprestimo(int novoPeriodoEmprestimo) {
		periodoEmprestimo = novoPeriodoEmprestimo;
	}
	
	private void setPeriodoReserva(int novoPeriodoReserva) {
		periodoReverva = novoPeriodoReserva;
	}
	
	private void setDescricao(String novaDescricao) {
		descricao = novaDescricao;
	}
	
	private void setExemplares(Exemplar[] novosExemplares) {
		exemplares = novosExemplares;
	}
	
	//Gets
	public String getNome() {
		return nome;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getPeriodoEmprestimo() {
		return periodoEmprestimo;
	}
	
	public int getPeriodoReverva() {
		return periodoReverva;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public Exemplar[] getExemplares() {
		return exemplares;
	}
	
}
