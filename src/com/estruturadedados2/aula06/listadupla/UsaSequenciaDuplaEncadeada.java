package com.estruturadedados2.aula06.listadupla;

public class UsaSequenciaDuplaEncadeada {
	public static void main(String[] args) {
		SequenciaDuplamenteEncadeada sequencia = new SequenciaDuplamenteEncadeada();
		sequencia.insertFirst(1);//1234
		sequencia.insertFirst(1);
		sequencia.insertFirst(3);
		sequencia.insertLast(3);
		System.out.println("Ordenado? : "+sequencia.isSorted());
		sequencia.print1();
		

	}

}
