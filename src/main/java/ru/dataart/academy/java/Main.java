package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.*;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(new Calculator()
                    .calcSquaresSum(
                            new Figure[]{
                                    new Circle(1),
                                    new Circle(2),
                                    new Rectangle(2, 2),
                                    new Rectangle(1, 2)
                            }));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}