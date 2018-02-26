package com.estruturadedados2.aula01;

import javax.swing.JOptionPane;

public class PilhaDeVetor {

	private Object[] stack = new Object[5];
	private int peek = -1;

	public void push(Object element) {
		if (!isFull()) {
			peek++;
			stack[peek] = element;
		} else {
			JOptionPane.showMessageDialog(null, "Pilha está Cheia!");
		}

	}

	public Object pop() {
		if (!isEmpty()) {
			Object temp = stack[peek];
			stack[peek] = null;
			peek--;
			return temp;
		} else {
			return null;
		}

	}

	public Object peek() {
		return stack[peek];
	}

	public String print() {
		String str = "";

		if (!isEmpty()) {
			for (int i = peek; i >= 0; i--) {
				str += stack[i] + "\t\n";
			}
		} else {
			str = "Pilha está Vazia.";
		}

		return str;
	}
	
	public int size(){
		return peek + 1;
	}

	public boolean isFull() {
		return peek == stack.length - 1;
	}

	public boolean isEmpty() {
		return peek == -1;
	}

}
