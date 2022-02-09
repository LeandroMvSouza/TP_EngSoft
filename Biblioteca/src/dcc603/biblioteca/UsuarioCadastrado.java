package dcc603.biblioteca;
import java.lang.*;

public class UsuarioCadastrado {

	//Construtor
	public UsuarioCadastrado(String novoNome, String novoCpf) {
		setNome(novoNome);
		setCpf(novoCpf);
	}

	//Atributos
	int N = 5;
	protected String nome;
	protected String cpf;
	protected Exemplar[] exemplaresEmprestados = new Exemplar[N];
	protected Exemplar[] titulosPerdidos = new Exemplar[N];
	protected boolean podeRealizarEmprestimo;

	//Métodos
	protected void realizarEmprestimo(Exemplar exemplarAPegarEmprestado) {
		if(exemplaresEmprestados.length < N && titulosPerdidos.length == 0 && podeRealizarEmprestimo) {
			exemplaresEmprestados = append(exemplaresEmprestados, exemplarAPegarEmprestado);
		}
	}

	protected String consultarStatusEmprestimo() {
		if(podeRealizarEmprestimo) {
			return("Pode realizar empréstimo");
		} else {
			return("Não pode realizar empréstimo");
		}
	}

	protected void informaPerda(Exemplar exemplarPerdido) {
		titulosPerdidos = append(titulosPerdidos, exemplarPerdido);
	}

	protected void preencheFormularioReposicao(Exemplar exemplarASerReposto) {
		for (i = 0; i < exemplaresEmprestados.length; i++) {
			if(exemplaresEmprestados[i].nome == exemplarASerReposto.nome) {
				exemplarASerReposto;
			}
		}
	}

	//Sets
	private void setNome(String novoNome) {
		nome = novoNome;
	}

	private void setCpf(String novoCpf) {
		cpf = novoCpf;
	}

	//Gets
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Exemplar[] getExemplaresEmprestados() {
		return exemplaresEmprestados;
	}

	public Exemplar[] getTitulosPerdidos() {
		return titulosPerdidos;
	}

}