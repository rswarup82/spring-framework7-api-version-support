package com.allybank.customer.models;


public record User(String id, String firstName, String lastName, String emailAddr, String phoneNumber, Address homeAddr) {

    public User(String id, String firstName, String lastName) {
        this(id, firstName, lastName, null, null, null);
    }

    public User(String id, String firstName, String lastName, String emailAddr, String phoneNumber) {
        this(id, firstName, lastName, emailAddr, phoneNumber, null);
    }
}
