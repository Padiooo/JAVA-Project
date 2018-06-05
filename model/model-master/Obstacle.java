package model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Obstacle {

	private int x;
	private int y;
	private int posX;
	private int posY;
	private Image sprite;
	private String url;
	

	public Obstacle(int x, int y, String url) {
		this.x = x;
		this.y = y;
		setPosX(x);
		setPosY(y);
		this.url = url;
		setSprite();

	}
	
	public void setSprite() {
		try {
			sprite = ImageIO.read(this.getClass().getResource(this.url)); 
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

	public Image getSprite() {
		return sprite;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
