package com.estruturadedados2.aula06.listadupla;

public class SequenciaDuplamenteEncadeada extends ListaDuplaEncadeada {

	public Dnode searchDnode(int pos) {
		if (checkPos(pos)) {
			Dnode aux = null;

			if (pos < size() / 2) {
				aux = firstNode();

				for (int i = 0; i < pos; i++) {
					aux = aux.getProx();
				}
			} else {
				aux = lastNode();
				for (int i = size() - 1; i > pos; i--) {
					aux = aux.getAnt();
				}
			}
			return aux;
		} else {
			return new Dnode(null, "", null);
		}
	}

	public int searchPosElement(Object element) {
		if (!isEmpty()) {
			Dnode aux = firstNode();

			for (int i = 0; i < size(); i++) {
				if (aux.getValue().equals(element)) {
					return i;
				}
				aux = aux.getProx();
			}

			return -1;

		} else {
			return -1;
		}
	}

	public void inserirOrdenado(int value) {

		if (isEmpty()) {
			insertFirst(value);
		} else {
			Dnode aux = firstNode();
			Dnode ant = null;

			while ((int) aux.getValue() < value) {
				ant = aux;
				aux = aux.getProx();
			}

			if (ant == null) {
				insertFirst(value);
			} else {
				insertAfterNode(ant, value);
			}

		}

	}

	public Object removePos(int pos) {
		if (checkPos(pos)) {
			Dnode aux = firstNode();
			Dnode aux2 = firstNode().getAnt();
			Object retorno = null;

			for (int i = 0; i < size(); i++) {
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
			aux.getProx().setAnt(aux2);

			setQtd(getQtd() - 1);

			return retorno;
		} else {
			System.out.println("Posição Inválida");
			return null;
		}
	}

}
