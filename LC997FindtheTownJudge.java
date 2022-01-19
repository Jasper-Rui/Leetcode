import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-12
 * Time: 15:53
 * Description:
 */
public class LC997FindtheTownJudge {

    public int findJudge1(int n, int[][] trust) {
        if(n == 0 || n == 1 || trust == null) {
            return -1;
        }

        int judge = trust[0][1];

        for (int i = 0; i < trust.length; i++){
            if(trust[i][1] != judge){
                return -1;
            }
        }
        return judge;
    }

    public int findJudge(int n, int[][] trust) {
        if(n == 0 || trust == null) {
            return -1;
        }

        if(n == 1) {
            return 1;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < trust.length; i++) {
            hashMap.put(trust[i][0], trust[i][1]);
        }

        int judge = -1;

        for (int i = 1; i <= n; i++){
            if(!hashMap.containsKey(i)){
                judge = i;
                break;
            }
        }

        if (judge == -1) return judge;

        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        sum -= judge;

        for(int i = 0; i < trust.length; i++) {
            if(trust[i][1] == judge) {
                sum -= trust[i][0];
            }
        }

        if(sum == 0) {
            return judge;
        }
        return -1;
    }


    public static void main(String[] args) {

    }
}
