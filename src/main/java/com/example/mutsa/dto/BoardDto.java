package com.example.mutsa.dto;

public class BoardDto {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "BoardDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public BoardDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public BoardDto() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
