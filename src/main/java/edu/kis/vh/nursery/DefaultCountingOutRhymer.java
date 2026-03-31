package edu.kis.vh.nursery;
/**
 * Klasa służy do przechowywania i wyliczania.
 * Wykorzystuje tablicę do przechowywania wprowadzonych liczb.
 */
public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int EMPTY = -1;
    private static final int ERROR_VALUE = -1;
    private static final int FULL = CAPACITY - 1;
    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY;

    /**
     * Wstawia nowa wartość.
     * @param in Wartość całkowita, która ma zostać dodana.
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy zawiera jakieś elementy.
     * @return true, jeśli jest puste, natomiast false w przeciwnym wypadku.
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Sprawdza czy osiągnięto maksymalną pojemność.
     * @return true, jeżeli jest pełna, natomiast false w przeciwnym wypadku.
     */
    public boolean isFull() {
        return total == FULL;
    }

    /**
     * Zwraca ostatni dodany element, nie usuwaj go.
     * @return Ostatnia wartość dodana lub ERROR_VALUE w przypadku jeżeli jest puste.
     */
    protected int peekAboo() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total];
    }

    /**
     * Pobiera i usuwa ostatni element.
     * @return Ostatnia wartość lub ERROR_VALUE w przypadku jeżeli jest puste.
     */
    public int countOut() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total--];
    }

    /**
     * Pobiera akutalny licznika.
     * @return Indeks ostatniego elementu w tablicy.
     */
    public int getTotal() {
        return total;
    }
    
}
