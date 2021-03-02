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

            System.out.println("Enter a number to make a selection.");
            System.out.println("1. Insert Quarter.");

            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            Integer choice = Integer.parseInt(s);

            switch (choice) {
                case 1:
                    System.out.println("Machine is in NoQuarter state");
                    System.out.println("Machine is moving to hasQuarter state");
                    System.out.println();
                    context.setState(HasQuarter.instance());

                default:
            }
        }


    }



    public String toString(){
        return "has quarter state";
    }
}
