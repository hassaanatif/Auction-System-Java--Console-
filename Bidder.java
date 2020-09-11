 
/**Assignment03: Solution
 * NAME: M.Hassaan Atif
 * ROLL NO: 0147-BSCS-2019 (Section C)
 */
 

public class Bidder {
    /**field declarations**/
    private String CNIC;
    private String Name;
    private int bid_price;

    /**constructor**/
    public Bidder(String CNIC, String name, int bid_price) {
        this.CNIC = CNIC;
        Name = name;
        this.bid_price = bid_price;
    }



    /**GETTER METHODS**/
    public String getCNIC() {
        return CNIC;
    }

    public String getName() {
        return Name;
    }

    public int getBid_price() {
        return bid_price;
    }

    /**SETTER METHODS **/
    public void setName(String name) {
        Name = name;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public void setBid_price(int bid_price) {
        this.bid_price = bid_price;
    }
}
