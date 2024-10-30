package com.pluralsight;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(){}

    public Vehicle(String makeModel, int year, int odometer) {
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

//    @Override
//    public double getValue(){
//
//        double value = super.getOriginalCost();
//        double age = this.year;
//
//        try{
//            switch(this.year){
//                case 1 -> {
//                    value = ;
//                }
//                case () -> {
//                    System.out.println("Good");
//                    value = (130 * this.squareFoot);
//                }
//                case 3 -> {
//                    System.out.println("Good");
//                    value = (90 * this.squareFoot);
//                }
//                case 4 -> {
//                    System.out.println("Poor");
//                    value = (80 * this.squareFoot);
//                }
//                default -> System.out.println("out of conditions");
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        finally {
//            value = value + (this.lotSize * 0.25);
//        }
//        return value;
//    }
}
