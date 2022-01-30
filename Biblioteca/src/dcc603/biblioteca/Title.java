package dcc603.biblioteca;
import java.util.ArrayList;

/**
 * Um título é único e representa uma obra literária
 * ou periódica, possuindo as informações necessárias
 * para identificá-lo. Caso um título tenha mais de
 * um volume, essa informação estará presente em
 * seu título, separada por um | .
 * 
 * Por exemplo :
 * 
 *  - Harry Potter e a Pedra Filosofal
 *  - Cálculo | Volume 1
 *  - Cálculo | Volume 2
 */

public class Title {
    private ArrayList <Exemplar> exemplars;

    // O número padrão de dias para a duração de um empréstimo.
    private int loanPeriod = 14;

    // O número padrão de dias para um título permanecer reservado.
    // 183 é aproximadamente 6 meses.
    private int reservePeriod = 183;

    protected boolean isReserved = false;
    protected String name;
    protected String author;
    protected String description;

    // ------------------Construtor-------------------------
    public Title(String name, String author, String description) {
        this.description = description;
        this.name = name;
        this.author = author;

        // Cada título terá 2 exemplares distintos da mesma obra literária/periódico.
        this.exemplars = new ArrayList<Exemplar>();
        for (int i = 0; i < 2; i++) {
            exemplars.add(new Exemplar());
        }
    }
    
	// -------------------Métodos---------------------------


	// -------------------Getter's/Setter's-----------------
    public ArrayList<Exemplar> getExemplars() {
        return exemplars;
    }

    public void setExemplars(ArrayList<Exemplar> exemplars) {
        this.exemplars = exemplars;
    }

    public int getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(int loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public int getReservePeriod() {
        return reservePeriod;
    }

    public void setReservePeriod(int reservePeriod) {
        this.reservePeriod = reservePeriod;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean isReserved) {
        this.isReserved = isReserved;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
