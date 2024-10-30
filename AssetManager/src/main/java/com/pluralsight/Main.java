package com.pluralsight;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    ArrayList<Asset> assets = new ArrayList<>();

    Asset a1 = new Asset("Golden Necklace", "2004", 200);

    assets.add(a1);

    House h1 = new House("My main house", "2001", 200000, "123 S Street", 2, 1500, 40000);
    House h2 = new House("My vacation home", "2019", 150000, "456 N Street", 3, 900, 150000);

    Vehicle v1 = new Vehicle("Daily driver", 2019, 150000);
    Vehicle v2 = new Vehicle();

    double netWorth = 0;
    for(Asset a : assets){
        System.out.println("The Description: " + a.getDescription() + "\n" +
                "The date acquired: " + a.getDateAcquired() + "\n" +
                "The original amount you paid: " + a.getOriginalCost() + "\n" +
                "How much it's worth now: " + a.getValue());
        netWorth += a.getValue();
        }
    System.out.println("Total net worth: " + netWorth);
    }
}