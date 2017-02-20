import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Gabe on 2/12/2017.
 */


public class ServersTests {

    Servers s1 = new Servers(1, 20.00, true);
    Servers s2 = new Servers(2, 20.00, false);


    @Test
    public void testServerGetters() {
        Assert.assertEquals(1, s1.getId());
        Assert.assertEquals(20.00, s1.getTip(), 0);
        Assert.assertEquals(true, s1.isAssignedtoTable());
    }

    @Test
    public void testAddTip() {
        s1.addTip(20.00);
        Assert.assertEquals(40.00, s1.getTip(), 0);
    }


}



