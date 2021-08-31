package controller;

public class ThreadVetor extends Thread {
	
	private int[] vetor;
	private int numero;
	
	public ThreadVetor(int[] vetor, int numero) {
		this.vetor = vetor;
		this.numero = numero;
	}
	
	public void run() {
		if (numero % 2==0) {
			par();
		} else {
			impar();
		}
		
	}

	private void impar() {
		double tempoInicial = System.nanoTime();
		for (@SuppressWarnings("unused") int vet:vetor){
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Tempo para percorer o laço ForEach ==>:" + tempoTotal);
	}

	private void par() {
		double tempoInicial = System.nanoTime();
		for (int i = 0 ; i < vetor.length; i++){
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Tempo para percorer o laço for ==>:" + tempoTotal);
	}

}
