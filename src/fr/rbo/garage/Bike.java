package fr.rbo.garage;

public class Bike extends Vehicle {
    public Bike(String modelName, String description, String manufacturer, int yeah, String color, int speed, int[] dimensions, int weight) {
        super(modelName, description, manufacturer, yeah, color, speed, dimensions, weight);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
