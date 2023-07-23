package com.ayushcodes;

public class Order {
    String orderId;
    double amount;

    public Order() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString(){
        return "Order details: Order Id: " + this.getOrderId() + ", Order Amount: " + this.getAmount();
    }
}
