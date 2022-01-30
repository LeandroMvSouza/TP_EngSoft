package dcc603.biblioteca;
import java.util.ArrayList;

public class User {
	protected float ownedDept = 0;
	protected String name;
	protected String cpf;

	// Um usuário pode pegar emprestado até N exemplares. Além disso,
	// um usuário não pode pegar emprestado mais de um exemplar
	// do mesmo título (i.e. dois "Harry Potter e a Pedra Filosofal")
	protected ArrayList <Exemplar> loanedExemplars;

	// Um usuário pode perder até N exemplares.
	protected ArrayList <Exemplar> lostExemplars;

	// Um usuário só pode pegar um título emprestado caso não 
	// tenha nenhum título perdido e se sua dívida atual é 0.
	protected boolean canLoan = true;

	// ------------------Construtor-------------------------

	public User(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
		this.loanedExemplars = new ArrayList<Exemplar>();
		this.lostExemplars = new ArrayList<Exemplar>();
    }

	// -------------------Métodos---------------------------


	// -------------------Getter's/Setter's-----------------
	public float getOwnedDept() {
		return ownedDept;
	}

	public void setOwnedDept(float ownedDept) {
		this.ownedDept = ownedDept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArrayList<Exemplar> getLoanedExemplars() {
		return loanedExemplars;
	}

	public void setLoanedExemplars(ArrayList<Exemplar> loanedExemplars) {
		this.loanedExemplars = loanedExemplars;
	}

	public ArrayList<Exemplar> getLostExemplars() {
		return lostExemplars;
	}

	public void setLostExemplars(ArrayList<Exemplar> lostExemplars) {
		this.lostExemplars = lostExemplars;
	}

	public boolean isCanLoan() {
		return canLoan;
	}

	public void setCanLoan(boolean canLoan) {
		this.canLoan = canLoan;
	}
}
