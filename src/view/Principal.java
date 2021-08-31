package view;

import controller.ThreadVetor;

public class Principal {
	
	public static void main(String[] args) {
		int vetor[] = new int[1000];
		int impar = 1;
		int par = 2;
		
		for (int i =0;i<999;i++) {
			vetor[i]=(int)((Math.random()*100)+1);
		}
		Thread Threadimpar = new ThreadVetor(vetor,impar);
		Thread Threadpar = new ThreadVetor(vetor,par);
		Threadimpar.start();
		Threadpar.start();
		
	}
}
