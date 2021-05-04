package model;

import java.util.ArrayList;
import java.util.List;

import entity.Ponto;
import entity.Desenho;

public class Model {
	
	static List<Ponto> triangulo = new ArrayList<>();
	{
		triangulo.add(new Ponto(250, 250)); //cima esquerda
		triangulo.add(new Ponto(350, 250)); //cima direita
		triangulo.add(new Ponto(300, 400)); //baixo
	};
		
	Desenho desenho = new Desenho(triangulo);
	
	public Model() {}
	
	public Desenho getDesenho() {
		return this.desenho;
	}
}
