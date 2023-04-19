package application;

import entities.Carta;

public class Program {

	public static void main(String[] args) {
		Carta carta1 = new Carta("Ouros", 7);
		
		System.out.println("Carta 1");
		System.out.printf("Naipe: %s%nValor: %d%n%n", carta1.getNaipe(), carta1.getValor());
		
		Carta carta2 = new Carta("Copas", 3);
		
		System.out.println("Carta 2");
		System.out.printf("Naipe: %s%nValor: %d%n%n", carta2.getNaipe(), carta2.getValor());
		
		System.out.println("O valor da carta 1 eh maior que a carta 2: " + carta1.compararValor(carta2));
		System.out.println("O naipe das cartas sao iguais: " + carta1.compararNaipe(carta2));
	}
	
}
