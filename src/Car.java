public class Car extends Vehicle {

    public String type;

    public Driver driver;

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

    void drive() {
        if (driver == null) {
            System.out.println(getType() + " didn't drive - there's no driver!");

        } else {
            System.out.println(getType() + " drove 10 miles, 90  miles to go ");

        }
    }



    public void setDriver(Driver driver) {
        if (driver.age <= 18) {
            System.out.println("Driver not changed! " + driver.name + " is " +  driver.age  + " driver must be 18 or older to drive car");


        } else if (driver.age >= 18) {
            System.out.println("Driver changed to " + driver.name);

        }

    }

}
