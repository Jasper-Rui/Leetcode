/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-25
 * Time: 9:20
 * Description:
 */
public class LC414ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Integer max = null;
        Integer max_second = null;
        Integer max_third = null;

        for(Integer num : nums) {
            if(num.equals(max) || num.equals(max_third) || num.equals(max_second)) continue;

            if(max == null || num > max) {
                max_third = max_second;
                max_second = max;
                max = num;
            }
            else if(max_second == null || num > max_second) {
                max_third = max_second;
                max_second = num;
            }
            else if(max_third == null || num > max_third) {
                max_third = num;
            }
        }

        if(max_third == null) return max;

        return max_third;
    }
}
