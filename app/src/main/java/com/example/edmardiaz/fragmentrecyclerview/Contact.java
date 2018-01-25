package com.example.edmardiaz.fragmentrecyclerview;

/**
 * Created by EdmarDiaz on 1/26/2018.
 */

public class Contact {

    private String name;
    private String phone_number;
    private int photo;

    public Contact(String name, String phone_number, int photo) {
        this.name = name;
        this.phone_number = phone_number;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public int getPhoto() {
        return photo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
