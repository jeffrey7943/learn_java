public class ClassesAndObjects {
    // java classes and objects
    // java is an object-oriented programming language
    /*
     * everything in java is associated with classes and objects, along with its
     * attributes and methods
     * for example: in real life, a car is an object
     * the car has attributes, such as weight and color, and methods, such as drive
     * and brake
     * a class is like an object constructor, or a "blueprint" for creating objects
     */

    // create a class
    // to create a class, use the keyword "class"
    // create a class named "ClassesAndObjects" with variable x
    int x = 5;
    /*
     * remember that a class should always start with an uppercase first letter, and
     * that the name of the java file should match the class name
     */

    // create an object
    /*
     * in java, an object is created from a class
     * to create an object of "ClassesAndObjects", specify the class name, followed
     * by the object name, and use the keyword "new"
     */

    public static void main(String[] args) throws Exception {
        ClassesAndObjects my_object1 = new ClassesAndObjects();
        System.out.println(my_object1.x);
        // you can create multiple objects of one class
        ClassesAndObjects my_object2 = new ClassesAndObjects();
        System.out.println(my_object2.x);
        Second.main();
    }

    // using multiple classes
    /*
     * you can also create an object of a class and access it in another class
     * this is often used for better organization of classes (one class has all the
     * attributes and methods, while the other class holds the methods (code to be
     * executed))
     */
    class Second {
        public static void main() throws Exception {
            ClassesAndObjects my_object = new ClassesAndObjects();
            System.out.println(my_object.x);
        }
    }
}
