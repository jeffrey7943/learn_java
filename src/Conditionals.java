public class Conditionals {
    public static void main(String[] args) throws Exception {
        // conditionals
        /*
         * java has the following conditionals statements
         * use "if" to specify a block of code to be executed, if a specified condition
         * is true
         * use "else" to specify a block of code to be executed, if the same condition
         * is false
         * use "else if" to specify a new condition to test, if the first condition is
         * false
         * use "switch" to specify many alternative blocks of code to be executed
         */

        /*
         * the if statement
         * use the "if" statement to specify a block of java code to be executed if a
         * condition is true
         * syntax
         * if (condition) {
         * // block of code to be executed if the condition is true
         * }
         */
        if (19 > 17) {
            System.out.println("19 is greater than 17");
        }
        // we can also test variables
        int x = 19;
        int y = 17;
        if (x > y) {
            System.out.println("x is greater than y");
        }

        /*
         * the else statement
         * use the "else" statement to specify a block of code to be executed if the
         * condition is false
         * syntax
         * if (condition){
         * // block of code to be executed if the condition is true
         * } else {
         * // block of code to be executed if the condition is false
         * }
         */
        int time = 19;
        if (time < 17) {
            System.out.println("good day");
        } else {
            System.out.println("good evening");
        }

        /*
         * the else if statement
         * use the "else if" statement to specify a new condition if the first condition
         * is false
         * syntax
         * if (condition1){
         * // block of code to be executed if condition1 is true
         * } else if (condition2) {
         * // block of code to be executed if the condition1 is false and condition2 is
         * true
         * } else {
         * // block of code to be executed if the condition1 is false and condition2 is
         * false
         * }
         */

        int a = 19;
        if (a < 10) {
            System.out.println("good morning");
        } else if (a < 17) {
            System.out.println("good day");
        } else {
            System.out.println("good evening");
        }

        /*
         * java short hand if...else (ternary operator)
         * the short hand if else, which is also know as the ternary operator because it
         * consists of three operands
         * syntax
         * variable = (condition) ? expression_true : expression_false;
         */
        // example
        int z = 19;
        String result = (z > 17) ? "good day" : "good evening";
        System.out.println(result);
    }
}
