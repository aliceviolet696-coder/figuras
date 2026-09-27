package com.krakedev.figuras;

public class Hexagono extends Figura {
	private double lado;

	public Hexagono(String nombre, String color, double lado) {
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
		return 6 * lado;
	}

	@Override
	public double calcularArea() {
		return (3 * Math.sqrt(3) * lado * lado) / 2;
	}

	@Override
	public String toString() {
		return "Hexagono [nombre=" + getNombre() + ", color=" + getColor() + ", lado=" + lado + "]";
	}

}
