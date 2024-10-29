package com.pluralsight;

public class Car extends Vehicle{
    private String truckContent;
    private String rearviewMirror;

    public String getTruckContent() {
        return truckContent;
    }

    public void setTruckContent(String truckContent) {
        this.truckContent = truckContent;
    }

    public String getRearviewMirror() {
        return rearviewMirror;
    }

    public void setRearviewMirror(String rearviewMirror) {
        this.rearviewMirror = rearviewMirror;
    }
}
