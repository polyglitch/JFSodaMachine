package jacobf.soda.machine;

import java.io.IOException;
import java.util.Scanner;

public class OutOfSoda implements State{

    private static OutOfSoda instance = new OutOfSoda();
    private OutOfSoda() {}

    public static OutOfSoda instance() {
        return instance;
    }

    @Override
    public void updateMenu(Context context) {
        System.out.print("\nSoda machine is completely empty");

        System.out.println("Enter a number to make a selection.");
        System.out.println("1. Exit");

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Integer choice = Integer.parseInt(s);

        switch (choice) {
            case 1:
                System.exit(0);
                break;
            case 100:
                context.setState(Admin.instance());
                break;
            default:
        }

    }

    public String toString(){
        return "has quarter state";
    }
}
