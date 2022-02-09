public class Periodico {
	
	//Construtor
	public Periodico(Date novoDiaContratado, int novoPeriodo, float novoValor) {
		diaContratado = novoDiaContratado;
		periodo = novoPeriodo;
		valor = novoValor;
	}

	//Atributos
	protected Date diaContratado;
	protected int periodo;
	protected float valor;
	
	//Sets
	private setDate(Date novoDiaContratado) {
		diaContratado = novoDiaContratado;
	}
	
	private setPeriodo(int novoPeriodo) {
		periodo = novoPeriodo;
	}
	
	private setValor(float novoValor) {
		valor = novoValor;
	}
	
	//Gets
	public Date getDiaContratado() {
		return diaContratado;
	}
	
	public int getPeriodo() {
		return periodo;
	}
	
	public float getValor() {
		return valor;
	}
}
