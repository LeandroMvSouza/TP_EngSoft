package dcc603.biblioteca;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Um professor é superclasse de um usuário.
 */

public class Professor extends User {

    // Um professor pode reservar por 6 meses até N títulos. Além disso,
	// um professor não pode reservar um título já reservado.
    private ArrayList <Title> reservedTitles;

    // ------------------Construtor-------------------------
    public Professor(String name, String cpf, Title[] reservedTitles) {
        super(name, cpf);
        this.reservedTitles = new ArrayList<Title>();
    }

	// -------------------Métodos---------------------------


	// -------------------Getter's/Setter's-----------------
    public ArrayList<Title> getReservedTitles() {
        return reservedTitles;
    }

    public void setReservedTitles(ArrayList<Title> reservedTitles) {
        this.reservedTitles = reservedTitles;
    }
}
