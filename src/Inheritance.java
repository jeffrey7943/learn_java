public class Inheritance extends Vehicle {
    // java inheritance (subclass and superclass)
    /*
     * in java, it is possible to inherit attributes and methods from one class to
     * another
     * we group the "inheritance concept" into two categories
     * "subclass" (child) - the class that inherits from another class
     * "superclass" (parent) - the class being inherited from
     * 
     * to inherit from a class, use the "extends" keyword
     */

    // final keyword
    /*
     * if you don't want other classes to inherit from a class, use the "final"
     * keyword
     */
    private String model_name = "mustang"; // car attribute

    public static void main(String[] args) throws Exception {
        // create a my_car object
        Inheritance my_car = new Inheritance();
        // call the honk() method from the vehicle class on the my_car object
        my_car.honk();
        System.out.println(my_car.brand + " " + my_car.model_name);
    }
}

class Vehicle {
    protected String brand = "ford"; // vehicle attribute
    // vehicle method

    public void honk() {
        System.out.println("tuut, tuut!");
    }
}
