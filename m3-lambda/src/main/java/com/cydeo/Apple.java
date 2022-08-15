package com.cydeo;

public class Apple {

    private Color appleColor;

    private Double appleWeight;

    public Apple(Color appleColor, Double appleWeight) {
        this.appleColor = appleColor;
        this.appleWeight = appleWeight;
    }

    public Color getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(Color appleColor) {
        this.appleColor = appleColor;
    }

    public Double getAppleWeight() {
        return appleWeight;
    }

    public void setAppleWeight(Double appleWeight) {
        this.appleWeight = appleWeight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "appleColor=" + appleColor +
                ", appleWeight=" + appleWeight +
                '}';
    }
}
