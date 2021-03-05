package jacobf.soda.machine;

import java.util.ArrayList;

//serves as a list to keep track of what sodas the vending machine is selling as well as how much they have in stock
public class SodaList {

    private ArrayList<Soda> sodaList; //keep track of all of the sodas
    private Integer totalSodas; //a running total of every can of soda in the machine

    //constructor
    public SodaList() {
        sodaList = new ArrayList<Soda>();
        totalSodas = 0;

    }

    //look through the list of sodas by name to find the correct soda
    //return null if it doesn't exist
    private Soda findSoda(String sodaName) {
        for (Soda soda : sodaList) {
            if (soda.getSodaName().equals(sodaName)) {
                return soda;
            }
        }
        return null;
    }

    //add a new soda to the list or add stock to an existing soda
    public Boolean addSoda(String sodaName, Integer amount, Integer max) {
        //create a boolean to check to see if the new soda name is already in the soda list
        Boolean inList = false;
        Soda currentSoda = findSoda(sodaName);

        totalSodas = totalSodas + amount;

        //if it isn't in the current list add it
        //otherwise add the amount to the current stock in that soda
        if (currentSoda == null){
            sodaList.add(new Soda(sodaName, sodaList.size(), amount, max));
            return true;
        }
        else {
            //if you want to refill this way uncomment this
            //currentSoda.refillSoda(amount);
            return false;
        }
    }

    public Integer addStock (Integer restockAmount) {
        totalSodas = totalSodas + restockAmount;
        return totalSodas;
    }

    //take in a soda number and return it as a string
    public String getSodaName(Integer index) {
        return sodaList.get(index).getSodaName();
    }

    //return number of sodas in the list
    public Integer size() {
        return sodaList.size();
    }

    //return the total cans of soda in the machine including all flavors
    public Integer getTotalSodas() {
        return totalSodas;
    }

    //iterate through the list to find out whether or not all the stock has been sold
    public Boolean isSoldOut(String sodaName) {
        if (findSoda(sodaName).hasStock()) {
            return false;
        }
        else
            return true;
    }

    //call sellSoda in an individual soda
    //return true if it has stock to sell
    //otherwise return false
    public Boolean sellSoda(Integer index) {
        return sodaList.get(index).sell();
    }

    //tell a soda to refill back to it's maximum capacity
    //return the amount of soda that was added to the machine
    public Integer refillSoda(Integer index) {
        Integer refills = sodaList.get(index).refillSoda();
        totalSodas = refills + totalSodas;
        return refills;
    }

    //get an individual soda from its position in the the list
    public Soda getSoda(Integer index) {
        return sodaList.get(index);
    }

    //return true if every soda in the machine has been sold out
    //otherwise return false
    public Boolean isSoldOut() {
        for (Soda soda: sodaList) {
            if (soda.hasStock()) {
                return false;
            }
        }
        return true;
    }


}
