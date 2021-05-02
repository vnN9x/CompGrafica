package view;

import javax.swing.event.ChangeListener;

public class View {

	Janela janela;
	
	public View(Plano plano) {
		janela = new Janela(plano);
	}
	
	public void setSlidersListener(ChangeListener listener) {
		janela.setSlidersListener(listener);
	}
	
	public int getValorRotacaoSlider() {
		return janela.getValorRotacaoSlider();
	}
	
	public int getValorEscalamentoSlider() {
		return janela.getValorEscalamentoSlider();
	}
	
	public int getValorCisalhamentoSlider() {
		return janela.getValorCisalhamentoSlider();
	}
	
	public int getValorQuantidadeLadosSlider() {
		return janela.getValorQuantidadeLadosSlider();
	}
}
