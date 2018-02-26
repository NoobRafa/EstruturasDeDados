package com.estruturadedados2.aula06;

public class No {
	
	private Object value;
	private No ant;
	private No prox;
	
	public No(Object value) {
		super();
		this.value = value;
	}
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
	public No getProx() {
		return prox;
	}
	public void setProx(No prox) {
		this.prox = prox;
	}

}
