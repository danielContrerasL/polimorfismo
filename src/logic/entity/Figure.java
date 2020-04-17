package logic.entity;


public abstract class Figure implements IDraw{
	
	protected int width;
	protected int height;
	protected int area;
	protected TypeFigure typeFigure;
	
	public Figure(TypeFigure typeFigure) {
		this.typeFigure=typeFigure;
	}
	
	public void setWidth(int width) {
		this.width = width;
		
	}

	public void setHeigth(int heigth) {
		this.height = heigth;
	}
	

}
