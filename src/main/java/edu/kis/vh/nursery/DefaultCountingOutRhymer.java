package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int ARRAY_SIZE = 12;
	public static final int ERROR_CODE = -1;

	private final int[] numbers = new int[ARRAY_SIZE];
	private int total = ERROR_CODE;
  
  public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == ERROR_CODE;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return ERROR_CODE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return ERROR_CODE;
		return numbers[total--];
	}
//pr
}

//brak nieużywanych setterów
