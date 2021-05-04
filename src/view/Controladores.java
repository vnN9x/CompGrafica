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

	JSlider rotacaoSlider = new JSlider(0, 360, 0);
	JSlider escalamentoSlider = new JSlider(0, 300, 0);
	JSlider cisalhamentoSlider = new JSlider(0, 300, 0);
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
	
	public int getValorCisalhamentoSlider() {
		return cisalhamentoSlider.getValue();
	}
	
	public int getValorQuantidadeLadosSlider() {
		return quantidadeLadosSlider.getValue();
	}
	
	public void setSlidersListener(ChangeListener listener) {
		rotacaoSlider.addChangeListener(listener);
		escalamentoSlider.addChangeListener(listener);
		cisalhamentoSlider.addChangeListener(listener);
		quantidadeLadosSlider.addChangeListener(listener);
	}
}
