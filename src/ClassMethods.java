public class ClassMethods {
    // java class methods
    // create a method named my_method()

    static void my_method() {
        System.out.println("HELLO, WORLD!");
    }

    // static method
    static void my_static_method() {
        System.out.println("static methods can be called without creating objects");
    }

    // public method
    public void my_public_method() {
        System.out.println("public methods must be called by creating objects");
    }

    /*
     * my_method() prints a text (the action), when it is called
     * to call a method, write the method's name followed by two parentheses () and
     * a semicolon;
     */

    public static void main(String[] args) throws Exception {
        my_method();
        my_static_method(); // call the static method
        // my_public_method(); this would compile an error

        ClassMethods my_object = new ClassMethods();
        my_object.my_public_method();
    }

    // static vs public
    /*
     * you will often see java programs that have either "static" or "public"
     * attributes and methods
     * below is an example to demonstrate the differences between "static" and
     * "public" methods
     */
}
