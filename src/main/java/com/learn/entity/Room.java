package com.learn.entity;

public class Room
{
    private int number;
    private String type;
    private String has_ac;
    private int Beds = 1;

    public Room(int number, String type, String has_ac, int Beds)
    {
        this.number = number;
        this.type = type;
        this.has_ac = has_ac;
        this.Beds = Beds;
    }

    public Room(String type, String has_ac, int Beds)
    {
        this.type = type;
        this.has_ac = has_ac;
        this.Beds = Beds;
    }
    public Room()
    {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHas_ac() {
        return has_ac;
    }

    public void setHas_ac(String has_ac) {
        this.has_ac = has_ac;
    }

    public int getBeds() {
        return Beds;
    }

    public void setBeds(int beds) {
        Beds = beds;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", has_ac='" + has_ac + '\'' +
                ", Beds=" + Beds +
                '}';
    }
}
