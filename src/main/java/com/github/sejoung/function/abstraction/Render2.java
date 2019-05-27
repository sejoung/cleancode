package com.github.sejoung.function.abstraction;

public class Render2 {

	private int exterDashes;

	public String render() throws Exception {

		HtmlTag hr = new HtmlTag("hr");

		if (exterDashes > 0) {
			hr.addAttribute("size", hrSize(exterDashes));
		}

		return hr.html();
	}

	private String hrSize(int height) {
		int hrSize = height + 1;
		return String.format("%d", hrSize);
	}

}
