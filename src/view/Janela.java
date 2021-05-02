package view;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.event.ChangeListener;

public class Janela extends JFrame {
	
	Controladores controladores = new Controladores();

	public Janela(Plano plano) {
		setSize(800, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		add(controladores);
		add(plano);
		
		setVisible(true);
	}
	
	public void setSlidersListener(ChangeListener listener) {
		controladores.setSlidersListener(listener);
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
}
