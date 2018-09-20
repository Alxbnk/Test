import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Formatter;
import java.util.Scanner;

public class Files {

    public void createFile() throws FileNotFoundException {

        Scanner cF = new Scanner(System.in);
        System.out.println("Your Name Please: ");
        String fileName = cF.next();
        final Formatter x;
        PrintStream pS = new PrintStream(fileName);

        try {
            x = new Formatter(fileName);
        } catch (Exception e) {
            System.out.println("Error Creating File");
        }
        pS.println(fileName);

    }

}
