package com.bss.j8p.dps;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

class Model {
}

class View extends JFrame {
	private static final long serialVersionUID = 1L;
	private Model model;
	private JButton helloButton;
	private JButton goodByeButton;
	
	public View(Model model) {
		super("MVC Demo");
		this.model = model;
        helloButton = new JButton("Hello MVC");
        goodByeButton = new JButton("Goodbye MVC");
        
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.fill = GridBagConstraints.NONE;
		
		add(helloButton, gbc);
		
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.fill = GridBagConstraints.NONE;
		add(goodByeButton, gbc);
		
		
		helloButton.addActionListener(e -> {
			System.out.println("Hello MVC Button Clicked!");
		});
		
		goodByeButton.addActionListener(e -> {
			System.out.println("Goodbye MVC Button Clicked!");
		});
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
		
}
	
class Controller {
	private View view;
	private Model model;	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}
}

public class MVCPattern {

	public static void main(String[] args) {
		System.out.println("Starting MVC Pattern Application...");
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				runApp();
			}
		});
		System.out.println("MVC Pattern Application Started.");
	}
	
	public static void runApp() {
		Model model = new Model();
		View view = new View(model);
		Controller controller = new Controller(view, model);
	}

}
