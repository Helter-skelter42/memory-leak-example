package com.example.project;

public class Key {
    Integer id;

    Key(Integer id) {
       this.id = id;
    }

    @Override
    public int hashCode() {
       return id.hashCode();
    }
 }
