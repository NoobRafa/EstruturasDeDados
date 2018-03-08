package com.estruturadedados2.aula06.listadupla;

public class UsaListaDuplaEncadeada {
	public static void main(String[] args) {
		ListaDuplaEncadeada lista = new ListaDuplaEncadeada();
		lista.insertFirst("A");
		lista.insertFirst("B");
		lista.insertFirst("C");
		lista.print1();
		lista.removeLast();
		System.out.println();
		lista.print1();
		lista.removeLast();
		System.out.println();
		lista.print1();
		lista.removeLast();
		System.out.println();
		lista.print1();
		System.out.println(lista.firstNode());
	}

}
