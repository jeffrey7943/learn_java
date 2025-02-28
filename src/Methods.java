public class Methods {
    public static void main(String[] args) throws Exception {
        // methods
        /*
         * you can pass data, known as parameters, into a method
         * methods are used to perform certain actions, and they are also known as
         * functions
         * why use methods? to reuse code: define the code once, and use it many times
         */

        // create method
        /*
         * a method must be declared within a class. it is defined with the name of the
         * method, followed by parentheses (). java provides some pre-defined methods,
         * such as "System.out.println()", but you can also create your own methods to
         * perform certain actions
         */

        // call a method
        /*
         * to call a method in java, write the method's name followed by two
         * parentheses() and a semicolon;
         * in the following example, my_method() is used to print a text, when it is
         * called
         */
        my_method();
        my_method();
        my_method();
        parameters("jeffrey");
        parameters("jeremy");
        multiple_parameters("jeffrey", 24);
        multiple_parameters("jeremy", 23);
        check_age(24);
        System.out.println(java_return(4));
        System.out.println(return_java(3, 4));
        int my_num1 = plus_method(9, 5);
        double my_num2 = plus_method(4.3, 5.3);
        System.out.println("int: " + my_num1);
        System.out.println("double: " + my_num2);
        int result = sum(5);
        System.out.println(result);
    }

    // example
    static void my_method() {
        String name = "jeffrey";
        System.out.println(name);

        // example explained
        /*
         * "my_method()" is the name of the method
         * "static" means the method belongs to the main class and not an object of the
         * main class. you will learn more about objects and how to access methods
         * through objects later in this tutorial
         * "void" means that this method does not have a return value. you will learn
         * more about return values later in this chapter
         */
    }

    static void parameters(String first_name) {
        // parameters and arguments
        /*
         * information can be passed to methods as a parameter. parameters acts as
         * variable inside the method
         * parameters are specified after the method name, inside the parentheses. you
         * can add as many parameters as you want, just separate them with a comma
         * the following example has a method that takes a "String" called "first_name"
         * as parameter. when the method is called, we pass along a first name, which is
         * used inside the method to print the full name
         */
        System.out.println(first_name + " mukkath");
    }

    static void multiple_parameters(String first_name, int age) {
        // multiple parameters
        // you can have as many parameters as you like
        System.out.println(first_name + " is " + age);
    }

    static void check_age(int age) {
        if (age < 18) {
            System.out.println("access denied - you are not old enough!");
        } else {
            System.out.println("access granted - you are old enough!");
        }
    }

    static int java_return(int x) {
        // java return
        /*
         * if you want the method to return a value, you can use a primitive data type
         * (such as int, char, etc) instead of void, and use return keyword inside the
         * method
         */
        return 5 + x;
    }

    static int return_java(int x, int y) {
        // this example returns the sum of a method's two parameters
        return x + y;
    }

    // java method overloading
    // in the example below, we overload plus_method to work for both int and double

    static int plus_method(int x, int y) {
        return x + y;
    }

    static double plus_method(double x, double y) {
        return x + y;
    }

    // java scope
    // in java, variables are only accessible inside the region they are created
    // this is called scope

    // method scope
    /*
     * variable declared directly inside a method are available anywhere in the
     * method following the line of code in which they were declared
     */

    static void scope_method() {
        // code here cannot use x
        int x = 100;
        System.out.println(x);
    }

    static void block_scope() {
        // code here cannot use x
        {
            // this is a block
            // code here cannot use x
            int x = 100;
            // code here can use x
            System.out.println(x);
        } // the block ends here
          // code here cannot use x
    }

    /*
     * a block of code may exist on its own or it can belong to an if, while or for
     * statement. in the case of for statements, variables declared in the statement
     * itself are also available inside the block's scope
     */

    // java recursion
    /*
     * recursion is the technique of making a function call itself. this technique
     * provides a way to break complicated problems down into simple problems which
     * are easier to solve
     * recursion may be a bit difficult to understand. the best way to figure out
     * how it works is to experiment with it
     */

    // recursion example
    // in the following example, recursion is used to add a range of numbers
    // together by breaking it down into the simple task of adding two numbers

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}
