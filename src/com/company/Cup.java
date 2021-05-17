package com.company;

public class Cup {
    private int volume;
    private String material;
    private String color;

    private String type;
    private String manufacturer;
    private String handleShape;
    private String size;
    private String location;

    private static int diameterOfSupport = 30;

    protected String owner;
    protected int price;

    public Cup() {
        volume = 250;
        material = "glass";
        color = "transparent";
        type = "for water";
        manufacturer = "robot";
        handleShape = "standard";
        size = "medium";
        location = "on the table";
        owner = "company";
        price = 100;
    }

    public Cup(int volume, String material, String color, String size) {
        this();
        this.volume = volume;
        this.material = material;
        this.color = color;
        this.size = size;
    }
    public Cup(int volume, String material, String color, String type, String manufacturer, String handleShape,
               String size, String location, String owner, int price) {
        this.volume = volume;
        this.material = material;
        this.color = color;
        this.type = type;
        this.manufacturer = manufacturer;
        this.handleShape = handleShape;
        this.size = size;
        this.location = location;
        this.owner = owner;
        this.price = price;
    }

    public void resetValues(int volume, String material, String color, String type, String manufacturer,
                            String handleShape, String size, String location, String owner, int price) {
        this.volume = volume;
        this.material = material;
        this.color = color;
        this.type = type;
        this.manufacturer = manufacturer;
        this.handleShape = handleShape;
        this.size = size;
        this.location = location;
        this.owner = owner;
        this.price = price;
    }



    public int getVolume() {
        return volume;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getHandleShape() {
        return handleShape;
    }

    public String getSize() {
        return size;
    }

    public String getLocation() {
        return location;
    }

    public static int getDiameterOfSupport() {
        return diameterOfSupport;
    }

    public String getOwner() {
        return owner;
    }

    public int getPrice() {
        return price;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setHandleShape(String handleShape) {
        this.handleShape = handleShape;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static void setDiameterOfSupport(int diameterOfSupport) {
        Cup.diameterOfSupport = diameterOfSupport;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void printStaticDiameterOfSupport() {
        System.out.println(Cup.getDiameterOfSupport());
    }
    public static void printDiameterOfSupport() {
        System.out.println(Cup.getDiameterOfSupport());
    }









    @Override
    public String toString() {
        return  "-------------------------------------------------\n" +
                "There is " + getSize() +", "+ getMaterial() +", "+
                getColor() +", "+ getOwner()+ "'s" +
                " cup" +" "+ getType() +" "+
                getLocation() +
                ", with a volume of " + getVolume() +" milliliters "+
                "and " + getHandleShape() + " handle," +
                "\nand with diameter of " + getDiameterOfSupport() + " millimetres" +
                ", which was purchased for $" + getPrice() +
                ", which was made by " + getManufacturer();
    }
}
