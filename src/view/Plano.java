package view;

import entity.Quadrado;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Plano extends JPanel {

    Quadrado forma;

    public Plano(Quadrado forma) {
        this.forma = forma;
    }

    public void desenhoUpdate(Quadrado forma) {
        this.forma = forma;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;

        this.setBackground(new Color(43, 43, 43));

        g2d.setStroke(new BasicStroke(15));

        List<Ponto> pontos = desenho.getPontos(); 

        if(pontos==null) {
            System.out.println("Desenho eh nulo");
            return;
        }

        Ponto pontoAnterior = pontos.get(pontos.size()-1);
        Cores cor = Cores.values()[0];
        for(Ponto pontoAtual: pontos) {
            g2d.setColor(cor.getCor());
            g2d.drawLine(
                    (int)pontoAnterior.x, (int)pontoAnterior.y, 
                    (int)pontoAtual.x,    (int)pontoAtual.y);

            cor = cor.next();
            pontoAnterior = pontoAtual;

        }
    }

