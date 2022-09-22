abstract public class Vehicle {
    String type;

    Driver driver;

    public Vehicle() {

    }
    public Vehicle(String type) {

        this.type = type;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    void drive() {

    }

    public void setDriver(Driver driver){

    }

}
