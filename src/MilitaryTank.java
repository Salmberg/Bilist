public class MilitaryTank extends Vehicle {

    public String type;

    public Driver driver;

    int milesDriven = 5;

    int milesToGo = 2000;

    boolean vroom = false;


    public MilitaryTank() {
        super();
        setType("Tank");
        System.out.println(getType() + " created, 2000 miles to go!");

    }

    public MilitaryTank(String type) {
        super(type);
    }

    public void drive() {
        if (!vroom) {
            System.out.println(getType() + " didn't drive - there's no driver!");

        } else {
            milesToGo = milesToGo - milesDriven;
            System.out.println("Tank drove  " + milesDriven + " miles " + milesToGo + " to go ");

        }

    }

    public void setDriver(Driver driver) {
        if (driver.age <= 25) {
            System.out.println("Driver not changed! " + driver.name + " is " + driver.age + " driver must be 18 or older to drive car");


        } else if (driver.age >= 25) {
            System.out.println("Driver changed to " + driver.name);
            vroom = true;

        }

    }
}
