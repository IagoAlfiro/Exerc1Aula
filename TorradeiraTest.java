package br.lasalle.opp.exer1r;

public class TorradeiraTest {
	
	public static void main(String[] args) {
		
	Torradeira torradeiraBrastemp1= new Torradeira();
	
	torradeiraBrastemp1.graus = 360;
	torradeiraBrastemp1.modelo = 2;
	torradeiraBrastemp1.marca = "Brastemp";
	
	torradeiraBrastemp1.abaixar();
	
	torradeiraBrastemp1.cancelar();
	
	}
}
