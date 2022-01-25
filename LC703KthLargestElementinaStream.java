import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-24
 * Time: 20:16
 * Description:
 */
public class LC703KthLargestElementinaStream {
    public int[] nums;
    public int k;

    public LC703KthLargestElementinaStream(int k, int[] nums) {
        this.nums = nums;
        this.k = k;
    }

    public int add(int val) {
        if(this.nums.length < 0) return -1;
        int[] array = Arrays.copyOf(this.nums, this.nums.length + 1);
        array[array.length - 1] = val;
        Arrays.sort(array);
        int result = array[this.k - 1];
        array[this.k - 1] = 0;
        Arrays.sort(array);
        this.nums = Arrays.copyOfRange(array, 1, array.length);
        return result;
    }
}
