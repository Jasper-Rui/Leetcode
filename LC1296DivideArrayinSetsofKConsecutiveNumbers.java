/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-25
 * Time: 10:14
 * Description:
 */
public class LC1296DivideArrayinSetsofKConsecutiveNumbers {
    public boolean isPossibleDivide(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;

        TreeMap<Integer, Integer> card_count = new TreeMap<>();
        for(int card : hand) {
            if(!card_count.containsKey(card)) {
                card_count.put(card, 1);
            } else {
                card_count.replace(card, card_count.get(card) + 1);
            }
        }


        while(card_count.size() > 0) {
            int min_val = card_count.firstKey();
            for(int card = min_val; card < min_val + groupSize; card++) {
                if(!card_count.containsKey(card)) return false;

                int count = card_count.get(card);
                if(count == 1) card_count.remove(card);
                else card_count.replace(card, count - 1);
            }
        }
        return true;
    }
}
