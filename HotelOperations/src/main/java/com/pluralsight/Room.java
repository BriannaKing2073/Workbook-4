package com.pluralsight;

public class Room {

    //Room Variables
    private int numberOfBeds;
    private double price;
    private String isOccupied;
    private String isDirty;
    private String available;
    private String checkIn;
    private String checkOut;
    private String cleanRoom;

    //Constructors
    public Room(int numberOfBeds, double price, String isOccupied, String isDirty, String available, String checkIn, String checkOut, String cleanRoom) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.available = available;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.cleanRoom = cleanRoom;
    }

    //Getters and Setters

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(String isOccupied) {
        this.isOccupied = isOccupied;
    }

    public String getIsDirty() {
        return isDirty;
    }

    public void setIsDirty(String isDirty) {
        this.isDirty = isDirty;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getCleanRoom() {
        return cleanRoom;
    }

    public void setCleanRoom(String cleanRoom) {
        this.cleanRoom = cleanRoom;
    }
}
