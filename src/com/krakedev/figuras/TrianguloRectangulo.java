package com.krakedev.figuras;

public class TrianguloRectangulo extends Triangulo {
	private double catetoA;
	private double catetoB;
	private double hipotenusa;

	public TrianguloRectangulo(String nombre, String color, double catetoA, double catetoB) {
		super(nombre, color, catetoA, catetoB);
		this.catetoA = catetoA;
		this.catetoB = catetoB;
		this.hipotenusa = calcularHipotenusa(catetoA, catetoB);
	}

	private static double calcularHipotenusa(double catetoA, double catetoB) {
		return Math.sqrt(catetoA * catetoA + catetoB * catetoB);
	}

	public double getCatetoA() {
		return catetoA;
	}

	public double getCatetoB() {
		return catetoB;
	}

	public double getHipotenusa() {
		return hipotenusa;
	}

	@Override
	public double calcularPerimetro() {
		return catetoA + catetoB + hipotenusa;
	}

	@Override
	public double calcularArea() {
		return catetoA * catetoB / 2;
	}

	@Override
	public String toString() {
		return "TrianguloRectangulo [nombre=" + getNombre() + ", color=" + getColor() + ", catetoA=" + catetoA
				+ ", catetoB=" + catetoB + ", hipotenusa=" + hipotenusa + "]";
	}

}
