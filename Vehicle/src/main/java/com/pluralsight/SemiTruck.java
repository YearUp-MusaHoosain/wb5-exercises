package com.pluralsight;

public class SemiTruck extends Vehicle{
    private int maxLoadCapacity;
    private int currentLoadCapacity;

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public void setMaxLoadCapacity(int maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public int getCurrentLoadCapacity() {
        return currentLoadCapacity;
    }

    public void setCurrentLoadCapacity(int currentLoadCapacity) {
        this.currentLoadCapacity = currentLoadCapacity;
    }
}
