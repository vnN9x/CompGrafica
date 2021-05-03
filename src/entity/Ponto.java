package entity;

public class Ponto {
	double x;
	double y;
	
	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(double nX) {
		this.x = nX;
	}
	
	public void setY(double nY) {
		this.y = nY;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
}
