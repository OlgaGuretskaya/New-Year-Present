package entity;

/**
 * Created by Olga on 21.03.2017.
 */
public class Sweets {
    private String brand;
    private String type;
    private int weight;

    public Sweets() {
    }

    public Sweets(String brand, String type, int weight) {
        this.brand = brand;
        this.type = type;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Sweets{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}
