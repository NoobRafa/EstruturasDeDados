package com.estruturadedados2.aula06.listadupla;

public class UsaSequenciaDuplaEncadeada {
	public static void main(String[] args) {
		SequenciaDuplamenteEncadeada sequencia = new SequenciaDuplamenteEncadeada();
		// sequencia.insertFirst("A");
		// sequencia.insertFirst("B");
		// sequencia.insertFirst("C");
		// sequencia.insertFirst("D");

		sequencia.inserirOrdenado(100);
		sequencia.inserirOrdenado(3);
		sequencia.inserirOrdenado(32);
		sequencia.inserirOrdenado(0);
		sequencia.inserirOrdenado(21);
		sequencia.inserirOrdenado(59);
		sequencia.inserirOrdenado(2);
		sequencia.inserirOrdenado(-2);
		sequencia.inserirOrdenado(7);
		sequencia.inserirOrdenado(5);
		sequencia.inserirOrdenado(1);
		sequencia.inserirOrdenado(-1);

		sequencia.print1();

		sequencia.removePos(10);
		sequencia.removePos(7);
		sequencia.removePos(3);

		sequencia.print1();

		sequencia.removePos(99);

		System.out.println("tam :" + sequencia.getQtd());

		// System.out.println(sequencia.searchDnode(0).getValue());
		// System.out.println(sequencia.searchDnode(1).getValue());
		// System.out.println(sequencia.searchDnode(2).getValue());
		// System.out.println(sequencia.searchDnode(3).getValue());
		// System.out.println(sequencia.searchDnode(4).getValue());

		// System.out.println(sequencia.searchPosElement("S"));
	}

}
