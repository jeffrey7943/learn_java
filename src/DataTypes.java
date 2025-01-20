public class DataTypes {
    public static void main(String[] args) throws Exception {
        // datatypes
        /*
         * data types are divided into two groups
         * primitive data types - includes byte, short, int, long, float, double,
         * boolean and char
         * non-primitive data types - such as string, arrays and classes
         */
        /*
         * byte - stores whole numbers from -128 to 127
         * short - stores whole numbers from -32,768 to 32,767
         * int - stores whole numbers from -2,147,483,648 to 2,147,483,647
         * long - stores whole numbers from -9,223,372,036,854,775,808 to
         * 9,223,372,036,854,775,807
         * float - stores fractional numbers. sufficient for storing 6 to 7 decimal
         * digits
         * double - stores fractional numbers. sufficient for storing 15 to 16 decimal
         * digits
         * boolean - stores true or false values
         * char - stores a single character/letter or ASCII values
         */
        String example = "examples";
        byte byte_example = 1;
        short short_example = 13333;
        int int_example = 4444444;
        long long_example = 444444444;
        float float_example = 5.99f;
        double double_example = 591116731.333433;
        boolean boolean_example = false;
        char char_example = 'a';

        System.out.println(example);
        System.out.println("byte example = " + byte_example);
        System.out.println("short example = " + short_example);
        System.out.println("int example = " + int_example);
        System.out.println("long example = " + long_example);
        System.out.println("float example = " + float_example);
        System.out.println("double example = " + double_example);
        System.out.println("boolean example = " + boolean_example);
        System.out.println("char example = " + char_example);
    }
}
