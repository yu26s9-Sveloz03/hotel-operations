package com.pluralsight;

public class Reservation {

    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights, Boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public Boolean isWeekend() {
        return weekend;
    }

    public void setIsWeekend(Boolean isWeekend) {
        this.weekend = isWeekend;
    }

    public double getPrice() {
        double currentPrice = 0;
        if (getRoomType().equalsIgnoreCase("king")) {
            currentPrice = 139;
        } else if (getRoomType().equalsIgnoreCase("double")) {
            currentPrice = 124;
        }
        if (isWeekend()) {
            currentPrice *= 1.1;
        }
        return currentPrice;
    }

    public double getReservationPrice() {
        double total = getPrice() * getNumberOfNights();
        return total;
    }
}
