package jacobf.soda.machine;

public interface State {

    //define a method for every possible action
    public boolean insertQuarter(Context context);
    public boolean removeQuarter(Context context);
    public boolean chooseSoda(Context context);
    public boolean dispenseSoda(Context context);
    public void updateMenu(Context context);

}
