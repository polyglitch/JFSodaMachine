package jacobf.soda.machine;

//class designed to keep track of the name, ID, the amount of soda sold, and the amount of soda in stock
public class Soda {
    private String sodaName; //name of the soda
    private Integer sodaID; //index for where the soda is in SodaList.java
    private Integer sodaAmount; //total amount of soda currently in the machine
    private Integer totalSold; //total sales
    private Integer maxCapacity; //max number of can that will fit in the machine

    //constructor
    public Soda(String sodaName, Integer sodaID, Integer sodaAmount, Integer maxCapacity) {
        this.sodaName = sodaName;
        this.sodaID = sodaID;
        this.sodaAmount = sodaAmount;
        this.maxCapacity = maxCapacity;
        totalSold = 0;
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
    public Integer getTotalSold() {
        return totalSold;
    }

    //add stock to the current soda
    //and return the amount that was put into the machine to fill
    //it back to maximum capacity
    public Integer refillSoda (){
        Integer amountRefilled = sodaAmount;
        sodaAmount = maxCapacity;
        amountRefilled = maxCapacity - amountRefilled;
        return amountRefilled;
    }

    //confirm that the soda has stock
    public Boolean hasStock() {
        if (sodaAmount > 0)
            return true;
        else
            return false;
    }


    //if you can sell one soda reduce the amount of sodas by 1 return true
    //otherwise return false
    public Boolean sell() {
        if (sodaAmount > 0) {
            sodaAmount = sodaAmount - 1;
            totalSold = totalSold + 1;
            System.out.print("\nHas sold " + totalSold + "\n");
            return true;
        }

        else
            return false;
    }


}
