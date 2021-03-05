package jacobf.soda.machine;

public class Context {
    private State currentState;
    private Soda currentSoda;
    public SodaList sodaList = new SodaList();

    //initialize the starting state to noQuarter
    public Context(State currentState){
        super();
        this.currentState = currentState;

        if (currentState == null) {
            this.currentState = NoQuarter.instance();
        }
        currentState = null;
    }

    //setter and getter for the current state
    public void setState(State state){
        this.currentState = state;
    }
    public State getState(){
        return currentState;
    }

    //setter and getter for the current soda
    //passed between HasQuarter and Soda Sold
    public void setSoda(Soda soda){
        currentSoda = soda;
    }
    public Soda getSoda(){
        return currentSoda;
    }

    //get soda name from address
    public String getSodaName(Integer index) {
        return sodaList.getSodaName(index);
    }

    //add sodas to machine
    //return true if the soda was new to the machine
    //return false otherwise

    public Boolean addSoda(String sodaName, Integer amount, Integer max) {
        return sodaList.addSoda(sodaName, amount, max);
    }


    //return kinds of soda
    public Integer getKindsOfSoda() {
        return sodaList.size();
    }

    //return the total number of soda stored in the machine
    public Integer getTotalCans() {
        return sodaList.getTotalSodas();
    }

    //sell a can of soda
    public Boolean sellSoda(Integer index) {
        return sodaList.sellSoda(index);
    }

    //update function
    public void update(){
        currentState.updateMenu(this);
    }

}
