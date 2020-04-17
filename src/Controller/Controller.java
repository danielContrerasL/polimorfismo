package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.mainWindow.MainWindow;
import logic.entity.Circle;
import logic.entity.Square;
import logic.entity.Triangle;
import logic.entity.TypeFigure;

public class Controller implements ActionListener {

	private MainWindow mainWindow;

	public Controller() {
		openMainwindow();
	}

	private void openMainwindow() {
		mainWindow = new MainWindow(this);
		mainWindow.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (Action.valueOf(e.getActionCommand())) {
		case DRAW_CIRCLE:
			mainWindow.setFiguraPintar(new Circle(TypeFigure.CIRCLE));
//			mainWindow.repaint();
			break;
			
		case DRAW_SQUARE:
			mainWindow.setFiguraPintar(new Square(TypeFigure.SQUARE));
//			mainWindow.repaint();
			break;
		case DRAW_TRIANGLE:
			mainWindow.setFiguraPintar(new Triangle(TypeFigure.TRIANGLE));
			break;
		default:
			break;
		}
			mainWindow.repaint();

	}

}
