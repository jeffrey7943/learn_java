public class Loops {
    public static void main(String[] args) throws Exception {
        // loops
        /*
         * loops can execute a block of code as long as a specified condition is reached
         * loops are handy because they save time, reduce errors, and they make code
         * more readable
         */

        // java while loop
        // the "while" loop loops through a block of code as long as a specified
        // condition is true
        /*
         * syntax
         * while (condition) {
         * // code block to be executed
         * }
         */
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // java do/while loop
        // the "do/while" loop is a variant of the while loop
        // this loop will execute the code block once, before checking if the condition
        // is true, then it will repeat the loop as long as the condition is true
        /*
         * syntax
         * do {
         * // code block to be executed
         * }
         * while (condition);
         */

        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        // java for loop
        // for loop is used when we know exactly how many times you want to loop through
        // a block of code, use the "for" loop instead of a "while" loop
        /*
         * syntax
         * for (statement1; statement2; statement3) {
         * // code block to be executed
         * }
         */
        // statement 1 is executed (one time) before the execution of the code block
        // statement 2 defines the condition for executing the code block
        // statement 3 is executed (every time) after the code block has been executed
        for (int a = 0; a < 5; a++) {
            System.out.println(a);
        }

        // java nested loop
        // it is possible to place a loop inside another loop
        // this is called a nested loop

        // example
        // outer loop
        for (int z = 1; z <= 2; z++) {
            System.out.println("outer:" + z);

            // inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("inner" + j);
            }
        }

        // java for each loop
        // there is a "for-each" loop, which is used extensively to loop through
        // elements in an array (or other datasets)
        /*
         * syntax
         * for (type variable_name : array_name) {
         * // code block to be executed
         * }
         */
        String[] cars = { "volvo", "BMW", "ford", "mazda" };
        for (String c : cars) {
            System.out.println(c);
        }

        // java break and continue
        // the break statement can also be used to jump out of a loop
        for (int m = 0; m < 10; m++) {
            if (m == 4) {
                break;
            }
            System.out.println(m);
        }

        // the continue statements break one iteration (in the loop), if a specified
        // condition occurs, and continues with the next iteration in the loop
        // this example skips value of 4
        for (int p = 0; p < 10; p++) {
            if (p == 4) {
                continue;
            }
            System.out.println(p);
        }
    }
}
