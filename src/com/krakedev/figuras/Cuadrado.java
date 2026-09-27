package com.krakedev.figuras;

public class Cuadrado extends Figura {
	private double lado;

	public Cuadrado(String nombre, String color, double lado) {
		super(nombre, color);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularPerimetro() {
		return 4 * lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [nombre=" + getNombre() + ", color=" + getColor() + ", lado=" + lado + "]";
	}

}
