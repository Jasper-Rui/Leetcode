/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-20
 * Time: 16:12
 * Description:
 */
public class LC1046LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        int index = stones.length - 1;
        while (index >= 1) {
            Arrays.sort(stones);

            stones[index - 1] = stones[index] - stones[index - 1];

            if(stones[index - 1] == 0 && index >= 2) {
                stones = Arrays.copyOfRange(stones, 0, index - 1);
                index -= 2;
            }
            else {
                stones = Arrays.copyOfRange(stones, 0, index);
                index--;
            }
        }

        return stones[0];
    }
}
