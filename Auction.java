 
/**Assignment03: Solution
 * NAME: M.Hassaan Atif
 * ROLL NO: 0147-BSCS-2019 (Section C)
 */
 
import java.util.HashMap;
import java.util.Map;

public class Auction {

    //field declarations
private Map<Lot, Bidder> highestBidder = new HashMap<>();
              /**MAIN METHOD**/
public static void main (String args []) {

    //declaring our bidders
    Bidder bid1 = new Bidder("831-5086-09", "Andy", 2000);
    Bidder bid2 = new Bidder("502-9131-64", "Kelvin", 3000);

    //declaring all of our lots
    Lot table = new Lot ("Table", "An office table");
    Lot chair = new Lot ("Chair", "A typical office chair");

    //declaring our one single auction and calling it's method
    Auction auction = new Auction();
    auction.highestValueBidder(table, bid1);
    auction.highestValueBidder(chair, bid2);

    //new bidders for above lots
    Bidder bid3 = new Bidder ("951-5195-10", "Jacob", 1000);
    auction.highestValueBidder(chair, bid3);

    auction.show_all();

}

/**METHODS**/
public void highestValueBidder (Lot lot, Bidder bidder) {
    if (!(highestBidder.containsKey(lot))) {
        highestBidder.put(lot, bidder);
    }
    if(highestBidder.containsKey(lot) && bidder.getBid_price() > highestBidder.get(lot).getBid_price()) {
        highestBidder.put(lot, bidder);
    }
}

public void show_all() {
for(Map.Entry<Lot, Bidder> map : highestBidder.entrySet()) {
    System.out.println("--Lot details--\n" + "Lot name: " + map.getKey().getLotName() + "\nLot description: " + map.getKey().getDescription() + "\n\n--Bidder Details--"+"\nHighest Bidder name: " + map.getValue().getName() +"\nBidder's CNIC: " + map.getValue().getCNIC() +  "\nHighest bid price: Rs " + map.getValue().getBid_price() +"\n------------" + "\n\n");

    }

}


}
