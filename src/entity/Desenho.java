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
	
	public List<Ponto> setPoligono(int vertices) { //escolhe o poligono de acordo com a quantidade de vertices
		List<Ponto> poligono = new ArrayList<>();
		try {
			for (int i = 0; i < vertices; ++i) {
				poligono.add(this.pontosIniciais.get(i));
			}
			return poligono;
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("A MUDANÇA DE VERTICES FALHOU!!!!");
			return this.pontosIniciais;
		}
	}
	
	public void cis(double qtdCis){ //cisalhamento
		int index = 0;
		for(Ponto p: this.pontosIniciais) {
			p.setX(p.getX()+qtdCis);
			p.setY(p.getY()-qtdCis);
			this.pontosIniciais.set(index, p);
			index++;
		}
		index = 0;
	}
	
	public void rotar(double rota) {
		int index = 0;
		for(Ponto p: this.pontosIniciais) {
			p.setX(p.getX()+rota);
			p.setY(p.getY()+rota);
			this.pontosIniciais.set(index, p);
			index++;
		}
		index = 0;
	}
	
	public void escala(double escala) {
		int index = 0;
		for(Ponto p: this.pontosIniciais) {
			p.setX(p.getX()*escala);
			p.setY(p.getY()*escala);
			this.pontosIniciais.set(index, p);
			index++;
		}
		index = 0;
	}
	
	public void voltar() {
		this.pontosIniciais = this.backup;
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
