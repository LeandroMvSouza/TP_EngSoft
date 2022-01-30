package dcc603.biblioteca;

/**
 * Classes têm seus elementos nesta ordem :
 * 
 *  - Atributos
 *  - Getter's
 *  - Setter's
 *  - Demais métodos
 *  - Construtor
 *
 */

public class User {
	protected float ownedDept = 0;
	protected String name;
	protected String cpf;

	// Um usuário pode pegar emprestado até N exemplares. Além disso,
	// um usuário não pode pegar emprestado mais de um exemplar
	// do mesmo título (i.e. dois "Harry Potter e a Pedra Filosofal")
	protected Exemplar[] loanedExemplars;

	// Um usuário pode perder até N exemplares.
	protected Exemplar[] lostExemplars;

	// Um usuário só pode pegar um título emprestado caso não 
	// tenha nenhum título perdido e se sua dívida atual é 0.
	protected boolean canLoan = true;
}
