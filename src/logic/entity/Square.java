package logic.entity;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

public class Square extends Figure {

	public Square(TypeFigure typeFigure) {
		super(typeFigure);
	}

	private int heightSquare;
	private int widthSquare;
//	private int area;

	private ArrayList<Point> x;
	private ArrayList<Point> y;
	private ArrayList<Point> x1;
	private ArrayList<Point> y2;


	@Override
	public void draw(Graphics g) {
		g.drawString("Ancho: " + widthSquare + "px, Alto: " + heightSquare + "px, Area " + area + "px", (int) (width * 0.15),
				((height - heightSquare) / 4));
		g.drawRect((int) (width * 0.15), ((height - heightSquare) / 2), widthSquare, heightSquare);
		Graphics2D g2 = (Graphics2D) (g);
//		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		for (int i = 0; i < x.size(); i++) {
			g2.drawLine((int)x.get(i).getX(), (int)x.get(i).getY(), (int)y.get(i).getX(), (int)y.get(i).getY());
			g2.drawLine((int)x1.get(i).getX(), (int)x1.get(i).getY(), (int)y2.get(i).getX(), (int)y2.get(i).getY());
		}
	}

	@Override
	public void updateArea() {
		heightSquare = (int) (height * 0.7);
		widthSquare = (int) (width * 0.7);
		area = (int) Math.pow(heightSquare, 2);
		calculatePoint();
	}


	private void calculatePoint() {
		double x = 0.02;
		this.x = new ArrayList<>();
		this.y = new ArrayList<>();
		this.x1 = new ArrayList<>();
		this.y2 = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			this.x.add(new Point((int) ((width * 0.15) + (widthSquare * x)), ((height - heightSquare) / 2)));
			this.y.add(new Point((int) (width * 0.15), (int) (((height - heightSquare) / 2) + (heightSquare * x))));
			this.x1.add(new Point((int) ((width * 0.15) + (widthSquare * x)), (int)(height * 0.85)));
			this.y2.add(new Point((int) (width * 0.85), (int) (((height - heightSquare) / 2) + (heightSquare * x))));
			x += 0.02;
		}
	}

}
