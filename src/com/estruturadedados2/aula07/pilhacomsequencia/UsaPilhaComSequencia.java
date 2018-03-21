package com.estruturadedados2.aula07.pilhacomsequencia;

public class UsaPilhaComSequencia {
	public static void main(String[] args) {
		PilhaComSequencia pilha = new PilhaComSequencia();
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		pilha.print();
		
		System.out.println(pilha.isSorted());
	}
}
