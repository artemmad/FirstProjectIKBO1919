package ru.mirea;

public class Shape {
    private int numberOfShapes;
    private String name;
    private int lenghtOfShape;

    public Shape(int numberOfShapes, String name, int lenghtOfShape) {
        this.numberOfShapes = numberOfShapes;
        this.name = name;
        this.lenghtOfShape = lenghtOfShape;
    }

    public Shape(int numberOfShapes){
        this.numberOfShapes = numberOfShapes;
    }

    public Shape(){
    }


   @Override
    public String toString() {
        return "Shape{" +
                "numberOfShapes=" + numberOfShapes +
                ", name='" + name + '\'' +
                ", lenghtOfShape=" + lenghtOfShape +
                '}';
    }

    public int getSquare(){
        return numberOfShapes*lenghtOfShape;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
