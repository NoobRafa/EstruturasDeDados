package com.estruturadedados2.aula05.listaencadeada;

public class UsaListaEncadeada {
	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		lista.insertFirst("A");
		lista.insertLast("B");
		lista.insertFirst("D");
		lista.insertLast("E");
		lista.insertLast("C");
		lista.insertPos(0, "C");

//		lista.removePos(2);


//		lista.insertAfterNode(lista.searchNode("B"), "E");
//		lista.insertBeforeNode(lista.searchNode("B"), "D");
//		lista.removeLast();
//		lista.removeFirst();
		// lista.insertBeforeNode(lista.searchNode("D"), "E");
//		lista.removeLast();
//		lista.print();
//		lista.removeLast();
//		lista.print();
//		lista.removeLast();
		lista.print();

		// lista.insertAfterNode(lista.searchNode("A"), "E");
		// lista.insertAfterNode(lista.searchNode("E"), "K");
		// lista.insertAfterNode(lista.searchNode("C"), "M");
		// lista.insertAfterNode(lista.searchNode("M"), "N");
		// lista.insertAfterNode(lista.searchNode("Z"), "T");
		// lista.removeFirst();
		// lista.removeFirst();

		
		System.out.println(lista.getQtd());
	}
}
