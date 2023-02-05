package com.learn.entity;

public class Reservation {
    private int r_id;
    private String date_in;
    private String date_out;
    private int g_pay_id;
    private int room_number;

    public Reservation(int r_id, String date_in, String date_out, int g_pay_id, int room_number)
    {
        this.r_id = r_id;
        this.date_in = date_in;
        this.date_out = date_out;
        this.g_pay_id = g_pay_id;
        this.room_number = room_number;
    }
    public Reservation(String date_in, String date_out, int g_pay_id, int room_number)
    {
        this.date_in =  date_in;
        this.date_out = date_out;
        this.g_pay_id = g_pay_id;
        this.room_number = room_number;
    }
    public Reservation()
    {

    }

    public int getR_id() {
        return r_id;
    }


    public String getDate_in() {
        return date_in;
    }

    public void setDate_in(String date_in) {
        this.date_in = date_in;
    }

    public String getDate_out() {
        return date_out;
    }

    public void setDate_out(String date_out) {
        this.date_out = date_out;
    }

    public int getG_pay_id() {
        return g_pay_id;
    }

    public void setG_pay_id(int g_pay_id) {
        this.g_pay_id = g_pay_id;
    }

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "r_id=" + r_id +
                ", date_in='" + date_in + '\'' +
                ", date_out='" + date_out + '\'' +
                ", g_pay_id=" + g_pay_id +
                ", room_number=" + room_number +
                '}';
    }


}
