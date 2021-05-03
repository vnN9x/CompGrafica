package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;

import javax.swing.JPanel;

import entity.Ponto;
import entity.Desenho;

public class Plano extends JPanel {

    Desenho forma;

    public Plano(Desenho forma) {
        this.forma = forma;
    }

    public void desenhoUpdate(Desenho forma) {
        this.forma = forma;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;

        this.setBackground(new Color(43, 43, 43));

        g2d.setStroke(new BasicStroke(15));

        List<Ponto> pontos = this.forma.getPontos(); 

        if(pontos==null) {
            System.out.println("Desenho eh nulo");
            return;
        }

        Ponto pontoAnterior = pontos.get(pontos.size()-1);
        Cores cor = Cores.values()[0];
        for(Ponto pontoAtual: pontos) {
            g2d.setColor(cor.getCor());
            g2d.drawLine(
                    (int)pontoAnterior.getX(), (int)pontoAnterior.getY(), 
                    (int)pontoAtual.getX(),    (int)pontoAtual.getY());

            cor = cor.next();
            pontoAnterior = pontoAtual;

        }
    }
}
