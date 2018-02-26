package com.estruturadedados2.aula06;

public class UsaListaDuplaEncadeada {
	public static void main(String[] args) {
		ListaDuplaEncadeada lista = new ListaDuplaEncadeada();
		lista.insert("A");
		lista.insert("B");
		lista.insert("C");
		lista.insert("D");
		lista.insert("Love", "A");
		lista.insert("Love", "A");
		lista.insert("Love", "D");
		lista.insert("Love", "D");
		lista.insert("Rafael");
		lista.removeBegin();
		lista.removeEnd();
		lista.removeEnd();
		lista.removeEnd();
		
		
		lista.remove("C");
		lista.remove("A");
		lista.remove("B");
		
		
		lista.insertBegin("E");
		lista.insertBegin("F");
		lista.print();
		
	}

}
