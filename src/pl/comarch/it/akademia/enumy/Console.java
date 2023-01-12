package pl.comarch.it.akademia.enumy;

public enum Console {
    XBOX_ONE("Microsoft", "Xbox", 1500.99),
    PS5("Sony", "PlayStation 5", 2000.00),
    NINTENDO_SWITCH;

    private String brand;
    private String model;
    private double price;

    Console(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    Console() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
