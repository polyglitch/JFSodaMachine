package jacobf.soda.machine;

//class designed to keep track of the name, ID, the amount of soda sold, and the amount of soda in stock
public class Soda {
    private String sodaName;
    private Integer sodaID;
    private Integer sodaAmount;

    public Soda(String sodaName, Integer sodaID, Integer sodaAmount) {
        this.sodaName = sodaName;
        this.sodaID = sodaID;
        this.sodaAmount = sodaAmount;
    }

    //getters
    public String getSodaName() {
        return sodaName;
    }
    public Integer getSodaAmount() {
        return sodaAmount;
    }
    public Integer getSodaID() {
        return sodaID;
    }

    public void refillSoda (Integer amount){
        sodaAmount = sodaAmount + amount;
    }

    //confirm that the soda has stock
    public Boolean hasStock() {
        if (sodaAmount > 0)
            return false;
        else
            return true;
    }

    //if you can sell one soda reduce the amount of sodas by 1 return true
    //otherwise return false
    public Boolean sell() {
        if (sodaAmount > 0)
            return false;
        else
            sodaAmount = sodaAmount - 1;
            return true;
    }


}
