package jacobf.soda.machine;

import java.io.IOException;

public class HasQuarter implements State{

    private static HasQuarter instance = new HasQuarter();

    private HasQuarter() {}

    public static HasQuarter instance() {
        return instance;
    }


    @Override
    public boolean insertQuarter(Context context){
        System.out.println("invalid choice");
        System.out.println();
        return false;
    }

    @Override
    public boolean removeQuarter(Context context){
        System.out.println("Machine is in the HasQuarter state");
        System.out.println("Machine is moving to NoQuarter state");
        System.out.println();
        context.setState(NoQuarter.instance());

        return true;
    }

    @Override
    public boolean chooseSoda(Context context){
        System.out.println("Machine is in the HasQuarter state");
        System.out.println("Machine is moving to SodaSold state");
        System.out.println();
        context.setState(SodaSold.instance());
        return true;
    }

    @Override
    public boolean dispenseSoda(Context context){
        System.out.println("invalid choice");
        System.out.println();
        return false;
    }

    @Override
    public void updateMenu(Context context) {
        System.out.println();
        System.out.println("Machine is in HasQuarter state");
        System.out.println();
        System.out.println("Enter a number to make a selection.");
        System.out.println("0. Soda 0.");
        System.out.println("1. Soda 1.");
        System.out.println("2. Soda 2.");
        System.out.println("3. Soda 3.");
        System.out.println("4. Soda 4.");
        System.out.println("5. Soda 5");
        System.out.println("7. Return Quarter 7");

        int choice = -1;
        try {
            choice = System.in.read();
        }
        catch (IOException e){
            System.out.println("error");
        }

        switch (choice) {
            case 1: System.out.println("Machine is moving to DispenseSoda state");
                    System.out.println();
                    context.setState(SodaSold.instance());

            case 2: System.out.println("Machine is moving to DispenseSoda state");
                    System.out.println();
                    context.setState(SodaSold.instance());

            case 3: System.out.println("Machine is moving to DispenseSoda state");
                    System.out.println();
                    context.setState(SodaSold.instance());

            case 4: System.out.println("Machine is moving to DispenseSoda state");
                    System.out.println();
                    context.setState(SodaSold.instance());

            case 5: System.out.println("Machine is moving to DispenseSoda state");
                    System.out.println();
                    context.setState(SodaSold.instance());

            case 7: System.out.println("Machine is moving to NoQuarter state");
                    System.out.println();
                    context.setState(NoQuarter.instance());
            default:
        }


    }


    public String toString(){
        return "has quarter state";
    }
}
