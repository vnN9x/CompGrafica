package model;

import java.util.ArrayList;
import java.util.List;

import entity.Ponto;
import entity.Quadrado;

public class Model {

	static List<Ponto> pontos = new ArrayList<>();
	{
		pontos.add(new Ponto(250, 250));
		pontos.add(new Ponto(350, 250));
		pontos.add(new Ponto(350, 350));
		pontos.add(new Ponto(250, 350));
	};
	
	Quadrado quadrado = new Quadrado(pontos);
	
	public Model() {}
}
