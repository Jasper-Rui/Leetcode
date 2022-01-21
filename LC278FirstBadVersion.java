/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-20
 * Time: 12:51
 * Description:
 */
public class LC278FirstBadVersion {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {

            int left = 1;
            int right = n;

            while (left < right) {

                int mid = left + (right - left) / 2;
                if(isBadVersion(mid)) {
                    right = mid;
                }
                else {
                    left = mid + 1;
                }
            }

            return left;
        }
    }
}
