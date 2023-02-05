package com.learn.entity;

public class Guest {
    private int g_id;
    private String g_name;
    private String g_email;
    private String g_phone;
    private String g_id_type;
    private String g_id_ref;
    private String g_pay_id;

    public Guest(int g_id, String g_name, String g_email, String g_phone, String g_id_type, String g_id_ref, String g_pay_id) {
        this.g_id = g_id;
        this.g_name = g_name;
        this.g_email = g_email;
        this.g_phone = g_phone;
        this.g_id_type = g_id_type;
        this.g_id_ref = g_id_ref;
        this.g_pay_id = g_pay_id;
    }
    public Guest(String g_name, String g_email, String g_phone, String g_id_type, String g_id_ref, String g_pay_id)
    {
        this.g_name = g_name;
        this.g_email = g_email;
        this.g_phone = g_phone;
        this.g_id_type = g_id_type;
        this.g_id_ref = g_id_ref;
        this.g_pay_id = g_pay_id;
    }
    public Guest()
    {

    }

    public int getG_id() {
        return g_id;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public String getG_email() {
        return g_email;
    }

    public void setG_email(String g_email) {
        this.g_email = g_email;
    }

    public String getG_phone() {
        return g_phone;
    }

    public void setG_phone(String g_phone) {
        this.g_phone = g_phone;
    }

    public String getG_id_type() {
        return g_id_type;
    }

    public void setG_id_type(String g_id_type) {
        this.g_id_type = g_id_type;
    }

    public String getG_id_ref() {
        return g_id_ref;
    }

    public void setG_id_ref(String g_id_ref) {
        this.g_id_ref = g_id_ref;
    }

    public String getG_pay_id() {
        return g_pay_id;
    }

    public void setG_pay_id(String g_pay_id) {
        this.g_pay_id = g_pay_id;
    }
    @Override
    public String toString() {
        return "Guest{" +
                "g_id=" + g_id +
                ", g_name='" + g_name + '\'' +
                ", g_email='" + g_email + '\'' +
                ", g_phone='" + g_phone + '\'' +
                ", g_id_type='" + g_id_type + '\'' +
                ", g_id_ref='" + g_id_ref + '\'' +
                ", g_pay_id='" + g_pay_id + '\'' +
                '}';
    }
}
