package jacobf.soda.machine;

public class Admin implements State{

    private static Admin instance = new Admin();

    private Admin() {}

    public static Admin instance() {
        return instance;
    }

    @Override
    public void updateMenu(Context context) {


    }


}
