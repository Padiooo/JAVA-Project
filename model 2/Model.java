package model;

public class Model {

	private Map map;
	private Map mapRestart;
	private int level = 0;
	private DAO dao;

	public Model() {
		dao = new DAO(level);
		map = new Map();
		setMapRestart(map);
	}

	public Map getMapRestart() {
		return mapRestart;
	}

	public void setMapRestart(Map mapRestart) {
		this.mapRestart = mapRestart;
	}

	public Map getMap() {
		return map;
	}

	public int getLevel() {
		return level;
	}

	public DAO getDao() {
		return dao;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}
}
