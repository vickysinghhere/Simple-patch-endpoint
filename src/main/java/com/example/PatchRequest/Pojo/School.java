package com.example.PatchRequest.Pojo;

public class School {
	private boolean front_patio;
	private boolean back_patio;
	private int windows;
	private int doors;
	private boolean Balcony;
	
	public School(boolean front_patio, boolean back_patio, int windows, int doors, boolean balcony) {
		super();
		this.front_patio = front_patio;
		this.back_patio = back_patio;
		this.windows = windows;
		this.doors = doors;
		Balcony = balcony;
	}
	
	public boolean isFront_patio() {
		return front_patio;
	}
	public void setFront_patio(boolean front_patio) {
		this.front_patio = front_patio;
	}
	public boolean isBack_patio() {
		return back_patio;
	}
	public void setBack_patio(boolean back_patio) {
		this.back_patio = back_patio;
	}
	public int getWindows() {
		return windows;
	}
	public void setWindows(int windows) {
		this.windows = windows;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public boolean isBalcony() {
		return Balcony;
	}
	public void setBalcony(boolean balcony) {
		Balcony = balcony;
	}
}
