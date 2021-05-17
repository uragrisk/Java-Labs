package com.company;

public class Main {
    public static void main(String[] args) {
        Cup cupForTea = new Cup(400, "clay", "red", "for tea", "potter",
                "standard", "large", "on the table", "Mom", 5);
        System.out.println(cupForTea);

        Cup cup = new Cup();
        System.out.println(cup);

        Cup cupForCamp = new Cup(300,"metal", "silver", "medium");
        System.out.println(cupForCamp);

        Cup.printStaticDiameterOfSupport();
        Cup.printDiameterOfSupport();

        
    }
}
