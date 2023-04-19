package entities;

public class Carta {
	private String naipe;
	private int valor;
	
	// construtores da classe carta
	
	public Carta() {
		this.naipe = "";
		this.valor = 0;
	}
	
	public Carta(String naipe, int valor) {
		this.naipe = naipe;
		this.valor = valor;
	}

	// metodos get e set
	
	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	// metodos comparativos
	
	public int compararValor(Carta carta) {
		if (valor > carta.getValor())
			return 1;
		else if (valor < carta.getValor())
			return -1;
		else
			return 0;
	}

	public boolean compararNaipe(Carta carta) {
		if (carta.getNaipe().equals(naipe))
			return true;
		return false;
	}
}
