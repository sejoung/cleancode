package com.github.sejoung.function.abstraction;

public class Render {

	private int size;

	public String render() throws Exception {
		StringBuffer html = new StringBuffer("<hr");
		if (size > 0) {
			html.append(" size=\"").append(size + 1).append("\"");
		}
		html.append(">");
		return html.toString();
	}

}
