public class Strings {
    public static void main(String[] args) throws Exception {
        // strings
        /*
         * strings are used for storing text
         * a string variable contains a collection of characters surrounded by double
         * quotes
         */
        // create a variable of type string and assign it a value
        String greeting = "hello, world!";
        System.out.println(greeting);
        String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("the length of the text string is: " + text.length());
        /*
         * there are many string methods available
         * for example "toUpperCase()" and "toLowerCase()"
         */
        String txt = "hello WORLD";
        System.out.println(txt);
        System.out.println("text changes after applying toUpperCase() method: " + txt.toUpperCase());
        System.out.println(txt);
        System.out.println("text changes after applying toLowerCase() method: " + txt.toLowerCase());
        /*
         * the "indexOf()" method returns the index (the position) of the first
         * occurrence of a specified text in a string (including whitespace)
         */
        String locate_text = "please locate where jeffrey occurs!";
        System.out.println(locate_text.indexOf("jeffrey"));

        // string concatenation
        // the + operator can be used between strings to combine them
        // this is called concatenation
        String first_name = "jeffrey";
        String last_name = "mukkath";
        System.out.println(first_name + " " + last_name);
        // note that we have added an empty text (" ") to create a space between
        // first_name and last_name on print
        // you can also use the concat() method to concatenate two strings
        System.out.println(first_name.concat(last_name));
        // java uses the + operator for both addition and concatenation
        // numbers are added. strings are concatenated
        int x = 19;
        int y = 17;
        int z = x + y;
        System.out.println(z);
        // if you add two strings, the result will be a string concatenation
        String a = "19";
        String b = "17";
        String c = a + b;
        System.out.println(c);
        // if you add a number and a string, the result will be a string concatenation

        // special characters
        // because strings must be written with quotes, java will misunderstand this
        // string and generate error
        // String txt = "we are the so-called "vikings" from the north";
        // the solution to avoid this problem, is to use the backslash escape character
        // the backslash (\) escape character turns special characters into string
        // characters
        // example
        String backslash = "we are the so-called \"vikings\" from the north";
        System.out.println(backslash);
        String backslash_text = "it\'s alright";
        System.out.println(backslash_text);
        String backslash_example = "the character \\ is called backslash";
        System.out.println(backslash_example);
        // other common escape sequences that are valid in java are
        System.out.println("hello\nworld!"); // new line
        System.out.println("hello\tworld!"); // tab
        System.out.println("hello\bworld!"); // backspace
    }
}
