package jacobf.soda.machine;

import java.io.IOException;
import java.util.Scanner;

public class HasQuarter implements State{

    private static HasQuarter instance = new HasQuarter();

    private HasQuarter() {}

    public static HasQuarter instance() {
        return instance;
    }

    @Override
    public void updateMenu(Context context) {
        System.out.println();
        System.out.println("Machine is in HasQuarter state");
        System.out.println("Enter a number to make a selection.");
        System.out.println();
        System.out.println("-1. Return Quarter");
        System.out.println();
        //reduce calls
        Integer kinds = context.getKindsOfSoda();

        //list all of the possible soda choices
        for (int i = 0; i < kinds; i++)
        {
            System.out.print(i + ". " + context.sodaList.getSodaName(i) + "\n");
        }

        //read user input from command line
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Integer choice = Integer.parseInt(s);



        //return quarter if chosen
        //dispense a soda
        //stay in the same state if the soda is out of stock or an invalid choice is picked
        if (choice == -1) {
            System.out.print("Returning your quarter \n");
            context.setState(NoQuarter.instance());
        }
        else if (choice >= 0 && choice <= kinds ) {
            Soda soda = context.sodaList.getSoda(choice);
            System.out.print("\nYou chose " + soda.getSodaName() + "\n");
            context.setSoda(soda);
            context.setState(SodaSold.instance());
        }
        else {
            System.out.print("\n Invalid choice");
        }



    }

}
