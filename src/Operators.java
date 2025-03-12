public class Operators {
    public static void main(String[] args) throws Exception {
        // operators
        // java operators are used to perform operations on variables and values
        /*
         * java divides the operators into the following groups
         * arithmetic operators
         * assignment operators
         * comparison operators
         * logical operators
         * bitwise operators
         */

        // arithmetic operators
        /*
         * "+" addition operator || example: x + y
         * "-" subtraction operator || example: x - y
         * "*" multiplication operator || example: x * y
         * "/" division operator || example: x / y
         * "%" modulus operator || example: x % y
         * "++" increment operator || example: ++x
         * "--" decrement operator || example: --x
         */

        // assignment operators
        // we use assignment operator (=) to assign the value 10 to variable called a
        int a = 10;
        System.out.println(a);
        // the addition assignment operator (+=) adds a value to a variable
        int x = 10;
        x += 5;
        System.out.println(x);
        /*
         * a list of all assignment operators
         * "=" || example: x = 5 || x = 5
         * "+=" || example: x += 3 || x = x + 3
         * "-=" || example: x -= 3 || x = x - 3
         * "*=" || example: x *= 3 || x = x * 3
         * "/=" || example: x /= 3 || x = x / 3
         * "%=" || example: x %= 3 || x = x % 3
         * "&=" || example: x &= 3 || x = x & 3
         * "|=" || example: x |= 3 || x = x | 3
         * "^=" || example: x ^= 3 || x = x ^ 3
         * ">>=" || example: x >>= 3 || x = x >> 3
         * "<<=" || example: x <<= 3 || x = x << 3
         */

        // comparison operators
        // comparison operators are used to compare two values (or variables)
        // this is useful for find answers and making decisions
        // the return value of a comparison is either true or false
        // in the following example, we use the greater than operator (>) to find out if
        // 5 is greater than 3
        int m = 5;
        int n = 3;
        System.out.println(m > n); // returns true, because 5 is greater than 3
        // a list of all comparison operators
        /*
         * "==" || equal to || x == y
         * "!=" || not equal || x != y
         * ">" || greater than || x > y
         * "<" || less than || x < y
         * ">=" || greater than or equal to || x >= y
         * "<=" || less than or equal to || x <= y
         */

        // logical operators
        // logical operators are used to determine the logic between variables or values
        /*
         * "&&" || logical and || returns true if both statements are true
         * example x < 5 && x < 10
         * "||" || logical or || returns true if one of the statements is true
         * example x < 5 || x < 4
         * "!" || logical not || reverse the result, returns false if the result is true
         * example !(x < 5 && x < 10)
         */
    }
}
