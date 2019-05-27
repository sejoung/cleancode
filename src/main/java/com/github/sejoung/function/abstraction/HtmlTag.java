package com.github.sejoung.function.abstraction;

public class HtmlTag {

	private String tag;

	public HtmlTag(String tag) {
		this.tag = tag;
	}

	public String html(){
		return tag;
	}

	public void addAttribute(String name, String value){

	}
}
