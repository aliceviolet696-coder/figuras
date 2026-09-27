package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Hexagono;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestPolimorfismo {

	public static void main(String[] args) {
		Graficador graficador = new Graficador();

		Figura[] figuras = { new Cuadrado("Cuadrado", "Rojo", 5),
				new Rectangulo("Rectangulo", "Azul", 4, 6),
				new Triangulo("Triangulo", "Verde", 6, 4),
				new TrianguloRectangulo("TrianguloRectangulo", "Negro", 3, 4),
				new Hexagono("Hexagono", "Blanco", 2) };

		for (Figura figura : figuras) {
			graficador.graficar(figura);
		}

		System.out.println();
		System.out.println("Hipotenusa del TrianguloRectangulo (3, 4): "
				+ ((TrianguloRectangulo) figuras[3]).getHipotenusa());
	}

}
