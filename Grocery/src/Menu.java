import java.util.Scanner;

public class Menu {

    public void menu1(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, would you like to: /n1.Add to list./n2.Run pre-existing list.");

        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                fI.createFile();
            case 2:

        }

    }

}