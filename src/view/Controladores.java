package view;

import java.awt.Dimension;
import java.awt.Label;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

import entity.Desenho;

public class Controladores extends JPanel{
	
	Desenho desenho;

	JSlider rotacaoSlider = new JSlider(0, 15, 0);
	JSlider escalamentoSlider = new JSlider(0, 15, 0);
	JSlider cisalhamentoSlider = new JSlider(0, 50, 0);
	JSlider quantidadeLadosSlider = new JSlider(3, 6, 3);
	
	public Controladores() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		add(new Label(" Rotação:"));
		add(rotacaoSlider);
		add(new Label(" Escalamento:"));
		add(escalamentoSlider);
		add(new Label(" Cisalhamento:"));
		add(cisalhamentoSlider);
		add(new Label(" Lados:"));
		add(quantidadeLadosSlider);
		
		setMaximumSize(new Dimension(800, 300));
	}
	
	public int getValorRotacaoSlider() {
		return rotacaoSlider.getValue();
	}
	
	public int getValorEscalamentoSlider() {
		return escalamentoSlider.getValue();
	}
	
	public void setQuantidadeLadosSlider(JSlider quantidadeLadosSlider) {
		this.quantidadeLadosSlider = quantidadeLadosSlider;
	}

	public int getValorCisalhamentoSlider() {
		return cisalhamentoSlider.getValue();
	}
	
	public int getValorQuantidadeLadosSlider() {
		return quantidadeLadosSlider.getValue();
	}
	
	public void setSlidersListener(ChangeListener listener) {
		quantidadeLadosSlider.addChangeListener(listener);
	}
	public void setSlidersListenerRotacao(ChangeListener listener) {
		rotacaoSlider.addChangeListener(listener);
	}
	public void setSlidersListenerCisalhamento(ChangeListener listener) {
		cisalhamentoSlider.addChangeListener(listener);
	}
	public void setSlidersListenerEscalamento(ChangeListener listener) {
		escalamentoSlider.addChangeListener(listener);
	}
}
