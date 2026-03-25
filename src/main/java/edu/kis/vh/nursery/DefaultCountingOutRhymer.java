package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int EMPTY = -1;
    public static final int ERROR_VALUE = -1;
    public static final int FULL = CAPACITY - 1;
    private final int[] numbers = new int[CAPACITY];

    public int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekAboo() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total--];
    }

}
