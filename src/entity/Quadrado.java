package entity;

import java.util.ArrayList;
import java.util.List;

public class Quadrado {
	List<Ponto> pontosIniciais;
	List<Ponto> pontos;
	
	public Quadrado(List<Ponto> pontosIniciais) {
		this.pontosIniciais = pontosIniciais;
	}
	
	public void reset() {
		pontos = new ArrayList<>(pontosIniciais);
	}
	
	public List<Ponto> getPontos(){
		return pontos;
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
