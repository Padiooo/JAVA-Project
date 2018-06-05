package model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Treasure {

	private int x;
	private int y;
	private int posX;
	private int posY;
	private int gold = 100; 
	private String url = "purse.png";
	private Image sprite; 

	public Treasure(int x, int y) {
		this.x = x;
		this.y = y;
		setPosX(x);
		setPosY(y);
	}
	
	public void setSprite() {
		try {
			sprite = ImageIO.read(this.getClass().getResource(url));
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

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
}
