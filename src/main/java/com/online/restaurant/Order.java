package com.online.restaurant;

import java.util.Date;

public class Order {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDelivery_add() {
        return delivery_add;
    }

    public void setDelivery_add(String delivery_add) {
        this.delivery_add = delivery_add;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String delivery_add;
    private long orderId;
    private Date orderdate;
    private Vendor vendor;
    private Customer customer;


}
