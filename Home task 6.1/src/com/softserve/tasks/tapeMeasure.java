package com.softserve.tasks;

import java.util.Objects;

public class tapeMeasure {
    private float tapeLength;
    private String color;

    public float getTapeLength() {return tapeLength;}

    public void setTapeLength(float tapeLength) {this.tapeLength = tapeLength;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public tapeMeasure() {}

    public tapeMeasure(String color) {
        this.color = color;
    }

    public tapeMeasure(float tapeLength) {
        this.tapeLength = tapeLength;
    }

    public tapeMeasure(float tapeLength, String color) {
        this.tapeLength = tapeLength;
        this.color = color;
    }

    public boolean isOut(boolean isOut) {
        if (isOut)
            System.out.println("Tape is out");
        return true;
    }
    public boolean isNotOut(boolean isOut) {
        if (!isOut)
            System.out.println("Tape is not out");
        return false;
    }

    public boolean holdButton(boolean holdButton){
        if (holdButton)
            System.out.println("Tape is held");
        return true;
    }
    public boolean noHoldButton(boolean holdButton){
        if (!holdButton)
            System.out.println("Tape is not holded");
        return false;
    }

    @Override
    public String toString() {
        return "Tape measure" +
                "length= " + tapeLength +
                "and its color is " + color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        tapeMeasure that = (tapeMeasure) o;
        return Float.compare(that.tapeLength, tapeLength) == 0 && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tapeLength, color);
    }





}