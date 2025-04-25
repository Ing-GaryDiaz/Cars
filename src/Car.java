import java.io.Serializable;

public class Car implements Serializable {
    private String make;
    private int year;
    private static final long serialVersionUID = 1;
    private transient String model;
    public Car(String make, int year, String model){
        this.make = make;
        this.year = year;
        this.model = model;
    }

    @Override
    public String toString(){
        String carInfo = "";
        carInfo += "Model: " + this.make;
        carInfo += "\nYear: " + this.year;
        carInfo += "\nModel : " + this.model;
        return carInfo;

    }
}
