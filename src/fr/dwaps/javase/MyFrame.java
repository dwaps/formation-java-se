package fr.dwaps.javase;

import java.awt.FlowLayout;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {
	private String title;
	private int offsetX;
	private int offsetY;
	private int width;
	private int height;
	
	MyFrame() {
		this.title = "DWAPS Formation";
		this.offsetX = 800;
		this.offsetY = 150;
		this.width = 600;
		this.height = 350;
		
		this.initFrame();
	}
	
	private void initFrame() {
		// general settings
		setTitle(title);
		setBounds(offsetX, offsetY, width, height);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout());
		
		// display frame
		setVisible(true);
	}

}
