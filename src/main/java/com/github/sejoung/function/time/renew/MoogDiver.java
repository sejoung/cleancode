package com.github.sejoung.function.time.renew;

import com.github.sejoung.function.time.Gradient;
import com.github.sejoung.function.time.Spline;
import java.util.ArrayList;
import java.util.List;

public class MoogDiver {

	Gradient gradient;
	List<Spline> splines;

	public void dive(String reason) {
		Gradient gradient = saturateGradient();
		List<Spline> splines = reticulateSplines(gradient);
		diveForMoog(splines, reason);
	}

	private Gradient saturateGradient() {

		return new Gradient();

	}

	private List<Spline> reticulateSplines(Gradient gradient) {

		List<Spline> splines = new ArrayList<>();

		return splines;
	}

	private void diveForMoog(List<Spline> splines, String reason) {

	}

}
