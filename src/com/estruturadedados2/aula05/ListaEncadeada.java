package com.estruturadedados2.aula05;

import com.estruturadedados2.aula03.PilhaEncadeada;

public class ListaEncadeada {

	private int qtd;
	private No head;
	private No tail;

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public No getHead() {
		return head;
	}

	public void setHead(No head) {
		this.head = head;
	}

	public No getTail() {
		return tail;
	}

	public void setTail(No tail) {
		this.tail = tail;
	}

	public boolean isEmpty() {
		return getQtd() == 0;
	}

	private void increase() {
		setQtd(getQtd() + 1);
	}

	private void decrease() {
		setQtd(getQtd() - 1);
	}
	
	private boolean checkPos(int pos){
		if (pos >=0 && pos < getQtd()) {
			return true;
		}
		return false;
	}

	public void insert(Object element) {
		No novo = new No(element);

		if (isEmpty()) {
			head = novo;
			tail = novo;
		} else {
			tail.setProx(novo);
			tail = novo;
		}

		increase();
	}

	public void insertHead(Object element) {
		No novo = new No(element);

		if (!isEmpty()) {
			novo.setProx(head);
			head = novo;
		} else {
			head = novo;
			tail = novo;

		}
		increase();
	}
	
	public Object removeHead(){
		if (!isEmpty()) {
			Object temp = head.getValue();
			head = head.getProx();
			decrease();
			return temp;		
		}else{
			System.out.println("Lista Vazia!");
			return null;
		}
	}
	
	public Object removePos(int pos){
		if (checkPos(pos)) {
			No aux = head;
			ListaEncadeada lista = new ListaEncadeada();
			Object temp = null;
			int tam = qtd;
			
			for(int i = 0; i < tam; i ++){
				if (i != pos) {
					lista.insert(aux.getValue());
				}else{
					temp = aux.getValue();
				}
				removeHead();
				aux = aux.getProx();
			}
			
			while(!lista.isEmpty()){
				insert(lista.removeHead());
			}
			
			return temp;
			
		}else{
			System.out.println("Posição inválida");
			return null;
		}
	}
	
	public Object removeTail(){
		if (!isEmpty()) {
			ListaEncadeada lista = new ListaEncadeada();
			No aux = head;
			Object temp = tail.getValue();
			
			while(aux != null){
				
				if (aux.getValue() != temp) {
					lista.insert(aux.getValue());
				}
				removeHead();
				aux = aux.getProx();
			}
			
			
			
			while(!lista.isEmpty()){
				insert(lista.removeHead());
			}
			
			return temp;
			
		}else{
			System.out.println("Lista Vazia!");
			return null;
		}
	}

	public void print() {
		if (!isEmpty()) {
			No aux = head;

			while (aux != null) {
				System.out.print(aux.getValue() + " ");
				aux = aux.getProx();
			}
			System.out.println();
		} else {
			System.out.println("Lista Vazia");
		}
	}

	public void printInverse() {
		if (!isEmpty()) {
			No aux = head;
			PilhaEncadeada pilha = new PilhaEncadeada();
			
			while (aux != null) {
				pilha.push(aux.getValue());
				aux = aux.getProx();
			}
			while (!pilha.isEmpty()) {
				System.out.print(pilha.pop() + " ");
			}
		}else{
			System.out.println("Lista Vazia!");
		}
	}
	
	public void inverseList(){
		if (!isEmpty()) {
			No aux = head;
			PilhaEncadeada pilha = new PilhaEncadeada();
			
			while (aux != null) {
				pilha.push(aux.getValue());
				aux = aux.getProx();
				removeHead();
			}
			while (!pilha.isEmpty()) {
				insert(pilha.pop());
			}
		}else{
			System.out.println("Lista Vazia!");
		}
	}

}
