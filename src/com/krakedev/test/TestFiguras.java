package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		// Figura es abstracta: no se puede instanciar, se usa una clase hija como referencia
		Figura figura = new Cuadrado("Cuadrado", "Rojo", 5);
		Cuadrado cuadrado = new Cuadrado("Cuadrado", "Rojo", 5);
		Triangulo triangulo = new Triangulo("Triangulo", "Azul", 4, 3);

		System.out.println(figura);
		System.out.println(cuadrado);
		System.out.println(triangulo);
	}

}
