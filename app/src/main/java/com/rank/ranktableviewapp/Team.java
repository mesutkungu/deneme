package com.rank.ranktableviewapp;

public class Team {
    private int rank;
    private String name;
    private String idea;
    private String points;

    public Team(int rank, String name, String idea, String points) {
        this.rank = rank;
        this.name = name;
        this.idea = idea;
        this.points = points;
    }

    public Team() { }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }
}