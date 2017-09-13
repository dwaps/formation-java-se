package fr.dwaps.javase;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MaFenetre extends JFrame {
	private String title;
	private int offsetX;
	private int offsetY;
	private int width;
	private int height;
	
	MaFenetre() {
		this.title = "DWAPS Formation";
		this.offsetX = 800;
		this.offsetY = 150;
		this.width = 600;
		this.height = 350;
		
		this.initFrame();
	}
	
	private void initFrame() {
		setTitle(title);
		setBounds(offsetX, offsetY, width, height);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
