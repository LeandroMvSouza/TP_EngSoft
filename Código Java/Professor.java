
public class Professor extends UsuarioCadastrado{

	//Atributos
	protected Titulo[] titulosReservados = new Titulo[N];
	
	//Métodos
	protected void reservaTitulo(exemplar tituloASerReservado) {
		titulosReservados = append(titulosReservados, tituloASerReservado);
	}
	
	protected Titulo[] consultarTitulosReservados() {
		return titulosReservados;
	}
	
	//Gets
	public Titulo[] getTitulosReservados() {
		return titulosReservados;
	}
		
}

