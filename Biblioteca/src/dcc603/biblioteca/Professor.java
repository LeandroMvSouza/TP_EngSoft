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
 * Um professor é superclasse de um usuário.
 */

public class Professor extends User {

    // Um professor pode reservar por 6 meses até N títulos. Além disso,
	// um professor não pode reservar um título já reservado.
    private Title[] reservedTitles;
}
