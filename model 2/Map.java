package model;


import java.sql.SQLException;
import java.util.ArrayList;

public class Map {

	private Player player;
	private Crystal crystal;
	private Door door;
	private ArrayList<Ennemy> ennemy = new ArrayList<Ennemy>();
	private ArrayList<Obstacle> obstacle = new ArrayList<Obstacle>();
	private ArrayList<Treasure> treasure = new ArrayList<Treasure>(); 
	private static int level = 1;
	
	public Map() {
		int x = 0;
		int y = 0;
		int E = 1;
		char[] map = null;
		mapBdd map1 = null;
		try {
			map1 = new mapBdd();
			map = map1.getStringMap(level);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
        
		for (char c : map) {
			switch (c) {
			case 'I': 
				obstacle.add(new Obstacle(x, y, "image/horizontal_bone.png"));        
				x++;
				break;
			case 'H': 
				obstacle.add(new Obstacle(x, y, "image/vertical_bone.png"));
				x++;
				break;
			case 'O': 
				obstacle.add(new Obstacle(x, y, "image/bone.png"));
				x++;
				break;
			case 'E': 
				if (E == 1) {
					ennemy.add(new Ennemy(x, y, "image/monster_1.png"));
					E++;
				}
				else if (E == 2) {
					ennemy.add(new Ennemy(x, y, "image/monster_2.png"));
					E++;
				}
				else if (E == 3) {
					ennemy.add(new Ennemy(x, y, "image/monster_3.png"));
					E++;
				}
				else if (E == 4) {
					ennemy.add(new Ennemy(x, y, "image/monster_4.png"));
					E++;
				}				
				x++;
				break;
			case 'T': 
				treasure.add(new Treasure(x, y));
				x++;
			case 'S': 
				player = new Player(x, y);
				x++;
				break;
			case 'C': 
				crystal = new Crystal(x, y);
				x++;
				break;
			case 'N': 
				door = new Door(x, y);
				x++;
				break;
			default:
				x++;
				break;
			}
			if(x == 20) {
				x = 0;
				y++;
			}
		}
	}

	/*
	 * 
	 * Normal getter and setters
	 * 
	 */

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
}
