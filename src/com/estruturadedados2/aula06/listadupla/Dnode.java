package com.estruturadedados2.aula06.listadupla;

public class Dnode {
	
	private Object value;
	private Dnode prox;
	private Dnode ant;
	
	public Dnode(Dnode ant, Object value, Dnode prox){
		this.ant = ant;
		this.prox = prox;
		this.value = value;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public Dnode getProx() {
		return prox;
	}
	public void setProx(Dnode prox) {
		this.prox = prox;
	}
	public Dnode getAnt() {
		return ant;
	}
	public void setAnt(Dnode ant) {
		this.ant = ant;
	}
	
	

}
