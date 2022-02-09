public class UsuarioNaoCadastrado {
	
	//Construtor
	public UsuarioNaoCadastrado(String novoNome) {
		setNome(novoNome);
	}
	
	//Atributos
	public String nome;
	
	//Métodos
	public void solicitarCadastro(String cpf) {
		User novoUsuario = new Usuario(nome, cpf);
	}
	
	//Sets
	private void setNome(novoNome) {
		nome = novoNome;
	}
	
	//Gets
	public String getNome() {
		return nome;
	}
	
}
