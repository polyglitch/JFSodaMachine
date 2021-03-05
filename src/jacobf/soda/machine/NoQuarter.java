package jacobf.soda.machine;

import java.awt.desktop.SystemSleepEvent;
import java.io.IOException;
import  java.util.Scanner;

public class NoQuarter implements State{

    private static NoQuarter instance = new NoQuarter();

    private NoQuarter() {}

    public static NoQuarter instance() {
        return instance;
    }

    @Override
    public void updateMenu(Context context) {

        //preemtively check to see if there are any remaining sodas to sell
        if (context.sodaList.isSoldOut()){
            context.setState(OutOfSoda.instance());
        }
        else {

            //ask for a selection
            System.out.println("Enter a number to make a selection.");
            System.out.println("1. Insert Quarter.\n");
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            Integer choice = Integer.parseInt(s);

            //parse the selection
            //100 is a hidden code to go to admin
            if (choice == 1) {
                System.out.println();
                context.setState(HasQuarter.instance());
            }
            else if (choice == 100) {
                context.setState(Admin.instance());
            }
        }


    }



    public String toString(){
        return "has quarter state";
    }
}
