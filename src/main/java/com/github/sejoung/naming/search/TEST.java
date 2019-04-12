package com.github.sejoung.naming.search;

public class TEST {

	private static final int WORK_DAYS_PER_WEEK = 5;
	private static final int NUMBER_OF_TASKS = 34;

	private void asis() {
		int[] t = {1, 2};
		int s = 0;
		for (int i = 0; i < 34; i++) {
			s += (t[i] * 4) / 5;
		}
		System.out.println(s);
	}


	private void tobe() {
		int [] taskEstimate = {1, 2};
		int realDaysPerIdealDay = 4;
		int sum = 0;

		for (int i = 0; i < NUMBER_OF_TASKS; i++) {
			int realTaskDays =taskEstimate[i] * realDaysPerIdealDay;
			int realTaskWeeks = (realTaskDays/WORK_DAYS_PER_WEEK);
			sum += realTaskWeeks;
		}
		System.out.println(sum);
	}

}
