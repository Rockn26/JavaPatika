package week5.PatikaStore.src;

import java.util.ArrayList;

public class SmartPhone extends Product{
    private int battery;
    private int cameraQuality;
    private String color;

    private static ArrayList<SmartPhone> smartPhones = new ArrayList<>();

    public SmartPhone(Brand brand, int unitPrice, int discountRate, int stock, String productName, int ram, int storage, double screenSize, int battery, int cameraQuality, String color) {
        super(brand, unitPrice, discountRate, stock, productName, ram, storage, screenSize);
        this.battery = battery;
        this.cameraQuality = cameraQuality;
        this.color = color;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getCameraQuality() {
        return cameraQuality;
    }

    public void setCameraQuality(int cameraQuality) {
        this.cameraQuality = cameraQuality;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static ArrayList<SmartPhone> getSmartPhones() {
        return smartPhones;
    }

    public static void setSmartPhones(ArrayList<SmartPhone> smartPhones) {
        SmartPhone.smartPhones = smartPhones;
    }
}
