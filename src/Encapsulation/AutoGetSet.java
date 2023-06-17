package Encapsulation;

public class AutoGetSet {
	private String Name;
	private int House;
	private float floor;
	private char Tower;
	// To auto generate getter & setter method right clicj -> Source ->Generate getter & setter method ->Sort by field in getter & setter->Generate
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getHouse() {
		return House;
	}
	public void setHouse(int house) {
		House = house;
	}
	public float getFloor() {
		return floor;
	}
	public void setTower(char tower) {
		Tower = tower;
	}
	
	

}
