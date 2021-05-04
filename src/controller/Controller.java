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
	}
	
	class MudaVertice implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			int vertices = view.getValorQuantidadeLadosSlider();
			model.getDesenho().setPoligono(vertices);
			view.atualiza(model.getDesenho());
			
		}
		
	}
}
