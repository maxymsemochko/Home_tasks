package com.softserve.tasks;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;
    private String name;

    abstract void fly();

    public boolean isFeathers() {
        return feathers;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
