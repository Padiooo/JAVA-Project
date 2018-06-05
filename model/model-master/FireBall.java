package model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import controller.EnumDirection;

public class FireBall {

	private int x;
	private int y;
	private int posX;
	private int posY;
	private EnumDirection direction;
	private int color = 0;
	private String url;
	private String urlGreen = "image/fireball_1.png";
	private String urlCyan = "image/fireball_2.png";
	private String urlPurple = "image/fireball_3.png"; 
	private String urlRed = "image/fireball_4.png";
	private String urlYellow = "image/fireball_5.png";
	private Image sprite;

	public FireBall(int x, int y, EnumDirection direction) {
		this.x = x;
		this.y = y;
		setSprite();
		setPosX(x);
		setPosY(y);
		this.direction = direction;
	}

	public void moveFireBall() {
		switch (direction) {
		case UP:
			setPosY(y - 1);
			changeColor();
			setSprite();
			break;
		case LEFT:
			setPosX(x - 1);
			changeColor();
			setSprite();
			break;
		case DOWN:
			setPosY(y + 1);
			changeColor();
			setSprite();
			break;
		case RIGHT:
			setPosX(x + 1);
			changeColor();
			setSprite();
			break;
		default:
			break;
		}
	}

	public void setSprite() {

		try {
			sprite = ImageIO.read(this.getClass().getResource(url));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void changeColor() {
		color++;
		if(color < 5) {
			color = 1;
		}
		switch (color) {
		case 1:
			url = urlGreen;
			break;
		case 2:
			url = urlCyan;
			break;
		case 3:
			url = urlPurple;
			break;
		case 4:
			url = urlRed;
			break;
		case 5:
			url = urlYellow;
			break;
		default:
			break;
		}
	}

	/*
	 * 
	 * Normal getter and setters
	 * 
	 */

	public void setDirection(EnumDirection direction) {
		this.direction = direction;
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

	public int getPosY() {
		return posY;
	}

	public int getPosX() {
		return posX;
	}

	public EnumDirection getDirection() {
		return direction;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getUrlGreen() {
		return urlGreen;
	}

	public String getUrlCyan() {
		return urlCyan;
	}

	public String getUrlPurple() {
		return urlPurple;
	}

	public String getUrlRed() {
		return urlRed;
	}

	public String getUrlYellow() {
		return urlYellow;
	}

	public Image getSprite() {
		return sprite;
	}

	public void setUrlGreen(String urlGreen) {
		this.urlGreen = urlGreen;
	}

	public void setUrlCyan(String urlCyan) {
		this.urlCyan = urlCyan;
	}

	public void setUrlPurple(String urlPurple) {
		this.urlPurple = urlPurple;
	}

	public void setUrlRed(String urlRed) {
		this.urlRed = urlRed;
	}

	public void setUrlYellow(String urlYellow) {
		this.urlYellow = urlYellow;
	}

	public void setSprite(BufferedImage sprite) {
		this.sprite = sprite;
	}

}
