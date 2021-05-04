package entity;

import java.util.ArrayList;
import java.util.List;

public class Desenho {
	List<Ponto> pontosIniciais = new ArrayList<>();
	List<Ponto> pontos;
	List<Ponto> backup = pontosIniciais;
	
	public Desenho(List<Ponto> pontosIniciais) {
		this.pontosIniciais = pontosIniciais;
	}
	
	public void setPoligono(int vertices) { //escolhe o poligono de acordo com a quantidade de vertices
		 List<Ponto> quadrado = new ArrayList<>();
			quadrado.add(new Ponto(250, 250));
			quadrado.add(new Ponto(350, 250));
			quadrado.add(new Ponto(350, 350));
			quadrado.add(new Ponto(250, 350));
		
		List<Ponto> triangulo = new ArrayList<>();
			triangulo.add(new Ponto(250, 250)); //cima esquerda
			triangulo.add(new Ponto(350, 250)); //cima direita
			triangulo.add(new Ponto(300, 400)); //baixo
		
		List<Ponto> pentagono = new ArrayList<>();
			pentagono.add(new Ponto(250, 250)); //cima esquerda
			pentagono.add(new Ponto(350, 250)); //cima direita
			pentagono.add(new Ponto(350, 350)); //baixo direita
			pentagono.add(new Ponto(300, 400)); //baixo
			pentagono.add(new Ponto(250, 350)); //baixo esquerda
		
		List<Ponto> hexagono = new ArrayList<>();
			hexagono.add(new Ponto(220, 250)); //cima esquerda
			hexagono.add(new Ponto(300, 200)); //cima
			hexagono.add(new Ponto(370, 250)); //cima direita
			hexagono.add(new Ponto(370, 350)); //baixo direita
			hexagono.add(new Ponto(300, 400)); //baixo
			hexagono.add(new Ponto(220, 350)); //baixo esquerda
		switch(vertices) {
		case 3:
			this.pontosIniciais = triangulo;
			break;
		case 4:
			this.pontosIniciais = quadrado;
			break;
		case 5:
			this.pontosIniciais = pentagono;
			break;
		case 6:
			this.pontosIniciais = hexagono;
			break;	
		}

	}
	
	public void cis(int qtdCis){ //cisalhamento
		int index = 0;
		for(Ponto p: this.pontosIniciais) {
			p.setX(p.getX()+qtdCis);
			p.setY(p.getY()-qtdCis);
			this.pontosIniciais.set(index, p);
			index++;
		}
		index = 0;
	}
	
	public void rotar(int rota) {
		int index = 0;
		for(Ponto p: this.pontosIniciais) {
			p.setX(p.getX()+rota);
			p.setY(p.getY()+rota);
			this.pontosIniciais.set(index, p);
			index++;
		}
		index = 0;
	}
	
	public void escala(int escala) {
		double nEscala = escala/10;
		int index = 0;
		for(Ponto p: this.pontosIniciais) {
			p.setX(p.getX()*nEscala);
			p.setY(p.getY()*nEscala);
			this.pontosIniciais.set(index, p);
			index++;
		}
		index = 0;
	}
	
	public void voltar() {
		this.pontosIniciais = this.backup;
	}
	
	
	public List<Ponto> getPontos(){
		return this.pontosIniciais;
	}
	
	public Ponto getPontoCentral() {
		Ponto pontoMedio = new Ponto(0, 0);
		for(Ponto p: pontos) {
			pontoMedio.x += p.x;
			pontoMedio.y += p.y;
		}
		pontoMedio.x /= pontos.size();
		pontoMedio.y /= pontos.size();
		
		return pontoMedio;
	}
}
