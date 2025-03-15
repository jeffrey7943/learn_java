public class Person {
    private String name; // private = restricted access

    // getter
    public String get_name() {
        return name;
    }

    // setter
    public void set_name(String new_name) {
        this.name = new_name;
    }

    // explanation
    /*
     * the "get" method returns the value of the variable name
     * the "set" method takes a parameter (new_name) and assigns it to the "name"
     * variable
     * the "this" keyword is used to refer to the current object
     * however, as the "name" variable is declared as private, we cannot access it
     * from outside this class
     */
}
