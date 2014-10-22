package no.ntnu.cabinet;

public class Cabin {
	
	private int id;
	private String name;
	private String location;
	private String capacity;
	private String difficulty;
	private int height;
	private int travel_time;
	private int wood;
	
	
	//setter & getter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getTravel_time() {
		return travel_time;
	}
	public void setTravel_time(int travel_time) {
		this.travel_time = travel_time;
	}
	public int getWood() {
		return wood;
	}
	public void setWood(int wood) {
		this.wood = wood;
	}
}
