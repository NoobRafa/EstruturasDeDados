package com.estruturadedados2.aula02;

public class FilaDeVetor {

	private Object[] queue = new Object[5];

	private int tail = -1;

	private int head = 0;

	private int qtd = 0;

	public void queue(Object value) {
		if (!isFull()) {
			if (tail == queue.length - 1) {
				tail = -1;
			}
			tail++;
			queue[tail] = value;
			qtd++;
		} else {
			System.out.println("A fila está cheia");
		}

	}

	public Object unqueue() {// Remover sempre da posição zero.
		if (!isEmpty()) {
			Object temp = queue[0];
			queue[0] = null;

			// qtd--;

			for (int i = 0; i < qtd - 1 /* ou qtd - 1 */; i++) {
				queue[i] = queue[i + 1];
			}
			queue[tail] = null;
			tail--;
			qtd--;
			return temp;
		} else {
			System.out.println("A fila está vazia!");
			return null;
		}
	}

	public Object unqueue2() {
		if (!isEmpty()) {
			Object temp = queue[head];
			queue[head] = null;
			if (isLastIndex()) {
				head = -1;
			}
			head++;
			qtd--;
			return temp;
		} else {
			System.out.println("A fila está vazia!");
			return null;
		}

	}

	public int size() {
		return qtd;
	}

	public boolean isLastIndex() {
		return head == queue.length - 1;
	}

	public Object head() {
		if (!isEmpty()) {
			return queue[head];
		} else {
			System.out.println("Fila vazia");
			return null;
		}
	}

	public boolean isFull() {
		return qtd == queue.length;
	}

	public boolean isEmpty() {
		return qtd == 0;
	}

	public void print1() {
		for (int i = 0; i < qtd; i++) {
			Object remove = unqueue2();
			System.out.print(remove + " ");
			queue(remove);
		}
	}

	public void print2() {
		for (int i = 0; i < qtd; i++) {
			System.out.print(head() + " ");
			queue(unqueue2());
		}
	}

	public String print3() {
		String str = "";
		for (int i = 0; i < qtd; i++) {
			str += head() + " ";
			queue(unqueue2());
		}
		return str;
	}

	public void print() {

		if (!isEmpty()) {
			String str = "";

			for (int i = 0; i < qtd; i++) {
				str += queue[i];
			}

			System.out.println(str);
		} else {
			System.out.println("Fila vazia.");
		}

	}

}
