package com.online.restaurant;

public class Vendor {
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String category;

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    private double rating;
    private String state;
    private  String name;
    private String Addresss;
    private String emailId;
    private String city;
    private boolean pure_veg;
    private long phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddresss() {
        return Addresss;
    }

    public void setAddresss(String addresss) {
        Addresss = addresss;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isPure_veg() {
        return pure_veg;
    }

    public void setPure_veg(boolean pure_veg) {
        this.pure_veg = pure_veg;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
