package jacobf.soda.machine;

import java.io.IOException;

public class NoQuarter implements State{

    private static NoQuarter instance = new NoQuarter();

    private NoQuarter() {}

    public static NoQuarter instance() {
        return instance;
    }


    @Override
    public boolean insertQuarter(Context context){
        System.out.println("Machine is in NoQuarter state");
        System.out.println("Machine is moving to hasQuarter state");
        System.out.println();
        context.setState(HasQuarter.instance());
        return true;
    }

    @Override
    public boolean removeQuarter(Context context){
        System.out.println("invalid choice");
        System.out.println();
        return true;
    }

    @Override
    public boolean chooseSoda(Context context){
        System.out.println("invalid choice");
        System.out.println();
        return true;
    }

    @Override
    public boolean dispenseSoda(Context context){
        System.out.println("invalid choice");
        System.out.println();
        return true;
    }

    @Override
    public void updateMenu(Context context) {
        System.out.println("Enter a number to make a selection.");
        System.out.println("1. Insert Quarter.");
        int choice = -1;
        try {
            choice = System.in.read();
        }
        catch (IOException e){
            System.out.println("error");
        }

        switch (choice) {
            case 1: System.out.println("Machine is in NoQuarter state");
                    System.out.println("Machine is moving to hasQuarter state");
                    System.out.println();
                    context.setState(HasQuarter.instance());

            default:
        }


    }



    public String toString(){
        return "has quarter state";
    }
}
