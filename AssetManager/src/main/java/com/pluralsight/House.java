package com.pluralsight;

public class House extends Asset{

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(){}

    public House(String address, int condition, int squareFoot, int lotSize) {
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){
        double value = 0;

        try{
            switch(this.condition){
                case 1 -> {
                    System.out.println("Excellent");
                    value = (180 * this.squareFoot);
                }
                case 2 -> {
                    System.out.println("Good");
                    value = (130 * this.squareFoot);
                }
                case 3 -> {
                    System.out.println("Good");
                    value = (90 * this.squareFoot);
                }
                case 4 -> {
                    System.out.println("Poor");
                    value = (80 * this.squareFoot);
                }
                default -> System.out.println("out of conditions");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            value = value + (this.lotSize * 0.25);
        }
        return value;
    }
}
