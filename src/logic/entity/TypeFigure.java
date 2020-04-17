package logic.entity;

public enum TypeFigure {

	TRIANGLE("TRIANGLE"), CIRCLE("CIRCLE"), SQUARE("SQUARE");

	private String type;

	private TypeFigure(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
