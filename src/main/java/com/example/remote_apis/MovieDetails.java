package com.example.remote_apis;

public class MovieDetails {
    private int budget;
    private int id;
    private String original_title;

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public MovieDetails() {
    }

    public MovieDetails(int budget, int id, String original_title) {
        this.budget = budget;
        this.id = id;
        this.original_title = original_title;
    }
}
