import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Gabe on 2/4/2017.
 */
public class Servers implements Cloneable {

    private static int id = 1;

    private boolean isAssignedtoTable = false;
    private double tip = 0.00;


    public static Servers randomServer(){
        Random ran = new Random();
        for(Servers i : serverList){
            int newID = ran.nextInt(3 - 1+ 1) + 1;
        if(i.getId() == newID){
            return i;
        }
        }
        return null;
    }

    //returns a clone of the server object to be used by the user.
    public Servers(int id, double tip, boolean isAssignedtoTable) {
        this.tip = tip;
        this.id = id;
        this.isAssignedtoTable = isAssignedtoTable;
    }

    public static  List<Servers> serverList = new ArrayList<>();

    public static void dismissServer(){
        int dismissID = 0;
        if(dismissID > 3){
            dismissID = 1;
        }
        for( Servers i: serverList){
            if(i.getId() == dismissID);
            serverList.remove(i);
        }
        dismissID++;
    }

    public static void addServer(){
        if(id > 3){
            id = 1;
        }
        serverList.add(new Servers(id,0,false));
                id++;
    }

    public boolean isAssignedtoTable() {
        return isAssignedtoTable;
    }

    public double getTip() {
        return this.tip;
    }

    public int getId() {
        return id;
    }


    /** allows for the user to add a tip to the current assigned server */
    public void addTip(double Customertip) {
        this.tip += Customertip;
    }






}
