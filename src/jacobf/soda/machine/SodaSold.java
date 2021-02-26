package jacobf.soda.machine;

import java.io.IOException;

public class SodaSold implements State{

    private static SodaSold instance = new SodaSold();

    private SodaSold() {}

    public static SodaSold instance() {
        return instance;
    }

    @Override
    public boolean insertQuarter(Context context){
        System.out.println("invalid choice");
        System.out.println();
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
        System.out.println("Machine is in the SodaSold state");
        System.out.println("Machine is moving to DispenseSoda  state");
        System.out.println();
        context.setState(OutOfSoda.instance());
        return true;
    }

    @Override
    public void updateMenu(Context context) {
        if (context.getSoda().sell()){
            context.setState(NoQuarter.instance());
        }
        else {
            System.out.print("Out of " + context.getSoda().getSodaName() + "\nPlease choose something else");
            context.setState(HasQuarter.instance());
        }



    }


}
