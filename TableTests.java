import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabe on 2/4/2017.
 */
public class TableTests {

    Party p1 = new Party(2,"joes");
    Party p2 = new Party(2,"Superman's Party");
    Servers s1 = new Servers(1,2.99,true);
    Servers s2 = new Servers(2,2.49,false);
    Table t1 = new Table(1,2,s1,p2);
    Table t2 = new Table(1,2,s1,p2);
    Table t3 = new Table(1,2,s1,p1);

    public List<Table> scannerTables = new ArrayList<>();

    /** Assert whether table 1 (t1) is open. -- it is not and thus will return false*/
    @Test
    public void testIsTableFree() {
    Assert.assertEquals(false,t1.isTableFree());
    }


    /** assert whether toString function outputs in the correct format */
    @Test
    public void testToString(){
        Assert.assertEquals(("Table1(2-top):joesparty of 2"), t1.toString());
    }

    /** see if there is a waiter assigned to table */
    @Test
    public void testIsWaiterAssigned(){
        Assert.assertEquals(true,t1.isServerAssigned());
    }

    @Test
    public void testAllTableStatus(){
        Table.tableReader();
        Assert.assertEquals("" , Table.listAllTableStatus());
    }

    /**test whether the file can be found or not */
    @Test
    public void testFileReader(){
        Table.tableReader();
        System.out.println(scannerTables.get(1));
    }

//    @Test
//    public void testAssignWaiter(){
//        Assert.assertEquals(t3,t2.assignParty(p1));
//    }
}