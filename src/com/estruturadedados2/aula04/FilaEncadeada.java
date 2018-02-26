package com.estruturadedados2.aula04;

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
		}else{
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

}
