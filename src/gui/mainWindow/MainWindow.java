package gui.mainWindow;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Controller.Action;
import Controller.Controller;
import logic.entity.Figure;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {

	private JPanel panelButtons;
	private JPanel panelDraw;
	private JButton jBSquare;
	private JButton jBTriangle;
	private JButton jBCircle;
	private Figure figuraPintar;

	public MainWindow(Controller controller) {
		setSize(600, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panelButtons = new JPanel();
		panelDraw = new JPanel();
		initButton(controller);
		add(panelButtons, BorderLayout.SOUTH);
		add(panelDraw, BorderLayout.CENTER);
	}

	private void initButton(Controller controller) {
		jBSquare = new JButton("Cuadrado");
		jBSquare.addActionListener(controller);
		jBSquare.setActionCommand(Action.DRAW_SQUARE.toString());
		jBTriangle = new JButton("Triángulo");
		jBTriangle.addActionListener(controller);
		jBTriangle.setActionCommand(Action.DRAW_TRIANGLE.toString());
		
		
		jBCircle = new JButton("Circúlo");
		jBCircle.addActionListener(controller);
		jBCircle.setActionCommand(Action.DRAW_CIRCLE.toString());
		panelButtons.setLayout(new FlowLayout());
		
		panelButtons.add(jBSquare);
		panelButtons.add(jBTriangle);
		panelButtons.add(jBCircle);
	}

	
	public void drawFigure(Figure figura){
		figura.setWidth(panelDraw.getWidth());
		figura.setHeigth(panelDraw.getHeight());
		figura.updateArea();
		figura.draw(panelDraw.getGraphics());
	}

	
	public Figure getFiguraPintar() {
		return figuraPintar;
	}
	public void setFiguraPintar(Figure figuraPintar) {
		this.figuraPintar = figuraPintar;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if(getFiguraPintar()!=null){
			drawFigure(getFiguraPintar());
		}
	}

}
