package com.estruturadedados2.aula07.filacomsequencia;

import com.estruturadedados2.aula06.listadupla.SequenciaDuplamenteEncadeada;

public class FilaComSequencia {
	private SequenciaDuplamenteEncadeada seq = new SequenciaDuplamenteEncadeada();

	public void queue(Object value) {
		seq.insertLast(value);
	}

	public Object unqueue() {
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
	
	public Object first(){
		return seq.firstNode().getValue();
	}
}
