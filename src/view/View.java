package view;

import javax.swing.event.ChangeListener;

import entity.Desenho;

public class View {

	Janela janela;
	
	public View(Plano plano) {
		janela = new Janela(plano);
	}
	
	public void setSlidersListener(ChangeListener listener) {
		janela.setSlidersListener(listener);
	}
	
	public void setSlidersListenerRotacao(ChangeListener listener) {
		janela.setSlidersListenerRotacao(listener);
	}
	public void setSlidersListenerCisalhamento(ChangeListener listener) {
		janela.setSlidersListenerCisalhamento(listener);
	}
	public void setSlidersListenerEscalamento(ChangeListener listener) {
		janela.setSlidersListenerEscalamento(listener);
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
	public void atualiza(Desenho desenho) {
        janela.atualiza(desenho);
    }
}
