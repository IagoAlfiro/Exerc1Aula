package br.lasalle.opp.exer1r;

public class Torradeira {
	int modelo;
	String marca;
	int graus;
	boolean alavanca;
	boolean temperatura;
	
	void abaixar() {
		if(alavanca)
			temperatura=true;
			System.out.println("Aquecendo em " + graus + " graus");
	}
	
	void subir() {
		temperatura=false;
	}
	
	void cancelar() {
		if(alavanca)
			alavanca=false;
			subir();
			System.out.println("Cancelado...");
	}
	
}
