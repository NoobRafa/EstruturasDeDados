package com.estruturadedados2.aula01;

import javax.swing.JOptionPane;

public class TestePilha {
	public static void main(String[] args) {
		
		PilhaDeVetor p = new PilhaDeVetor();
		
		p.push("A");
		p.push("B");
		p.push("C");
		p.push("D");
		p.push("E");
		
		//JOptionPane.showMessageDialog(null, p.print());
		
		//p.push("F");
		
		
		p.pop();
		p.pop();
		p.pop();
		p.pop();
		p.pop();
		p.pop();
		
		JOptionPane.showMessageDialog(null, p.print());
		
	}

}
