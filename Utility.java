import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabe on 2/19/2017.
 */
public class Utility {

    private static double registerAmount = 0.00;
    static double money = 0.00;

    public Utility(double money) {
        this.money = money;
    }

    public static double getMoney() {
        return money;
    }

    public static void addMoney(double money) {
        Utility.money += money;
    }

    public static double cashRegister() {
        return Utility.getMoney();
    }

    public static List<Party> waitingList = new ArrayList<>();

    public static void removeFromWaitList(Party party) {
        waitingList.remove(party);
    }

    public static void addToWaitList(Party party) {
        waitingList.add(party);
    }


}
