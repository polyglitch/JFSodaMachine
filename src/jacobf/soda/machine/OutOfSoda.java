package jacobf.soda.machine;

import java.io.IOException;

public class OutOfSoda implements State{

    private static OutOfSoda instance = new OutOfSoda();
    private OutOfSoda() {}

    public static OutOfSoda instance() {
        return instance;
    }

    @Override
    public void updateMenu(Context context) {
        System.out.print("\nSoda machine is completely empty");


    }

    public String toString(){
        return "has quarter state";
    }
}
