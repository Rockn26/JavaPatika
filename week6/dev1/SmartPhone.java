package week6.dev1;



public abstract class SmartPhone extends Product {
    private int battery;
    private int cameraQuaility;
    private String color;

    public SmartPhone(int id, String name, int unitPrice, int discountRate, int stock, String productName, int ram, int storage, double screenSize, int battery, int cameraQuaility, String color) {
        super(id, name, unitPrice, discountRate, stock, productName, ram, storage, screenSize);
        this.battery = battery;
        this.cameraQuaility = cameraQuaility;
        this.color = color;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getCameraQuaility() {
        return cameraQuaility;
    }

    public void setCameraQuaility(int cameraQuaility) {
        this.cameraQuaility = cameraQuaility;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
