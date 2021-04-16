package converter;

public class Peso {

	private double miliGrama;
	private double grama;
	private double kiloGrama;
	private double libra;
	private double tonelada;
	
	
	// Função usada para fazer as conversões de peso
	
public void convertePeso(double valor, int unidadeMedida) {
		
		switch (unidadeMedida)
		{
	// Caso o usuário escolha miligrama
		case 0:
			this.miliGrama = valor;
			this.grama = valor / 1000;
			this.kiloGrama = valor / 1000000;            // Em cada caso é calculado todos os 
			this.libra = valor / 453592;                 //         valores possíveis
			this.tonelada = valor / 1000000000;
			break;
			
			
	// Caso o usuário escolha grama
		case 1:
			this.grama = valor;
			this.miliGrama = valor * 1000;
			this.kiloGrama = valor / 1000;
			this.libra = valor / 453.592;
			this.tonelada = valor / 1000000;
			break;
			
			
	// Caso o usuário escolha quilograma
		case 2:
			this.kiloGrama = valor;
			this.miliGrama = valor * 1000000;
			this.grama = valor * 1000;
			this.libra = valor * 0.453592;
			this.tonelada = valor / 1000;
			break;
			
	// Caso o usuário escolha libra
	
		case 3:
			this.libra = valor;
			this.miliGrama = valor * 453592;
			this.grama = valor * 453.592;
			this.kiloGrama = valor * 0.453592;
			this.tonelada = valor * 0.000453592;
			break;
			
			
	// Caso o usuário escolha tonelada
		case 4:
			this.tonelada = valor;
			this.miliGrama = valor * 1000000000;
			this.grama = valor * 1000000;
			this.kiloGrama = valor * 1000;
			this.libra = valor * 2205;
			break;
		
		}
}
	
	
	// Abaixo constam os getters e setters
	
	public double getMiliGrama() {
		return miliGrama;
	}
	public void setMiliGrama(double miliGrama) {
		this.miliGrama = miliGrama;
	}
	public double getGrama() {
		return grama;
	}
	public void setGrama(double grama) {
		this.grama = grama;
	}
	public double getKiloGrama() {
		return kiloGrama;
	}
	public void setKiloGrama(double kiloGrama) {
		this.kiloGrama = kiloGrama;
	}
	public double getLibra() {
		return libra;
	}
	public void setLibra(double libra) {
		this.libra = libra;
	}
	public double getTonelada() {
		return tonelada;
	}
	public void setTonelada(double tonelada) {
		this.tonelada = tonelada;
	}
	public String getPeso(int n)
	{
		String str = null;
		switch (n)
		{
		case 0:
			str = Double.toString(this.miliGrama);
			break;
		case 1:
			str = Double.toString(this.grama);
			break;
		case 2:
			str = Double.toString(this.kiloGrama);
			break;
		case 3:
			str = Double.toString(this.libra);
			break;
		case 4:
			str = Double.toString(this.tonelada);
			break;
		
		}
		return str;
	}
	
	
}
