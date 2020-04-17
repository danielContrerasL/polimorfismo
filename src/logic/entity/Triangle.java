package logic.entity;

import java.awt.Graphics;

public class Triangle extends Figure {

	private int widthTriangle;
	private int heightTriangle;
	private int area;
	private int x[];
	private int y[];

	public Triangle(TypeFigure typeFigure) {
		super(typeFigure);
	}

	@Override
	public void draw(Graphics g) {
		g.drawPolyline(x, y, 4);
		g.drawString("Base: " + widthTriangle + "px, Altura: " + heightTriangle + "px", (int) (width * 0.35),
				((height - heightTriangle)));
		g.drawString("Area " + area + "px", (int) (width * 0.25), (int) (height * 0.5));
		for (int i = 0; i < (x.length - 1); i++) {
			g.drawString("(x,y) " + x[i] + " " + y[i], x[i], y[i] - 10);
			g.fillOval(x[i] - 5, y[i] - 5, 10, 10);
		}
	}

	@Override
	public void updateArea() {
		widthTriangle = (int) (width * 0.7);
		heightTriangle = (int) (height * 0.7);
		area = (widthTriangle * heightTriangle) / 2;
	}

	@Override
	public void setWidth(int width) {
		this.width = width;
		int x[] = { (int) (width * 0.15), (int) (width * 0.85), (int) (width * 0.15), (int) (width * 0.15) };
		this.x = x;
	}

	@Override
	public void setHeigth(int heigth) {
		this.height = heigth;
		int y[] = { (int) (heigth * 0.85), (int) (heigth * 0.85), (int) (heigth * 0.15), (int) (heigth * 0.85) };
		this.y = y;
	}

}
