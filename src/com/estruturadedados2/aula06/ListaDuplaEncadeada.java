package com.estruturadedados2.aula06;

public class ListaDuplaEncadeada {
	private int qtd;
	private No begin;
	private No end;

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public No getBegin() {
		return begin;
	}

	public void setBegin(No begin) {
		this.begin = begin;
	}

	public No getEnd() {
		return end;
	}

	public void setEnd(No end) {
		this.end = end;
	}

	public boolean isEmpty() {
		return getQtd() == 0;
	}

	public void insert(Object element) {
		No novo = new No(element);
		if (isEmpty()) {
			begin = novo;
			end = novo;
		} else {
			novo.setAnt(end);
			end.setProx(novo);
			end = novo;

		}
		setQtd(getQtd() + 1);
	}

	private void reset() {
		begin = null;
		end = null;
	}

	public void insertBegin(Object element) {
		if (!isEmpty()) {
			No novo = new No(element);
			novo.setProx(begin);
			begin.setAnt(novo);
			begin = novo;
			setQtd(getQtd() + 1);
		} else {
			insert(element);
		}
	}

	public void insert(Object element, Object search) {
		if (!isEmpty()) {
			No aux = begin;
			boolean check = false;

			while (aux != null) {
				if (aux.getValue().equals(search)) {
					check = true;
					break;
				}
				aux = aux.getProx();
			}

			if (check) {
				No novo = new No(element);

				if (aux.getProx() != null) {
					novo.setProx(aux.getProx());
					novo.setAnt(aux);
					aux.getProx().setAnt(novo);
					aux.setProx(novo);
				} else {
					novo.setAnt(aux.getAnt());
					novo.setProx(aux);
					aux.getAnt().setProx(novo);
					aux.setAnt(novo);
				}

				setQtd(getQtd() + 1);
			} else {
				System.out.println("Elemento de referência não encontrado");
			}

		} else {
			System.out
					.println("Lista Vazia - Elemento de referência não existe");
		}

	}

	public Object removeBegin() {
		Object temp = begin.getValue();
		if (!isEmpty()) {
			if (getQtd() != 1) {
				begin.getProx().setAnt(null);
				begin = begin.getProx();

			} else {
				reset();
			}
			setQtd(getQtd() - 1);
			return temp;
		} else {
			System.out.println("Lista Vazia");
			return null;
		}
	}

	public Object remove(Object search) {
		if (!isEmpty()) {
			No aux = begin;
			Object temp;
			Boolean check = false;

			while (aux != null) {
				if (aux.getValue() == search) {
					check = true;
					break;
				}
				aux = aux.getProx();

			}

			if (check) {
				
				temp = aux.getValue();

				if (aux.equals(begin)) {
					removeBegin();
				} else if (aux.equals(end)) {
					removeEnd();
				} else {
					aux.getAnt().setProx(aux.getProx());
					aux.getProx().setAnt(aux.getAnt());
				}

				return temp;
			} else {
				System.out.println("Elemento não encontrado !");
				return null;
			}

		} else {
			System.out.println("Lista Vazia");
			return null;
		}
	}

	public Object removeEnd() {
		Object temp = end.getValue();
		if (!isEmpty()) {

			if (getQtd() != 1) {
				end.getAnt().setProx(null);
				end = end.getAnt();
			} else {
				reset();
			}
			setQtd(getQtd() - 1);
			return temp;
		} else {
			System.out.println("Lista Vazia");
			return null;
		}
	}

	public void print() {
		if (!isEmpty()) {
			No aux = begin;
			while (aux != null) {
				System.out.print(aux.getValue() + " ");
				aux = aux.getProx();
			}
			System.out.println();
		} else {
			System.out.println("Lista Vazia");
		}
	}

	public void print2() {
		if (!isEmpty()) {
			No aux = end;
			while (aux != null) {
				System.out.print(aux.getValue() + " ");
				aux = aux.getAnt();
			}
			System.out.println();
		} else {
			System.out.println("Lista Vazia");
		}
	}

}
