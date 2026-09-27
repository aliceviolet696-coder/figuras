package com.krakedev.figuras;

public class Triangulo extends Figura {
	private double base;
	private double altura;

	public Triangulo(String nombre, String color, double base, double altura) {
		super(nombre, color);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	protected double calcularHipotenusa() {
		return Math.sqrt(base * base + altura * altura);
	}

	@Override
	public double calcularPerimetro() {
		return base + altura + calcularHipotenusa();
	}

	@Override
	public double calcularArea() {
		return base * altura / 2;
	}

	@Override
	public String toString() {
		return "Triangulo [nombre=" + getNombre() + ", color=" + getColor() + ", base=" + base + ", altura=" + altura
				+ "]";
	}

}
