package com.estruturadedados2.aula05.listaencadeada;

public class ListaEncadeada {
	private No head; // Sentinela
	private No tail; // Sentinela
	private int qtd;

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public ListaEncadeada() {
		qtd = 0;
		head = new No(null, null);
		tail = new No(null, null);
		head.setProx(tail);
	}

	public boolean isEmpty() {
		return qtd == 0;
	}

	public boolean checkPos(int pos) {
		if (pos >= 0 && pos < qtd) {
			return true;
		}
		return false;
	}

	public void insertFirst(Object value) {
		No novo = new No(value, head.getProx());
		head.setProx(novo);
		qtd++;
	}

	public void insertLast(Object value) {

		if (isEmpty()) {
			insertFirst(value);
		} else {
			No novo = new No(value, tail);
			No aux = head.getProx();
			for (int i = 0; i < qtd - 1; i++) {
				aux = aux.getProx();
			}

			aux.setProx(novo);
			qtd++;
		}

	}

	public void doubleInsert(Object value) {
		insertFirst(value);
		insertLast(value);
	}

	public void insertAfterNode(No no, Object value) {
		if (no != null) {
			No novo = new No(value, no.getProx());
			no.setProx(novo);
			qtd++;
		} else {
			System.out.println("Nó inexistente ou Nó nulo.");
		}

	}

	public void insertBeforeNode(No no, Object value) {
		if (no != null) {
			No novo;
			No aux = head;

			while (aux.getProx() != no) {
				aux = aux.getProx();
			}

			novo = new No(value, aux.getProx() /* no */);
			aux.setProx(novo);
			qtd++;
		} else {
			System.out.println("Nó inexistente ou Nó nulo.");
		}

	}

	public void insertPos(int pos, Object value) {
		if (checkPos(pos)) {
			No aux = head;
			No aux2 = head.getProx();

			for (int i = 0; i < qtd; i++) {
				if (i == pos) {
					break;
				}
				aux2 = aux2.getProx();
			}
			No novo = new No(value, aux2);

			while (aux.getProx() != aux2) {
				aux = aux.getProx();
			}

			aux.setProx(novo);
			qtd++;

		} else {
			System.out.println("Posição inválida!");
		}
	}

	public Object removePos(int pos) {
		if (checkPos(pos)) {
			No aux = head.getProx();
			No aux2 = head;
			Object retorno = null;

			for (int i = 0; i < qtd; i++) {
				if (i == pos) {
					retorno = aux.getValue();
					break;
				}
				aux = aux.getProx();
			}

			while (aux2.getProx() != aux) {
				aux2 = aux2.getProx();
			}
			aux2.setProx(aux.getProx());
			qtd--;

			return retorno;

		} else {
			System.out.println("Posição Inválida");
			return null;
		}
	}

	public Object removeFirst() {
		if (!isEmpty()) {
			Object value = head.getProx().getValue();
			head.setProx(head.getProx().getProx());
			qtd--;
			return value;
		} else {
			System.out.println("Lista Vazia");
			return null;
		}
	}

	public Object removeLast() {
		if (!isEmpty()) {
			Object value;
			No aux = head.getProx();
			No anterior = head;

			while (aux.getProx() != tail) {
				anterior = aux;
				aux = aux.getProx();
			}

			value = aux.getValue();

			anterior.setProx(aux.getProx());

			qtd--;

			return value;
		} else {
			System.out.println("Lista Vazia");
			return null;
		}
	}

	public No searchNode(Object value) {

		if (!isEmpty()) {

			No aux = head.getProx();

			while (aux != tail) {
				if (aux.getValue() == value) {
					return aux;
				}
				aux = aux.getProx();
			}
			System.out.println("Elemento não encontrado");
			return null;

		} else {
			System.out.println("Lista Vazia");
			return null;
		}

	}

	public void print() {
		if (!isEmpty()) {
			No aux = head.getProx();

			for (int i = 0; i < qtd; i++) {
				System.out.print(aux.getValue() + " ");
				aux = aux.getProx();
			}
			System.out.println();
		} else {
			System.out.println("Lista Vazia");
		}

	}
}
