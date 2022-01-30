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

    // Cada título terá 2 exemplares distintos da mesma obra literária/periódico.
    private int numOfExemplars = 2;

    // O número padrão de dias para a duração de um empréstimo.
    private int loanPeriod = 14;

    // O número padrão de dias para um título permanecer reservado.
    // 183 é aproximadamente 6 meses.
    private int reservePeriod = 183;

    protected boolean isReserved = false;
    protected String description;
    protected String name;
    protected String author;
}
