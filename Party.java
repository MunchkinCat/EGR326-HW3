/**
 * @author Gabe on 2/4/2017.
 *
 * Class of Party who will fill tables. Contains constructors and getter methods for
 * Restaurant.
 */
public class Party {

    private int numbInParty;
    private String partyName;

    public Party(int numbInParty, String partyName) {
        this.numbInParty = numbInParty;
        this.partyName = partyName;
    }

    /**@return the number in a given party */
    public int getNumberInParty() {
        return numbInParty;
    }

    /**@return the partyname of a given party */
    public String getPartyName() {
        return partyName;
    }


    public void partyToBeSeated(Party party1) {
        int numInParty = party1.getNumberInParty();
        String partyName = party1.getPartyName();
        for (Table i : Table.scannerTables) {   //go through the list of tables
            if (i.getSeats() < party1.getNumberInParty()) { //if the seats can fit the amount of people...
                if (!i.isServerAssigned()) {                // if there is no server assigned...
                    i.assignServer(Servers.randomServer());
                    i.assignParty(party1);                  //random server is assigned
                }
            }
        } Utility.addToWaitList(party1);//If the party doesnt fit at any tables, it will be placed in waiting list
    }

}
