package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Hexagono;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestPerimetro {
	private static int pruebasFallidas = 0;

	public static void main(String[] args) {
		Figura cuadrado = new Cuadrado("Cuadrado", "Rojo", 5);
		Figura rectangulo = new Rectangulo("Rectangulo", "Azul", 4, 6);
		Figura triangulo = new Triangulo("Triangulo", "Verde", 6, 4);
		Figura trianguloRectangulo = new TrianguloRectangulo("TrianguloRectangulo", "Negro", 3, 4);
		Figura hexagono = new Hexagono("Hexagono", "Blanco", 2);

		System.out.println("== Perimetros ==");
		verificar("Cuadrado", 20.0, cuadrado.calcularPerimetro());
		verificar("Rectangulo", 20.0, rectangulo.calcularPerimetro());
		verificar("Triangulo", 10 + Math.sqrt(52), triangulo.calcularPerimetro());
		verificar("TrianguloRectangulo", 12.0, trianguloRectangulo.calcularPerimetro());
		verificar("Hexagono", 12.0, hexagono.calcularPerimetro());

		System.out.println();
		System.out.println("== Areas ==");
		verificar("Cuadrado", 25.0, cuadrado.calcularArea());
		verificar("Rectangulo", 24.0, rectangulo.calcularArea());
		verificar("Triangulo", 12.0, triangulo.calcularArea());
		verificar("TrianguloRectangulo", 6.0, trianguloRectangulo.calcularArea());
		verificar("Hexagono", 6 * Math.sqrt(3), hexagono.calcularArea());

		System.out.println();
		if (pruebasFallidas == 0) {
			System.out.println("Todas las pruebas pasaron");
		} else {
			System.out.println("Pruebas fallidas: " + pruebasFallidas);
		}
	}

	private static void verificar(String nombre, double esperado, double obtenido) {
		boolean correcto = Math.abs(esperado - obtenido) < 0.0001;
		if (correcto) {
			System.out.println("OK   " + nombre + " -> " + obtenido);
		} else {
			pruebasFallidas++;
			System.out.println("ERROR " + nombre + " -> esperado: " + esperado + ", obtenido: " + obtenido);
		}
	}

}
