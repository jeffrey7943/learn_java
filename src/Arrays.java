public class Arrays {
    public static void main(String[] args) throws Exception {
        // arrays
        /*
         * arrays are used to store multiple values in a single variable, instead of
         * declaring separate variables for each value
         */
        // to declare an array, define the variable type with square brackets
        String[] cars = { "volvo", "BMW", "ford", "mazda" };
        System.out.println(cars[0]);
        // to create an array of integers, you could write
        int[] num = { 10, 20, 30, 40 };
        System.out.println(num[0]);

        // change an array element
        // to change the value of a specific element, refer to the index number
        cars[0] = "opel";
        System.out.println(cars[0]);
        // now outputs opel instead of volvo

        // array length
        // to find out how many elements an array has, use the length property
        System.out.println(cars.length);

        // java arrays loop
        // loop through an array
        /*
         * you can loop through the array elements with the for loop, and use the length
         * property to specify how many times the loop should run
         */
        // the following example outputs all elements in the cars array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // loop through an array with for-each
        /*
         * the following example outputs all elements in the cars array, using a
         * "for-each" loop
         */
        for (String i : cars) {
            System.out.println(i);
        }

        // java multi-dimensional arrays
        /*
         * a multi-dimensional array in an array of arrays
         * multi-dimensional arrays are useful when you want to store data as a tabular
         * form, like a table with rows and columns
         */
        /*
         * to create a two-dimensional array, add each array within its own set of curly
         * braces
         */
        int[][] my_numbers = { { 1, 2, 3, 4 }, { 5, 6, 7, } };

        // access elements
        System.out.println(my_numbers[1][2]);

        // change element values
        my_numbers[1][2] = 9;
        System.out.println(my_numbers[1][2]);

        // loop through a multi-dimensional array
        for (int i = 0; i < my_numbers.length; ++i) {
            for (int j = 0; j < my_numbers[i].length; ++j) {
                System.out.println(my_numbers[i][j]);
            }
        }

        /*
         * or we could just use a "for-each" loop, which is considered easier to read
         * and write
         */
        for (int[] row : my_numbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }
}
