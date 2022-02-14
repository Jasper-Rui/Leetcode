import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-02-14
 * Time: 18:19
 * Description:
 */
public class NonConstructibleChange {
    public int nonConstructibleChange(int[] coins) {
        // Write your code here.
        Arrays.sort(coins);
        int ccc = 0;
        for(int coin : coins) {
            if(coin > ccc + 1)  {
                return ccc + 1;
            }
            ccc += coin;
        }

        return ccc + 1;
    }
}
