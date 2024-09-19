package car;
public class Car {
    private int id;
    private String model;
    private int year;
    private double price;
    private String registrationNumber;

    public Car(int id, String model, int year, double price, String registrationNumber) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
