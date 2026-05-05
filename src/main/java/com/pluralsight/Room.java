package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, Boolean occupied, Boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public Boolean isOccupied() {
        return occupied;
    }

    public Boolean isDirty() {
        return dirty;
    }

    public Boolean isAvailable() {
        if (!isDirty() && !isOccupied()) {
            return true;
        } else {
            return false;
        }
    }

    public void checkIn() {
        this.occupied = true;
        this.dirty = true;
    }

    public void checkOut() {
        this.occupied = false;
    }

    public void cleanroom() {
        this.dirty = false;
    }

}
