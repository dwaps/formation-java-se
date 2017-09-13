package fr.dwaps.javase;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class Calculator extends MyFrame implements ActionListener  {
	private List<JButton> buttons;
	
	Calculator() {
		super();
		
		this.buildKeyboard();
		this.displayCalculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.print(e.getActionCommand());
	}
	
	private void buildKeyboard() {
		buttons = new ArrayList<JButton>();
		
		for (int i = 9; i >= 0; i--) {
			buttons.add(new JButton(Integer.toString(i)));
		}
		buttons.add(new JButton("+"));
		buttons.add(new JButton("="));
	}
	
	private void displayCalculator() {
		Container container = getContentPane();
		
		for (JButton button : buttons) {
			container.add(button);
			button.addActionListener(this);
		}
		
		setVisible(true);
	}

}
