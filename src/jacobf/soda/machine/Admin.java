package jacobf.soda.machine;

import java.util.Scanner;

public class Admin implements State{

    private static Admin instance = new Admin();

    private Admin() {}

    public static Admin instance() {
        return instance;
    }

    @Override
    public void updateMenu(Context context) {

        System.out.println();
        System.out.println("Machine is in the Admin state");
        System.out.println("Enter a number to make a selection.");
        System.out.println();
        System.out.println("1. Refill Sodas");
        System.out.println("2. Show Sales");
        System.out.println("3. Leave Admin");
        //reduce calls
        Integer kinds = context.getKindsOfSoda();

        //read user input from command line
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Integer choice = Integer.parseInt(s);

        //refill sodas
        if (choice == 1) {
            for (int i = 0; i < context.sodaList.size(); i++) {
                System.out.print("\nRefilled " + context.sodaList.refillSoda(i)
                        + " cans of " + context.getSodaName(i));

            }
        }
        //show sales
        else if (choice == 2) {
            for (int i = 0; i < context.sodaList.size(); i++) {
                Soda soda = context.sodaList.getSoda(i);
                System.out.print("\nSold " + soda.getTotalSold() + " cans of " + soda.getSodaName());
            }
        }
        //leave the admin state and go back to NoQuarter
        else if (choice == 3) {
            context.setState(NoQuarter.instance());
        }




    }


}
