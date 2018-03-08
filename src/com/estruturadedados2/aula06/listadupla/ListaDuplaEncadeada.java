package com.estruturadedados2.aula06.listadupla;

public class ListaDuplaEncadeada {
	private Dnode head; //Sentinela
	private Dnode tail; //Sentinela
	private int qtd;
	
	public ListaDuplaEncadeada(){
		qtd = 0;		//ant //valor //prox
		head = new Dnode(null, null, null);
		tail = new Dnode(head, null, null);
		head.setProx(tail);
	}
	
	public boolean isEmpty(){
		return qtd == 0;
	}
	
	public void insertFirst(Object value){
		Dnode novo = new Dnode(head, value, head.getProx());
		head.getProx().setAnt(novo);
		head.setProx(novo);
		qtd++;
	}
	
	public void insertAfterNode(Dnode node, Object value){
		Dnode novo = new Dnode(node, value, node.getProx());
		node.getProx().setAnt(novo);
		node.setProx(novo);
		qtd++;
	}
	
	public void insertBeforeNode(Dnode node, Object value){
		Dnode novo = new Dnode(node.getAnt(),value,node);
		node.getAnt().setProx(novo);
		node.setAnt(novo);
		qtd++;
	}
	
	public void insertLast(Object value){
		Dnode novo = new Dnode(tail.getAnt(), value, tail);
		tail.getAnt().setProx(novo);
		tail.setAnt(novo);
		qtd++;
	}
	
	public Dnode firstNode(){
		if (!isEmpty()) {
			return head.getProx();
		}else{
			System.out.println("Fila Vazia");
			return null;
		}
	}
	
	public Dnode lastNode(){
		if (!isEmpty()) {
			return tail.getAnt();
		}else{
			System.out.println("Fila Vazia");
			return null;
		}
	}
	
	public Object removeFirst(){
		if (!isEmpty()) {
			Object temp = head.getProx().getValue();
			head.setProx(head.getProx().getProx());
			head.getProx().setAnt(head);
			qtd--;
			return temp;
		}else{
			System.out.println("Lista Vazia");
			return null;
		}
		
	}
	
	public Object removeLast(){
		if (!isEmpty()) {
			Object temp = tail.getAnt().getValue();
			tail.setAnt(tail.getAnt().getAnt());
			tail.getAnt().setProx(tail);
			qtd--;
			return temp;
		}else{
			System.out.println("Lista Vazia");
			return null;
		}
		
	}
	
	public void print2(){
		Dnode aux = tail.getAnt();
		
		while (aux != head) {
			System.out.print(aux.getValue() + " ");
			aux = aux.getAnt();
		}
	}
	
	public void print1(){
		Dnode aux = head.getProx();
		
		while (aux != tail) {
			System.out.print(aux.getValue() + " ");
			aux = aux.getProx();
		}
	}

}
