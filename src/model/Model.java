package model;

import java.util.ArrayList;
import java.util.List;

import entity.Ponto;
import entity.Desenho;

public class Model {

	static List<Ponto> pontos = new ArrayList<>();
	{
		pontos.add(new Ponto(250, 250));
		pontos.add(new Ponto(350, 250));
		pontos.add(new Ponto(350, 350));
		pontos.add(new Ponto(250, 350));
		pontos.add(new Ponto(200, 200));
		pontos.add(new Ponto(400, 400));
	};
	
	Desenho desenho = new Desenho(pontos);
	
	public Model() {}
	
	public Desenho getDesenho() {
		return this.desenho;
	}
}
