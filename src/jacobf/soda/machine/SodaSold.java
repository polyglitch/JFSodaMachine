package jacobf.soda.machine;

import java.io.IOException;

public class SodaSold implements State{

    private static SodaSold instance = new SodaSold();

    private SodaSold() {}

    public static SodaSold instance() {
        return instance;
    }

    @Override
    public void updateMenu(Context context) {

        //fetch the currently chose soda
        Soda currentSoda = context.getSoda();

        //go to NoQuarter if there is stock to be sold
        if (currentSoda.sell()){
            System.out.print("\nSold and dispensed " + currentSoda.getSodaName() + "\n");
            context.setState(NoQuarter.instance());
        }
        //Return to HasQuarter if there is no stock in the chosen soda
        else {
            System.out.print("\nOut of " + currentSoda.getSodaName() + "\nPlease choose something else");
            context.setState(HasQuarter.instance());
        }



    }


}
