package model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import controller.EnumDirection;

public class Ennemy {

	private int x;
	private int y;
	private int posX;
	private int posY;
	private EnumDirection direction;
	private Boolean alive;
	private String url;
	private Image sprite;

	public Ennemy(int x, int y, String url) {
		this.x = x;
		this.y = y;
		setPosX(x);
		setPosY(y);
		this.url = url;
		setSprite();
	}

	public void move(int xPlayer, int yPlayer) {
		// to change only one thing in one call (could have done with if else if but looked weird)
		int A = 0;
		// to have allways the same behaviour what ever the place
		int deltaX = (int) Math.pow((xPlayer - x), 2); 
		int deltaY = (int) Math.pow((yPlayer - y), 2);

		if (deltaX < deltaY && A == 0) {
			if (yPlayer < y) {
				setPosY(y-1);
				direction = EnumDirection.UP;
				A++;
			} else {
				setPosY(y+1);
				direction = EnumDirection.DOWN;
				A++;
			}
		}
		if (deltaX > deltaY && A == 0) {
			if (xPlayer < x) {
				setPosX(x-1);
				direction = EnumDirection.LEFT;
				A++;
			} else {
				setPosX(x+1);
				direction = EnumDirection.RIGHT;
				A++;
			}
		}
		if (deltaX == deltaY && A == 0) {
			if (xPlayer < x) {
				setPosX(x-1);
				direction = EnumDirection.LEFT;
				A++;
			} else {
				setPosX(x+1);
				direction = EnumDirection.RIGHT;
				A++;
			}
		}
	}
	
	public void die() {
		posX = 32 * 100;
		posY = 32 * 100;
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

	public Boolean getAlive() {
		return alive;
	}

	public void setAlive(Boolean alive) {
		this.alive = alive;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Image getSprite() {
		return sprite;
	}

	public EnumDirection getDirection() {
		return direction;
	}

	public void setDirection(EnumDirection direction) {
		this.direction = direction;
	}
}
