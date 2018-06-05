package view;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.JPanel;

import model.Crystal;
import model.Door;
import model.Ennemy;
import model.Obstacle;
import model.Player;
import model.Treasure;

public class ConfigPanel extends JPanel {

	private static final long serialVersionUID = 6707285193480699195L;

	JPanel panel = new JPanel();
	private Player player;
	private Crystal crystal;
	private Door door;
	private ArrayList<Ennemy> ennemy; 
	private ArrayList<Obstacle> obstacle;
	private ArrayList<Treasure> treasure;
	Frame frame;

	/**
	 * Initiate the Panel
	 */
	public ConfigPanel() {

	}

	/**
	 * Initiate the Panel
	 * 
	 * @param Frame
	 *            frm
	 */

	public ConfigPanel(Frame frm) {
		// TODO Auto-generated constructor stub
		this.frame = frm;

	}

	/**
	 * Standard graphic from swing
	 * 
	 * @param Graphics
	 *            g
	 */

	public void paint(Graphics g) {
		super.paint(g);
		this.setBackground(Color.BLACK);
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		int x;
		int y;
		Image image;

		if (ennemy != null && treasure != null && obstacle != null && door != null && crystal != null && player != null) {
			for (Ennemy ennemy : ennemy) {
				x = ennemy.getPosX();
				y = ennemy.getPosY();
				image = ennemy.getSprite();
				g.drawImage(image, x, y, this);
			}

			for (Treasure treasure : treasure) {
				x = treasure.getPosX();
				y = treasure.getPosY();
				image = treasure.getSprite();
				g.drawImage(image, x, y, this);
			}

			for (Obstacle obstacle : obstacle) {
				x = obstacle.getPosX();
				y = obstacle.getPosY();
				image = obstacle.getSprite();
				g.drawImage(image, x, y, this);
			}

			// Player
			x = player.getPosX();
			y = player.getPosY();
			image = player.getSprite();
			g.drawImage(image, x, y, this);

			// Crystal
			x = crystal.getPosX();
			y = crystal.getPosY();
			image = crystal.getSprite();
			g.drawImage(image, x, y, this);

			// Door
			x = door.getPosX();
			y = door.getPosY();
			image = door.getSprite();
			g.drawImage(image, x, y, this);

		}

	}

	public void stringout() {
		for (Ennemy ennemy1 : ennemy) {
			System.out.println(ennemy1.getX());
		}

	}

	public Player getPlayer() {
		return player;
	}

	public Crystal getCrystal() {
		return crystal;
	}

	public Door getDoor() {
		return door;
	}

	public ArrayList<Ennemy> getEnnemy() {
		return ennemy;
	}

	public ArrayList<Obstacle> getObstacle() {
		return obstacle;
	}

	public ArrayList<Treasure> getTreasure() {
		return treasure;
	}

	public Frame getFrame() {
		return frame;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void setCrystal(Crystal crystal) {
		this.crystal = crystal;
	}

	public void setDoor(Door door) {
		this.door = door;
	}

	public void setEnnemy(ArrayList<Ennemy> ennemy) {
		this.ennemy = ennemy;
	}

	public void setObstacle(ArrayList<Obstacle> obstacle) {
		this.obstacle = obstacle;
	}

	public void setTreasure(ArrayList<Treasure> treasure) {
		this.treasure = treasure;
	}

	public void setFrame(Frame frame) {
		this.frame = frame;
	}

}