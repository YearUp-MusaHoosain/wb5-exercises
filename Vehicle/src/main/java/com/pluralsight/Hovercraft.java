package com.pluralsight;

public class Hovercraft extends Vehicle{
    private boolean onWater;
    private float hoverHeight;
    private boolean electric;

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public boolean isOnWater() {
        return onWater;
    }

    public void setOnWater(boolean onWater) {
        this.onWater = onWater;
    }

    public float getHoverHeight() {
        return hoverHeight;
    }

    public void setHoverHeight(float hoverHeight) {
        this.hoverHeight = hoverHeight;
    }
}
