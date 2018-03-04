package com.estruturadedados2.aula05;

public class No {
	
	private Object value;
	private No prox;
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public No getProx() {
		return prox;
	}
	public void setProx(No prox) {
		this.prox = prox;
	}
	
	public No(Object value){
		this.value = value;
	}
	public No(){}

}
