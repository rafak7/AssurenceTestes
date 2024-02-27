package PacoteApps;

//import PacoteApps.Calculadora;

public class Elevador {
	
	
	private int id;
	
	private double cargaMaxima;
	
	private double cargaAtual;
	
	private boolean sinalAlerta;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public double getCargaAtual() {
		return cargaAtual;
	}

	public void setCargaAtual(double cargaAtual) {
		this.cargaAtual = cargaAtual;
	}

	public boolean isSinalAlerta() {
		return sinalAlerta;
	}

	public void setSinalAlerta(boolean sinalAlerta) {
		this.sinalAlerta = sinalAlerta;
	}
	
	public double entrarNoElevador(double pesoPessoa){
		Calculadora calc = new Calculadora();
		cargaAtual = calc.somar(pesoPessoa, cargaAtual);
		return cargaAtual;
		
	}
	
	public double sairDoElevador(double pesoPessoa){
		Calculadora calc = new Calculadora();
		cargaAtual = calc.subtrair(pesoPessoa, cargaAtual);
		return cargaAtual;
	}
	
	public boolean avaliarPeso(double pesoElevador) {
		if(pesoElevador > cargaMaxima) {
			return sinalAlerta =  true;
		}else {
			return sinalAlerta = false;
		}

	}
	
}
