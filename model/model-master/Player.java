package model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import controller.EnumDirection;

public class Player {

	private int x;
	private int y;
	private int posX;
	private int posY;
	private String urlUP = "lorann_u.png";
	private String urlLEFT = "lorann_l.png";
	private String urlDOWN = "lorann_b.png";
	private String urlRIGHT = "lorann_r.png";
	private Image sprite;
	private int goldLoot;
	private Boolean alive = true;
	private Boolean shoot = true;
	private Boolean crystal = false;
	private Boolean win = false; 
	private EnumDirection direction = EnumDirection.RIGHT; 
	private FireBall fireBall;

	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		changeImage();
		setPosX(x);
		setPosY(y);
	}

	public void move() {
		switch (direction) {
		case UP:
			setY(y - 1);
			changeImage();
			break;
		case LEFT:
			setX(x - 1);
			changeImage();
			break;
		case DOWN:
			setY(y + 1);
			changeImage();
			break;
		case RIGHT:
			setX(x + 1);
			changeImage();
			break;
		default:
			break;
		}
	}

	public void changeImage() {
		switch (direction) {
		case UP:

			try {
				sprite = ImageIO.read(this.getClass().getResource(urlUP));
			} catch (IOException e) {
				e.printStackTrace();
			}

			break;
		case LEFT:

			try {
				sprite = ImageIO.read(this.getClass().getResource(urlLEFT));
			} catch (IOException e) {
				e.printStackTrace();
			}

			break;
		case DOWN:
			try {
				sprite = ImageIO.read(this.getClass().getResource(urlDOWN));
			} catch (IOException e) {
				e.printStackTrace();
			}

			break;
		case RIGHT:
			try {
				sprite = ImageIO.read(this.getClass().getResource(urlRIGHT));
			} catch (IOException e) {
				e.printStackTrace();
			}

			break;

		default:
			break;
		}
	}

	public void shoot() {
		this.setFireBall(new FireBall(x, y, direction));
	}

	public void lootTreasure(int gold) {
		goldLoot += gold;
	}

	public void lootCrystal() {
		crystal = true;
		win = true;
	}

	public void die() {
		alive = false;
	}

	public void setDirection(EnumDirection direction) {
		this.direction = direction;
		changeImage();
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

	public void win() {
		this.setWin(true);
	}

	/*
	 *
	 * Normal getters and setters
	 * 
	 */

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

	public int getGoldLoot() {
		return goldLoot;
	}

	public Boolean getAlive() {
		return alive;
	}

	public Boolean getShoot() {
		return shoot;
	}

	public Boolean getCrystal() {
		return crystal;
	}

	public EnumDirection getDirection() {
		return direction;
	}

	public FireBall getFireBall() {
		return fireBall;
	}

	public void setSprite(BufferedImage sprite) {
		this.sprite = sprite;
	}

	public void setGoldLoot(int goldLoot) {
		this.goldLoot = goldLoot;
	}

	public void setAlive(Boolean alive) {
		this.alive = alive;
	}

	public void setShoot(Boolean shoot) {
		this.shoot = shoot;
	}

	public void setCrystal(Boolean crystal) {
		this.crystal = crystal;
	}

	public void setFireBall(FireBall fireBall) {
		this.fireBall = fireBall;
	}

	public Boolean getWin() {
		return win;
	}

	public void setWin(Boolean win) {
		this.win = win;
	}
}
