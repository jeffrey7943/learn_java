public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("HELLO, WORLD!");
        System.out.println("NEW FIRST LINE");
        System.out.println("NEW SECOND LINE");
        System.out.println("NEW THIRD LINE");
        System.out.print("DEMONSTRATING PRINT WHICH DOESNT USE NEW LINE. ");
        System.out.print("AN EXAMPLE SHOWN HERE!");
        System.out.println(
                "NOW DEMONSTRATING HOW TO PRINT NUMBER. PRINTING NUMBERS DONT NEED TO BE PUT INSIDE DOUBLE QUOTATIONS");
        System.out.println(7777777);
        System.out.println("some mathematical calculation examples");
        System.out.println(3 + 3);
        System.out.println(3 * 3);
        // this is a comment line
        /*
         * this is a
         * multi line comment
         */
        System.out.println("demonstrating single line comments");

        // variables
        /*
         * string - stores text, such as "hello". string values are surrounded by double
         * quotes
         * int - stores integers (whole numbers), without decimals, such as 111 or -111
         * float - stores floating point numbers, with decimals, such as 19.99 or -19.99
         * char - stores single characters, such as 'a' or 'B'. char values are
         * surrounded by single quotes
         * boolean - stores values with two states: true or false
         * syntax - type variablename = value;
         */
        // example
        String name = "jeffrey";
        System.out.println(name);
        int num = 97431;
        System.out.println(num);
        // final variables are variables which cannot be overwritten. they use final
        // keyword which means unchangeable and read-only
        final int number = 33;
        // number = 44 // will generate an error: cannot assign a value to a final
        // variable
        System.out.println(number);
        // other types of variables
        float floatingnumber = 5.99f;
        char singleletter = 'A';
        boolean state = true;
        System.out.println(floatingnumber);
        System.out.println(singleletter);
        System.out.println(state);

        // display variables
        // println() method is often used to display variables. to combine both text and
        // a variable, use the + character
        String name1 = "jeffrey";
        System.out.println(name1);
        String firstname = "jeffrey";
        String lastname = "mukkath";
        String fullname = firstname + lastname;
        System.out.println(fullname);
        // for numeric values, the + character works as a mathematical operator
        int num1 = 5;
        int num2 = 6;
        System.out.println(num1 + num2); // value we achieve here is 11

        // identifiers
        // all java variables must be identified with unique names
        // these unique names are called identifiers
    }
}
