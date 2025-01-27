import static java.lang.Math.*;

public class Math {
    public static void main(String[] args) throws Exception {
        // math
        /*
         * the java math class has many methods that allows you to perform mathematical
         * tasks on numbers
         */
        // "Math.max(a, b)"
        // the Math.max(a, b) method can be used to find the highest value
        System.out.println(max(5, 10));
        // "Math.min(a, b)"
        // the Math.min(a, b) method can be used to find the lowest value
        System.out.println(min(5, 10));
        // "Math.sqrt(a)"
        // the Math.sqrt(a) method returns the square root of a
        System.out.println(sqrt(49));
        // "Math.abs(a)"
        // the Math.abs(a) method returns the absolute (positive) value of a
        System.out.println(abs(-4));
        // "Math.random()"
        // Math.random() returns a number between 0.0 (inclusive) and 1.0 (exclusive)
        System.out.println(random());
        /*
         * to get more control over the random number, for example, if you only want a
         * random between 0 and 100, you can use this formula
         */
        int random_number = (int) (random() * 101); // 0 to 100
        System.out.println(random_number);
    }
}
