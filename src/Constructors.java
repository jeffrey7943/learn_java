public class Constructors {
    // a constructor in java is a special method that is used to initialize objects
    /*
     * the constructor is called when an object of a class in created
     * it can be used to set initial values for object attributes
     */

    // create a constructor
    int x; // create a class attribute
    int y;

    // create a class constructor for the "Constructor" class
    public Constructors(int z) {
        x = 5; // set the initial value for the class attribute x
        y = z;
    }

    public static void main(String[] args) throws Exception {
        Constructors my_object = new Constructors(0); // create an object of the class (this will call the constructor)
        System.out.println(my_object.x); // print the value of x
        Constructors my_constructor = new Constructors(7);
        System.out.println(my_constructor.y);
    }

    /*
     * note that the constructor name must match the class name, and it cannot have
     * a return type (like void)
     * also note that the constructor is called when the object is created
     * all classes have constructors by default
     */

    // constructor parameters
    // constructors can also take parameters, which is used to initialize attributes

    /*
     * the following example adds an "int z" parameter to the constructor
     * inside the constructor we set y to z (y=z)
     * when we call the constructor, we pass a parameter to the constructor (7),
     * which will set the value of y to 7
     */
    // you can have as many parameters as you want
}
