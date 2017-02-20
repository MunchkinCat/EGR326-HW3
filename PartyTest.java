import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Gabe on 2/9/2017.
 */
public class PartyTest {


    Party p1 = new Party(10, "Joe's Party");
    Party p2 = new Party(100, "@..Party?");
    Party p3 = new Party(90, "Happy go Lucky");



    //*Tests the number in party method from Party */
    @Test
    public void getNumberInPartyTest() {
        Assert.assertEquals(10, p1.getNumberInParty());
        Assert.assertEquals(100, p2.getNumberInParty());
        Assert.assertEquals(90, p3.getNumberInParty());
    }


    //*Tests the party name getter method from Party */
    @Test
    public void getPartyNameTest(){
        Assert.assertEquals("Joe's Party",p1.getPartyName());
        Assert.assertEquals("@..Party?",p2.getPartyName());
        Assert.assertEquals("Happy go Lucky",p3.getPartyName());
    }
}
