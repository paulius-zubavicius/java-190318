package com.vcs.lects.l10.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Element {

	private String name;

	private List<Element> childs = new ArrayList<>();

	public Element(String name, List<Element> childs) {
		this.name = name;
		this.childs.addAll(childs);
	}

	public Element(String name, Element... childs) {
		this.name = name;
		this.childs.addAll(Arrays.asList(childs));
	}

	public Element(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Element> getChilds() {
		return childs;
	}

	public void setChilds(List<Element> childs) {
		this.childs = childs;
	}

	@Override
	public String toString() {

		return name + " (" + super.toString() + ")";

	}

}
