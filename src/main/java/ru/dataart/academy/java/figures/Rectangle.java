package ru.dataart.academy.java.figures;

public class Rectangle extends Figure {

    private final double height;
    private final double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calcSquare() {
        return width * height;
    }

    @Override
    public double calcPerimeter() {
        return 2 * (width + height);
    }
}
