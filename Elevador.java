package br.lasalle.opp.exer1r;

public class Elevador {
	String modelo;
	String marca;
	int ano;
	float capacidade; 
	boolean aberto;
	
	void funcionar() {
		if(!aberto) 
			System.out.println("Em funcionamento!");
		else
		    System.out.println("Portas abertas! Não está operando!");
		
	}
	
	void abrir() {
		aberto = true;
	}
	
	void fechar() {
		aberto = false;
	}
}
