package dcc603.biblioteca;

/**
 * Um exemplar é uma unidade atômica de um título.
 *
 * Por exemplo:
 *  - Senhor dos Aneis e a Sociedade do Anel é um título X
 *    X->exemplars[0] é o primeiro exemplar
 *    X->exemplars[1] é o segundo exemplar
 */

public class Exemplar {

	//Construtor
	public Exemplar( boolean novoEmprestado, boolean novoPerdido, int novoDiasEmprestado, int novoDiasReservado, boolean novoEstaAtrasado, boolean novoEstaReservado) {
		setEmprestado(novoEmprestado);
		setPerdido(novoPerdido);
		setDiasEmprestado(novoDiasEmprestado);
		setEstaAtrasado(novoDiasReservado);
		setEstaReservado(novoEstaAtrasado);
		setExemplares(novoEstaReservado);
	}

	//Atributos
	protected boolean emprestado;
	protected boolean perdido;
	protected int diasEmprestado;
	protected int diasReservado;
	protected boolean estaAtrasado;
	protected boolean estaReservado;

	//Métodos
	protected void alterarStatus(boolean novoStatus) {
		emprestado = novoStatus;
	}

	//Sets
	private void setEmprestado(boolean novoEmprestado) {
		emprestado = novoEmprestado;
	}

	private void setPerdido(boolean novoPerdido) {
		perdido = novoPerdido;
	}

	private void setDiasEmprestado(int novoDiasEmprestados) {
		diasEmprestado = novoDiasEmprestados;
	}

	private void setEstaAtrasado(int novoDiasReservados) {
		diasReservado = novoDiasReservados;
	}

	private void setEstaReservado(boolean novoEstaAtrasado) {
		estaAtrasado = novoEstaAtrasado;
	}

	private void setExemplares(boolean novoEstaReservado) {
		estaReservado = novoEstaReservado;
	}

	//Gets
	public boolean getEmprestado() {
		return emprestado;
	}

	public boolean getPerdido() {
		return perdido;
	}

	public int getDiasEmprestado() {
		return diasEmprestado;
	}

	public int getDiasReservado() {
		return diasReservado;
	}

	public boolean getEstaAtrasado () {
		return estaAtrasado;
	}

	public boolean getEstaReservado() {
		return estaReservado;
	}

}