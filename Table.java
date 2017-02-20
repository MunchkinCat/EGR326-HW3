import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Created by Gabe on 2/4/2017.
 *         An object a server can be assigned to.
 */
public final class Table {

    /**
     * variables for immutability declared below
     */

    private  int id = 0;
    private  int seats = 0;
    private  Servers server = null;
    private  Party partySeated;

    /**
     * constructor, made to be immutable
     * @param id    name of the table
     * @param seats how many the table can seat
     * @param partySeated name of party sitting at the table
     */
    public Table(int id, int seats, Servers server, Party partySeated) {
        this.id = id;
        this.seats = seats;
        this.server = server;
        this.partySeated = partySeated;

    }

    public Party getPartySeated() {
        return partySeated;
    }

    public Servers getServer() {
        return server;
    }

    public int getSeats() {
        return seats;
    }

    /**
     * List of Tables
     */
    public static  List<Table> scannerTables = new ArrayList<>();


    /** returns all of the servers that are currently on duty */
    public Servers ServersOnDuty(){
        for(Table i : scannerTables){   //iterates through the tables
            return i.server;            //returns the active server for each table
        }
        return server;
    }




    /** Scans the file and outputs into multiple table objects*/
    public  static List<Table> tableReader() {

        try {
            Scanner in = new Scanner(new FileReader("tables.txt"));
            String tempVar = in.toString();
            String temp2[] = tempVar.split("\n");

            for (int j = 1; j < temp2.length; j++) {
                int seatsReader = Integer.parseInt(temp2[j]);
                int idReader = j;
                scannerTables.add(new Table(idReader, seatsReader, null, null));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }


    public static String TableStatus(){
    for(Table i : scannerTables){
        return(i.toString());
    }
    return null;
    }


    /**
     * @return whether there is a party sitting at this
     * table or if it is open to be seated
     */
    public boolean isTableFree() {
        if (this.partySeated == null) {
            return true;
        }
        return false;
    }

    /**
     * @returns a text representation of the table
     */
    public String toString() {
        return ( "Table" + id + "("+ seats +"-top):" +partySeated.getPartyName()
                + "party of " + partySeated.getNumberInParty());
    }


    /**
     * @return whether a waiter has been assigned to the table or not
     */
    public boolean isServerAssigned() {
        if (server == null) {
            return true;
        }
        return false;
    }

    public void assignServer(Servers assignedServer){
       if(server == null)
        this.server = assignedServer;
       else System.out.println("There is already a server assigned!");
    }
    /**
     * @param party the partyName that will sit at the given table
     */
    public void assignParty(Party party) throws IllegalArgumentException {
        if (party == null) {
            this.partySeated = party;
        }
        else System.out.println("There is already a server assigned!");
    }







}
