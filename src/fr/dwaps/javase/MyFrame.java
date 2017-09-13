package fr.dwaps.javase;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements MouseListener {
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
		setTitle(title);
		setBounds(offsetX, offsetY, width, height);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Cliquer");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Presser");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Relâcher");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Entrer");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Sortir");
	}
}
