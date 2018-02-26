package com.estruturadedados2.aula03;

public class PilhaEncadeada {
	private No topo;
	private int qtd;
	
	public No getTopo() {
		return topo;
	}
	public void setTopo(No topo) {
		this.topo = topo;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public void push(Object element){
		No novo = new No(element,topo);
		topo = novo;
		qtd++;
	}
	
	public Object pop(){
		if (!isEmpty()) {
			Object temp = topo.getValue();
			topo = topo.getAnt();
			qtd--;
			return temp;
			
		}else{
			System.out.println("Pilha vazia!");
			return null;
		}
	}
	
	public void print(){
		No aux  = topo;
		while(aux != null){
			System.out.print(aux.getValue() + "\t");
			aux = aux.getAnt();
		}
	}
	
	public int size(){
		return qtd;
	}
	public boolean isEmpty(){
		return size() == 0;
	}

}
