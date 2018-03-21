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

	public void insertSorted(int value) {

		if (isEmpty()) {
			insertFirst(value);
		} else {
			Dnode aux = firstNode();

			for (int i = 0; i < size(); i++) {
				if (value <= (int) aux.getValue()) {
					Dnode novo = new Dnode(aux.getAnt(), value, aux);
					aux.getAnt().setProx(novo);
					aux.setAnt(novo);
					setQtd(getQtd() + 1);
					return;
				}
				aux = aux.getProx();
			}

			insertLast(value);

		}

	}

	public void insertPos(int pos, Object value) {
		if (checkPos(pos)) {

			Dnode aux = firstNode();

			for (int i = 0; i < size(); i++) {
				if (i == pos) {
					insertBeforeNode(aux, value);
					return;
				}
				aux = aux.getProx();
			}

		} else {
			System.out.println("Posição Inválida");
		}
	}

	private boolean isCrescent(){
		if (!isEmpty()) {
			Dnode aux = firstNode();
			
			int valor = (int) aux.getValue();
			aux = aux.getProx();
			
			while (aux != lastNode().getProx()) {
				if (valor > (int) aux.getValue()) {
					return false;
				}
				valor = (int) aux.getValue();
				aux = aux.getProx();
			}
			
			return true;
		}
		
		return false;
	}
	
	private boolean isDecrescent(){
		if (!isEmpty()) {
			Dnode aux = firstNode();
			
			int valor = (int) aux.getValue();
			aux = aux.getProx();
			
			while (aux != lastNode().getProx()) {
				if (valor < (int) aux.getValue()) {
					return false;
				}
				valor = (int) aux.getValue();
				aux = aux.getProx();
			}
			
			return true;
		}
		
		return false;
	}
	
	public boolean isSorted(){
		if (isCrescent() || isDecrescent()) {
			if (isCrescent()) {
				System.out.println("Crescente");
			}else if(isDecrescent()){
				System.out.println("Decrescente");
			
			}
			return true;
		}
		System.out.println("Desordenado");
		return false;
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
