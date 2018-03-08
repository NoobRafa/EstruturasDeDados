package com.estruturadedados2.aula04;

import com.estruturadedados2.aula03.PilhaEncadeada;

public class FilaEncadeada {
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

	public void queue(Object element) {
		No novo = new No(element);
		if (isEmpty()) {
			head = novo;
			tail = novo;
			setQtd(getQtd() + 1);
		} else {
			tail.setProx(novo);
			tail = novo;
			setQtd(getQtd() + 1);

		}
	}

	public boolean isEmpty() {
		return getQtd() == 0;
	}

	public void print() {
		if (!isEmpty()) {
			No aux = head;

			while (aux != null) {
				System.out.print(aux.getValue() + " ");
				aux = aux.getProx();
			}
		} else {
			System.out.println("Fila Vazia");
		}
	}

	public int size() {
		return getQtd();
	}

	public Object unqueue() {
		if (!isEmpty()) {
			Object temp = head.getValue();
			head = head.getProx();
			setQtd(getQtd() - 1);
			return temp;
		} else {
			System.out.println("Fila Vazia");
			return null;
		}
	}
	
	public Object unqueuePos(int pos){
		if (check(pos)) {
			No aux = head;
			
			FilaEncadeada fila = new FilaEncadeada();
			
			Object value = null;
			int cont = 0;
			
			while(!isEmpty()){ // Fila Real: A B C D
							//   			 0 1 2 3
				if (cont != pos) {
					fila.queue(aux.getValue());
				}else{
					value = aux.getValue();
				}
				cont++;
				aux = aux.getProx();
				unqueue();	
			}
			
			while(!fila.isEmpty()){
				queue(fila.unqueue());
			}

			return value;
		}else{
			return null;
		}
	}
	
	public Object unqueuePos2(int pos){
		if (check(pos)) {
			Object value = null;
			No aux = head;
			No aux2 = head;
			
			int cont  = 0;
			
			while(aux != null){
				if (cont == pos) {
					value = aux.getValue();
				}
				cont++;
				unqueue();
				aux = aux.getProx();
			}
			
			while (aux2 != null) {
				if (aux2.getValue() != value) {
					queue(aux2.getValue());
				}
				
				aux2 = aux2.getProx();
			}
			
			
			return value;
		}else{
			System.out.println("Posição Inváilda");
			return null;
		}
	}
	
	public Object unqueuePos3(int pos){
		if (check(pos)) {
			No anterior;
			No aux = head;
			int cont = 0;
			Object retorno = null;
			
			while (cont <= pos) {
				if (cont == pos) {
					retorno = aux.getValue();
					head = head.getProx();
					qtd--;
					break;
				}else if(cont == pos - 1){
					anterior = aux;
					retorno = aux.getProx().getValue();
					anterior.setProx(aux.getProx().getProx());
					qtd--;
					break;
				}
				cont++;
				aux = aux.getProx();
			}
			
			return retorno;
			
			
		}else{
			return null;
		}
	}
	
	
	
	private boolean check(int pos){
		if (pos >= 0 && pos < qtd) { //4  -  0 1 2 3
			return true;
		}else{
			return false;
		}
	}
	
	

	public Object firstElement() {
		if (!isEmpty()) {
			return head.getValue();
		} else {
			System.out.println("Fila Vazia");
			return null;
		}
	}

	public void doubledQueue(Object element) {
		No novo1 = new No(element);
		No novo2 = new No(element);
		if (isEmpty()) {

			head = novo1;
			tail = novo2;

			head.setProx(tail);
		} else {

			// head
			novo1.setProx(head);
			head = novo1;

			// tail
			tail.setProx(novo2);
			tail = novo2;

		}

		setQtd(getQtd() + 2);
	}

	public void printElement(int pos) {

		if (check(pos)) {

			No aux = head;

			int cont = 0;

			while (aux != null) {
				if (cont == pos) {
					System.out.print(aux.getValue());
					break;
				}
				cont++;
				aux = aux.getProx();
			}

		} else {
			System.out.println("Posição Inválida");
		}

	}
	
	public int printPos(Object element){
		int cont = 0;
		
		if (!isEmpty()) {
			
			No aux = head;
			
			while (aux != null) {
				if (aux.getValue().equals(element)) {
					return cont;
				}
				cont++;
				aux = aux.getProx();
			}
			
			return -1;
			
		}else{
			return -1;
		}
	}

	public void inverterFila() {
		if (!isEmpty()) {

			PilhaEncadeada pilha = new PilhaEncadeada();

			while (!isEmpty()) {
				pilha.push(unqueue());
			}

			while (!pilha.isEmpty()) {
				queue(pilha.pop());
			}


		} else {
			System.out.println("Fila Vazia!");
		}
	}

}
