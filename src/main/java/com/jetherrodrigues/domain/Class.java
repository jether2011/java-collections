package com.jetherrodrigues.domain;

import java.io.Serializable;

/**
 * 
 * @author jether.rodrigues
 *
 */
public final class Class implements Serializable, Comparable<Class> {

	private static final long serialVersionUID = 1L;
	private String title;
	private int time;

	public Class(String title, int time) {
		super();
		this.title = title;
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public int getTime() {
		return time;
	}

	@Override
	public int compareTo(Class other) {
		return this.title.compareTo(other.title);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Class [title=")
			.append(title)
			.append(", time=")
			.append(time)
			.append("]");
		return builder.toString();
	}

}
