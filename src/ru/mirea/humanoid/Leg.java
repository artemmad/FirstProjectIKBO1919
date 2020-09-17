package ru.mirea.humanoid;

public class Leg {
	String legOrientation;

	public Leg(String legOrientation) {
		this.legOrientation = legOrientation;

	}

	public String toString() {
		return " " + Leg + "\n";
	}
	
	   public void print() {
	   	System.out.println(this);
	   }
}
