package com.estruturadedados2.aula07.pilhacomsequencia;

import com.estruturadedados2.aula06.listadupla.SequenciaDuplamenteEncadeada;

public class PilhaComSequencia {

	private SequenciaDuplamenteEncadeada seq = new SequenciaDuplamenteEncadeada();

	public void push(Object value) {
		seq.insertFirst(value);
	}

	public Object pop() {
		return seq.removeFirst();
	}

	public void print() {
		seq.print1();
	}

	public boolean isEmpty() {
		return seq.isEmpty();
	}

	public int size() {
		return seq.size();
	}
	
	public Object top(){
		return seq.firstNode().getValue();
	}
	
	public boolean isSorted(){
		return seq.isSorted();
	}

}
