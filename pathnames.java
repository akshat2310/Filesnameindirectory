import java.io.File;
public class pathnames {
    public static void main(String[] args) {
        String[] pathnames;

        // Creates a new File instance by converting the given pathname string
        // into an abstract pathname
        File f = new File("C:/Users/akshat/desktop");

        // Populates the array with names of files and directories
        pathnames = f.list();

        // For each pathname in the pathnames array
        for (String pathname : pathnames) {
            // Print the names of files and directories
            System.out.println(pathname);
        }

    }
}
