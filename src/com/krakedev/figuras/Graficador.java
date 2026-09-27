package com.krakedev.figuras;

public class Graficador {

	public void graficar(Figura figura) {
		System.out.println("Graficando " + figura.getNombre() + " de color " + figura.getColor() + " con perimetro "
				+ figura.calcularPerimetro() + " y area " + figura.calcularArea());
	}

}
