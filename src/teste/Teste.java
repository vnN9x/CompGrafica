package teste;

import model.Model;
import view.Janela;
import view.Plano;

public class Teste {
	public static void main(String[] args) {
		new Janela(new Plano(new Model().getDesenho()));
		
		
		
	}
}
