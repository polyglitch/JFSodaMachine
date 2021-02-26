package jacobf.soda.machine;

public class Context {
    private State currentState;
    private Soda currentSoda;

    //initialize the starting state to noQuarter
    public Context(State currentState){
        super();
        this.currentState = currentState;

        if (currentState == null) {
            this.currentState = NoQuarter.instance();
        }
        currentState = null;
    }

    //set the current active state
    public void setState(State state){
        this.currentState = state;
    }

    //return the active state
    public State getState(){
        return currentState;
    }

    //set soda
    public void setSoda(Soda soda){
        currentSoda = soda;
    }

    //set soda
    public Soda getSoda(){
        return currentSoda;
    }

    //update function
    public void update(){
        currentState.updateMenu(this);
    }



    //every possible action that will be needed by the states
    public boolean insertQuarter() {
        return currentState.insertQuarter(this);
    }
    public boolean removeQuarter() {
        return currentState.removeQuarter(this);
    }
    public boolean chooseSoda() {
        return currentState.chooseSoda(this);
    }
    public boolean dispenseSoda() {
        return currentState.dispenseSoda(this);
    }

}
