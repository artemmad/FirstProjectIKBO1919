package ru.mirea;

public class Circle {
	private	int radius;
	private	int xPos = 0; //Лучше инициализировать в конструкторе
	private	int yPos = 0;
	
	private double lenght;


   public Circle(int radius, int xPos, int yPos) {
	  this.radius = radius;
	  this.xPos = xPos;
	  this.yPos = yPos;
	  calcLenght();
   }

  public Circle(int radius) {
	 this.radius = radius;
	 calcLenght();
  }

  /*public void getRadius() {

	return radius;  
  }*/

  	//public void setxPos() {

  	//      this.xPos;
  	//}

  	//public void setyPos() {

  	//      this.yPos;
  	//}

  	//public void getxPos() {

  	//      return xPos;  
  	//}
 
  	//  public void getyPos() {

  	//        return yPos;  
  	//  }

  	//    public void getLenght() {

  	//          return lenght;  
  	//    }

	//      public double getSpace() {

	//	      return lenght*radius;
	//      }
	       
	       public String toString() {
		       return "Circle{" +
			       "radius: " + radius + "\n" +
		       	       "xPos: " + xPos + "\n" +
			       "yPos: " + yPos + "\n" +
			       "lenght: " + lenght + "}";
		       	 }


	       public void printCircle() {
			System.out.println(this);
	       }

	       private void calcLenght() {
		      lenght = Math.PI * 2 * radius;
	       }
} 
