package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;

public class TestGraficar {

	public static void main(String[] args) {
		Graficador graficador = new Graficador();

		Figura f1 = new Cuadrado("Cuadrado", "Rojo", 5);
		Figura f2 = new Rectangulo("Rectangulo", "Azul", 4, 6);

		graficador.graficar(f1);
		graficador.graficar(f2);
	}

}
