package model;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Door {

	private int x;
	private int y;
	private int posX;
	private int posY;
	private String urlOpen = "gate_closed.png";
	private String urlClose = "gate_closed.png";
	private Image sprite;
	private Boolean state = false;
	
	public Door(int x, int y) {
		this.x = x;
		this.y = y;
		setPosX(x);
		setPosY(y);
		checkDoor();
	}
	
	public void checkDoor() {
		if (state) {
			setDoorOpen();
		}
		else setDoorClose();
	}
	
	public void setDoorOpen() {
		try {
			sprite = ImageIO.read(this.getClass().getResource(urlOpen));
		} catch (IOException e) { 
			e.printStackTrace();
		}
	}
	
	public void setDoorClose() {
		try {
			sprite = ImageIO.read(this.getClass().getResource(urlClose));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setPosX(int x) {
		this.posX = x * 32;
	}

	public void setPosY(int y) {
		this.posY = y * 32;
	}
	
	public void setX(int x) {
		this.x = x;
		setPosX(x);
	}

	public void setY(int y) {
		this.y = y;
		setPosY(y);
	}
	
	/***********************************/

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public String getUrlOpen() {
		return urlOpen;
	}

	public String getUrlClose() {
		return urlClose;
	}

	public Image getSprite() {
		return sprite;
	}

	public Boolean getState() {
		return state;
	}

	public void setUrlOpen(String urlOpen) {
		this.urlOpen = urlOpen;
	}

	public void setUrlClose(String urlClose) {
		this.urlClose = urlClose;
	}

	public void setState(Boolean state) {
		this.state = state;
	}
}
