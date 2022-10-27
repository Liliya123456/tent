package taskFive;

public class Car {
    public Car(String color, String brand, int numbersOfCars) {
        this.color = color;
        this.brand = brand;
        this.numbersOfCars = numbersOfCars;
        count++;
    }

    private String color;
    private String brand;
    private  int numbersOfCars;
    static public int count;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumbersOfCars() {
        return numbersOfCars;
    }

    public void setNumbersOfCars(int numbersOfCars) {
        this.numbersOfCars = numbersOfCars;
    }
}
