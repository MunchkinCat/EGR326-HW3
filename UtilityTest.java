import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Gabe on 2/19/2017.
 */
public class UtilityTest {


    @Test
    public void addMoneyTest(){
        Utility.addMoney(10.99);
        Assert.assertEquals(10.99,Utility.getMoney(),0.0);
    }

    @Test
    public void cashRegisterTest(){
        Assert.assertEquals(Utility.getMoney(),Utility.cashRegister(),0);
    }
}
