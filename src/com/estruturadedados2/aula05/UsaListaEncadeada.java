package com.estruturadedados2.aula05;

public class UsaListaEncadeada {
	
	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		lista.insert("A");
		lista.insert("B");
		lista.insert("C");
//		lista.insertHead("D");
//		lista.insertHead("V");
//		lista.removeTail();
//		lista.removeTail();
//		lista.removeTail();
//		lista.removePos(2);
//		lista.removePos(0);
//		lista.removePos(0);
		lista.print();

		lista.inverseList();
		lista.print();
		lista.inverseList();
		lista.print();
		
//		lista.printInverse();
	}

}
