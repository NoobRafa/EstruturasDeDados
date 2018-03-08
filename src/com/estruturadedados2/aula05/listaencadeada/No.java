package com.estruturadedados2.aula05.listaencadeada;

public class No {
	
	private Object value;
	private No prox;
	
	public No(Object value, No prox){
		this.prox = prox;
		this.value = value;
	}
	
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

}
