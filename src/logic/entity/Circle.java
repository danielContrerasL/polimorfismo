package logic.entity;

import java.awt.Graphics;

public class Circle extends Figure{
	
	private int sideCircle;

	public Circle(TypeFigure typeFigure) {
		super(typeFigure);
	}

	@Override
	public void updateArea() {
		sideCircle = (int) (width * 0.7);
		area = (int)(Math.PI *(Math.pow(sideCircle/2, 2)));
	}

	@Override
	public void draw(Graphics g) {
		
		g.drawOval((int) (width * 0.15),  ((height-sideCircle)/2), sideCircle, sideCircle);
		g.drawString("Area " + area + "px", (int) (width * 0.35), (int) (height * 0.48));
		g.drawLine(width/2, height/2, (int)(width * 0.85), height/2);
		g.drawString("r = " + (sideCircle/2), (int)(width * 0.65), (int) (height * 0.48));
	}


}
