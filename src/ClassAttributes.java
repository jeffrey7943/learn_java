public class ClassAttributes {
    // java class attributes
    // create a class called "ClassAttributes" with two attributes: x and y
    int x = 5;
    int y = 4;
    String fname = "jeffrey";
    String lname = "mukkath";
    int age = 24;
    // another term for class attributes is fields

    // accessing attributes
    /*
     * you can access attributes by creating an object of the class, and by using
     * the dot syntax (.)
     * the following example will create an object of the "ClassAttributes" class,
     * with the name "my_object"
     * we use the "x" attribute on the object to print its value
     */
    public static void main(String[] args) throws Exception {
        ClassAttributes my_object = new ClassAttributes();
        System.out.println(my_object.x);
        my_object.x = 33;
        System.out.println(my_object.x);
        System.out.println("name: " + my_object.fname + " " + my_object.lname);
        System.out.println("age: " + my_object.age);
    }

    // modify attributes
    // you can modify attribute values
    /*
     * if you don't want the ability to override existing values, declare the
     * attribute as "final"
     */

    // multiple attributes
    // you can specify as many attributes as you want
}
