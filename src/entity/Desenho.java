package entity;

import java.util.ArrayList;
import java.util.List;

public class Desenho {
	List<Ponto> pontosIniciais;
	List<Ponto> pontos;
	List<Ponto> backup = new ArrayList<>();

	
	public Desenho(List<Ponto> aPontosIniciais) {
		this.pontosIniciais = aPontosIniciais;
		backup = pontosIniciais;
	}
	
	public void setPoligono(int vertices) { //escolhe o poligono de acordo com a quantidade de vertices
		 List<Ponto> quadrado = new ArrayList<>();
           quadrado.add(new Ponto(200, 200));
           quadrado.add(new Ponto(600, 200));
           quadrado.add(new Ponto(600, 600));
           quadrado.add(new Ponto(200, 600));
		
		List<Ponto> triangulo = new ArrayList<>();
			triangulo.add(new Ponto(200, 200)); 
	        triangulo.add(new Ponto(600, 200)); 
	        triangulo.add(new Ponto(400, 600)); 
		
		List<Ponto> pentagono = new ArrayList<>();
	        pentagono.add(new Ponto(600, 400));
	        pentagono.add(new Ponto(500, 600));
	        pentagono.add(new Ponto(300, 600));
	        pentagono.add(new Ponto(200, 400));
		
		
		List<Ponto> hexagono = new ArrayList<>();
			hexagono.add(new Ponto(500, 200));
	        hexagono.add(new Ponto(600, 400));
	        hexagono.add(new Ponto(500, 600));
	        hexagono.add(new Ponto(300, 600));
	        hexagono.add(new Ponto(200, 400));
	        hexagono.add(new Ponto(300, 200));
		
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
		double x;
		for(Ponto p: this.backup) {
			if(index%2 == 0){
				x = p.getX()-qtdCis;
			}else {
				x = p.getX()+qtdCis;
			}
			Ponto ponto = new Ponto(x, p.getY());
			this.pontosIniciais.set(index, ponto);
			index++;
		}
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
		double nEscala = (double) escala/10;
		System.out.println(nEscala);
		int index = 0;
		double y;
		double x;
		Ponto ponto;
		for(Ponto p: this.backup) {
			System.out.println("Antes: "+ this.backup);
			if(nEscala <= 0.9) {
				continue;
			}else {
				x = Math.round(p.getX()*nEscala);
				y = Math.round(p.getY()*nEscala);
			ponto = new Ponto(x, y);	
			this.pontosIniciais.set(index, ponto);
			System.out.println("Depois: " +this.pontosIniciais);
			index++;
			}
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
		System.out.println(pontoMedio);
		return pontoMedio;
	}
	
	public List<Ponto> centralizar(List<Ponto> central) {
		int index = 0;
		for (Ponto p: central) {
			
		}
		return central;
	}
}

