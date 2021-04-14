package converter;

public class Area {

	private double milimetroQuadrado;
	private double centimetroQuadrado;
	private double decimetroQuadrado;
	private double metroQuadrado;
	private double kilometroQuadrado;
	private double milhaQuadrado;
	private double pesQuadrado;
	private long dezElevado12 = 1000000000000L;         // Representa o número 10 elevado a 12 
	private long dois59Elevado12 = 2590000000000L;      // Representa número 2,59 x 10 elevado a 12
	private long dezElevado10 = 10000000000L;           // Representa o número 10 elevado a 10
	private long dois59Elevado10 = 25900000000L;        // Representa o número 2,59 x 10 elevado a 10 
	
	// Função usada para fazer as conversões dos valores de área
	
	public void converteArea(double valor, int unidadeMedida)
	{
	/* Esses longs armazenam valores grandes utilizados em algumas conversões  */
		
	  
		
	   switch (unidadeMedida) 
		{
		// Caso o usuário escolha milímetros quadrados
		case 0:
			this.centimetroQuadrado = valor / 100;
			this.decimetroQuadrado = valor / 10000;
			this.metroQuadrado = valor / 1000000;
			this.kilometroQuadrado = valor / dezElevado12;
			this.milhaQuadrado = valor / dois59Elevado12;
			this.pesQuadrado = valor / 92903.04;
			break;
			
			
		// Caso o usuário escolha centímetros quadrados
		case 1:
			this.milimetroQuadrado = valor * 100;
			this.decimetroQuadrado = valor / 100;
			this.metroQuadrado = valor / 10000;
			this.kilometroQuadrado = valor / dezElevado10;
			this.milhaQuadrado = valor / dois59Elevado10;
			this.pesQuadrado = valor / 929;
			break;
			
			
		// Caso o usuário escolha decímetros quadrados
		case 2:
			this.milimetroQuadrado = valor * 10000;
			this.centimetroQuadrado = valor * 100;
			this.metroQuadrado = valor / 100;
			this.kilometroQuadrado = valor / 100000000;
			this.milhaQuadrado = valor / 259000000;
			this.pesQuadrado = valor / 9.29;
			break;
			
			
		// Caso o usuário escolha metros quadrados
		case 3:
			this.milimetroQuadrado = valor * 1000000;
			this.centimetroQuadrado = valor * 10000;
			this.decimetroQuadrado = valor * 100;
			this.kilometroQuadrado = valor / 1000000;
			this.milhaQuadrado = valor / 2590000;
			this.pesQuadrado = valor * 10.764;
			break;
			
			
		// Caso o usuário escolha quilômetros quadrados
		case 4:
			this.milimetroQuadrado = valor * dezElevado12;
			this.centimetroQuadrado = valor * dezElevado10;
			this.decimetroQuadrado = valor * 100000000;
			this.metroQuadrado = valor * 1000000;
			this.milhaQuadrado = valor / 2.59;
			this.pesQuadrado = valor * 10760000;
			break;
			
			
		// Caso o usuário escolha milhas quadradas
		case 5:
			this.milimetroQuadrado = valor * dois59Elevado12;
			this.centimetroQuadrado = valor * dois59Elevado10;
			this.decimetroQuadrado = valor * 259000000;
			this.metroQuadrado = valor * 2590000;
			this.kilometroQuadrado = valor * 2.59;
			this.pesQuadrado = valor = 27880000;
			break;
			
			
		// Caso o usuário escolha pés quadrados
		case 6:
			this.milimetroQuadrado = valor * 92903;
			this.centimetroQuadrado = valor * 929.03;
			this.decimetroQuadrado = valor * 9.2902;
			this.metroQuadrado = valor / 10.764;
			this.kilometroQuadrado = valor / 10760000;
			this.milhaQuadrado = valor / 27880000;
			break;
		}
	}
	
	
	
	
	public double getMilimetroQuadrado() {
		return milimetroQuadrado;
	}
	public void setMilimetroQuadrado(double milimetroQuadrado) {
		this.milimetroQuadrado = milimetroQuadrado;
	}
	public double getCentimetroQuadrado() {
		return centimetroQuadrado;
	}
	public void setCentimetroQuadrado(double centimetroQuadrado) {
		this.centimetroQuadrado = centimetroQuadrado;
	}
	public double getDecimetroQuadrado() {
		return decimetroQuadrado;
	}
	public void setDecimetroQuadrado(double decimetroQuadrado) {
		this.decimetroQuadrado = decimetroQuadrado;
	}
	public double getMetroQuadradoQuadrado() {
		return metroQuadrado;
	}
	public void setMetroQuadradoQuadrado(double metroQuadradoQuadrado) {
		this.metroQuadrado = metroQuadradoQuadrado;
	}
	public double getKilometroQuadrado() {
		return kilometroQuadrado;
	}
	public void setKilometroQuadrado(double kilometroQuadrado) {
		this.kilometroQuadrado = kilometroQuadrado;
	}
	public double getMilhaQuadrado() {
		return milhaQuadrado;
	}
	public void setMilhaQuadrado(double milhaQuadrado) {
		this.milhaQuadrado = milhaQuadrado;
	}
	public double getPesQuadrado() {
		return pesQuadrado;
	}
	public void setPesQuadrado(double pesQuadrado) {
		this.pesQuadrado = pesQuadrado;
	}
	public String getArea(int n)
	{
		String str = null;
		switch (n)
		{
		case 0:
			str = Double.toString(this.milimetroQuadrado);
			break;
		case 1:
			str = Double.toString(this.centimetroQuadrado);
			break;
		case 2:
			str = Double.toString(this.decimetroQuadrado);
			break;
		case 3:
			str = Double.toString(this.metroQuadrado);
			break;
		case 4:
			str = Double.toString(this.kilometroQuadrado);
			break;
		case 5:
			str = Double.toString(this.milhaQuadrado);
			break;
		case 6:
			str = Double.toString(this.pesQuadrado);
			break;
		}
		return str;
	}
	
	
}
