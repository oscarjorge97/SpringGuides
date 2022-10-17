package com.oyataco.rest.service;

public class Saludo {
    private final long ID;
    private final String content;


    //Constructor
    public Saludo(long ID, String content) {
        this.ID = ID;
        this.content = content;
    }


    //Getters
    public long getID() {
        return ID;
    }

    public String getContent() {
        return content;
    }
}
