/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-19
 * Time: 15:16
 * Description:
 */
public class LC258AddDigits {

    public int addDigits1(int num) {

        while (num > 9) {
            num = sumDigits(num);
        }
        return num;
    }

    private int sumDigits(int input) {
        int sum = 0;

        while (input > 0) {
            sum += input % 10;
            input /= 10;
        }

        sum += input;
        return sum;
    }

    public int addDigits2(int num) {
        if (num == 0)
            return num;
        if (num % 9 == 0)
            return 9;
        return (num % 9);
    }

    public int addDigits3(int num) {
        if (num < 10) return num;

        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return addDigits3(sum);
    }
}
