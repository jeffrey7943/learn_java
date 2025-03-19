import java.util.Scanner; // importing java.util package

public class PackagesAndAPI {
    /*
     * a package in java is used to group related classes
     * think of it as a folder in a file directory
     * we use packages to avoid name conflicts, and to write a better maintainable
     * code
     * packages are divided into two categories
     * built in packages (packages from the java API)
     * user-defined packages (create your own packages)
     */

    // built-in packages
    /*
     * the java API is a library of prewritten classes, that are free to use,
     * included in the java development environment
     * to use a class or a package from the library, you need to use the "import"
     * keyword
     */
    // syntax
    // "import package.name.Class;" // import a single class
    // "import.package.name.*"; // import the whole package

    // example
    public static void main(String[] args) throws Exception {
        try (Scanner my_object = new Scanner(System.in)) {
            System.out.println("enter username");
            String username = my_object.nextLine();
            System.out.println("username is: " + username);
        }
    }
}
