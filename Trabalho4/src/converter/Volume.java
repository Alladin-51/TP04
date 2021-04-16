package converter;

public class Volume {
	
	private double miliLitros;
	private double litros;
	private double milimetrosCubicos;
	private double centimetrosCubicos;
	private double decimetrosCubicos;
	private double metrosCubicos;
	private double pesCubicos;
	
	// Fun��o usada para converter os valores de volume 
	
	public void converteVol(double valor, int unidadeMedida)
	{
		switch(unidadeMedida)
		{
	// Caso o usu�rio escolha mililitros
		case 0:
			this.miliLitros = valor;
			this.litros = valor / 1000;
			this.milimetrosCubicos = valor * 1000;
			this.centimetrosCubicos = valor ;               // Em cada caso � calculado todos os 
			this.decimetrosCubicos = valor / 1000;          //       valores poss�veis
			this.metrosCubicos = valor / 1000000;
			this.pesCubicos = valor / 28317;
			break;
			
			
	// Caso o usu�rio escolha litros
		case 1:
			this.litros = valor;
			this.miliLitros = valor * 1000;
			this.milimetrosCubicos = valor * 1000000;
			this.centimetrosCubicos = valor * 1000;
			this.decimetrosCubicos = valor;
			this.metrosCubicos = valor / 1000;
			this.pesCubicos = valor / 28.317;
			break;
			
			
	// Caso o usu�rio escolha mil�metros c�bicos
		case 2:
			this.milimetrosCubicos = valor;
			this.miliLitros = valor / 1000;
			this.litros = valor / 1000000;
			this.centimetrosCubicos = valor / 1000;
			this.decimetrosCubicos = valor / 1000000;
			this.metrosCubicos = valor / 1000000000;
			this.pesCubicos = valor / 28320000;
			break;
			
			
	// Caso o usu�rio escolha cent�metros c�bicos
		case 3:
			this.centimetrosCubicos = valor;
			this.miliLitros = valor;
			this.litros = valor / 1000;
			this.milimetrosCubicos = valor * 1000;
			this.decimetrosCubicos = valor / 1000;
			this.metrosCubicos = valor / 1000000;
			this.pesCubicos = valor / 28317;
			break;
			
			
	// Caso o usu�rio escolha dec�metros c�bicos
		case 4:
			this.decimetrosCubicos = valor;
			this.miliLitros = valor * 1000;
			this.litros = valor;
			this.milimetrosCubicos = valor * 1000000;
			this.centimetrosCubicos = valor * 1000;
			this.metrosCubicos = valor / 1000;
			this.pesCubicos = valor / 28.317;
			break;
			
			
	// Caso o usu�rio escolha metros c�bicos
		case 5:
			this.metrosCubicos = valor;
			this.miliLitros = valor * 1000000;
			this.litros = valor * 1000;
			this.milimetrosCubicos = valor * 1000000000;
			this.centimetrosCubicos = valor * 1000000;
			this.decimetrosCubicos = valor * 1000;
			this.pesCubicos = valor * 35.315;
			break;
			
			
	// Caso o usu�rio escolha p�s c�bicos
		case 6:
			this.pesCubicos = valor;
			this.miliLitros = valor * 28317;
			this.litros = valor * 28.317;
			this.milimetrosCubicos = valor * 28320000;
			this.centimetrosCubicos = valor * 28317;
			this.decimetrosCubicos = valor * 28.317;
			this.metrosCubicos = valor / 35.315;
			break;
		}
	}
	
	
	// Abaixo constam os getters e setters
	
	
	
	public double getMiliLitros() {
		return miliLitros;
	}
	public void setMiliLitros(double miliLitros) {
		this.miliLitros = miliLitros;
	}
	public double getLitros() {
		return litros;
	}
	public void setLitros(double litros) {
		this.litros = litros;
	}
	public double getMilimetrosCubicos() {
		return milimetrosCubicos;
	}
	public void setMilimetrosCubicos(double milimetrosCubicos) {
		this.milimetrosCubicos = milimetrosCubicos;
	}
	public double getCentimetrosCubicos() {
		return centimetrosCubicos;
	}
	public void setCentimetrosCubicos(double centimetrosCubicos) {
		this.centimetrosCubicos = centimetrosCubicos;
	}
	public double getDecimetrosCubicos() {
		return decimetrosCubicos;
	}
	public void setDecimetrosCubicos(double decimetrosCubicos) {
		this.decimetrosCubicos = decimetrosCubicos;
	}
	public double getMetrosCubicos() {
		return metrosCubicos;
	}
	public void setMetrosCubicos(double metrosCubicos) {
		this.metrosCubicos = metrosCubicos;
	}
	public double getPesCubicos() {
		return pesCubicos;
	}
	public void setPesCubicos(double pesCubicos) {
		this.pesCubicos = pesCubicos;
	}
	
	
	// Este m�todo serve para mandar as informa��es para o pacote view
	// Ele transforma o resultado da conta em uma string e usa o switch para alternar entre as op�oes escolhidas
	
	public String getVol(int n)
	{
		String str = null;
		switch (n)
		{
		case 0:
			str = Double.toString(this.miliLitros);
			break;
		case 1:
			str = Double.toString(this.litros);
			break;
		case 2:
			str = Double.toString(this.milimetrosCubicos);
			break;
		case 3:
			str = Double.toString(this.centimetrosCubicos);
			break;
		case 4:
			str = Double.toString(this.decimetrosCubicos);
			break;
		case 5:
			str = Double.toString(this.metrosCubicos);
			break;
		case 6:
			str = Double.toString(this.pesCubicos);
			break;
		}
		return str;
	}
}