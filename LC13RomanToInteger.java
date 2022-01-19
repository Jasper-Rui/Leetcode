import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-12
 * Time: 13:15
 * Description:
 */
public class LC13RomanToInteger {

    public static int romanToInt(String s) {

        if(s == null) return 0;
        //put every possibility into hashmap
        HashMap <String, Integer> hashMap = new HashMap<>();
        hashMap.put("I", 1);
        hashMap.put("V", 5);
        hashMap.put("X", 10);
        hashMap.put("L", 50);
        hashMap.put("C", 100);
        hashMap.put("D", 500);
        hashMap.put("M", 1000);
        hashMap.put("IV", 4);
        hashMap.put("IX", 9);
        hashMap.put("XL", 40);
        hashMap.put("XC", 90);
        hashMap.put("CD", 400);
        hashMap.put("CM", 900);

        //initialize result to 0
        //get string length
        int result = 0;
        int length = s.length();

        //if length is 1, return value
        if(s.length() == 1){
            return hashMap.get(s);
        }
        //if not, base on the length of string
        else {
            while (length >= 2) {
                String substring = s.substring(length - 2, length);//[ )

                if(hashMap.containsKey(substring)){
                    String temp = substring;
                    result += hashMap.get(temp);
                    length -= 2;
                }
                else{
                    result += hashMap.get(s.substring(length - 1, length));
                    length -= 1;
                }

            }
        }

        if(length > 0) {
            String s1 = s.substring(0, 1);
            return result + hashMap.get(s1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IM"));
    }
}
