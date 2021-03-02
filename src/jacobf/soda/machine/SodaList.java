package jacobf.soda.machine;

import java.util.ArrayList;

//serves as a list to keep track of what sodas the vending machine is selling as well as how much they have in stock
public class SodaList {

    private ArrayList<Soda> sodaList;
    private Integer totalSodas;

    //constructor
    public SodaList() {
        sodaList = new ArrayList<Soda>();
        totalSodas = 0;

    }

    //look through the list of sodas by name to find the correct soda
    //return null if it doesn't exist
    private Soda findSoda(String sodaName) {
        for (Soda soda : sodaList) {
            if (soda.getSodaName() == sodaName) {
                return soda;
            }
        }
        return null;
    }

    //add a new soda to the list or add stock to an existing soda
    public Boolean addSoda(String sodaName, Integer amount) {
        //create a boolean to check to see if the new soda name is already in the soda list
        Boolean inList = false;
        Soda currentSoda = findSoda(sodaName);

        totalSodas = totalSodas + amount;

        //if it isn't in the current list add it
        //otherwise add the amount to the current stock in that soda
        if (currentSoda == null){
            sodaList.add(new Soda(sodaName, sodaList.size(), amount));
            return true;
        }
        else {
            currentSoda.refillSoda(amount);
            return false;
        }
    }

    //take in a soda number and return it as a string
    public String getSodaName(Integer index) {
        return sodaList.get(index).getSodaName();
    }

    public Integer size() {
        return sodaList.size();
    }

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

    //
    public Boolean sellSoda(Integer index) {
        return sodaList.get(index).sell();
    }
    public Boolean sellSoda(String sodaName) {
        if (findSoda(sodaName).sell())
            return true;
        else
            return false;
    }

    public Soda getSoda(Integer index) {
        return sodaList.get(index);
    }

    public Boolean isSoldOut() {
        for (Soda soda: sodaList) {
            if (soda.hasStock()) {
                return false;
            }
        }
        return true;
    }


}
