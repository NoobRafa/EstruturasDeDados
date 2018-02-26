package com.estruturadedados2.aula03;

public class No {

	private Object value;
	private No ant;

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public No getAnt() {
		return ant;
	}

	public void setAnt(No ant) {
		this.ant = ant;
	}

	public No(Object value, No ant) {

		this.value = value;
		this.ant = ant;
	}

	public No() {

	}

}
