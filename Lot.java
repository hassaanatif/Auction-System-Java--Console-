
/**Assignment03: Solution
 * NAME: M.Hassaan Atif
 * ROLL NO: 0147-BSCS-2019 (Section C)
 */
 
public class Lot {
    /**field declarations**/
    private String lotName;
    private String description;

    /**Constructor declaration**/
    public Lot(String lotName, String description) {
        this.lotName = lotName;
        this.description = description;
    }



/**GETTER METHODS**/
    public String getLotName() {
        return lotName;
    }

    public String getDescription() {
        return description;
    }
    /**SETTER METHODS**/
    public void setLotName(String lotName) {
        this.lotName = lotName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
