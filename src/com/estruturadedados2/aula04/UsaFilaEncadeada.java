package com.estruturadedados2.aula04;

public class UsaFilaEncadeada {
	public static void main(String[] args) {
		FilaEncadeada f = new FilaEncadeada();
		f.queue("A");
		f.queue("B");
		f.queue("C");
		
		// A - 0 B - 1  c - 2
		f.print();
		System.out.println("\nElemento removido: " + f.unqueuePos2(0));
		f.print();
		
//		System.out.println("\n"+f.unqueuePos(1));
//		f.print();
//		System.out.println("\n"+f.unqueuePos(0));
//		f.print();
//		System.out.println(f.unqueuePos());
//	    System.out.println(f.getQtd());
//		f.print();
		
		
		
//		f.queue("meu coração");
//		f.queue("Roubou");
//		f.queue("Ladrão");
//		f.queue("Lula");
//		
//		f.inverterFila();
//		f.print();
//		System.out.println();
//		
//		System.out.println("Posição " + f.printPos("Lula"));
//		System.out.println("Elemento");
//		f.printElement(0);
//		System.out.println();
//		
//		f.unqueue();
//		
//		f.print();
//		
//		
//		f.printElement(1);
//		
//		System.out.println();
//		
//		f.printElement(-1);
		
	}

}
