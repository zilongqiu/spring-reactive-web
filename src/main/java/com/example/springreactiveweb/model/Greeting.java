package com.example.springreactiveweb.model;

import lombok.Data;

@Data
public class Greeting {
    private String message;

    public Greeting() {
    }

    public Greeting(String message) {
        this.message = message;
    }
}
