package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Frame extends JFrame implements KeyListener, IView {

	/** The initial frame size. */
	private static final int Width = 645; // Width //
	private static final int Height = 384; // Height //

	private KeyEvent key;

	/**
	 * 
	 */
	private static final long serialVersionUID = 6707285193480699195L;

	ConfigPanel pan = new ConfigPanel(this);

	public Frame() {
		super();
		myFrame();
	}


	public void myFrame() {

		/* Style of the frame */

		this.setTitle("Lorann");
		this.setSize(Width, Height);

		/* Position */
		this.setLocationRelativeTo(null);

		/* Behavior */
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setContentPane(pan);

		/* Make the frame visible */
		this.setVisible(true);

		/* Add keyListener */
		this.addKeyListener(this);

		/* Focus on the keyboard */
		requestFocusInWindow();

		/* this.paintWindow.start(); */

	}

	public ConfigPanel getPan() {
		return pan;
	}

	public void setPan(ConfigPanel pan) {
		this.pan = pan;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		setKey(e);
	}

	public KeyEvent getKey() {
		return key;
	}

	public void setKey(KeyEvent key) {
		this.key = key;
	}

	public int getWidth() {
		return Width;
	}

	public int getHeight() {
		return Height;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}


	

}
