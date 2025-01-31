public class Switch {
    public static void main(String[] args) throws Exception {
        // switch
        /*
         * instead of writing many if else statements, we can you the switch statement
         * the switch statement selects one of the many code blocks to be executed
         * syntax
         * switch (expression) {
         * case x:
         * // code block
         * break;
         * case y:
         * // code block
         * break;
         * default:
         * // code block
         * }
         * 
         * the switch expression is evaluated once
         * the value of the expression is compared with the values of each case
         * if there is a match, the associated block of code is executed
         * the "break" and "default" keywords are optional
         */

        // the example below uses the weekday number to calculate the weekday name:
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
        }

        // the break keyword
        /*
         * when java reaches a "break" keyword, it breaks out of the switch block
         * this will stop the execution of more code and case testing inside the block
         * when a match is found, and the job is done, it's time for a break
         * there is no need for more testing
         */
        // a break can save a lot of execution time because it "ignores" the execution
        // of all the rest of the code in the switch block

        // the default keyword
        /*
         * the default keyword specifies some code to run if there is no case match
         */
        switch (day) {
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("looking forward to the weekend");
        }
        // note that if the default statement is used as the last statement in a switch
        // block, it does not need a break
    }
}
