public class Encapsulation {
    /*
     * the meaning of encapsulation, is to make sure that "sensitive" data is hidden
     * from users
     * to achieve this, you must:
     * declare class variables/attributes as "private"
     * provide public get and set methods to access and update the value of a
     * "private" variable
     */

    /*
     * private variables can only be accessed within the same class
     * however, it is possible to access them if we provide public "get" and "set"
     * methods
     * the "get" method returns the variable value, and the "set" method sets the
     * value
     * syntaax for both is that they start with either "get" or "set", followed by
     * the name of the variable, with the first letter in upper case
     */

    public static void main(String[] args) {
        Person my_object = new Person();
        my_object.set_name("jeffrey");
        System.out.println(my_object.get_name());
    }

    // why encapsulation?
    /*
     * better control of class attributes and methods
     * class attributes can be made read-only (if you only use the "get" method), or
     * write-only (if you only use the "set" method)
     * flexible: the programmer can change one part of the code without affecting
     * other parts
     * increased security of data
     */
}
