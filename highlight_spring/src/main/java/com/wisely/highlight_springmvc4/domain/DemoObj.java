package com.wisely.highlight_springmvc4.domain;

public class DemoObj {
	private Long id;
	private String name;

	public DemoObj() {
		super();
	}

	public DemoObj(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
