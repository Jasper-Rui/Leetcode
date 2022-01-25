import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-21
 * Time: 10:54
 * Description:
 */



public class TestDemo {

    public static void main(String[] args) {
        String[] strings = {"cat","bt","hat","tree"};

        String chars = "atach";

        System.out.println(countCharacters(strings, chars));
        System.out.println(1);


    }


    public static int countCharacters(String[] words, String chars) {

        int sum = 0;

        if(chars == null || chars.equals("")) return 0;

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < chars.length(); i++) {
            char ch = chars.charAt(i);

            if(hashMap.containsKey(ch)) {
                int oldval = hashMap.get(ch);
                hashMap.put(ch, oldval + 1);
            }
            hashMap.put(ch, 1);
        }


        for(int i = 0; i < words.length; i++) {

            HashMap<Character, Integer> temp = new HashMap<>();
            for(int j = 0; j < words[i].length(); j++) {
                char ch = chars.charAt(j);

                if(temp.containsKey(ch)) {
                    int oldval = temp.get(ch);
                    temp.put(ch, oldval + 1);
                }
                temp.put(ch, 1);
            }

            boolean flg = false;

            for (Character ch : temp.keySet()) {
                if(temp.get(ch) <= hashMap.get(ch)){
                    flg = true;
                }
                else if(!hashMap.containsKey(ch)) {
                    flg = false;
                    break;
                }
            }

            if(flg) {
                sum += words[i].length();
            }

        }
        return sum;
    }
}
