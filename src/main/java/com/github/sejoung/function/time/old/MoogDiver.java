package com.github.sejoung.function.time.old;

import com.github.sejoung.function.time.Gradient;
import com.github.sejoung.function.time.Spline;
import java.util.ArrayList;
import java.util.List;

public class MoogDiver {

	Gradient gradient;
	List<Spline> splines;

	public void dive(String reason) {
		saturateGradient();
		reticulateSplines();
		diveForMoog(reason);
	}

	private void saturateGradient() {
		gradient = new Gradient();
	}

	private void reticulateSplines() {
		System.out.println(this.gradient);
		splines = new ArrayList<>();
	}

	private void diveForMoog(String reason) {
		System.out.println(this.splines);
		System.out.println(reason);
	}
}
