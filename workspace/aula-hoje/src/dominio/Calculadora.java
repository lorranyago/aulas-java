package dominio;

public class Calculadora {
	
	private int valor1;
	private int valor2;
	
	public Calculadora(int valor1, int valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	public int soma() {
		return this.valor1 + this.valor2;
	}
	public int soma(int num1, int num2) {
		if(num1 > 99) {
			throw new RuntimeException("O primeiro número deve ser menor que 99");
		}
		return num1 + num2;
	}
	public int soma(int num1, int num2, int num3) {
		if(num1 > 99) {
			throw new RuntimeException("O primeiro número deve ser menor que 99");
		}
		return num1 + num2;
	}

	public int subtracao() {
		return this.valor1 - this.valor2;
	}
	public int multiplicacao() {
		return this.valor1 * this.valor2;
	}
	public int divisao() {
		return this.valor1 / this.valor2;
	}
	
	public int getValor1() {
		return valor1;
	}
	public void setValor1(Integer valor1) {
		this.valor1 = valor1;
	}
	public int getValor2() {
		return valor2;
	}
	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}
	@Override
	public String toString() {
		return "print da minha calculadora";
	}

}
