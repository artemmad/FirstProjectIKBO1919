package ru.mirea.humanoid;
import java.util.Arrays;

public class Human {
	Leg[] legs = {new Leg("Левая нога"),new Leg("Правая нога")};
	Head head = new Head();
	Hand[] hands = {new Hand("Левая рука"),new Hand("Правая рука")};


	public String toString() {
      		return "Human{" + "\n" +
				"Head: " + head + "\n" + 
				"Leg: " + Arrays.toString(legs) + "\n" +
				"Hand: " + Arrays.toString(hands) + "\n" +
				"}";
	}

	public void print() {
		System.out.println(this);
	}
}
