/**
 * Created by Gabe on 2/4/2017.
 */
public class Restaurant {


    /** puts money into register, frees table,
     * searches waitlist to see if a party can be seated at this table */

    public static void checkPlease(String PartyName, double tip, double subtotal) {
        for (Table i : Table.scannerTables) {
            if (i.getPartySeated().equals(PartyName)) {

                Utility.addMoney(subtotal); //add subtotal to the register
                Utility.cashRegister();     //return amount in the register

                i.getServer().addTip(tip); //gives the tip to the server


                i.assignParty(null);    //free the table
                i.assignServer(null);

                for(Party j: Utility.waitingList){
                if(j.getNumberInParty() <= i.getSeats()){
                    j.partyToBeSeated(j);           //seats the party if it will fit
                Utility.removeFromWaitList(j);      //removes the party from the waitlist
                }
                }

            }
        }


    }
}
