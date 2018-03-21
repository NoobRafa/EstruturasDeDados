package com.estruturadedados2.aula07.filacomsequencia;

public class UsaFilaComSequencia {
	public static void main(String[] args) {
		FilaComSequencia fila = new FilaComSequencia();
		fila.queue("A");
		fila.queue("B");
		fila.unqueue();
		fila.queue("C");
		fila.queue("D");
		fila.queue("E");

		fila.print();
	}

}
