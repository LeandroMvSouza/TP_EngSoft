public class Administrador {
	
	//Construtor
	public Administrador(String novoLogin, String novaSenha) {
		setLogin(novoLogin);
		setSenha(novaSenha);
	}
	

	//Atributos
	private String login;
	private String senha;
	
	//Métodos
	private void cadastrarTitulo(String nome, String autor, int periodoEmprestimo, int periodoReserva, String descricao, Exemplar exemplares) {
		Titulo novoUsuario = new Titulo(nome, autor, periodoEmprestimo, periodoReserva, descricao, exemplares);
	}
	
	private void cadastrarUsuario(UsuarioNaoCadastro usuarioACadastrar, String cpf) {
		UsuarioCadastrado novoUsuario = new UsuarioCadastrado(usuarioACadastrar.nome, cpf);
	}

	private void cadastrarPeriodicos(Date diaContratado, int periodo, float valor) {
		Periodico novoPeriodico = new Periodico(diaContratado, periodo, valor);
	}

	private void removerUsuario(Usuario usuarioARemover) {
		usuarioARemover = null;
	}
	
	//Sets
	private setLogin(String novoLogin) {
		login = novoLogin;
	}
	
	private setSenha(String novaSenha) {
		senha = novaSenha;
	}
	
	
}

