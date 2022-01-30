package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}

// 1.3.1 Błędnie sformatowane linie to: 5, 12, 14, 15
// 1.3.3 Kombinacja ta służy do przemieszczania się po ostatnio otwartych kartach.