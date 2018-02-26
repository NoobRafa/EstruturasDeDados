package com.estruturadedados2.aula03;

public class UsaPilha {
	public static void main(String[] args) {
		PilhaEncadeada p = new PilhaEncadeada();
		p.push("A");
		p.push("B");
		p.push("C");
		p.push("D");
		p.print(); //D C B A
		
		p.pop();// C B A
		p.pop();// B A
		p.push("E"); // E B A
		p.pop();// B A
		System.out.println();
		p.print();



	}

}
