import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args)throws FileNotFoundException {

        Menu mE = new Menu();
        Files fI = new Files();

        mE.menu1();
        fI.createFile();


    }
}
