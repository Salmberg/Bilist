public class Car extends Vehicle {

    String type;

    Driver driver;

    int milesDriven = 10;

    int milesToGo = 100;

    boolean vroom = false;

    public Car() {
        super();
        setType("Car");
        System.out.println(getType() + " created, 100 miles to go!");

    }


    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    public void drive() {
        if (!vroom) {
            System.out.println(getType() + " didn't drive - there's no driver!");

        } else {
            milesToGo = milesToGo - milesDriven;
            System.out.println("Car drove  " + milesDriven + " miles " + milesToGo + " to go ");
        }

    }



    public void setDriver(Driver driver) {
        if (driver.age <= 18) {
            System.out.println("Driver not changed! " + driver.name + " is " +  driver.age  + " driver must be 18 or older to drive car");


        } else if (driver.age >= 18) {
            System.out.println("Driver changed to " + driver.name);
            vroom = true;
        }

    }

}
