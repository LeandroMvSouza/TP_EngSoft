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
 * Um exemplar é superclasse de título.
 */

public class Exemplar extends Title {
    private int daysLoaned;
    private int daysInReserve;

    private boolean isLoaned;
    private boolean isLost;

    // loan_countdown > title->loanPeriod ? TRUE : FALSE;
    private boolean isLate;

    // daysInReserve > 6 title->reservePeriod ? FALSE : TRUE;
    private boolean keptAsReserve;
}
