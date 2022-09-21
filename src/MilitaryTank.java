public class MilitaryTank extends Vehicle {

    public String type;

    public Driver driver;


    public MilitaryTank() {
        super();
        setType("Tank");
        System.out.println(getType() + " created, 2000 miles to go!");

    }

    public MilitaryTank(String type) {
        super(type);
    }

    void drive() {
        if (driver == null) {
            System.out.println(getType() + " didn't drive - there's no driver!");

        } else {

            System.out.println(getType() +" drove 5 miles - 1995 miles to go");


        }

    }

    public void setDriver(Driver driver) {
        if (driver.age <= 25) {
            System.out.println("Driver not changed! " + driver.name + " is " +  driver.age  + " driver must be 18 or older to drive car");


        } else if (driver.age >= 25) {
            System.out.println("Driver changed to " + driver.name);

        }

    }
}
