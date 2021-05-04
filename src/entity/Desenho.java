package entity;

import java.util.ArrayList;
import java.util.List;

public class Desenho {
	List<Ponto> pontosIniciais;
	List<Ponto> pontos;
	List<Ponto> backup = pontosIniciais;
	
	public Desenho(List<Ponto> aPontosIniciais) {
		this.pontosIniciais = aPontosIniciais;
	}
	
	public void setPoligono(int vertices) { //escolhe o poligono de acordo com a quantidade de vertices
		 List<Ponto> quadrado = new ArrayList<>();
           quadrado.add(new Ponto(200, 200));
           quadrado.add(new Ponto(600, 200));
           quadrado.add(new Ponto(600, 600));
           quadrado.add(new Ponto(200, 600));
		
		List<Ponto> triangulo = new ArrayList<>();
			triangulo.add(new Ponto(200, 200)); //cima esquerda
	        triangulo.add(new Ponto(600, 200)); //cima direita
	        triangulo.add(new Ponto(400, 600)); //baixo
		
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
		System.out.println(this.pontosIniciais);
		int index = 0;
		double x;
		for(Ponto p: this.pontosIniciais) {
			if(index%2 == 0){
				x = p.getX()-qtdCis;
			}else {
				x = p.getX()+qtdCis;
			}
			Ponto ponto = new Ponto(x, p.getY());
			this.pontosIniciais.set(index, ponto);
			index++;
		}
		index = 0;
		System.out.println(this.pontosIniciais);
	}
	
	public void rotar(int rota) {
		int index = 0;
		double x;
		double y;
		for(Ponto p: this.pontosIniciais) {
			x = Math.round((p.getX()*Math.cos(Math.toRadians(rota)))+(p.getY()*Math.sin(Math.toRadians(rota))));
			y = Math.round((p.getX()*-Math.sin(Math.toRadians(rota)))+(p.getY()*Math.cos(Math.toRadians(rota))));
			Ponto ponto = new Ponto(x, y);
			this.pontosIniciais.set(index, ponto);
			index++;
		}
		index = 0;
	}
	
	public void escala(int escala) {
		double nEscala = escala/10;
		int index = 0;
		double y;
		double x;
		for(Ponto p: this.pontosIniciais) {
			x = Math.round(p.getX()*nEscala);
			y = Math.round(p.getY()*nEscala);
			Ponto ponto = new Ponto(x, y);
			this.pontosIniciais.set(index, ponto);
			index++;
		}
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

