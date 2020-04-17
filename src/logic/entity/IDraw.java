package logic.entity;

import java.awt.Graphics;

public interface IDraw {
	
	public void setWidth(int width);
	public void updateArea();
	public void setHeigth(int heigth);
	public abstract void draw(Graphics g);

}
