package view;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.event.ChangeListener;

import entity.Desenho;

public class Janela extends JFrame {
	Plano plano;
	
	Controladores controladores = new Controladores();

	public Janela(Plano plano) {
		this.plano = plano;
		setSize(800, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		setResizable(false);
		
		add(controladores);
		add(plano);
		
		setVisible(true);
	}
	
	public void setSlidersListener(ChangeListener listener) {
		controladores.setSlidersListener(listener);
	}
	
	public void setSlidersListenerRotacao(ChangeListener listener) {
		controladores.setSlidersListenerRotacao(listener);
	}
	
	public void setSlidersListenerCisalhamento(ChangeListener listener) {
		controladores.setSlidersListenerCisalhamento(listener);
	}
	
	public int getValorRotacaoSlider() {
		return controladores.rotacaoSlider.getValue();
	}
	
	public int getValorEscalamentoSlider() {
		return controladores.escalamentoSlider.getValue();
	}
	
	public int getValorCisalhamentoSlider() {
		return controladores.cisalhamentoSlider.getValue();
	}
	
	public int getValorQuantidadeLadosSlider() {
		return controladores.quantidadeLadosSlider.getValue();
	}
	public void atualiza(Desenho desenho) {
        plano.desenhoUpdate(desenho);
    }
}
