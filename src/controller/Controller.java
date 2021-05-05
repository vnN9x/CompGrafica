package controller;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import model.Model;
import view.Plano;
import view.View;

public class Controller {
	Model model;
	View view;
	Plano plano;
		
	public Controller() {
		model = new Model();
		view = new View(new Plano(model.getDesenho()));
		
		view.setSlidersListener(new MudaVertice());
		view.setSlidersListenerRotacao(new Rotaciona());
		view.setSlidersListenerCisalhamento(new Cisalhamento());
//		view.setSlidersListener(new Escalamento());
	}
	
	class MudaVertice implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			int vertices = view.getValorQuantidadeLadosSlider();
			model.getDesenho().setPoligono(vertices);
			view.atualiza(model.getDesenho());
		}	
	}
	
	class Rotaciona implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			int rota = view.getValorRotacaoSlider();
			model.getDesenho().rotar(rota);
			view.atualiza(model.getDesenho());
		}
	}
	
	class Cisalhamento implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			int cis = view.getValorCisalhamentoSlider();
			model.getDesenho().cis(cis);
			view.atualiza(model.getDesenho());
		}		
	}
	
	class Escalamento implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			int escala = view.getValorEscalamentoSlider();
			model.getDesenho().escala(escala);
			view.atualiza(model.getDesenho());
		}
	}
	
}
