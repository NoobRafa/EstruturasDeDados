package com.estruturadedados2.aula06.listadupla;

public class UsaSequenciaDuplaEncadeada {
	public static void main(String[] args) {
		SequenciaDuplamenteEncadeada sequencia = new SequenciaDuplamenteEncadeada();
		sequencia.insertFirst(4);//0123
		sequencia.insertFirst(3);
		sequencia.insertFirst(2);
		sequencia.insertFirst(1);
		System.out.println("Ordenado? : "+sequencia.isSorted());
		sequencia.print1();
		

	}

}
