package com.ayushcodes;

public class Customer {
    private int customerId;
    private String name;
    private Order order;

    public Customer() {
    }

    public Customer(int customerId, String name, Order order) {
        this.customerId = customerId;
        this.name = name;
        this.order = order;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void displayCustomerDetails(){
        System.out.println("Customer [customerId=" + this.getCustomerId() + ", name=" + this.getName() + ", order=" + this.getOrder()+ "]");
    }
}
