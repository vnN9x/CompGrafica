package model;

import java.util.ArrayList;
import java.util.List;

import entity.Ponto;
import entity.Desenho;

public class Model {
	
	static List<Ponto> triangulo = new ArrayList<>();
	{
		triangulo.add(new Ponto(200, 200)); //cima esquerda
        triangulo.add(new Ponto(600, 200)); //cima direita
        triangulo.add(new Ponto(400, 600)); //baixo
	};
		
	Desenho desenho = new Desenho(triangulo);
	
	public Model() {}
	
	public Desenho getDesenho() {
		return this.desenho;
	}
}
